package gf.practice04_;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
	
	public static void main(String[] args) {
		
		List<List<Integer>> listList = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6));
		
		listList.stream().map(ele->ele.size()).forEach(ele->System.out.print(ele+" "));
		System.out.println();
		listList.stream().flatMap(List::stream).forEach(List->System.out.print(List+" "));
		
	}
}


/*CREATE TABLE Bill_Master (
	    bill_id INT PRIMARY KEY AUTO_INCREMENT,
	    order_id INT,
	    cust_id INT,
	    CGST INT DEFAULT 6,
	    SGCT INT DEFAULT 6,
	    Discount INT DEFAULT 10,
	    grand_total INT NOT NULL,
	    bill_date DATE DEFAULT CURRENT_DATE,
	    FOREIGN KEY(order_id) REFERENCES Order_Master(order_id)
	        ON DELETE CASCADE
	        ON UPDATE CASCADE,
	    FOREIGN KEY(cust_id) REFERENCES Customer_Master(cust_id)
	        ON DELETE CASCADE
	        ON UPDATE CASCADE
	);*/


