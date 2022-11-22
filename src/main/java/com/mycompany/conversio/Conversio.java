/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.conversio;

import java.util.Scanner;

/**
 *
 * @author nil
 */
public class Conversio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int valor_lliures,valor_euros = 0;
        double tipus_de_canvi = 0;
        int opcio = 0;
        
        do{
        
                System.out.println("OPCIONS QUE POTS TRIAR");
                System.out.println("1. Passar de Lliures a Euros");
                System.out.println("2. Passar d'Euros a Lliures");
                System.out.println("3. Sortir");
                
                System.out.println("\n Tria una opcio: ");
                opcio = sc.nextInt();
                
                switch(opcio){
                    case 1:
                        System.out.println("Introdueix en £ ");
                        valor_lliures = sc.nextInt();
                
                        tipus_de_canvi = 1.15;
                        System.out.println(valor_lliures + " lliures esterlines (£) actualment equivalen a " + (valor_lliures * tipus_de_canvi) + " euros (€)");
                 break;
                    case 2:
                        System.out.println("Introdueix en € ");
                        valor_euros = sc.nextInt();
                        
                        tipus_de_canvi= 0.87;
                        System.out.println(valor_euros + " euros (€) actualment equivalen a " + (valor_euros * tipus_de_canvi) + " lliures esterlines (£)");
                  break;
                    case 3:
                        break;
                        default:
                        System.out.println("Opcio Incorrecta");
                    }
                }while (opcio != 3);
  }
}
               
