package hremplist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class HREmpList {

	public static void main(String[] args) {
		String dbur1 = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dbur1, dbuser, dbpass);
			stmt = conn.createStatement();
			String sql = "SELECT emp.first_name, emp.last_name," +
			        "man.first_name, man.last_name, emp.employee_id, man.manager_id" +
			        " FROM employees emp JOIN employees man ON emp.manager_id = man.employee_id" +
			        " ORDER BY emp.first_name";
			System.out.println(sql);
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String empName1 = rs.getString(1);
				String empName2 = rs.getString(2);
				String manName1 = rs.getString(3);
				String manName2 = rs.getString(4);
				System.out.printf("%s, %s, %s, %s%n",empName1, empName2, manName1, manName2);
			}
			
			
		}catch(ClassNotFoundException e) {
			System.err.println("JDBC 드라이버에 로드실패!");
		}catch(SQLException e) {
			System.out.println("SQLEroor: " + e.getMessage());
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			}catch(Exception e) {
				
			}
		}

	}

}
