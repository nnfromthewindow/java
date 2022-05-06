import java.io.File;

//file es una representacion abstracta de un archivo y su ubicacion

public class Main {

	public static void main(String[] args) {
		
		File file = new File("secret_message.txt");
		
			if(file.exists()) {
				System.out.println("El archivo existe");
				System.out.println(file.getPath());
				System.out.println(file.getAbsolutePath());
				System.out.println(file.isFile());
			}
			else {
				System.out.println("El archivo no existe");
			}
		
		
		
	}

}
