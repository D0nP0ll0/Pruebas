/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alber
 */
//Aquesta línia fa que la biblioteca estigui disponible.
import java.util.Scanner;
//Un programa en què cal endevinar un nombre.
public class mispruebas {
//PAS 1
//El nombre per endevinar serà el 4.
public static final int VA1 = 4;
public static final int VA2 = 3;
public static void main (String[] args) {
Scanner lector = new Scanner(System.in);
//PAS 2 i 3
System.out.println("Comencem el joc.");
System.out.print("Endevina el valor enter, entre 0 i 10: ");
int valorUsuari = lector.nextInt();
lector.nextLine();
//PAS 4
//Estructura de selecció doble.
//O s'endevina o es falla.
if (VA1 == valorUsuari) {
//PAS I
//Si l'expressió avalua true, executa el bloc dins l'if.
System.out.println("Exacte! Era " + VA1 + ".");
} 
else {
if (VA2 == valorUsuari) {
//PAS I
//Si l'expressió avalua true, executa el bloc dins l'if.
System.out.println("Exacte! Era " + VA2 + ".");
}
//PAS II
//Si l'expressió avalua false, executa el bloc dins l'else.
else {
System.out.println("T'has equivocat!");
        }
}
System.out.println("Hem acabat el joc.");
}
}



