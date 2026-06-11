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
        System.out.println("Practica con github y ciclo hile");
        int opcion;
        do {
            System.out.println("1.suma");
            System.out.println("2.resta");
            System.out.println("ingrese una opcion:");
            
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
        Scanner scc = new Scanner(System.in);
    //Algoritmo para simular cajero automatico
        System.out.println("""
                           -----------------------------------------------------
                                            CAJERO AUTOMATICO
                           """);
        int clave = 1234;
        int intentos = 3;
        while (intentos > 0 && intentos<=3){
        System.out.println("Ingrese su tarjeta:");
        System.out.println("Tarjeta detectada");
        System.out.println("Ingresa tu clave:");
        int clave_ingresada = scc.nextInt();
        if (clave_ingresada ==clave){
        //Si la clave coincide
            System.out.println("""
                               -----------------------------------------------------
                                               BIENVENIDO AL CAJERO
                               """);
            System.out.println("Selecciona una opcion:");
            System.out.println("1. consultar saldo");
            System.out.println("2. retirar dinero");
            System.out.println("3. depositar dinero");
            System.out.println("4. salir");
        }else{
            System.out.println("Si la clave es incorrecta:");
            intentos = -1;
            System.out.println("Te quedan" + intentos);
            
            }
        if (intentos == 0){
            System.out.println("Haz superado los 3 intentos..., ¿Eres Mongolo?");
        }
        }
    } 
}