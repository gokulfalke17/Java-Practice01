package gf.practice03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class ConnectionTest {

	static Connection con = null;
	static String password = "root";
	static String user = "root";
	static String url = "jdbc:mysql://localhost:3306/jdbcjan24";

	static Logger logger = Logger.getLogger(ConnectionTest.class);
	static {
		SimpleLayout layout = new SimpleLayout();
		ConsoleAppender appender = new ConsoleAppender(layout);
		logger.addAppender(appender);
		logger.setLevel(Level.DEBUG);
	}

	public static void main(String[] args) {
		logger.debug("Main Method Starte!");
		try {
			con = DriverManager.getConnection(url, user, password);
			if (con != null) {
				logger.info("Connection establsihed");
			} else {
				logger.warn("Check it username and password");
			}
		} catch (SQLException e) {
			logger.error("Gandu not connected");
		} catch (Exception e) {
			logger.fatal("chuty go to bhosdi");
		}
	}
}
