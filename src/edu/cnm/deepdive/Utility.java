package edu.cnm.deepdive;

import java.util.Scanner;

public class Utility {

  static void processInput() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine().trim();
      if (!input.isEmpty()) { // the ! in !input.isEmpty() turns that statement into "if input is NOT empty."
        System.out.println(input.toUpperCase());
      }
    }
  }

  static void takeNap(long duration) {
    try {
      System.out.printf("Going to sleep for %.2f seconds.\u2026%n", duration / 1000.0); //the \u20206 is an embedded unicode character, the number
      //being the character's address. 2026 is a horizontal ellipses.
      Thread.sleep(duration);
    } catch (InterruptedException e) {
     //DO NOTHING!
    } finally {
      System.out.println("\u2026\nwaking up now!");
    }
  }
}
