import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {
	
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0,100); //Se aclaran los valores minimos y maximos dentro de los()
	
	ProgressBarDemo(){
		
		bar.setValue(0);
		bar.setBounds(0,0,420,50);
		bar.setStringPainted(true);
		bar.setFont(new Font("MV Boli",Font.BOLD,25));
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
			
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();		//creamos el metodo fill afuera a nievl global y lo instanciamos dentro del constructor ProgressBarDemo
	}
	
	public void fill() {
		int counter =0;
		
		while(counter<=100) {
			
			bar.setValue(counter);
			try {					//Para hacer la prueba del progress bar uso el Thread.sleep() donde pongo la cantidad de milisegs.
				Thread.sleep(50);	//que se detiene para volver a iniciar el while loop
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			counter +=1; // poner counter +=1 es como hacer counter = counter +1
		}
		bar.setString("Done! :)"); //Cuando salgo del loop porque counter llego a =100 imprime esto
	}

}
