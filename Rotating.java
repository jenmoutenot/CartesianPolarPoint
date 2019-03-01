/**
 * This is my code! It's goal is to serve as an Interface for rotation methods
 * CS 312 - Assignment 1
 * @author Jennifer Moutenot
 * @version 1.0 9/14/2018
 */

package asn1;

public interface Rotating
{
  public String cartesianRotation(double x, double y, double angle);
  public String polarRotation(double angle, double newAngle);
}
