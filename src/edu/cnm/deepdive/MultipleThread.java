package edu.cnm.deepdive;

public class MultipleThread {

  public static void main(String[] args) { //run MultipleThread to have input and sleep run simultaneously.
    Thread lazy = new LazyThread();
    lazy.start();
    Utility.processInput();
  }


}
