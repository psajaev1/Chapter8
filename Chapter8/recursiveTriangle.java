
import javax.swing.JApplet;
import java.awt.*;

public class recursiveTriangle extends JApplet
{
   private final int APPLET_WIDTH = 800;
   private final int APPLET_HEIGHT = 800;

   /*
   //x is across and y is down
   point 1 - Right  A x[0],y[0] (720,600)
   point 2 - Left   B x[1],y[1]
   point 3 - Top    C x[2],y[2]
   point 4 draws back to point 1 to complete triangle

   */  private int[] xPos = {720, 80, 400, 720};
    private int[] yPos = {600, 600, 40, 600};


   //-----------------------------------------------------------------
   //  Sets up the basic applet environment.
   //-----------------------------------------------------------------
   public void init()
   {
      setBackground (Color.white);
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }

   //-----------------------------------------------------------------
   //  Draws a Triangle using polygons.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {

        page.setColor (Color.red);
        page.drawPolyline (xPos, yPos, xPos.length);

        Triangle(xPos,yPos,page);

   }//end of paint

   public void Triangle(int[] xPos, int[] yPos, Graphics page)
   {
       //Find the distance between 2 points ex. - x,y & x1,y1
       
       double distance = Math.sqrt(Math.pow((xPos[2] - xPos[1]),2) + Math.pow((yPos[2] - yPos[1]),2));
     
       
       
        if (distance >= 4)
        {
              int ABMidx, BCMidx, ACMidx, ABMidy, BCMidy, ACMidy;
       
              ABMidx = (xPos[0] + xPos[1]) / 2;
              BCMidx = (xPos[1] + xPos[2]) / 2;
              ACMidx = (xPos[0] + xPos[2]) / 2;
              ABMidy = (yPos[0] + yPos[1]) / 2;
              BCMidy = (yPos[1] + yPos[2]) / 2;
              ACMidy = (yPos[0] + yPos[2]) / 2;
              
              
            //find the mid points of each line segment
            
            
            //make the x and y array (3 points + first point to finish triangle)
            
        

            //draw the Triangle
        
            page.drawPolyline(xPos,yPos,xPos.length);
            //create 3 x,y Array using the midpoints you calculated
            
            int[] ATrix = {xPos[0],ABMidx,ACMidx,xPos[0]};
            int[] BTrix = {ABMidx,xPos[1],BCMidx,ABMidx};
            int[] CTrix = {ACMidx,BCMidx,xPos[2],ACMidx};
            
            int[] ATriy = {yPos[0],ABMidy,ACMidy,yPos[0]};
            int[] BTriy = {ABMidy,yPos[1],BCMidy,ABMidy};
            int[] CTriy = {ACMidy,BCMidy,yPos[2],ACMidy};
            
            //example
            //int[] ATrix = {xPos[0],Segment1Midx,Segment2Midx, xPos[0]};



            // Three recursive calls for each section of triangle
            //example
            
            Triangle(ATrix,ATriy, page);
            Triangle(BTrix,BTriy, page);
            Triangle(CTrix,CTriy, page);
            
            
        }
        
       
       


   }//end of Triangle
}
