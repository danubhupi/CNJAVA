package Strings;

import java.util.Scanner;

public class printAllChars {
	
	public static void printAllChars(String s) {
//		for(char i:s) {
//			System.out.println(i);
//		}
		
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		printAllChars(sc.nextLine());
		System.out.println((char)97);

	}

}
