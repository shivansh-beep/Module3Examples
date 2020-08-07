package com.userdefined.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyTag extends SimpleTagSupport

{
		public void doTag() throws JspException,IOException
		{

			JspWriter out = getJspContext().getOut();
	out.println("<font color=red>Welcome All to user defined tag");
		}

}
