import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;  
import java.awt.Graphics;  
 
/* <APPLET CODE="MouseEvents.class" WIDTH="300" HEIGHT="300">
   </APPLET>
*/
 
public class MouseEvents extends Applet implements MouseListener, MouseMotionListener {
 
 String message = "";
 
 /* String m="This is my java project";*/
 int x,y;
  
 public void init() {
  
  setBackground(Color.YELLOW);
  addMouseListener(this);
  addMouseMotionListener(this);
 }
 
 public void paint(Graphics g) {
  g.drawString(message, 50, 50);
  
 
  Font font= new Font("Monospaced", Font.ITALIC, 22); 
  g.setFont(font);  
g.drawString("This is my Java NSP project", 550, 70); 

  g.setColor(Color.RED);  
   g.fillOval(x,y,50,80); 
 }
 
 public void mouseEntered(MouseEvent me) {
  setBackground(Color.PINK);
  message = "Mouse Entered: (" + me.getX() + ", " + me.getY() + ")";
  repaint();
 }
 
  

 public void mouseExited(MouseEvent me) {
  setBackground(Color.RED);
  message = "Mouse Exited: (" + me.getX() + ", " + me.getY() + ")";
  repaint();
 }
 
 public void mouseClicked(MouseEvent me) {
  setBackground(Color.CYAN);
  message = "Mouse Clicked: (" + me.getX() + ", " + me.getY() + ")";
  x = me.getX();
  y = me.getY();
  repaint();
 }
 
 public void mousePressed(MouseEvent me) {
  setBackground(Color.MAGENTA);
  message = "Mouse Pressed: (" + me.getX() + ", " + me.getY() + ")";
  repaint();
 }
 
 public void mouseReleased(MouseEvent me) {
  setBackground(Color.GREEN);
  message = "Mouse Released: (" + me.getX() + ", " + me.getY() + ")";
  repaint();
 }
 
 public void mouseMoved(MouseEvent me) {
  setBackground(Color.ORANGE);
  message = "Mouse Moved: (" + me.getX() + ", " + me.getY() + ")";
  repaint();
 }
 
 public void mouseDragged(MouseEvent me) {
  setBackground(Color.GRAY);
  message = "Mouse Dragged: (" + me.getX() + ", " + me.getY() + ")";
  x = me.getX();
  y = me.getY();
  repaint();
 }
}