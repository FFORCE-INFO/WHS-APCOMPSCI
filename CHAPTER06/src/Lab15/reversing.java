/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab15;

/**
 *
 * @author Frank
 */
import java.util.Scanner;

public class reversing {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        
        System.out.println("How much values you have? ");
        int number = scan.nextInt();
        while(number <= 0){
            System.out.print("INVALAD intput, try again:  ");
            number = scan.nextInt();
        }
        double[] values = new double[number];
        scan.nextLine();
        System.out.print("Please enter the values with space between them: ");
        for (int i = 0; i < number; i++) {
            values[i] = scan.nextDouble();
        }
        for (double x : values) {
            System.out.print(x + "\t");
        }
     
        int s = 0;
        int e = values.length - 1;
        double temp = 0;
        do {
            temp = values[s];
            values[s] = values[e];
            values[e] = temp;
            s++;
            e--;
        } while (s < e);
        System.out.println("\n the results reversing:");
        for (double x : values) {
            System.out.print(x + "\t");
        }
    }

}

