package wipro;

public class Positivenegativezero {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		if(a>0) {
			System.out.println("POSITIVE");
		}
		else if(a<0) {
			System.out.println("NEGATIVE");
		}
		else if(a==0) {
			System.out.println("ZERO");
		}
	

	}
}
