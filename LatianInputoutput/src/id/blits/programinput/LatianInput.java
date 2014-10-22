/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.blits.programinput;

import java.util.Scanner;

/**
 *
 * @author Deddy_CkL1st
 */
public class LatianInput {
    public static void main(String[]args){
     Scanner input =new Scanner(System.in);
     System.out.print("Masukan Nama :");
     String Nama=input.nextLine();
     
     System.out.print("alamat :");
     String Alamat=input.nextLine();
     
     System.out.print("NPM: ");
     int NPM =input.nextInt();
     
     System.out.print("Nilai tugas besar :");
     int tugasbesar  =input.nextInt();
     
     System.out.print("nilai tugas kecil :");
     int tugaskecil=input.nextInt();
     
     System.out.print("nilai kuis 1: ");
     int kuis1=input.nextInt();
     
     System.out.print("nilai kuis2: ");
     int kuis2=input.nextInt();
     
     System.out.print("Nilai UAS praktek :");
     int UASpraktek=input.nextInt();
     
     System.out.print("Nilai UAS teori :");
     int UASteori=input.nextInt();
     
     float tugas1 =(float) (tugasbesar *0.7);
     float tugas2 =(float) (tugaskecil *0.3);
     float tugas =tugas1+tugas2;
     
     float kuis=kuis1+kuis2/2;
     
     float UAS1 =(float) (UASpraktek *0.6);
     float UAS2 =(float) (UASteori *0.4);
     float UAS =UAS1 +UAS2;
     
     System.out.println();
     System.out.println("Nama anda:"+ Nama);
     System.out.println("Alamat anda :"+ Alamat);
     System.out.println("NPM anda :"+ NPM);
     System.out.println("Niai kuis anda :"+ kuis);
     System.out.println("Nilai tugas anda :"+ tugas);
     System.out.println("nilai uas anda :"+ UAS);
     
         
     
    }
    
}
