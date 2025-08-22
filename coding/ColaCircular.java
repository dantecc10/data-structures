// ColaCircular.java
// Autor: Ing. Bruno Lopez Takeyas

// Este programa utiliza arreglos para la representacion de Colas Circulares
// y se ejecuta en modo texto

// Compilar:  javac ColaCircular.java
// Ejecutar:  java ColaCircular
// ========================================================

import java.io.*;

public class ColaCircular {
   public static class ClaseColaCircular { // Declaracion de la clase de la Cola Circular
	   static int max=5; // Tamano maximo de la Cola Circular
	   static int colacirc[]=new int[max]; // Declaracion del arreglo para almacenar la Cola Circular
	   static int frente, fin; // Inidicadores del inicio y final de la Cola Circular

	   ClaseColaCircular() { // Constructor que inicializa el frente y el final de la Cola Circular
		   frente=-1;    fin=-1;
		   System.out.println("Cola circular inicializada !!!");
	   }
	   
	   public static void Mostrar() {
		   int i=0;
		   System.out.println("\n\n<<< MOSTRAR COLA CIRCULAR >>>");
		   if(frente==-1) {
			   System.out.println("\nCola Circular vacia !!!");
		   }
		   else {
			   i=frente;
			   do {
			           System.out.println("colacirc["+i+"]="+colacirc[i]);
			           i++;
			           if(i==max && frente>fin) i=0; // Reiniciar en cero (dar la vuelta)
		       }while(i!=fin+1);
	       }
		   
		   System.out.println("frente="+frente);
		   System.out.println("fin="+fin);
		   System.out.println("max="+max);
	   }
	   	   
	   public static void Insertar(int dato) {
		   if((fin==max-1 && frente==0) || (fin+1==frente)) {
			   System.out.println("\nCola Circular llena !!!");
			   return;
		   }
		   if(fin==max-1 && frente!=0) fin=0; else fin++;
		   colacirc[fin]=dato;
		   if(frente==-1) frente=0;
	   }
	   
	   public static void Eliminar() {
		   System.out.println("\n\n<<< ELIMINAR DATO >>>");
		   if(frente==-1) {
			   System.out.println("Cola Circular vacia !!!");
			   return;
		   }
		   System.out.println("Dato eliminado = "+colacirc[frente]);
		   if(frente==fin) {
			   frente=-1;   fin=-1;
			   return;
		   }
		   if(frente==max) frente=0; else frente++;
	   }
   }
   
   // Declaracion del objeto ColaCircular
   static ClaseColaCircular ColaCircular=new ClaseColaCircular();
   
   // Funcion principal
   public static void main(String args[]) throws IOException {
      int op=0;
      do {
              System.out.println("\n\n<<< COLAS CIRCULARES >>>");
              System.out.println("1.- Insertar");
              System.out.println("2.- Eliminar");
              System.out.println("3.- Mostrar");
              System.out.println("0.- Salir");
              
              System.out.print("Opcion? ---> ");
              op=getInt();
              switch(op) {
	              case 1 : Altas();                           break;
	              case 2 : ColaCircular.Eliminar();  break;
	              case 3 : ColaCircular.Mostrar();   break;
              }
      }while(op!=0);
   }
   
   public static void Altas() throws IOException {
	   int dato;
	   System.out.println("\n\n<<< ALTAS >>>");
	   System.out.print("Dato a insertar? ---> ");
	   dato=getInt();
	   ColaCircular.Insertar(dato); //Invocar el metodo Insertar del objeto ColaCircular
   }
   
   // Funcion para capturar una cadena desde el teclado
       public static String getString() throws IOException {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            return s;
        }    
        
        // Funcion para capturar un entero desde el teclado
        public static int getInt() throws IOException {
            String s = getString();
            return Integer.parseInt(s);
        }    
}