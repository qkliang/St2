package cn.w3cschool.struts2;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class Employee extends ActionSupport {

	private String name;
	private String department;
	private List employees;
	private List contractors;
	public Employee() {}
	public Employee(String name,String department) {
		this.name = name;
		this.department = department;
	}
	public String execute() {
		employees = new ArrayList<String>();
		employees.add(new Employee("George","Recruitment"));
		employees.add(new Employee("Danielle","Accounts"));
		employees.add(new Employee("Melissa","Recruitment"));
	    employees.add(new Employee("Rose","Accounts"));
	    
		return SUCCESS;
	}


}
