import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DragPanel extends JPanel{
 
 ImageIcon image = new ImageIcon("smile.png");
 final int WIDTH = image.getIconWidth();
 final int HEIGHT = image.getIconHeight();
 Point imageCorner;				
 Point prevPt;
 
 DragPanel(){
  
  imageCorner = new Point(0,0);
  ClickListener clickListener = new ClickListener();
  DragListener dragListener = new DragListener();
  this.addMouseListener(clickListener);
  this.addMouseMotionListener(dragListener);
 }
 
 //Creo inner classes
 
 public void paintComponent(Graphics g) {
  super.paintComponent(g);
  image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
 }
 
 private class ClickListener extends MouseAdapter{
  
  public void mousePressed(MouseEvent e) {
   prevPt = e.getPoint();						//Tomo el prevPt (que seria como el punto inicial del desplazamiento) cuando presiono el mouse
  }
 }
 
 private class DragListener extends MouseMotionAdapter{
  
  public void mouseDragged(MouseEvent e) {
   
   Point currentPt = e.getPoint(); //Toma el punto donde este el mouse 
   
   imageCorner.translate(
     
     (int)(currentPt.getX() - prevPt.getX()),
     (int)(currentPt.getY() - prevPt.getY())
   );
   prevPt = currentPt;
   repaint();   
  }  
 }
}
