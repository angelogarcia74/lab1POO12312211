/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROYECTO1;
import java.util.Scanner;
/**
 *
 * @author Angelo Garcia
 */
public class Ejercicio14 {
    
    public static void main(String[]args) {
        //Imprimir el dia de la semana
        Scanner in = new Scanner (System.in);
        int numeroDia = 0;
        
        System.out.println("Ingrese un numero de la semana (1-7):");
        numeroDia = in.nextInt();
        
        switch (numeroDia) {
            case 1:
                System.out.println ("Lunes");
                break;
            case 2: 
                System.out.println ("Martes");
                break;
            case 3:
                System.out.println ("Miercoles");
                break;
            case 4:
                System.out.println ("Jueves");
                break;
            case 5:
                System.out.println ("Viernes");
                break;
            case 6:
                System.out.println ("Sabado");
                break;
            case 7:
                System.out.println ("Domingo");
                break;
            default:
        }
    }
}
