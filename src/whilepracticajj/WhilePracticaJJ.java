/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whilepracticajj;

/**
 *
 * @author el_ingeniero
 */
import java.util.Scanner;
public class WhilePracticaJJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("practica con github y ciclo hile");
        int opcion;
        do {
            System.out.println("1.suma");
            System.out.println("2.resta");
            System.out.println("ingrese una opcion");
            
            opcion = sc.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("funcion suma");
                    break;
                case 2:
                    System.out.println("funcion resta");
                    break;
                default:
                    System.out.println("opcion incorrecta");
                    
            }       
            
        } while (opcion <=3);
    }
    public static void cajero_automatico(){
    //Algoritmo para simular cajero automatico
        System.out.println("""
                           -----------------------------------------------------
                                            CAJERO AUTOMATICO
                           """);
        System.out.println("Ingrese su tarjeta:");
        System.out.println("Tarjeta detectada");
        System.out.println("Ingresa tu clave:");
        int clave = sc.nextint();
    }
}
