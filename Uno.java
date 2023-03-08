/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.util.Scanner;

/**
 *
 * @author Blaker
 */
public class Uno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
   
        // se crea una variable scanner que se utiliza para leer datos de usuario
        Scanner leer = new Scanner(System.in);
        // se crea una variable cadena (string) que se utiliza para leer datos del usuario
        String nombre;
        //muestra un mensaje por pantalla
        System.out.println("Ingrese su nombre");
        //leemos el nombre de la persona en la variable nombre
        nombre= leer.next();
        //mostramos por consola un saludo personalizado
        System.out.println("Hola Mundo! Soy" + nombre + " y estoy programando en Java!");
   
   }
    


