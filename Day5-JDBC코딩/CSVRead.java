package day5_lib;

import java.io.*;
import java.sql.*;
import java.util.*;

public class CSVRead {
	public static void main(String[] args) {
        BufferedReader reader = null;
        Reader r = null;
        List<String> list = null;
        Connection conn = null;
        PreparedStatement stmt =null;
        int count =0;
        
        try {
            r = new FileReader("C:\\Users\\곽기용\\Desktop\\회사 관련\\인턴교육과제\\Day5\\월드컵명단.csv");
            reader = new BufferedReader(r);
            list = new ArrayList<String>(); // 자료 담을 자료구조 생성
            while (true) {
                String data = reader.readLine();
                if (data == null) 
                    break;
                String[] arr = data.split(",");
                count++;
 
                for (String string : arr) { // 하나씩 뽑아서 리스트에 add
                    list.add(string);
                    
                }
           	}System.out.println(list);
           	
            //DB연결 후 넣기
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            String url = "jdbc:mysql://localhost:3306/jspbook?serverTimezone=UTC";
            String id = "root";
            String pw = "1234";
            conn = DriverManager.getConnection(url, id, pw); // Connection
 
            StringBuffer query = new StringBuffer(); 
            query.append("INSERT INTO WORLDCUP_MEMBER VALUES (?,?,?,?,?)");
            																
            stmt = conn.prepareStatement(query.toString());
                         
            for (int i = 0; i < count-1; i++) { 
            	
            	/*
            	System.out.print(list.get(5+(i*5)) + " ");
            	System.out.print(list.get(6+(i*5)) + " ");
            	System.out.print(list.get(7+(i*5)) + " ");
            	System.out.print(list.get(8+(i*5)) + " ");
            	System.out.println(list.get(9+(i*5)) + " ");
            	*/
            	
            	stmt.setString(1, list.get(5+(i*5)));
                stmt.setString(2, list.get(6+(i*5)));
                stmt.setString(3, list.get(7+(i*5)));
                stmt.setString(4, list.get(8+(i*5)));
                stmt.setString(5, list.get(9+(i*5)));
                stmt.executeUpdate(); 
                
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            
            if (r!= null) 
            try {
                r.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            catch (NullPointerException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
