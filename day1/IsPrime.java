package weeks.day1;

public class IsPrime {

	public static void main(String[] args) {
		int n=31,flag=0;
		for(int i=2;i<n;i++) {
			if(n%i==0 )
			{ flag++;
			System.out.println("Not Prime");
			break;
			}
		}
		if(flag==0)
			System.out.println("Prime");
	}



}
