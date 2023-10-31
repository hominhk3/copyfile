package common;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Scanner;

public class Library {

    Scanner sc = new Scanner(System.in);

    public int getInt(String promt, int m, int n) {
        int a = -1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(promt + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }
//
//    public int[] createArray(int size_Array) {
//        int[] array = new int[size_Array];
//        Random rd = new Random();
//        for (int i = 0; i < size_Array; i++) {
//            array[i] = rd.nextInt(100);
//        }
//        return array;
//    }
//
//    public void display(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            if (i < array.length - 1) {
//                System.out.print(array[i] + ", ");
//            } else {
//                System.out.print(array[i]);
//            }
//        }
//        System.out.println("");
//    }

}
