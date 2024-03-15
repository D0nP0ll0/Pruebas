/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alber
 */
import java.util.Scanner;
public class E3_RevillaV {
    //Declarem la llongitud ja que ara es fixa
    public static final float llargada = 300.3f;
    public static void main (String [] args) {
        //Declarem les variables ja que ara es demanen a l'usuari
        float ample1, ample2, profunditat1, profunditat2, ampladaT, aux;
        int area1, area2, vol1, vol2, areaT, volT;
        
        //Engeguem el lector
        Scanner lector = new Scanner(System.in);

        //Presa de dates
        System.out.print("Introdueix ample 1: ");
        ample1 = lector.nextFloat();
        System.out.print("Introdueix profunditat 1: ");
        profunditat1 = lector.nextFloat();
        System.out.print("Introdueix ample 2: ");
        ample2 = lector.nextFloat();
        System.out.print("Introdueix profunditat 2: ");
        profunditat2 = lector.nextFloat();
              
        //Calcul area i volum piscines
        area1 = (int) (ample1 * llargada);
        area2 = (int) (ample2 * llargada);
        vol1 = (int) (area1 * profunditat1);
        vol2 = (int) (area2 * profunditat2);
              
        System.out.println(""); //Deixar un espai
        
        //Mostrem resultats               
        System.out.println("Piscina 1"); 
        System.out.println("Llargada:" + llargada);
        System.out.println("Ample:" + ample1);
        System.out.println("Area:" + area1 + "M^2");
        System.out.println("Volum" + vol1 + "M^3");        
        System.out.println(""); //Deixar un espai
        
        System.out.println("Piscina 2"); 
        System.out.println("Llargada:" + llargada);
        System.out.println("Ample:" + ample2);
        System.out.println("Area:" + area2 + "M^2");
        System.out.println("Volum" + vol2 + "M^3");        
        System.out.println(""); //Deixar un espai
        
        //Calculs piscines juntes        
        ampladaT = ample1 + ample2;
        areaT = area1 + area2;
        volT = vol1+vol2;   
        
        System.out.println("Valors Juntant Piscines"); 
        System.out.println("Llargada:" + llargada);
        System.out.println("Amplada:" + ampladaT);
        System.out.println("Area:" + areaT + "M^2");
        System.out.println("Volum:" + volT + "M^3");
        System.out.println(""); //Deixar un espai
        
         //Intercanvi Valors profunditats
        System.out.println("Valors Intercanviant Profunditats:"); 
        aux = profunditat1;
        profunditat1 = profunditat2;
        profunditat2 = aux;
               
        //Re-calcular amb les noves dades
        vol1 = (int) (area1 * profunditat1);
        vol2 = (int) (area2 * profunditat2);
        
        System.out.println("Piscina 1:");
        System.out.println("Llargada:" + llargada);
        System.out.println("Amplada:" + ample1);
        System.out.println("Profunditat:" + profunditat1);        
        System.out.println("Area:" + area1 + "M^2");
        System.out.println("Volum" + vol1 + "M^3");        
        System.out.println(""); //Deixar un espai 
        
        System.out.println("Piscina 2:");
        System.out.println("Llargada:" + llargada);
        System.out.println("Amplada:" + ample2);
        System.out.println("Profunditat:" + profunditat2);        
        System.out.println("Area:" + area2 + "M^2");
        System.out.println("Volum" + vol2 + "M^3");
        }
}

