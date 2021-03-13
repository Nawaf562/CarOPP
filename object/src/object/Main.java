package object;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car setget = new Car("KIA", 200);              // opject1
		Car setget2 = new Car("FORD", 180);            // opject2
		setget.setTopSpeed(250)	;         

		System.out.println(setget.getname());
		System.out.println(setget.getTopSpeed());
		
		System.out.println("---------------------------------------------------------------------------");
		
		System.out.println(setget2.getname());
		System.out.println(setget2.getTopSpeed());


	

	}

}
