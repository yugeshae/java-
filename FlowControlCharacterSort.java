package fundamnetalsJava;

import java.util.Scanner;

public class FlowControlCharacterSort {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char c= s.next().charAt(0);
		char d= s.next().charAt(0);
		if(c<d) {
			System.out.print(c+","+d);
		}
		else {
			System.out.print(d+","+c);
		}
	}

}
