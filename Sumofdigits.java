package wipro;

public class Sumofdigits {

	public static void main(String[] args) {
			int n=1234;
			for(sum=0 ;n!=0 ;n/=10)
	    {
		sum+=n%10;
	    }
	    System.out.println("Sum of digits of a number is "+sum); 
	}

}
