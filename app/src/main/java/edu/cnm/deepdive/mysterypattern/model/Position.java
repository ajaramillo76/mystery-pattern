package edu.cnm.deepdive.mysterypattern.model;

public class Position {

  private double x;
  private double y;

  public Position(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }
//"protected" can be accessed by anything in it's class, but cannot be modified by anything outside of it's class
  protected void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  protected void setY(double y) {
    this.y = y;
  }

}

