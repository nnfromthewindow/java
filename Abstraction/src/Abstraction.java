//abstract: las abstract classes no pueden ser instanciadas pero si sus subclases
//			los metodos tambien pueden ser abstract pero se pueden instanciar en las subclases
//Se usa para cuando una clase es muy generica. Como este ejemplo uno cuando compra autos no compra vehiculos (ya que es muy generico)
//Se usa tambien por seguridad de que no instancien la clase por ser muy generica

public class Abstraction {

	public static void main(String[] args) {

		
		//Vehicles vehicles=new Vehicles();
		Car car=new Car();
		
		car.go();
		
	}

}
