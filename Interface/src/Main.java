//Interface: son plantillas (templates) que pueden ser aplicadas a una clase
// 			 Es similar a inheritance solo que especifica que es lo que debe hacer la clase y puede aplica mas de una interface mientras que inheritance
//			 se limita a un solo super 

public class Main {

	public static void main(String[] args) {
	
		
		Hawk hawk = new Hawk();
		hawk.hunt();
		Rabbit rabbit = new Rabbit();
		rabbit.flee();
		Fish fish = new Fish();
		fish.hunt();
		fish.flee();
		
		
	}

}
