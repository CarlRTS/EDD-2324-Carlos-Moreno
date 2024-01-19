/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosalcuadrado;

import java.util.Scanner;

/**
 *
 * @author Carl
 */
public class NumerosAlCuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);  // Pide al usuario una entrada
        System.out.println("Ingrese el numero hasta el cual se tiene que elevar");
        
        int NumInicial = 0;
        int NumElevar = sc.nextInt(); // Guarda el número del usuario
        
            if (NumElevar == 1) {
                System.out.println(NumElevar);
                
            }else{
                
                if (NumElevar > 0) { //Si el numero ingresado por el usuario es mayor a 0 entra en un loop
            
                while(NumInicial < NumElevar){ //Mientras el numero inicial sea menor a el número ingresado seguirá en el loop
                        NumInicial = NumInicial+1; //Se le suma 1 al número inicial 
                        System.out.println(NumInicial*NumInicial); //Se multiplica el número inicial por si mismo
                }        
                
                }else{ 
                    /*try{
                        NumElevar = Integer.parseInt("aasjhg"); ----- Cuando lo ingresado no es un int
                    }
                    catch(NumberFormatException nfe){
                        System.out.println("Eso no es un número entero");
                    */
                
                    System.out.println("0"); //Si no es un numero ni negativo ni positivo, es 0
                }      
          
    }
    
}
