
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama      : Alvin Lukman Nulhakim 
 * Kelas     : IF3 
 * NIM       : 10117095 
 * Deskripsi : 
 */
public class PerhitunganLingkaran {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double phi = 3.14;
        double d, r, luas, keliling;

        System.out.println("Program Luas Lingkaran\n");
        System.out.print("Masukkan nilai diameter Lingkaran  : ");
        d= input.nextDouble();

       
        r = d / 2;
        luas =  phi * r * r;
        keliling = 2 * phi * r;

        System.out.print("Jari-jari Lingkaran = " + (double) r +" \nLuas Lingkaran = " + (double) luas + " \nKeliling lingkaran = " + (int) keliling);
        System.out.println();
    }
    
}
