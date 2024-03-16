/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author alber
 */
//Importem la biblioteca per introduïr dades.

import java.util.Scanner;

public class E05_RevillaV {

    // Declarem les puntuacions com a constants
    public static final int PUNTS_GERMA = 40;
    public static final int PUNTS_POBL = 30;
    public static final int PUNTS_FEIN = 20;
    public static final int PUNTS_DISMAL = 10;
    public static final int PUNTS_FAM = 15;
    public static final int PUNTS_HIST = 5;

    public static void main(String[] args) {
        // Declarem les variables a introduir
        int num, germa, pobl, fein, dismal, fam, hist, punts = 0;

        // Engeguem el lector
        Scanner lector = new Scanner(System.in);

        // Presa de dates

        // mostrar: Numero Alumne;
        num = demanarNumero("Introdueix Nº de registre del nen: ", 1, 499, lector);
        // mostrar: Te germans a l'escola? (0: no  /  1:si);
        germa = demanarNumero("¿Té germans a l'escola? (0:no / 1:si): ", 0, 1, lector);
        // mostrar: Viu a la poblacio?  (0: no  /  1:si);
        pobl = demanarNumero("¿Resideix a la poblacio? (0:no / 1:si): ", 0, 1, lector);
        // mostrar: Treballen els pares a la poblacio? (0: no  /  1:si);
        fein = demanarNumero("¿Treballen els pares a la poblacio? (0:no / 1:si): ", 0, 1, lector);
        // mostrar: Te alguna discapacitat o malaltia cronica? (0: no  /  1:si);
        dismal = demanarNumero("¿Té alguna discapacitat o malaltia cronica? (0:no / 1:si): ", 0, 1, lector);
        // mostrar: Familia nombrosa o monoparental? (0: no  /  1:si);
        fam = demanarNumero("¿Familia monoparental o numerosa? (0:no / 1:si): ", 0, 1, lector);
        // mostrar: Va estudiar algun pare o germa a l'escola? (0: no  /  1:si);
        hist = demanarNumero("¿Han estudiat els pares o germans al centre? (0:no / 1:si): ", 0, 1, lector);

        // Calcul de la puntuacio

        // si germa = 1;
        //	punts = + 40;
        if (germa == 1) {
            punts = punts + PUNTS_GERMA;
        }
        // si resideix = 1;
        //	punts = + 30;
        // si no,
        //	si feina = 1;
        //		punts = + 20;
        if (pobl == 1) {
            punts = punts + PUNTS_POBL;
        } else {
            if (fein == 1) {
                punts = punts + PUNTS_FEIN;
            }
        }
        // si discaMalal = 1;
        //	punts = + 10;
        if (dismal == 1) {
            punts = punts + PUNTS_DISMAL;
        }
        // si fam1_3 = 1;
        //	punts = + 15;
        if (fam == 1) {
            punts = punts + PUNTS_FAM;
        }
        // si historial = 1;
        //	punts = + 5
        if (hist == 1) {
            punts = punts + PUNTS_HIST;
        }

        // Mostra puntuacio

        // mostrar: Puntuacio alumne:;
        // mostrar: "Alumne" + numnen + punts + "/100"
        System.out.println("\nAlumne Nº: " + num + "\tPunts: " + punts + "/100");
    }

    /**
     * Demana un valor a l'usuari.
     *
     * @return el valor introduit per l'usuari
     */
    private static int demanarNumero(String missatge, int min, int max, Scanner lector) {
        System.out.print(missatge);
        int resultat = lector.nextInt();
        while (resultat < min || resultat > max) {
            System.out.println("Si us plau, introduiex un valor entre " + min + " i " + max + ".");
            System.out.print(missatge);
            if (lector.hasNextInt()) {
                resultat = lector.nextInt();
            }
        }
        return resultat;
    }
}
