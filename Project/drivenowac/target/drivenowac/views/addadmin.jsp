<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>AdminLTE 2 | Dashboard</title>
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<!-- Bootstrap 3.3.6 -->
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="dist/css/AdminLTE.min.css">
<!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet" href="dist/css/skins/_all-skins.min.css">
<!-- iCheck -->
<link rel="stylesheet" href="plugins/iCheck/flat/blue.css">
<!-- Morris chart -->
<link rel="stylesheet" href="plugins/morris/morris.css">
<!-- jvectormap -->
<link rel="stylesheet"
	href="plugins/jvectormap/jquery-jvectormap-1.2.2.css">
<!-- Date Picker -->
<link rel="stylesheet" href="plugins/datepicker/datepicker3.css">
<!-- Daterange picker -->
<link rel="stylesheet"
	href="plugins/daterangepicker/daterangepicker-bs3.css">
<!-- bootstrap wysihtml5 - text editor -->
<link rel="stylesheet"
	href="plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>
<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper">

		<jsp:include page="header.jsp" />
		<jsp:include page="sidebar.jsp" />

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1>
					Dashboard <small>Control panel</small>
				</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
					<li class="active">Dashboard</li>
				</ol>
			</section>

			<!-- Main content -->
			<section class="content">
				<div class="row">
					<!-- left column -->
					<div class="col-md-6">
						<!-- general form elements -->
						<div class="box box-primary">
							<div class="box-header with-border">
								<h3 class="box-title">Register New Admin</h3>
							</div>
							<!-- /.box-header -->
							<!-- form start -->
							<c:if test="${not empty view}">
								<c:if test="${view =='error'}">
									<c:if test="${response =='ERR:EMAILEXISTS'}">
										<div class="err-msg-logs row clearfix" style="height: 70px">
											<p class="alert alert-danger">Email ID already Exists</p>
										</div>
									</c:if>
									<c:if test="${response =='ERR:PHONEEXISTS'}">
										<div class="err-msg-logs row clearfix" style="height: 70px">
											<p class="alert alert-danger">Email ID already Exists</p>
										</div>
									</c:if>
									<c:if test="${response =='ERR:UNKNOWNERRON'}">
										<div class="err-msg-logs row clearfix" style="height: 70px">
											<p class="alert alert-danger">Unexpected Error Occurred</p>
										</div>
									</c:if>
								</c:if>
							</c:if>
							
							
							<form:form role="form" modelAttribute="admin" action="addadmin"
				method="post">
								<div class="box-body">
									<div class="form-group">
										<label for="emailId">Email address</label> <input
											type="email" class="form-control" id="emailId"
											placeholder="Enter email" value='${admin.emailId}' REQUIRED>
									</div>
									<div class="form-group">
										<label for="fullName">Email address</label> <input
											type="text" class="form-control" id="fullName"
											placeholder="Enter Full Name" value='${admin.fullName}' REQUIRED>
									</div>
									<div class="form-group">
										<label for="contactNo">Contact No</label> <input
											type="text" class="form-control" id="contactNo"
											placeholder="Enter Contact No" value='${admin.contactNo}' REQUIRED>
									</div>
									<div class="form-group">
										<label for="password">Password</label> <input
											type="password" class="form-control"
											id="password" placeholder="Password" REQUIRED>
									</div>
									<div class="form-group">
										<label for="imageURL">Display Picture</label> <input
											type="file" id="imageURL" disabled>

										<p class="help-block">Select Image from local drive</p>
									</div>
									
								</div>
								<!-- /.box-body -->

								<div class="box-footer">
									<button type="submit" class="btn btn-primary">Submit</button>
								</div>
							</form:form>
						</div>
						<!-- /.box -->

						


					</div>
					</div>
					</section>
					<!-- /.content-wrapper -->
					<jsp:include page="footer.jsp" />


				</div>
				<!-- ./wrapper -->

				<!-- jQuery 2.2.0 -->
				<script src="plugins/jQuery/jQuery-2.2.0.min.js"></script>
				<!-- jQuery UI 1.11.4 -->
				<script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
				<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
				<script>
  $.widget.bridge('uibutton', $.ui.button);
</script>
				<!-- Bootstrap 3.3.6 -->
				<script src="bootstrap/js/bootstrap.min.js"></script>
				<!-- Morris.js charts -->
				<script
					src="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
				<script src="plugins/morris/morris.min.js"></script>
				<!-- Sparkline -->
				<script src="plugins/sparkline/jquery.sparkline.min.js"></script>
				<!-- jvectormap -->
				<script src="plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
				<script src="plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
				<!-- jQuery Knob Chart -->
				<script src="plugins/knob/jquery.knob.js"></script>
				<!-- daterangepicker -->
				<script
					src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script>
				<script src="plugins/daterangepicker/daterangepicker.js"></script>
				<!-- datepicker -->
				<script src="plugins/datepicker/bootstrap-datepicker.js"></script>
				<!-- Bootstrap WYSIHTML5 -->
				<script
					src="plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
				<!-- Slimscroll -->
				<script src="plugins/slimScroll/jquery.slimscroll.min.js"></script>
				<!-- FastClick -->
				<script src="plugins/fastclick/fastclick.js"></script>
				<!-- AdminLTE App -->
				<script src="dist/js/app.min.js"></script>
				<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
				<script src="dist/js/pages/dashboard.js"></script>
				<!-- AdminLTE for demo purposes -->
				<script src="dist/js/demo.js"></script>
</body>
</html>