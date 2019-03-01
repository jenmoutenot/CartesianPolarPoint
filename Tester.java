/**
 * This is my code! It's goal is to serve as a tester to test my code
 * CS 312 - Assignment 1
 * @author Jennifer Moutenot
 * @version 1.0 9/14/2018
 */

package asn1;

public class Tester
{
  public static void main(String [] args)
  {
    CartesianPoint cp = new CartesianPoint();
    PolarPoint pp = new PolarPoint();
    
    //Test Case 1
    System.out.println("Testing (2,3) to be translated by (1,2) (should be (3,5)) = "
    + cp.cartesianTranslationX(2.0,1.0) + ","
    + cp.cartesianTranslationY(3.0, 2.0));
    
    //Test Case 2
    System.out.println("Testing (4,6) to be translated by (4,1) (should be (8,7)) = "
    + cp.cartesianTranslationX(4.0,4.0) + ","
    + cp.cartesianTranslationY(6.0, 1.0));
    
    //Test Case 3
    System.out.println("Testing (3,2) to be rotated by 45 degrees (should be (.707,3.5355)) = "
    + cp.cartesianRotation(3.0,2.0,45.0));
    
    //Test Case 4
    CartesianPoint cr2 = new CartesianPoint();
    System.out.println("Testing (3,4) to be rotated by 0 degrees (should be (3,4)) = "
    + cp.cartesianRotation(3.0,4.0,0.0));
    
    //Test Case 5
    double cartesianX = cp.asCartesianX(45.0, 4.0);
    double cartesianY = cp.asCartesianY(45.0, 4.0);
    double convertedX = cp.cartesianTranslationX(cartesianX, 3);
    double convertedY = cp.cartesianTranslationY(cartesianY, 4);
    double translatedX = pp.asPolarAngle(convertedX, convertedY);
    double translatedY = pp.asPolarRadius(convertedX, convertedY);
    
    System.out.println("Testing 45 degrees, 4 radius to be translated by (3,4) (should be 49.52 degrees, 8.98 radius) = "
    + translatedX + "," + translatedY);
 
    //Test Case 6
    double cartesianX2 = cp.asCartesianX(0.0, 6.0);
    double cartesianY2 = cp.asCartesianY(0.0, 6.0);
    double convertedX2 = cp.cartesianTranslationX(cartesianX2, 2);
    double convertedY2 = cp.cartesianTranslationY(cartesianY2, 3);
    double translatedX2 = pp.asPolarAngle(convertedX2, convertedY2);
    double translatedY2 = pp.asPolarRadius(convertedX2, convertedY2);
    
    System.out.println("Testing 0 degrees, 6 radius to be translated by (2,3) (should be 20.56 degrees, 8.54 radius) = "
    + translatedX2 + "," + translatedY2);
       
    //Test Case 7
    System.out.println("Testing 90 degrees, 8 radius to be rotated 10 degrees (should be 100 degrees)) = "
    + pp.polarRotation(90.0,10.0));
    
    //Test Case 8
    System.out.println("Testing 75 degrees, 2 radius to be rotated 130 degrees (should be 205 degrees)) = "
    + pp.polarRotation(75.0,130.0));
  }
}


