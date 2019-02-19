package cn.w3cschool.struts2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String user;
	private String password;
	private String name;

	@Override
	public String execute() throws Exception {
		String ret = ERROR;
		Connection conn = null;
		try {
			String URL = "jdbc:mysql://192.168.56.101:3306/struts_tutoria";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "root", "123456");
			String sql = "SELECT name FROM login WHERE ";
			sql += "user = ? AND password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				name = rs.getString(1);
				
				ret = SUCCESS;
			}
			System.out.println(name);
		} catch (Exception e) {
			ret = ERROR;
		}finally {
			if(conn != null) {
				conn.close();
			}
		}
		return ret;
		
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
