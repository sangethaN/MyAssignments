package weeks.day2;

public class ArrayActivity {

	public static void main(String[] args) {
		int count=0;
		int arr[]= {1,5,7,8,9,0,4,5,2,3,11,21,32,5,23,67};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==5)
				count++;
		}
		System.out.println("total count of 5 : "+ count);
	}
}
