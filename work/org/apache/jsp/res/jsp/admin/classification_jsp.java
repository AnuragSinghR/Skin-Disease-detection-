package org.apache.jsp.res.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.util.Utility;
import com.dao.AdminDAO;
import java.sql.*;

public final class classification_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


	ResultSet rs = null;

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Skin Disease Detection System Technologies Using Image Processing and Deep Learning</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/res/CSS/message.css\" type=\"text/css\"/>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/res/CSS/contact.css\" type=\"text/css\"/>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/res/CSS/button.css\" type=\"text/css\"/>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/res/JS/pagination.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/res/JS/style.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	rs = (ResultSet)request.getAttribute("rs");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<body onload=\"startTimer()\">\r\n");
      out.write("<br><br>\r\n");
      out.write("<form action=\"");
      out.print(request.getContextPath() );
      out.write("/ClassificationList\">\r\n");
      out.write("\r\n");
      out.write("<input type=\"submit\" name=\"action\" value=\"Add\" class=\"gradientbuttons\" style=\"margin-left: 25px;;\">\r\n");
      out.write("<input type=\"submit\" name=\"action\" value=\"Edit\" class=\"gradientbuttons\">\r\n");
      out.write("<input type=\"submit\" name=\"action\" value=\"Delete\" class=\"gradientbuttons\">\r\n");
      out.write("\r\n");
      out.write("<table id=\"results\" class=\"tab\" align=\"center\" style=\"width:780px;\">\r\n");
      out.write("   \r\n");
      out.write("\t<tr align=\"center\">\r\n");
      out.write("\t\t<th>Select</th>\r\n");
      out.write("\t\t<th>Classification Name</th>\r\n");
      out.write("\t\t<th>Classification Remark</th>\r\n");
      out.write("\t</tr>\r\n");

		while(rs.next())
		{

      out.write("\r\n");
      out.write("\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t\t<td><input name=\"chk\" type=\"checkbox\" value=\"");
      out.print(rs.getInt(1));
      out.write("\"></input></td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(2));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(3));
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\r\n");

		}

      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("<div id=\"pageNavPosition\" style=\"cursor:hand;position:relative;left:25px;\"></div>\r\n");
      out.write("<script type=\"text/javascript\"><!--\r\n");
      out.write("        var pager = new Pager('results', 5); \r\n");
      out.write("        pager.init(); \r\n");
      out.write("        pager.showPageNav('pager', 'pageNavPosition'); \r\n");
      out.write("        pager.showPage(1);\r\n");
      out.write("    //--></script>\r\n");

	if(Utility.parse(request.getParameter("no"))==1)
    {
      out.write("\r\n");
      out.write("    \t<div class=\"success\" id=\"message\" style=\"position:absolute;top:10px;left:300px\">\t\r\n");
      out.write("    \t\t<p>Skin disease Classification Details Added Successfully.....!</p>\r\n");
      out.write("    \t</div>\t\t\t\r\n");
      out.write("    ");
}
	if(Utility.parse(request.getParameter("no"))==-1)
	{
      out.write("\r\n");
      out.write("\t\t<div class=\"success\" id=\"message\" style=\"position:absolute;top:10px;left:300px\">\t\r\n");
      out.write("\t\t\t<p>Opp's something went wrong.....!</p>\r\n");
      out.write("\t\t</div>\t\t\t\r\n");
      out.write("\t");
}
	if(Utility.parse(request.getParameter("no"))==2)
	{
      out.write("\r\n");
      out.write("\t\t<div class=\"error\" id=\"message\" style=\"position:absolute;top:10px;left:300px\">\t\r\n");
      out.write("\t\t\t<p>Opp's select atleast one.....!</p>\r\n");
      out.write("\t\t</div>\t\t\t\r\n");
      out.write("\t");
}
	if(Utility.parse(request.getParameter("no"))==3)
	{
      out.write("\r\n");
      out.write("\t\t<div class=\"success\" id=\"message\" style=\"position:absolute;top:10px;left:300px\">\t\r\n");
      out.write("\t\t\t<p>Skin disease Classification Details Deleted Successfully.....!</p>\r\n");
      out.write("\t\t</div>\t\t\t\r\n");
      out.write("\t");
}
	if(Utility.parse(request.getParameter("no"))==4)
	{
      out.write("\r\n");
      out.write("\t\t<div class=\"error\" id=\"message\" style=\"position:absolute;top:10px;left:300px\">\t\r\n");
      out.write("\t\t\t<p>Opp's Select only one record to edit....!</p>\r\n");
      out.write("\t\t</div>\t\t\t\r\n");
      out.write("\t");
}
	if(Utility.parse(request.getParameter("no"))==5)
	{
      out.write("\r\n");
      out.write("\t\t<div class=\"success\" id=\"message\" style=\"position:absolute;top:10px;left:300px\">\t\r\n");
      out.write("\t\t\t<p>Skin disease Classification Details Updated Successfully....!</p>\r\n");
      out.write("\t\t</div>\t\t\t\r\n");
      out.write("\t");
}

      out.write("\t\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
