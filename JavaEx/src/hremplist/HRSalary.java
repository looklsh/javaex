package hremplist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HRSalary {

	public static void main(String[] args) {
		String dbur1 = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dbur1, dbuser, dbpass);
			
			int keyword1 = scanner.nextInt();
			int keyword2 = scanner.nextInt();
			
			String sql = "SELECT last_name, first_name, salary" +
						" FROM employees" + 
						" WHERE salary BETWEEN " + keyword1 + " AND " + keyword2;
			
			System.out.println(sql);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("=======================================");
			
			while(rs.next()) {
				System.out.printf("%s, %s, %d%n", rs.getString(1), rs.getString(2), rs.getInt(3));
			}
			
		}catch(ClassNotFoundException e) {
			System.err.println("JDBC 드라이버에 로드실패!");
		
		}catch(SQLException e) {
			System.err.println("SQLEroor: ");
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
