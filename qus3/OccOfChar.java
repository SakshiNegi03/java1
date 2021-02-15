package qus3;

import java.util.Scanner;

public class OccOfChar{
    public static void main(String[] args)
    {
        String str = "Java is java ";
        int count = str.length() - str.replace("a", "").length();
		System.out.println("Number of occurances of 'a' in "+str+" = "+count);
    }
}