package hello;

import java.util.Date;
 
public class HelloDate {

	public static void main(String[] args) {
		Date date = new Date();	
		System.out.println(date + ": Hello from Java 8 with lambda expressions!");
		Helper helper = new Helper();
		System.out.println(helper.getMessage());
	}

}
