//Polymorphism:  viene de la palabra griega poly - muchos y morph- forma
//				 Es la capacidad de un objeto de identificarse como mas de un tipo				
public class Main {

	public static void main(String[] args) {
	
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		//creamos un array de Vehicle (racers) ya que es la clase que tienen en comun Car, Bycicle y Boat
		//Tambien debemos crear el metodo (en este caso .go) en la clase super (Vehicles) y hacer un override en las clases heredadas
		
		Vehicle[] racers = {car,bicycle,boat};
	
	//Se puede imprimir asi pero es mas practico hacerlo con un loop for	
		/*
		car.go();
		bicycle.go();
		boat.go();
		*/
	//Es mejor imprimir con el for loop para iterar en todos los elementos del array
	//El tipo de dato va a ser Vehicle y se va a usar "x" para el contador y : racers(nombre del array) para que itere una vez en cada elemento
		
		for(Vehicle x : racers) {
			x.go();
		}
	}

}
