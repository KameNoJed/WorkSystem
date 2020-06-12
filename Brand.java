class Car {

String brand;

public String getBrand() {
brand = "Ford";
return brand;

}

void run() {

System.out.println("Car is running...");

}
}
public class Brand {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ford = new Car();
		System.out.print(ford.getBrand());
	}

}
