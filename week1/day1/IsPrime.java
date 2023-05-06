package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int n=13,flag=0;
		for(int i=2;i<n;i++) {

			if(n%i==0 )
			{ flag++;
			System.out.println("Not Prime");
			break;
			}
		}
		if(n<=1) {
			System.out.println("Neither Prime nor Composite");
		}
		else if(flag==0)
			System.out.println("Prime");
	}



}