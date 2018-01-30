package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // 1.8.​ Realizuoti programą, kuri apskaičiuotų kiek automobilis vidutiniškai sunaudoja kuro 100
        // km. Programa turi paprašyti vartotojo įvesti nuvažiuotus km ir kuro sąnaudas.
        // vidurkis = (kuro sąnaudos *100)/ nuvažiuoto atstumo

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite nuvaziuotus km: ");
        int km = sc.nextInt();
        System.out.println("Iveskite kuro sanaudas: ");
        int sanaudos = sc.nextInt();
        float vidurkis = (sanaudos*100)/km;
        System.out.println("Kuro sanaudu vidurkis: " + vidurkis + "l.");
    }
}
