/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuentesperla_20251020;

/**
 *
 * @author UFG
 */
public class Pila {
    
    private int [] elementos;
    private int cima;
    private int capacidad;
    
    //MÉTODO CONSTRUCTOR DE CLASE PILA
    //AL INSTANCIAR UNA NUEVA VARIABLE DE TIPO PILA SE CRERÁ UN
    //OBJETO CON LO ATRIBUTOS QUE ESTÁN DENTRO DE ESTE CONSTRUCTOR.
    public Pila (int tamano){
        
        this.capacidad = tamano;
        this.elementos = new int [this.capacidad];
        this.cima = -1;
        
    }
    
    public boolean estaVacia(){
        if(this.cima == -1){
            //EL VALOR DE LA CIMA ES -1, LO QUE SIGNIFICA UE ESTÁ VACÍA
            return true;
        }else{
            //EL VALOR DE LA CIMA ES UN NÚMERO DIFERNTE DE -1 POR LO TANTO
            //L PILA SÍ TIENE AL MENOS UN ELEMENTO.
            return false;
        }
    }
    
    public boolean estaLlena(){
        if(this.cima ==(this.capacidad -1) ){ 
            //EL VALR DE LA CIMA ES IGUAL A LA CANTIDAD DE ELEMENTOS
            return true;
        }else{
            //EL ALOR DE LA CIMA ES DIFERETE A LA CANTIDAD DE ELEMENTOS
            return false;
        }    
    }
    
    //DEVUELVE EL VALOR DE L CIMA, ES DECIR EL VALOR DEL ÚLTIMO ELEMENTO
    //QUE FUE INSERTADO AL ARREGLO 
    public int tamano(){
        return this.cima +1;
        
    }
    
    public void push(int elemento){
        if (estaLlena()){
            System.out.println("La pila está llena, no puede agregar el valor: "+elemento);
            //return;
        }else{
            this.cima++;
            this.elementos[this.cima]=elemento;
            System.out.println("El valor: "+elemento+" fue agregado a la pila");
        }
        
    }
    //METODO PARA EXTRAER UN ELEMENTO DE LA PILA
    public int pop(){
        //SE VERIFICA QUE LA PILA NO ESTÉ VACÍA
        if(estaVacia()){
            System.out.println("La pila está vacía, no se puede hacer la extracción del elemento");
            return -1;
        }else{
            //SE CREA UNA NUEVA VARIABLE PARA ALMACENAR LOS ELEMENTOS EXTRAIDOS
            //SI HAY ELEMENTOS QUE EXTRAER
            int elementoExtraido = this.elementos[this.cima];
            this.cima--;
            return elementoExtraido;
            
        }
    }
    
    public int peek(){
        if(estaVacia()){
            //SI ESTA VACÍA, SE LE MUESTRA EL MENSAJE AL USUARIO
            System.out.println("La pila está vacía");
            return -1;
        }else {
            //SE DEVUELVE EL ÚLTIMO ELEMENTO INSERTADO
            return this.elementos[this.cima];
        }
    }
    
    //MÉTODO PARA IMPRIMIR LOS VALORES QUE POSEE LA PILA
    //TODOS LOS VALORES DEL ARREGLO
    //DESDE EL ULTIMO HASTA EL PRIMERO EN AGREGARSDE (EN ESE ORDEN)
    public void mostrar(){
        //SE VERIFICA QUE LA PILA NO ESTÉ VACÍA
        if (estaVacia()){
            //SI ESTÁ VACÍA NO SE HACE NADA
            System.out.println("La pila está vacía");
        }else{
            System.out.print("Contenido de la pila(desde la cima, hasta la base)");
            System.out.print("[");
            //SE DEBE RECORRER EL ARREGLO DE LA PILA PARA PODER IMPRIMIR CADA VALOR
            //EN LA ESTRUCTURA ITERATIVA SE INCIA DESDE EL VALOR DE LA CIMA, ESD DECIR
            //DESDE LA ULTIMA POSICION AGREGADA AL ARREGLO, MIENTRAS EL VALOR DE "i" SEA 
            //MAYOR QUE CERO(AUN NO SE HA LLEGADO A LA BASE DE LA PILA)
            //EL VALOR DE "i" ESTARÁ EN DECREMENTO HASTA LLEGAR A CERO
            for(int i = this.cima; i>= 0; i--){
                System.out.print(this.elementos[i]);
                //SE VERIFICA SI EL VALOR DE I ES MAYOR QUE CERO
                if(i>0){
                    System.out.print(",");
                }
            }
            
            System.out.print("]");
        }
    }
    
    
    
}
