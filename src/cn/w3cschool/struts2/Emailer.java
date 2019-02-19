package cn.w3cschool.struts2;

import java.util.Properties;

import com.opensymphony.xwork2.ActionSupport;

public class Emailer extends ActionSupport {

	private String from;
	private String password;
	private String to;
	private String subject;
	private String body;

	static Properties properties = new Properties();
}
