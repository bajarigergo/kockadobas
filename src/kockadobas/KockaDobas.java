/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kockadobas;

import java.util.Random;
import java.util.Scanner;

public class KockaDobas {

    static Random veletlen = new Random();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Hányszor dobjunk?");
        int be = sc.nextInt();
        while (be<0){
            be = sc.nextInt();
        }
        int egyes = 0;
        int kettes = 0;
        int harmas = 0;
        int negyes = 0;
        int otos = 0;
        int hatos = 0;
        /*int[] sorozat;
        sorozat = new int[be];
        for (int i = 0; i < be; i++) {
            int dobas = veletlen.nextInt(1, 7);
            sorozat[i] = dobas;
        }*/
        /*for (int i = 0; i < sorozat.length; i++) {
            if (sorozat[i] == 1){
                egyes++;
            }else if (sorozat[i] == 2){
                kettes++;
            }else if (sorozat[i] == 3){
                harmas++;
            }else if (sorozat[i] == 4){
                negyes++;
            }else if (sorozat[i] == 5){
                otos++;
            }else{
            hatos++;
            }
            
        }*/

        for (int i = 0; i < be; i++) {
            int dobas = veletlen.nextInt(1, 7);
            if (dobas == 1){
                egyes++;
            }else if (dobas == 2){
                kettes++;
            }else if (dobas == 3){
                harmas++;
            }else if (dobas == 4){
                negyes++;
            }else if (dobas == 5){
                otos++;
            }else{
            hatos++;
            }
        }
        System.out.printf("6 volt %d db\n5 volt %d db\n4 volt %d db\n3 volt %d db\n2 volt %d db\n1 volt %d db\n",hatos,otos,negyes,harmas,kettes,egyes);
            int[] sorozat = {0,0,0,0, 0,0,0,0, 0,0,0 };
            for (int i = 0; i < be; i++) {
                int dobas = veletlen.nextInt(2, 13);
                sorozat[dobas-2]++;
            }
            for (int i = 0; i < sorozat.length; i++) {
                if (sorozat[i]!=0){
                int csillagok = be/sorozat[i];
                System.out.printf("%d ",i+2);
                int j = 10;
                while (j > csillagok){
                    System.out.printf("*");
                    csillagok++;
                }
                System.out.printf(" (%d db)\n",sorozat[i]);
        }
    }
    }
    
    
}
