
public class Car {
	String carName;
	int carPrize;
	String carColor;       //variables
	

	void displayCarName() {             //method1
		carName="Mahindra Thar";
		System.out.println("Car Name::"+carName);    //print statement
		}
	void displayCarPrize() {           //method2
		carPrize=1500000;
		System.out.println("Car Prize ::"+carPrize);
		}
	void displayCarColor() {          //method3
		carColor="Black";
		System.out.println("Car color::"+carColor);
		}
	
	public static void main(String[] args) {   //main method
		// TODO Auto-generated method stub
		
		Car obj=new Car();                   // initiate the object
		obj.displayCarName();
		obj.displayCarPrize();              //invoke the methods
		obj.displayCarColor();

	}

}
