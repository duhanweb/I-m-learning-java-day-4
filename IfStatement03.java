package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {

    // iki tane strıngde == yerine equals kullanılır.
    //equals kucuk buyuk harf aryımı yapar
    //equalsıgnorecase yapmaz
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println("Gün ismini giriniz");
        String gunName = input.nextLine();
        if (gunName.equalsIgnoreCase("Pazar")) {

            System.out.println("Hafta sonu");
        } else if (gunName.equals("Pazartesi")) {
            System.out.println("Hafta içi");
        } else if (gunName.equals("Salı")) {
            System.out.println("Hafta içi");
        } else if (gunName.equals("Çarşamba")) {
            System.out.println("Hafta içi");
        } else if (gunName.equals("Perşembe")) {
            System.out.println("Hafta içi");
        } else if (gunName.equals("Cuma")) {
            System.out.println("Hafta içi");
        } else if (gunName.equals("Cumartesi")) {
            System.out.println("Hafta sonu");
        } else ;
        System.out.println("Doğru bir isim giriniz");
    }
}
