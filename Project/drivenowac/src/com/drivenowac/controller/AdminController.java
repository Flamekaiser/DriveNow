package com.drivenowac.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.drivenowac.service.AdminService;
import com.drivenowcore.ac.model.Admin;



@Controller
public class AdminController {
	
	//@Autowired
	AdminService adminService;

	@RequestMapping(value ={"/", "/welcome**"})
	public ModelAndView welcomePage(@RequestParam(value="action",defaultValue = "None") String action) {
		
		ModelAndView model = new ModelAndView();
		model.addObject("action", action);	
		model.setViewName("welcome");

		return model;

	}
	@RequestMapping(value ={"addadmin"}, method=RequestMethod.POST)
	public ModelAndView AddAdminGet(@ModelAttribute("admin") Admin admin, BindingResult result, ModelMap modelMap, HttpServletRequest request) {
		String response = adminService.CreateAdmin(admin);
		ModelAndView model = new ModelAndView();
		if(null != response && response.equals("SUCCESS")){
			model.setViewName("createdadmin");
			model.addObject("admin", admin);
		}
		else{
			if(null != response && response.equals("ERR:EMAILEXISTS")){
				model.setViewName("addadmin?view=error");
				model.addObject("admin", admin);
				model.addObject("response", response);
			}
			if(null != response && response.equals("ERR:PHONEEXISTS")){
				model.setViewName("addadmin?view=error");
				model.addObject("admin", admin);
				model.addObject("response", response);
			}
			if(null != response && response.equals("ERR:FAILED")){
				model.setViewName("addadmin?view=error");
				model.addObject("admin", admin);
				model.addObject("response", "ERR:UNKNOWNERROR");
			}
			else{
				model.setViewName("errorpage");
			}
		}

		return model;

	}
	@RequestMapping(value ={"addadmin"})
	public ModelAndView AddAdminPost(@ModelAttribute("employee") Admin admin, BindingResult result, ModelMap modelMap, HttpServletRequest request) {
		
		ModelAndView model = new ModelAndView();	
		model.setViewName("addadmin");

		return model;

	}
	@RequestMapping(value ={"/loginPage"})
	public ModelAndView loginPage() {
		
		ModelAndView model = new ModelAndView();
		model.setViewName("loginPage");

		return model;

	}
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    if (auth != null){    
	        new SecurityContextLogoutHandler().logout(request, response, auth);
	    }
	    return "redirect:/login?logout";//You can redirect wherever you want, but generally it's a good practice to show login screen again.
	}


	

}