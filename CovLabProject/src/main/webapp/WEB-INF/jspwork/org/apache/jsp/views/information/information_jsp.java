/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
<<<<<<< HEAD
 * Generated at: 2021-07-19 08:54:42 UTC
=======
 * Generated at: 2021-07-15 05:57:37 UTC
>>>>>>> parent of 29c3322... comments 패키지 생성
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.information;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class information_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
<<<<<<< HEAD
    _jspx_dependants.put("/views/information/../common/sidebar.jsp", Long.valueOf(1626672854922L));
    _jspx_dependants.put("/views/information/../common/topbar.jsp", Long.valueOf(1626672814580L));
=======
    _jspx_dependants.put("/views/information/../common/sidebar.jsp", Long.valueOf(1626328647168L));
    _jspx_dependants.put("/views/information/../common/topbar.jsp", Long.valueOf(1625289158932L));
>>>>>>> parent of 29c3322... comments 패키지 생성
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

<<<<<<< HEAD
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("    <title>Information</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- ================= Favicon ================== -->\r\n");
      out.write("    <!-- Standard -->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"http://placehold.it/64.png/000/fff\">\r\n");
      out.write("    <!-- Retina iPad Touch Icon-->\r\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"http://placehold.it/144.png/000/fff\">\r\n");
      out.write("    <!-- Retina iPhone Touch Icon-->\r\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"http://placehold.it/114.png/000/fff\">\r\n");
      out.write("    <!-- Standard iPad Touch Icon-->\r\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"http://placehold.it/72.png/000/fff\">\r\n");
      out.write("    <!-- Standard iPhone Touch Icon-->\r\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"57x57\" href=\"http://placehold.it/57.png/000/fff\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Styles -->\r\n");
      out.write("    <link href=\"/semi/resources/css/lib/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"/semi/resources/css/lib/themify-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"/semi/resources/css/lib/menubar/sidebar.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"/semi/resources/css/lib/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"/semi/resources/css/lib/helper.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"/semi/resources/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

	//로그인 확인을 위해서 내장된 session 객체를 이용
	//Member loginMember = (Member)session.getAttribute("loginMember");

      out.write(" \r\n");
=======
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <title>Focus Admin: Tab</title>\n");
      out.write("\n");
      out.write("    <!-- ================= Favicon ================== -->\n");
      out.write("    <!-- Standard -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"http://placehold.it/64.png/000/fff\">\n");
      out.write("    <!-- Retina iPad Touch Icon-->\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"http://placehold.it/144.png/000/fff\">\n");
      out.write("    <!-- Retina iPhone Touch Icon-->\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"http://placehold.it/114.png/000/fff\">\n");
      out.write("    <!-- Standard iPad Touch Icon-->\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"http://placehold.it/72.png/000/fff\">\n");
      out.write("    <!-- Standard iPhone Touch Icon-->\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"57x57\" href=\"http://placehold.it/57.png/000/fff\">\n");
      out.write("\n");
      out.write("    <!-- Styles -->\n");
      out.write("    <link href=\"/semi/resources/css/lib/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"/semi/resources/css/lib/themify-icons.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"/semi/resources/css/lib/menubar/sidebar.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"/semi/resources/css/lib/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"/semi/resources/css/lib/helper.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"/semi/resources/css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\r\n");
>>>>>>> parent of 29c3322... comments 패키지 생성
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title></title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<div\r\n");
      out.write("		class=\"sidebar sidebar-hide-to-small sidebar-shrink sidebar-gestures\">\r\n");
      out.write("		<div class=\"nano\">\r\n");
      out.write("			<div class=\"nano-content\">\r\n");
      out.write("				<ul>\r\n");
      out.write("					<div class=\"logo\">\r\n");
      out.write("						<a href=\"index1.html\"> <!-- <img src=\"assets/images/logo.png\" alt=\"\" /> -->\r\n");
      out.write("							<span>CovLab</span></a>\r\n");
      out.write("					</div>\r\n");
      out.write("					<li class=\"label\">Menu</li>\r\n");
      out.write("					<ul>\r\n");
      out.write("						<li><a href=\"/semi/index.jsp\">백신 예약</a></li>\r\n");
      out.write("						<li><a href=\"/semi/views/information/information.jsp\">뉴스/백신 정보</a></li>\r\n");
      out.write("						<li><a href=\"/semi/views/board/boardMain.jsp\">접종 후기</a></li>\r\n");
      out.write("						<li><a href=\"/semi/index.jsp\">MY PAGE</a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<li><a class=\"sidebar-sub-toggle\"><i class=\"ti-target\"></i>\r\n");
      out.write("							Pages <span class=\"sidebar-collapse-icon ti-angle-down\"></span></a>\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li><a href=\"page-login.html\">Login</a></li>\r\n");
      out.write("							<li><a href=\"page-register.html\">Register</a></li>\r\n");
      out.write("							<li><a href=\"page-reset-password.html\">Forgot password</a></li>\r\n");
      out.write("						</ul></li>\r\n");
      out.write("					<li><a href=\"../documentation/index.html\"><i\r\n");
      out.write("							class=\"ti-file\"></i> Documentation</a></li>\r\n");
      out.write("					<li><a><i class=\"ti-close\"></i> Logout</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- /# sidebar -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title></title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"header\">\r\n");
      out.write(" \r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <div class=\"float-left\">\r\n");
      out.write("                        <div class=\"hamburger sidebar-toggle\">\r\n");
      out.write("                            <span class=\"line\"></span>\r\n");
      out.write("                            <span class=\"line\"></span>\r\n");
      out.write("                            <span class=\"line\"></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"float-right\">\r\n");
      out.write("                        <div class=\"dropdown dib\">\r\n");
      out.write("                            <div class=\"header-icon\" data-toggle=\"dropdown\">\r\n");
      out.write("                                <i class=\"ti-bell\"></i>\r\n");
      out.write("                                \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"dropdown dib\">\r\n");
      out.write("                            <div class=\"header-icon\" data-toggle=\"dropdown\">\r\n");
      out.write("                                <i class=\"ti-email\"></i>\r\n");
      out.write("                                <div class=\"drop-down dropdown-menu dropdown-menu-right\">\r\n");
      out.write("                                    <div class=\"dropdown-content-heading\">\r\n");
      out.write("                                        <span class=\"text-left\">2 New Messages</span>\r\n");
      out.write("                                        <a href=\"email.html\">\r\n");
      out.write("                                            <i class=\"ti-pencil-alt pull-right\"></i>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"dropdown-content-body\">\r\n");
      out.write("                                        <ul>\r\n");
      out.write("                                            <li class=\"notification-unread\">\r\n");
      out.write("                                                <a href=\"#\">\r\n");
      out.write("                                                    <img class=\"pull-left m-r-10 avatar-img\"\r\n");
      out.write("                                                        src=\"/semi/resources/images/avatar/1.jpg\" alt=\"\" />\r\n");
      out.write("                                                    <div class=\"notification-content\">\r\n");
      out.write("                                                        <small class=\"notification-timestamp pull-right\">02:34\r\n");
      out.write("                                                            PM</small>\r\n");
      out.write("                                                        <div class=\"notification-heading\">Michael Qin</div>\r\n");
      out.write("                                                        <div class=\"notification-text\">Hi Teddy, Just wanted to let you\r\n");
      out.write("                                                            ...</div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li class=\"notification-unread\">\r\n");
      out.write("                                                <a href=\"#\">\r\n");
      out.write("                                                    <img class=\"pull-left m-r-10 avatar-img\"\r\n");
      out.write("                                                        src=\"/semi/resources/images/avatar/2.jpg\" alt=\"\" />\r\n");
      out.write("                                                    <div class=\"notification-content\">\r\n");
      out.write("                                                        <small class=\"notification-timestamp pull-right\">02:34\r\n");
      out.write("                                                            PM</small>\r\n");
      out.write("                                                        <div class=\"notification-heading\">Mr. John</div>\r\n");
      out.write("                                                        <div class=\"notification-text\">Hi Teddy, Just wanted to let you\r\n");
      out.write("                                                            ...</div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <a href=\"#\">\r\n");
      out.write("                                                    <img class=\"pull-left m-r-10 avatar-img\"\r\n");
      out.write("                                                        src=\"/semi/resources/images/avatar/3.jpg\" alt=\"\" />\r\n");
      out.write("                                                    <div class=\"notification-content\">\r\n");
      out.write("                                                        <small class=\"notification-timestamp pull-right\">02:34\r\n");
      out.write("                                                            PM</small>\r\n");
      out.write("                                                        <div class=\"notification-heading\">Michael Qin</div>\r\n");
      out.write("                                                        <div class=\"notification-text\">Hi Teddy, Just wanted to let you\r\n");
      out.write("                                                            ...</div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <a href=\"#\">\r\n");
      out.write("                                                    <img class=\"pull-left m-r-10 avatar-img\"\r\n");
      out.write("                                                        src=\"/semi/resources/images/avatar/2.jpg\" alt=\"\" />\r\n");
      out.write("                                                    <div class=\"notification-content\">\r\n");
      out.write("                                                        <small class=\"notification-timestamp pull-right\">02:34\r\n");
      out.write("                                                            PM</small>\r\n");
      out.write("                                                        <div class=\"notification-heading\">Mr. John</div>\r\n");
      out.write("                                                        <div class=\"notification-text\">Hi Teddy, Just wanted to let you\r\n");
      out.write("                                                            ...</div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li class=\"text-center\">\r\n");
      out.write("                                                <a href=\"#\" class=\"more-link\">See All</a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"dropdown dib\">\r\n");
      out.write("                            <div class=\"header-icon\" data-toggle=\"dropdown\">\r\n");
      out.write("                                <span class=\"user-avatar\">John\r\n");
      out.write("                                    <i class=\"ti-angle-down f-s-10\"></i>\r\n");
      out.write("                                </span>\r\n");
      out.write("                                <div class=\"drop-down dropdown-profile dropdown-menu dropdown-menu-right\">\r\n");
      out.write("                                    <div class=\"dropdown-content-heading\">\r\n");
      out.write("                                        <span class=\"text-left\">Upgrade Now</span>\r\n");
      out.write("                                        <p class=\"trial-day\">30 Days Trail</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"dropdown-content-body\">\r\n");
      out.write("                                        <ul>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <a href=\"#\">\r\n");
      out.write("                                                    <i class=\"ti-user\"></i>\r\n");
      out.write("                                                    <span>Profile</span>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("\r\n");
      out.write("                                            \r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <a href=\"#\">\r\n");
      out.write("                                                    <i class=\"ti-settings\"></i>\r\n");
      out.write("                                                    <span>Setting</span>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <a href=\"#\">\r\n");
      out.write("                                                    <i class=\"ti-lock\"></i>\r\n");
      out.write("                                                    <span>Lock Screen</span>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <a href=\"#\">\r\n");
      out.write("                                                    <i class=\"ti-power-off\"></i>\r\n");
      out.write("                                                    <span>Logout</span>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"page-title\">\r\n");
      out.write("	<h5>뉴스 /  백신 정보</h5>\r\n");
      out.write("</div>\r\n");
      out.write("<hr>\r\n");
      out.write("  \r\n");
      out.write("    <!-- jquery vendor -->\r\n");
      out.write("    <script src=\"/semi/resources/js/lib/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"/semi/resources/js/lib/jquery.nanoscroller.min.js\"></script>\r\n");
      out.write("    <!-- nano scroller -->\r\n");
      out.write("    <script src=\"/semi/resources/js/lib/menubar/sidebar.js\"></script>\r\n");
      out.write("    <script src=\"/semi/resources/js/lib/preloader/pace.min.js\"></script>\r\n");
      out.write("    <!-- sidebar -->\r\n");
      out.write("    \r\n");
      out.write("    <!-- bootstrap -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"/semi/resources/js/lib/bootstrap.min.js\"></script><script src=\"assets/js/scripts.js\"></script>\r\n");
      out.write("    <!-- scripit init-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
