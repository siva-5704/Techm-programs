// question 7

package tech_m;
import java.util.*;
public class testq7 {

	public static void main(String[] args) {
		
		    	Scanner sc=new Scanner(System.in);
		    	
		    		System.out.println("Enter first number :");
		        	int a=sc.nextInt();
		        	System.out.println("Enter second number :");
		        	int b=sc.nextInt();
		        	System.out.println("Enter your operation ( +, -, *, /) ");
		        	char c=sc.next().charAt(0);
		        	
		    		switch(c)
		    		{
		    		case '+': System.out.println(a+b);
		 	        break;
		    		case '-': System.out.println(a-b);
		            break;
		    		case '*': System.out.println(a*b);
		    		break;
		    		case '/': System.out.println(a/b);
		    		break;
		    		
		    		}
		    	
		    	
		    }
	}

