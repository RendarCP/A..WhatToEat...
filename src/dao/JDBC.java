package dao;

import java.sql.*;

public class JDBC {
	Connection conn = null;
	Statement stmt = null;
	final String url = "jdbc:mysql://localhost:3306/WhatToEat";
	final String userName = "root";
	final String pw = "database";

	public JDBC() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, userName, pw);
			System.out.println("���� ����");
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

}
