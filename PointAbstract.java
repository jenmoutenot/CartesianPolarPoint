/**
 * This is my code! It's goal is to serve as an abstract class for shared methods
 * CS 312 - Assignment 1
 * @author Jennifer Moutenot
 * @version 1.0 9/14/2018
 */

package asn1;

public abstract class PointAbstract implements Translating, Rotating
{
  /* purpose: rotate Cartesian point
   * input: x point to be rotated, y point to be rotated, and angle rotated by
   * output: new rotated x,y point in the form of a string
   */
  public String cartesianRotation(double x, double y, double angle)
  {
    angle = Math.toRadians(angle);
          
    double newX = (x*Math.cos(angle)) - (y*Math.sin(angle));
    y = (x*Math.sin(angle)) + (y*Math.cos(angle));
          
    String str = "Rotated cartesian point:" + newX + "," + y;
    return str;

   }
    
   /* purpose: translate Cartesian point by adding old point with new point
    * input: x point to be translated and x point translated by
    * output: new translated x point in the form of a double
    */
   public double cartesianTranslationX(double oldX, double addX)
   {
     double x = oldX + addX;
     return x;       
   }
   
   /* purpose: translate Cartesian point by adding old point y with new point y
    * input: y point to be translated and y point to be translated by
    * output: new translated y point in the form of a double
    */
   public double cartesianTranslationY(double oldY, double addY)
   {
     double y = oldY + addY;
     return y;
   }
      
   /* purpose: polar rotation of polar point to new polar point
    * input: the angle to be rotated and the angle it is to be rotated by
    * output: the rotated polar point in the form of a string    
    */
   public String polarRotation(double angle, double newAngle)
   {
     angle = angle + newAngle;
        
     String str = "Rotated polar point:" + angle;
     return str;
   }
}  
