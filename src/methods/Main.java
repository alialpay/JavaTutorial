package methods;

import java.util.Scanner;

public class Main {
    public  static void main(String[] args){
/*
        sayiBulmaca();
    }
    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 6;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            mesajVer("sayı mevcuttur: " + aranacak);
        } else {
            mesajVer("sayı mevcut değildir: " + aranacak);
        }
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);


 */

        System.out.println("Boyutu giriniz");


        System.out.println("  ****");
        System.out.println(" ******");
        System.out.println("********");
        System.out.println("********");
        System.out.println(" ******");
        System.out.println("  ****");


        for (int i=0;i<7;i++){
            if(i<3){
                System.out.print(" ");
            }else {
                System.out.print("*");
            }
        }
        System.out.println();
        for (int i=0;i<8;i++){
            if(i<2){
                System.out.print(" ");
            }else {
                System.out.print("*");
            }
        }
        System.out.println();
        for (int i=0;i<9;i++){
            if(i<1){
                System.out.print(" ");
            }else {
                System.out.print("*");
            }
        }
        System.out.println();
        for (int i=0;i<9;i++){
            if(i<1){
                System.out.print(" ");
            }else {
                System.out.print("*");
            }
        }System.out.println();
        for (int i=0;i<8;i++){
            if(i<2){
                System.out.print(" ");
            }else {
                System.out.print("*");
            }
        }
        System.out.println();
        for (int i=0;i<7;i++){
            if(i<3){
                System.out.print(" ");
            }else {
                System.out.print("*");
            }
        }




    }

}