/**
 * This is my code! It's goal is to serve as a concrete class for asPolar conversions
 * CS 312 - Assignment 1
 * @author Jennifer Moutenot
 * @version 1.0 9/14/2018
 */

package asn1;

import java.util.*;

public class PolarPoint extends PointAbstract
{
  /* purpose: conversion from Cartesian to polar
   * input: x and y from Cartesian point
   * output: radius value in polar    
   */
  public double asPolarRadius(double x, double y)
  {
    double radius = Math.sqrt(x*x + y*y);
        
    return radius;
  }

  /* purpose: conversion from Cartesian to polar
   * input: x and y from Cartesian point
   * output: angle value in polar
   */
  public double asPolarAngle(double x, double y)
  {
    double angle = Math.atan2(y, x);   
    angle = Math.toDegrees(angle);
            
    return angle;
  }
}  
