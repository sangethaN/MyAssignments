package week1.day2;

public class Car {
	public void printCarBrand() {
		System.out.println("Toyota");
	}
	private int getRegNo() {
		int regNo = 1234;
		return regNo;
	}
	public boolean tyreDetail() {
		return false;
	}
	public float multiplication(float a, float b, float c ) {
		float m = a*b*c;
		return m;
	}
	public String carModel() {
		String model ="innova";
		return model;
	}

	public static void main(String[] args) {
		Car obj = new Car();
		obj.printCarBrand();
		int regNo = obj.getRegNo();
		boolean tyreDetail = obj.tyreDetail();
		float multiplication = obj.multiplication(10.0f, 20.0f, 30.0f);
		String carModel = obj.carModel();
		System.out.println(regNo);
		System.out.println("Is tyre puncture:"+tyreDetail);
		System.out.println(multiplication);
		System.out.println(carModel);

	}

}
