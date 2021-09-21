package maindriver;

import java.util.Scanner;
import com.accounts.*;
import com.connectionfactory.ConnectionFactory;


public class MainDriver {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
				
		
				System.out.println("---------------------------------------");
				System.out.println("Please select an option from the list");
				System.out.println("1)Create an account");
				System.out.println("2)Login to an account");
				System.out.println("3)Exit");
				System.out.println("---------------------------------------");
				int selection = sc.nextInt();
				
			switch(selection) {
			
			case 1:
				System.out.println("Please select a username to create");
				break;
			case 2:
				System.out.println("Please use your username and password to login");
				break;
			case 3:
				System.out.println("We hope to see you again soon!");
				break;
				
				
			}
				
			
				
	}
}
		
		
		
	

