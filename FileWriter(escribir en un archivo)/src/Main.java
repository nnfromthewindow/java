
//FileWriter se usa para escribir iun archivo en java, se usa en conjunto con try y catch exceptions 

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
	
		try {
			FileWriter writer = new FileWriter("poem.txt");
				writer.write("Las rosas son rojas \n Las violetas azules \n Y la marimba es verde");
				writer.append("\n TEXTO CREADO POR NICO");
				writer.close();
		
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
