package wipro;

public class Palindrome {

	public static void main(String[] args) {
			int a=1234321;
			int safe=a;
			int n=0;
			int digit;
			while(a!=0) {
				digit=a%10;
				n =(n *10)+digit;
				a=a/10;
			}
			if(safe==n) {
				System.out.println("palindrome"+safe+""+n);
			}
			else {
				System.out.println("not a palindrome"+safe+""+n);
			}

	}

}
