
import java.applet.Applet;
import java.awt.*;

public class Bullseye extends Applet
{
	//Graphics page;
   //-----------------------------------------------------------------
   //  Paints a bullseye target.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {

		drawCircle(200, 200, 500,page);

		//drawCircle(600, 600, 100,page);



      /**/
   }// end of paint

   void drawCircle(int x, int y, float radius,Graphics page) {

	  page.drawOval(x,y,(int)radius,(int)radius);

	}//end of drawCircle
}//end of class
