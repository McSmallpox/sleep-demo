package edu.cnm.deepdive;

public class SingleThread {

  public static void main(String[] args) { //run SingleThread to have your inputs be queued until sleep is over.
    Utility.takeNap(10_000);
    Utility.processInput();
  }

}
