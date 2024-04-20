import processing.core.PApplet;
import java.util.Random;
public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    size(950, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(102, 204, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

  /**
   * Create a drawing of a flower
   * 
   * @param circleX The x-coordinates of the center of the flower.
   * @param circleY The y-coordinates of the center of the flower.
   * @return A drawing of the flower.
   * @author H. Ye
   */

    drawFlower (200, 200);
    drawFlower (740, 550);
    drawMoon (75, 200);
    drawMoon (615, 550);
    }

    private void drawFlower (float circleX, float circleY) {
    
    // Draw four petals for the flower
    fill (204, 51, 255);
    ellipse(circleX - 50, circleY - 50, 100, 100);
    ellipse(circleX + 50, circleY - 50, 100, 100); 
    ellipse(circleX - 50, circleY + 50, 100, 100);
    ellipse(circleX + 50, circleY + 50, 100, 100);
  
    // Draw the middle of the flower
    int intRand = randomColour(0, 255);
    fill (intRand, 100, 100);
    ellipse(circleX, circleY, 100, 100);

    // Draw the stem of the flower
    line (circleX, circleY + 50, circleX, circleY + 200);
    stroke (0, 153/2, 0);
    strokeWeight (10);
  
    // Draw the leaves on the stem of the flower
    fill (0, 204, 0);
    triangle (circleX, circleY + 120, circleX - 50, circleY + 135, circleX, circleY + 150);
    triangle (circleX, circleY + 150, circleX, circleY + 175, circleX + 50, circleY + 165);
  
    // Draw the sun on the top left-hand corner
    fill (255, 255, 0);
    ellipse (circleX - 200, circleY - 200, 250, 250);
  
    // Draw the dirt/grass 
    fill (81, 21, 21);
    rect (circleX - 200, circleY + 185, circleX + 200, circleY - 100);
    }

    // Create a random object
    Random myRandom = new Random();
    
    private int randomColour(int min, int max)
    {
      return myRandom.nextInt(max - min + 1) + min;
    }

  /**
   * Create a drawing of the moon
   * 
   * @param circleX Draw the x-coordinate of the moon 125 to the right of the sun.
   * @param circleY Draw the y-coordinate of the sun in the exact y-coordinate of the sun.
   * @return Creating the moon drawing in relation to the sun in the first drawing.
   * @author H. Ye
   */
        
    private void drawMoon (float circleX, float circleY) {
    // Draw the moon
    fill (179, 179, 179);
    ellipse (circleX - (- 300), circleY - 200, 250, 250);
  }

}