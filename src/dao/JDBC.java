package dao;

import java.sql.*;

public class JDBC {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	final String url = "jdbc:mysql://localhost:3306/WhatToEat";
	final String userName = "root";
	final String pw = "database";
	
	public JDBC() {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, userName, pw);
			System.out.println("���� ����");
			stmt = conn.createStatement();
			
		}
		catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("����: " + e);
		}

		finally {
			try {
				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void Test() throws SQLException {
		rs = stmt.executeQuery("SELECT * FROM whattoeat.restaurant WHERE id=1");
		while (rs.next()) {
			String state = rs.getString("state");
			String city = rs.getString("city");
			String name = rs.getString("name");
			
			System.out.println(state+city+" "+name);
		}
	}


}
