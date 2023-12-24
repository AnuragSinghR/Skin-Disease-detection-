<%@page import="com.dao.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String userName = (String)session.getAttribute("uid"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Skin Disease Detection System Technologies Using Image Processing and Deep Learning</title>

        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/demo.css" />
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style1.css" />
        <link href="<%=request.getContextPath() %>/css/fontstyle.css" rel='stylesheet' type='text/css' />
   
   
    </head>
    <body>
        <div class="container">
            
           <h1>Skin Disease Detection System Technologies Using Image Processing and Deep Learning</h1>

<div class="header">
               
                <span class="right">
                    <a href="#" target="_blank">Welcome..<%=userName %></a>
                    <a href="#"><strong></strong></a>
                </span>
                <div class="clr"></div>
            </div>
            <div class="content">
                
                <ul class="ca-menu">
                    <li>
                        <a href="<%=request.getContextPath() %>/res/jsp/user/profile.jsp?no=0" target="f">
                            <span class="ca-icon">U</span>
                            <div class="ca-content">
                                <h2 class="ca-main">Profile</h2>
                                <h3 class="ca-sub">View Profile</h3>
                            </div>
                        </a>
                    </li>
                   
                   
                      <li>
                        <a href="<%=request.getContextPath() %>/res/jsp/user/imageSearch.jsp?no=0" target="f">
                            <span class="ca-icon">I</span>
                            <div class="ca-content">
                                <h2 class="ca-main">Image Search</h2>
                                <h3 class="ca-sub">Upload Image</h3>
                            </div>
                        </a>
                    </li>
                    
                    
                    
                    <li>
                        <a href="<%=request.getContextPath() %>/res/jsp/user/feedback.jsp?no=0" target="f">
                            <span class="ca-icon">I</span>
                            <div class="ca-content">
                                <h2 class="ca-main">Register Feedback</h2>
                                <h3 class="ca-sub">Feedback</h3>
                            </div>
                        </a>
                    </li>
                    
                    <li>
                        <a href="<%=request.getContextPath() %>/res/jsp/user/viewFeedback.jsp?no=0" target="f">
                            <span class="ca-icon">I</span>
                            <div class="ca-content">
                                <h2 class="ca-main">View Feedback</h2>
                                <h3 class="ca-sub">Feedback</h3>
                            </div>
                        </a>
                    </li>
                   
                    
                   
                     <li>
                        <a href="<%=request.getContextPath()%>/res/jsp/user/uchangepass.jsp?no=0" target="f">
                            <span class="ca-icon">S</span>
                            <div class="ca-content">
                                <h2 class="ca-main">Change Password</h2>
                                <h3 class="ca-sub">Change Pass</h3>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="<%=request.getContextPath()%>/index1.jsp">
                            <span class="ca-icon">X</span>
                            <div class="ca-content">
                                <h2 class="ca-main">Log Out</h2>
                                <h3 class="ca-sub">Log Out</h3>
                            </div>
                        </a>
                    </li>
                   
                </ul>
            </div><!-- content -->
            
            
           <div style="position: absolute;top: 160px;left: 230px;"><iframe width="750px;" height="520px;" name="f"  frameborder="0" scrolling="auto"></iframe></div>
            
        </div>
       
    </body>
</html>