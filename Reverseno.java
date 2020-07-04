package wipro;

public class Reverseno {

	public static void main(String[] args) {
			int a=1234;
			int safe=a;
			int n=0;
			int digit;
			while(a!=0) {
				digit=a%10;
				n =(n *10)+digit;
				a=a/10;
			}
			System.out.println(n);
	}

}
