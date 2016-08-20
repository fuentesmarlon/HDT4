/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt4;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Marlon
 */
public class Principal {
    	 public static void main(String[] args) throws IOException { 
                String respuesta;
                
                 Scanner sc = new Scanner(System.in);
                 System.out.println("Bienvenido, Escriba la opcion que desea:\n 1.Vector\n 2.lista");
                 respuesta=sc.nextLine();
                 if (respuesta.equals("vector")){
                     Calculadora calculadora = new Calculadora();
                     calculadora.Calculadora();
                      
                 }
                 else if(respuesta.equals("lista")){
                     Calculadora calculadora = new Calculadora();
                     calculadora.Calculadora();
                     
                 }
                 else{
                     System.out.println("Ingrese un valor valido");
                     
                 }
		 
		  }
	 

    
            
    
}
