/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact;

import java.util.Scanner;

/**
 *
 * @author StarHP
 */
public class Fact {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
       int f=n;
       for(int i=(n-1);i>1;i--)
       {
        f=f*i;
   }
    System.out.println("Fact of"+n+"is"+f);
}
}