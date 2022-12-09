package day5_lib;

import java.sql.*;
import java.util.*;

public class CSVSelect {

	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jspbook?serverTimezone=UTC";
			String id = "root";
			String pw = "1234";
			conn = DriverManager.getConnection(url, id, pw);
			
			String sql = "SELECT NAME, POSITION, HEIGHT, WEIGHT, AGE FROM WORLDCUP_MEMBER";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			// 결과를 담을 ArrayList생성
			ArrayList<UserBean> list = new ArrayList<UserBean>();

			// ResultSet에 담긴 결과를 ArrayList에 담기
			while (rs.next()) {
				UserBean bean = new UserBean();
				bean.setName(rs.getString("Name"));
				bean.setPosition(rs.getString("Position"));
				bean.setHeight(rs.getString("Height"));
				bean.setWeight(rs.getString("Weight"));
				bean.setAge(rs.getString("Age"));
				list.add(bean);
			}
			// 결과물 출력
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getName() + " ");
				System.out.print(list.get(i).getPosition() + " ");
				System.out.print(list.get(i).getHeight() + " ");
				System.out.print(list.get(i).getWeight() + " ");
				System.out.println(list.get(i).getAge() + " ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
