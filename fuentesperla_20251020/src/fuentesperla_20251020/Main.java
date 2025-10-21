/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fuentesperla_20251020;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pila miPila = new Pila(5);
        
        System.out.println("La pila está vacía?    "+miPila.estaVacia());//DEVOLVERÁ TRUE OR FALSE
        System.out.println();
        
        System.out.println("AGREGANDO VALORES CON MÉTODO PUSH(");
        miPila.push(10);
        miPila.push(20);
        miPila.push(30);
        miPila.push(40);
        miPila.push(50);
        
        System.out.println();
        
        miPila.mostrar();
        System.out.println("Tamaño actual de la pila: "+miPila.tamano()+ " elementos");
        System.out.println();
        
        System.out.println("AGREGAR ELEMENTOS NUEVOS CVON LA PILA LLENA: ");
        miPila.push(60);
        System.out.println();
        
        System.out.println("VERIFICAR EL ÚLTIMO VALOR AGREGADO");
        System.out.println("El elemento de la cima es: "+miPila.peek());
        System.out.println();
         
        System.out.println("EXTRAER VALORES DE LA PILA");
        System.out.println("Se ha extraido el valor de: "+miPila.pop());
        System.out.println("Se ha extraido el valor de: "+miPila.pop());
        System.out.println();
        
        System.out.println("MOSTRANDO VALORES DE LA PILA");
        miPila.mostrar();
        System.out.println("Tamaño actual de la pila: "+miPila.tamano()+ " elementos");
        System.out.println();
        
        System.out.println("SE EXTRAEN TODOS LOS VALORES DE LA PILA");
        while(!miPila.estaVacia()){
            System.out.println("Se ha extraído el valor de: "+ miPila.pop());
        }
        System.out.println();
        
        miPila.pop();
        System.out.println();
        
        System.out.println("VERIFICAR EL ÚLTIMO VALOR AGREGADO");
        System.out.println("El elemento de la cima es: "+miPila.peek());
        System.out.println();
        
        
    }
    
}
