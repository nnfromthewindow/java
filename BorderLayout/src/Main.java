import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		// Layout Manager = Defines the natural layout for components within a container
		
				// 3 common managers
				
				// BorderLayout = 	A BorderLayout places components in five areas: NORTH,SOUTH,WEST,EAST,CENTER. 
				//					All extra space is placed in the center area.

				JFrame frame = new JFrame();	//creo el frame
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//seteo el boton de cerrar el JFrame
				frame.setSize(500, 500);	// seteo el tamaño de mi JFrame
				frame.setLayout(new BorderLayout(10,10));  //Declaro que el Layout va a ser BorderLayout y dentro de los argumentos()van los margenes que deseo en pixels
				frame.setVisible(true); // seteo que sea visible el JFrame

				JPanel panel1 = new JPanel();	//creo los JPanels
				JPanel panel2 = new JPanel();
				JPanel panel3 = new JPanel();
				JPanel panel4 = new JPanel();
				JPanel panel5 = new JPanel();
				
				panel1.setBackground(Color.red);	//seteo el color del fondo de cada JPanel
				panel2.setBackground(Color.green);
				panel3.setBackground(Color.yellow);
				panel4.setBackground(Color.magenta);
				panel5.setBackground(Color.blue);
				
				//panel5.setLayout(new BorderLayout());	//Aca el Bro me parece que le pifio y escribio dos veces el seteo de BorderLayout 
														//para el panel5 que es el del medio para crear subpaneles
				
				panel1.setPreferredSize(new Dimension(100,100));	//seteo la dimension de cada panel en pixels
				panel2.setPreferredSize(new Dimension(150,100));
				panel3.setPreferredSize(new Dimension(150,100));
				panel4.setPreferredSize(new Dimension(100,100));
				panel5.setPreferredSize(new Dimension(100,100));
				
				//------------- sub panels --------------------
				
				JPanel panel6 = new JPanel();	//Creo JPanel 6,7,8,9 y 10 que serian los subpaneles
				JPanel panel7 = new JPanel();
				JPanel panel8 = new JPanel();
				JPanel panel9 = new JPanel();
				JPanel panel10 = new JPanel();
				
				panel6.setBackground(Color.black); 		//Seteo el color de fondo para mis subpaneles
				panel7.setBackground(Color.darkGray);
				panel8.setBackground(Color.gray);
				panel9.setBackground(Color.lightGray);
				panel10.setBackground(Color.white);
				
				panel5.setLayout(new BorderLayout());	//Seteo que el panel5 va a contener un BorderLayout, Bro lo puso aca, yo lo pondria mas arriba del codigo
						
				panel6.setPreferredSize(new Dimension(50,50));	//Seteo el tamaño de mis nuevos subpaneles
				panel7.setPreferredSize(new Dimension(50,50));
				panel8.setPreferredSize(new Dimension(50,50));
				panel9.setPreferredSize(new Dimension(50,50));
				panel10.setPreferredSize(new Dimension(50,50));
			
				panel5.add(panel6,BorderLayout.NORTH);		//Agego al panel5 mis nuevos subpaneles y les asigno la ubicacion
				panel5.add(panel7,BorderLayout.SOUTH);
				panel5.add(panel8,BorderLayout.WEST);
				panel5.add(panel9,BorderLayout.EAST);
				panel5.add(panel10,BorderLayout.CENTER);
				
				//------------- sub panels --------------------
			
				frame.add(panel1,BorderLayout.NORTH);	//agrego los paneles a mi JFrame con BorderLayout aclarando su ubicacion en el JFrame (N,W,E,S,C)
				frame.add(panel2,BorderLayout.WEST);	//El Bro los puso aca abajo del codigo pero me parece le pifio, los podndria arriba
				frame.add(panel3,BorderLayout.EAST);	// junto a los paneles principales ya que panel1,2,3,4 y 5 no son los sub panels
				frame.add(panel4,BorderLayout.SOUTH);
				frame.add(panel5,BorderLayout.CENTER);

	}

}
