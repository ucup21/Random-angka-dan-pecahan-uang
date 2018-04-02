/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class TugasJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TugasJava tugas = new TugasJava();
        System.out.println("######## Random Angka Unik ########");
        System.out.println(tugas.acak(10)+"\n");
        System.out.println("######## Pecahan Uang ########");
        tugas.mecahin(1880820);

//        int jmlPecahan[] = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200,
//             100};
//        pecahan(jmlPecahan);
    }

//    public static void pecahan(int nominal[]) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Masukan nominal uang : Rp");
//        int uang;
//        uang = scan.nextInt();
//        for (int i = 0; i < 10; i++) {
//            int jml = uang / nominal[i];
//            uang = uang - (nominal[i] * jml);
//            System.out.println(i + ") Rp" + nominal[i] + " = " + jml);
//        }
//        if (uang == 0) {
//            System.out.println("Berhasil Menukarkan Uang");
//        } else {
//            System.out.println("Tahun 2018 ga ada pecahan Rp" + uang);
//        }
//    }
    public static ArrayList acak(int batas) {
        ArrayList numbers = new ArrayList();
        for (int i = 0; i < batas; i++) {
            numbers.add(i + 1);
        }
        Collections.shuffle(numbers);
        return numbers;
    }

    public int mecahin(int uang) {
        int nominal[] = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200,
            100};
        for (int i = 0; i < 10; i++) {
            int jml = uang / nominal[i];
            uang = uang - (nominal[i] * jml);
            System.out.println(i + ") Rp" + nominal[i] + " = " + jml);
        }
        if (uang == 0) {
            System.out.println("Berhasil Menukarkan Uang");
        } else {
            System.out.println("Tahun 2018 ga ada pecahan Rp" + uang);
        }
        return uang;
    }

}
