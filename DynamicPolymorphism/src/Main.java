import java.util.Scanner;

//Polymorphism: poly-muchas morph-formas
//Dynamic: despues de la compilacion (durante el runtime)
//ej: un Corvette es un Corvette, y un auto, y un vehiculo y un objeto


public class Main {

	public static void main(String[] args) {

	//no especificamos el tipo de objeto haciendo por ej. =new Dog(); ya que lo vamos a especificar en el runtime
		
		Scanner scanner = new Scanner(System.in);
		Animal animal;
		
		System.out.println("Que animal queres?");
		System.out.print("(1=Dog) o (2=Cat): ");
		int choice =scanner.nextInt();
		
		if(choice==1) {
			animal = new Dog();
			animal.speak();
		}
		else if(choice==2) {
			animal = new Cat();
			animal.speak();
		}
		else {
			animal=new Animal();
			System.out.println("Esa respuesta fue invalida");
			animal.speak();
		}
		

	}

}
