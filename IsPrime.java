package homeAssignment.Week1.Day1;

public class IsPrime {

	public static void main(String[] args) {
		// Print if the given number is prime
		//1 2 3 4 5 6 7 8 9 
		//the number divisible by 1 will be prime otherwise non-prime
		int n=13;
		boolean prime=true;
		
		for (int i=2; i<n; i++) {
			if (n%i==0){
			prime=false;
			break;
			}
		}
		System.out.println(prime);	
 }
}
