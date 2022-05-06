
//FileReader: lee el contenido de un archivo como una cadena de caracteres. Uno por uno read() devuelve un valor int que contiene el valor byte
//			  de cada caracter leido. Cuando read() devuelve el valor de -1 es que ya no hay mas datos por leer

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try {
			FileReader reader = new FileReader("art.txt"); 
			int data = reader.read();    //creo un valor int en este caso data para que aloje el valor int del caracter leido por el metodo .read del FileReader
										 //Inicia a leer el primer caracter y queremos que continue leyendo mientras sea desigual(!=) a -1 de valor int(data)
			while(data!=-1) {			 //Para eso lo hacemos con un while loop	
			System.out.print((char)data); //imprime en la misma linea el valor transformado a char de data que originalmente es int
			data=reader.read(); 		  //sigue leyendo y sale del loop cuando lea int -1
			}
		reader.close();		//cerramos el FileReader reader
		
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
