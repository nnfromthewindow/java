// Copy Objects: copiar los atributos de un objeto a otro y que sigan siendo objetos separados en la memoria
public class Main {

	public static void main(String[] args) {
		
		Car car1=new Car("Ford","Focus",2004);
		//Car car2=new Car("Fiat","Palio",1999);
		
		//esta es otra forma de copiar cuando instancio (creo) un objeto nuevo y le creo un metodo copiar en el objeto
	
		Car car2 = new Car(car1);
		car2.copy(car1);

		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		
		
	}

}
