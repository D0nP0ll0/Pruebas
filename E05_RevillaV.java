/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alber
 */
//Importem la biblioteca per introduïr dades.
import java.util.Scanner;

public class E05_RevillaV {

    //Declarem les puntuacions com a constants
    public static final int PUNTS_GERMA = 40;
    public static final int PUNTS_POBL = 30;
    public static final int PUNTS_FEIN = 20;
    public static final int PUNTS_DISMAL = 10;
    public static final int PUNTS_FAM = 15;
    public static final int PUNTS_HIST = 5;

    public static void main(String[] args) {
        //Declarem les variables a introduir
        int num, germa, pobl, fein, dismal, fam, hist, punts = 0;

        //Engeguem el lector
        Scanner lector = new Scanner(System.in);

        //Presa de dates
        //mostrar: Numero Alumne;
        //numnen = llegir sencer 
        System.out.print("Introdueix Numero de registre del nen:");
        //Verifiquem que el valor esta entre 1 i 499 a mes de ser un sencer
        if (lector.hasNextInt()) {
            num = lector.nextInt();
            if (num >= 1 && num <= 499) {
            } else {
                System.out.println("Numero de registre erroni");
                return; //He trobat aquesta opcio ja que sino continua executant el codi
            }
        } else {
            System.out.println("Numero de registre erroni");
            return;
        }
        //mostrar: Te germans a l'escola? (0: no  /  1:si);
        //germa = llegir sencer
        System.out.print("Te germans a l'escola? (0:no / 1:si)");
        germa = lector.nextInt();
        if (germa == 0 || germa == 1) { //Assegurem que no s'ha introduit altre valor
        } else {
            System.out.println("Si us plau, introdueix 0 per 'no' o 1 per 'si'.");
            return;
        }
        //mostrar: Viu a la poblacio?  (0: no  /  1:si);
        //resideix = llegir sencer
        System.out.print("Resideix a la poblacio? (0:no / 1:si)");
        pobl = lector.nextInt();
         if (pobl == 0 || pobl == 1) {
        } else {
            System.out.println("Si us plau, introdueix 0 per 'no' o 1 per 'si'.");
            return;
        }
        //mostrar: Treballen els pares a la poblacio? (0: no  /  1:si);
        //feina = llegir sencer
        System.out.print("Treballen els pares a la poblacio (0:no / 1:si)");
        fein = lector.nextInt();
         if (fein == 0 || fein == 1) {
        } else {
            System.out.println("Si us plau, introdueix 0 per 'no' o 1 per 'si'.");
            return;
        }
        //mostrar: Te alguna discapacitat o malaltia cronica? (0: no  /  1:si);
        //discaMalal = llegir sencer
        System.out.print("Te alguna discapacitat o malaltia cronica? (0:no / 1:si)");
        dismal = lector.nextInt();
         if (dismal == 0 || dismal == 1) {
        } else {
            System.out.println("Si us plau, introdueix 0 per 'no' o 1 per 'si'.");
            return;
        }
        //mostrar: Familia nombrosa o monoparental? (0: no  /  1:si);
        //fam1_3 = llegir sencer
        System.out.print("Familia monoparental o numerosa? (0:no / 1:si)");
        fam = lector.nextInt();
         if (fam == 0 || fam == 1) {
        } else {
            System.out.println("Si us plau, introdueix 0 per 'no' o 1 per 'si'.");
            return;
        }
        //mostrar: Va estudiar algun pare o germa a l'escola? (0: no  /  1:si);
        //historial = llegir sencer
        System.out.print("Han estudiat els pares o germans al centre? (0:no / 1:si)");
        hist = lector.nextInt();
         if (hist == 0 || hist == 1) {
        } else {
            System.out.println("Si us plau, introdueix 0 per 'no' o 1 per 'si'.");
            return;
        }
        //Calcul de la puntuacio
        
        //si germa = 1;
        //	punts = + 40;
        if (germa == 1) {
            punts = punts + PUNTS_GERMA;
        }
        //si resideix = 1;
        //	punts = + 30;
        //si no,
        //	si feina = 1;
        //		punts = + 20;
        if (pobl == 1) {
            punts = punts + PUNTS_POBL;
        } else {
            if (fein == 1) {
                punts = punts + PUNTS_FEIN;
            }
        }
        //si discaMalal = 1;
        //	punts = + 10;
        if (dismal == 1) {
            punts = punts + PUNTS_DISMAL;
        }
        //si fam1_3 = 1;
        //	punts = + 15;
        if (fam == 1) {
            punts = punts + PUNTS_FAM;
        }
        //si historial = 1;
        //	punts = + 5
        if (hist == 1) {
            punts = punts + PUNTS_HIST;
        }
        //Mostra puntuacio
        //mostrar: Puntuacio alumne:;
        //mostrar: "Alumne" + numnen + punts + "/100"
        System.out.println("Alumne N:" + num + "\tPunts:" + punts);
    }
}
