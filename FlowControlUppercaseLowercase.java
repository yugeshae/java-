package wipro;

import java.util.Scanner;

public class FlowControlUppercaseLowercase {

	public static void main(String[] args) {
		char c;
		int a;
		Scanner s=new Scanner(System.in);
		c= s.next().charAt(0);
		System.out.print(c+"->");
		if(Character.isLowerCase(c)) {
			c=Character.toUpperCase(c);
		    System.out.print(c);}
		else {
			c=Character.toLowerCase(c);
			System.out.print(c);
		}
	}
}
