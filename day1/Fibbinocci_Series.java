package weeks.day1;

public class Fibbinocci_Series {

	public static void main(String[] args) {
		int a=0,b=1,sum=0;
		System.out.println(a+"\n"+b);
		for(int i=0;i<11;i++) {
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);
		}

	}

}
