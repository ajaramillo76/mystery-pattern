package edu.cnm.deepdive.mysterypattern.model;

import  java.util.Random;

public class Agent extends Position {

  private static Random rng = new Random();

  public Agent(double x, double y) {
    super(x, y);
  }

  public void jump(Position[] vertices, double fraction) { //"fraction" represents how far we would like to go. i.e., .5 = half way, 0 = stay still, 1 = all the way.
    Position target = vertices[rng.nextInt(vertices.length)];
    setX(getX() + (target.getX() - getX()) * fraction);
    setY(getY() + (target.getY() - getY()) * fraction);
  }

}
