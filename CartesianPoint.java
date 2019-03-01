/**
 * This is my code! It's goal is to serve as a concrete class for asCartesian conversions
 * CS 312 - Assignment 1
 * @author Jennifer Moutenot
 * @version 1.0 9/14/2018
 */

package asn1;

import java.util.*;

public class CartesianPoint extends PointAbstract
{
  /* purpose: conversion from polar to Cartesian point
   * input: angle and radius
   * output: x value in Cartesian    
   */
  public double asCartesianX(double angle, double radius)
  {
    angle = Math.toRadians(angle);
    double x;
        
    x = radius*Math.cos(angle);
    return x;
  }
    
  /* purpose: conversion from polar to Cartesian point
   * input: angle and radius
   * output: y value in Cartesian    
   */
  public double asCartesianY(double angle, double radius)
  {
    angle = Math.toRadians(angle);
    double y;
        
    y = radius*Math.sin(angle);
    return y;
  }

}

