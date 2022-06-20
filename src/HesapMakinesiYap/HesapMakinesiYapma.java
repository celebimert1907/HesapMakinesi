package HesapMakinesiYap;

import java.util.Scanner;

public class HesapMakinesiYapma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;
        int select;

        System.out.print("Islem yapmak istediginiz ilk sayiyi giriniz: ");
        num1=input.nextInt();
        System.out.print("Islem yapmak istediginiz ikinci sayiyi giriniz: ");
        num2=input.nextInt();

        System.out.println("Yapmak istediginen islemi seciniz.\nToplama islemi icin (+) => 1 i seciniz.\n" +
                "Cikartma islemi icin (-) => 2 yi seciniz.\nBolme islemi icin (/) => 3 u seciniz.\n" +
                "Carpma islemi icin (*) => 4 u seciniz.");
        System.out.print("Yapmak istedigim islemin numarasi: ");
        select=input.nextInt();

        if (select == 1){
            System.out.print("Sonuc: " + (num1+num2));
        } else if (select == 2){
            System.out.print("Sonuc: " + (num1-num2));
        }
        else if (select == 3){
            if (num2 != 0){
                System.out.print("Sonuc: " + (num1/num2));
            } else {
                System.out.println("Sifara bolme islemi yapilamaz.");
            }
        } else if (select == 4){
            System.out.print("Sonuc: " + (num1*num2));
        } else{
            System.out.print("Hatali giris yaptiniz!");
        }
    }
}
