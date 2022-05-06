import java.util.InputMismatchException;
import java.util.Scanner;

//Exceptions es un evento que ocurre durante la ejecucion de un programa que interrumpe el flujo normal de instrucciones

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//El codigo que pueda ser peligroso se lo pone dentro de try{} para que evalue las excepciones
		try {
			System.out.println("Ingrese un numero para dividir");
			int x = scanner.nextInt();
		
			System.out.println("Ingrese el dividendo");
			int y = scanner.nextInt();
		
			int z = x/y;
		
			System.out.println("El resultado de la division es: " + z);
			}
		
		//Si encuentra alguna excepcion tenemos catch blocks que pueden "agarrar" excepciones especificas 
		//o se pueden generalizar todas las exceptions como mas abajo catch(Exception e) y ejecutar un bloque de codigo {}
		
		catch(ArithmeticException e) {
			System.out.println("No se puede dividir por 0");
			}
		catch(InputMismatchException e) {
			System.out.println("Ingrese algun numero, no letras");
			}
		//se hace un ultimo catch (Exception e) por si nos olvidamos alguna excepcion pero es mejor aclarar una por una las excepciones
		
		catch(Exception e) {
			System.out.println("Algo anduvo mal");
			}
		//finally se pone para que si se "agarra" (catch) o no alguna excepcion se ejecute un bloque de codigo final
		finally {
			//siempre es una buena practica cerrar el scanner o archivos al final	
			scanner.close();
			//System.out.println("Esto se va a imprimir siempre");
		}
	
	}

}
