 <!-- Left side column. contains the logo and sidebar  2nd snippet-->
  <aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
      <!-- Sidebar user panel -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p><c:out value="${sessionScope.name}"/></p>
          <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
        </div>
      </div>
      <!-- search form -->
      <form action="#" method="get" class="sidebar-form">
        <div class="input-group">
          <input type="text" name="q" class="form-control" placeholder="Search...">
              <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
        </div>
      </form>
      <!-- /.search form -->
      <!-- sidebar menu: : style can be found in sidebar.less -->
      <ul class="sidebar-menu">
        <li class="header">MAIN NAVIGATION</li>
         <li>
          <a href="pages/mailbox/mailbox.html">
            <i class="fa fa-envelope"></i> <span>Mailbox</span>
            <small class="label pull-right bg-yellow">12</small>
          </a>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-dashboard"></i> <span>Admin Management</span> <i class="fa fa-angle-left pull-right"></i>
          </a>
          <ul class="treeview-menu">
            <li class="active"><a href="./addadmin"><i class="fa fa-circle-o"></i> Add New Admin</a></li>
            <li><a href="index2.html"><i class="fa fa-circle-o"></i> Edit Admin Details</a></li>
          </ul>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-files-o"></i>
            <span>Vehicle Registrations</span>
            <span class="label label-primary pull-right">4</span>
          </a>
          <ul class="treeview-menu">
            <li><a href="pages/layout/top-nav.html"><i class="fa fa-circle-o"></i> Pending Approvals</a></li>
            <li><a href="pages/layout/boxed.html"><i class="fa fa-circle-o"></i> Approved Vehicles</a></li>
            </ul>
        </li>
        <li>
          <a href="pages/widgets.html">
            <i class="fa fa-th"></i> <span>Flexible Query</span>
            <small class="label pull-right bg-green">new</small>
          </a>
        </li>
        
       
        
      </ul>
    </section>
    <!-- /.sidebar separate snippet 2 -->
  </aside>
