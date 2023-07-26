package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

    Scanner input   = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
    int s = input.nextInt();


    if(s%2==0){
        System.out.println("Cift sayı");
    }

    if(s%2!=0){
        System.out.println("Tek sayi");


        //ex2:
        System.out.println("Bir sayı giriniz");

        double d = input.nextDouble();


        if(d>0) {

            System.out.println("Pozitif");

        }else if(d==0) {

            System.out.println("Notr");
        }else{
            System.out.println("Negatif");
        }
    }
  }

}