/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alber
 */
public class E2_RevillaV {
    public static void main (String [] args) {
        
        //Dades Piscina 1
        int llargada1 = 300;
        int ample1 = 150;
        int profunditat1 = 20;
        
        //Dades Piscina 2
        int llargada2 = 300;
        int ample2 = 80;
        int profunditat2 = 35;
        
        //Calcul area i volum piscines       
        int area1 = ample1 * llargada1;
        int area2 = ample2 * llargada2;
        int vol1 = area1 * profunditat1;
        int vol2 = area2 * profunditat2;
               
        System.out.println("Piscina 1"); 
        System.out.println("Area:" + area1 + "M^2");
        System.out.println("Volum" + vol1 + "M^3");        
        System.out.println(""); //Deixar un espai 
                
        System.out.println("Piscina 2"); 
        System.out.println("Area:" + area2 + "M^2");
        System.out.println("Volum" + vol2 + "M^3");        
        System.out.println(""); //Deixar un espai 
        
        
        //Calculs piscines juntes        
        int llargadaT = llargada1;
        int ampladaT = ample1 + ample2;
        int areaT = area1 + area2;
        int volT = vol1+vol2;                        
        
        System.out.println("Valors Juntant Piscines"); 
        System.out.println("Llargada:" + llargadaT);
        System.out.println("Amplada:" + ampladaT);
        System.out.println("Area:" + areaT + "M^2");
        System.out.println("Volum:" + volT + "M^3");
        System.out.println(""); //Deixar un espai 
        
        //Intercanvi Valors profunditats
        int aux = profunditat1;
        profunditat1 = profunditat2;
        profunditat2 = aux;
        
        //Re-calcular amb les noves dades
        vol1 = area1 * profunditat1;
        vol2 = area2 * profunditat2;
        
        System.out.println("Piscina 1:");
        System.out.println("Llargada:" + llargada1);
        System.out.println("Amplada:" + ample1);
        System.out.println("Profunditat:" + profunditat1);        
        System.out.println("Area:" + area1 + "M^2");
        System.out.println("Volum" + vol1 + "M^3");        
        System.out.println(""); //Deixar un espai 
        
        System.out.println("Piscina 2:");
        System.out.println("Llargada:" + llargada2);
        System.out.println("Amplada:" + ample2);
        System.out.println("Profunditat:" + profunditat2);        
        System.out.println("Area:" + area2 + "M^2");
        System.out.println("Volum" + vol2 + "M^3");        
     }
}

