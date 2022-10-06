package codechef;

import java.util.Scanner;

public class ReverseWords {

  public static String reverseWord(String s) {
    String reverse = new String("");
    for (int i = s.length() - 1; i >= 0; i--) {
      reverse += s.charAt(i);
    }
    return reverse + " ";
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String:");
    String input = sc.nextLine();
    if (input.length() == 0) {
      System.out.println("Enter valid String");
      return;
    }
    String[] words = input.split(" ");
    String result = new String("");
    for (int i = 0; i < words.length; i++) {
      result += reverseWord(words[i]);
    }
    System.out.println(result);
  }
}