import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.GRAY);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                        //Draw a outside border
                        g.setColor(Color.LIGHT_GRAY);
                        g.drawRect(x1, y1, width, height);
                        
                        //Draw a inside border
                        g.setColor(Color.BLACK);
                        g.drawRect(x1 , y1 , width, height);
                        
                        // Line 1
                        //g.setColor(Color.BLUE);
                        //g.drawLine(x1 + 10, y1 + 10, width - 10, height - 10);
                        
                        // Line 2
                        //g.setColor(Color.BLUE);
                        //g.drawLine(width, y1, x1,height);
                        
                        //g.setColor(Color.BLUE);
                        //g.fillOval(x1 + 70, y1 + 70, 55, 55);
                        
                        //Polygon p = new Polygon();
                        //p.addPoint(x1 + 5, y1 + 25);
                        //p.addPoint(x1 + 20, y1 + 10);
                        //p.addPoint(x1 + 35, y1 + 25);
                        //p.addPoint(x1 + 25, y1 + 25);
                        //p.addPoint(x1 + 25, y1 + 45);
                        //p.addPoint(x1 + 15, y1 + 45);
                        //p.addPoint(x1 + 15, y1 + 25);
                        //g.setColor(Color.YELLOW);
                        //g.fillPolygon(p);  
                        
                        
                        
                        //Franjas                    
                        g.setColor(Color.RED);
                        g.fillRect(x1 + 0, y1, width, height- 130);                   
                        g.setColor(Color.WHITE);
                        g.fillRect(x1 + 0, y1 + 30, width, height - 130);
                        g.setColor(Color.RED);
                        g.fillRect(x1 + 0, y1 + 60, width, height- 120);
                        g.setColor(Color.WHITE);
                        g.fillRect(x1 + 0, y1 + 100, width, height - 130);
                        g.setColor(Color.RED);
                        g.fillRect(x1 + 0, y1 + 130, width, height - 130);
                       

                        Polygon p3 = new Polygon();
                        p3.addPoint(x1 + 95, y1 + 85);
                        p3.addPoint(x1 + 0, y1 + 1);
                        p3.addPoint(x1 + 115, y1 + 85);
                        p3.addPoint(x1 + 0, y1 + 160);
                        p3.addPoint(x1 + 0, y1 + 1);
                        p3.addPoint(x1 + 0, y1 + 1);
                        p3.addPoint(x1 + 0, y1 + 1);                     
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p3);
                        
                        //Star
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 73);
                        p2.addPoint(x1 + 41, y1 + 73);
                        p2.addPoint(x1 + 47, y1 + 58);
                        p2.addPoint(x1 + 53, y1 + 73);
                        p2.addPoint(x1 + 69, y1 + 73);
                        p2.addPoint(x1 + 56, y1 + 83);
                        p2.addPoint(x1 + 61, y1 + 98);
                        p2.addPoint(x1 + 47, y1 + 88);
                        p2.addPoint(x1 + 34, y1 + 98);
                        p2.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        
                       
                        
                       
                        
                        
                        
                 
            }
}