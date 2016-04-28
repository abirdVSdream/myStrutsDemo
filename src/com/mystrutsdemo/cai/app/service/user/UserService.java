package com.mystrutsdemo.cai.app.service.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mystrutsdemo.cai.app.dao.user.UserBean;


public class UserService 
{
	public UserBean Connect(String sql) throws Exception
	{
		
		
		
			String url = "jdbc:mysql://localhost:3306/mystrutsdemo";
			String user ="root";
			String pass = "123456";
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn =DriverManager.getConnection(url,user,pass);
			Statement st = conn.createStatement();
			
			UserBean userBean = new UserBean();
//			String sq = sql+s;
			ResultSet rs =st.executeQuery(sql);
			while(rs.next())
			{
				userBean.setUsername(rs.getString("username"));
				userBean.setPassword(rs.getString("password"));
			}
			
		
			rs.close();
			st.close();
			conn.close();
//			System.out.println(userBean.getUsername());
			
			return userBean;
			

	}
	public UserBean serchByusername (String username) throws Exception
	{
		String sq = "select id,username,password,email from user where username=";
		String sql = sq+change(username);
		return Connect(sql); 
	}
	
	public String change(String  s)
	{
		String  sc = "'"+s+"'";
		return sc;
	}
	public void insert(UserBean userBean) throws Exception
	{
		String sq ="insert into user values(";
		String user = userBean.getUsername();
		String pass =userBean.getPassword();
		String mail = userBean.getMail();
		String sql = sq+user+","+pass+","+mail+")";
		Connect(sql);
	}
	
//	public static void main(String args[])
//	{
//		LoginService lg = new LoginService();
//		try {
//			System.out.println(lg.serchByusername("lala").getUsername());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
