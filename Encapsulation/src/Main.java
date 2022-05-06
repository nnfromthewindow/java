//Encapsulacion: se usa para traer atributos de clases que estan privados u ocultos. Se traen mediante getters y setters
//				Los atributos deberian ser private si no hay necesidad para que sean public/protected


public class Main {

	public static void main(String[] args) {
	
		Car car=new Car("Ford","Focus",2004);
		Car car2=new Car("Fiat","Palio",1999);
		
		car.setYear(2020);
		car2.setMake("Land Rover");
		System.out.println(car.getYear());
		System.out.println(car2.getMake());
				
	}

}
