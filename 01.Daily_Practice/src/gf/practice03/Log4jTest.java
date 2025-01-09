package gf.practice03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class Log4jTest {
	
	private static Logger logger = Logger.getLogger(Log4jTest.class);
	static {
		SimpleLayout layout = new SimpleLayout();
		ConsoleAppender appender = new ConsoleAppender(layout);
		logger.addAppender(appender);
		logger.setLevel(Level.DEBUG);
		
	}
	
	public static void main(String[] args) {
		logger.debug("main method Start...");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			logger.info("Driver Lodded Successfully...");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcjan24", "root", "root");
			if(conn!=null) {
				PreparedStatement ps = conn.prepareStatement("select * from employee");
				logger.info("Connection Establish Successfully...");
				ResultSet rs = ps.executeQuery();
				System.out.println();
				logger.info("Employee Data is :: ");
				logger.debug("==========================================="); 
				while(rs.next()) {
					logger.debug(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
				}
				System.out.println();
				logger.warn("This Style is Not good for Fatching give column name...");
			}else {
				logger.info("Database is not Establish...");
			}			
		}catch(SQLException e) {
			logger.error("Log4jTest :: SQLException is Generated :: "+ e.getMessage());
		}catch(Exception e) {
			logger.fatal("Log4jTest :: Unknown Exception :: "+ e.getMessage());
		}
		
		logger.debug("Main Method end...");
		 
	}
}




/*



CREATE TABLE student (sid INT PRIMARY KEY, sname VARCHAR(100));



INSERT INTO student (sid, sname) VALUES (1, 'Karan'),(2, 'Sanket'),(3, 'Ganesh'),(4, 'Yashraj'),(5, 'Gokul');

CREATE TABLE exam (eid INT AUTO_INCREMENT PRIMARY KEY, ename VARCHAR(200), sid INT);


mysql> DELIMITER //
mysql> CREATE TRIGGER insertExam AFTER DELETE ON student
-> FOR EACH ROW
-> BEGIN
->     INSERT INTO exam (ename, sid) VALUES ('deleted_student', OLD.sid);
-> END;
-> //
mysql> DELIMITER ;


mysql> SELECT * FROM student;
+-----+---------+
| sid | sname   |
+-----+---------+
|   2 | Sanket  |
|   3 | Ganesh  |
|   4 | Yashraj |
|   5 | Gokul   |
+-----+---------+

INSERT INTO student (sid, sname) VALUES (1, 'Test Student');

DELETE FROM student WHERE sid = 1;


mysql> SELECT * FROM exam;
+-----+-----------------+------+
| eid | ename           | sid  |
+-----+-----------------+------+
|   1 | deleted_student |    1 |
+-----+-----------------+------+



*/
























