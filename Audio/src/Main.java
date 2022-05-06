//Audio: importamos el paquete javax.sound.sampled.*

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		Scanner scanner = new Scanner(System.in);
		
		//Traemos el archivo mediante File, en el constructor de File() ponemos el nombre de mi archivo wav o su path
		
		File file = new File("pop.wav");	//Declaro el archivo de audio en carpeta o path de mi equipo 
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);	//Declaro el ingreso de audio de mi sistema de audio mixer y lo aplico a mi file 
		Clip clip = AudioSystem.getClip();	//Declaro un Clip obteniendolo a traves de mi sistema de audio mixer
		clip.open(audioStream);		//abro el clip mediante el metodo AudioInputStream
		
		String response = ""; //creamos una String response fuera del while loop para asignarle luego el scanner y asi poder elegir una respuesta
		//Usamos un while loop para crear una especie de reproductor
		
		while(!response.equals("Q")) {		//mientras la response sea desigual "Q" se ejecuta el loop 
			System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");	
			System.out.print("Entra tu opcion: ");
		
			response = scanner.next();	//Asignamos el scanner a response para poder ingresar texto(nuestra respuesta)
			response = response.toUpperCase(); //Establecemos que response lo transforme en mayusculas por si aprietan minuscula en el Scanner
			
			//Creamos un switch para que examine nuestra respuesta y ver si coincide asignarle una funcion 
			
			switch(response) {
			case("P"): clip.start();
			break;
			case("S"): clip.stop();
			break;
			case("R"): clip.setMicrosecondPosition(0);
			break;
			case("Q"): clip.close();
			
			}
		}
		System.out.println("Chauuuuu gracias por escuchar!!!");		
	}

}
