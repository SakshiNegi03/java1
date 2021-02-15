package qus6;

import java.util.Scanner;

public class Element  {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);

        int[] arr = new int[101];

        System.out.print("Enter length of array: ");
        int a = f.nextInt();
        System.out.print("Enter elements in array: ");
        for(int i=0; i<a; i++) arr[i] = f.nextInt();

        int b = 0;
        for(int i=0; i<a; i++){
            b = 0;
            for(int j=0; j<a; j++){
                if(i!=j){
                    if (arr[i] == arr[j]) {
                        b = 1;
                        break;
                    }
                }
            }
            if(b == 0){
                b = arr[i];
                break;
            }

        }

        System.out.print("The element which is not repeated twice is " + b);
    }
}