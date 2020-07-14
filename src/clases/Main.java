/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 
 */
package clases;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;


/**
 *
 * @author JUAN PABLO ARENAS VELEZ 
 * cedula 1037633965
 */


public class Main {
    
    public static void main(String[] args) {
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        int[] va = null;
        int[] vo = null;
        int  p = 0;
        int[] A = null;
        int[] M = null;

        
      
           do{
               try{
                   
                opcion =  Integer.parseInt(JOptionPane.showInputDialog("        Escribe una de las opciones\n\n"
                                                                            + "1. Divide y venceras.\n"
                                                                            + "2. Programacion dinamica(problema de los numeros primos).\n"
                                                                            + "3. Programacion con retroceso.\n"
                                                                            + "4. Salir"                                                               
                                                                            ));            

        switch(opcion){    
                case 1:   // Crear Matriz adyacente                    
                        
                        
                        boolean a = true;
                        int op;
                        
                        do{
                                                       
                            
                            
                            op =  Integer.parseInt(JOptionPane.showInputDialog("        Escribe una de las opciones\n\n"
                                                                            + "1. Generar aleatoriamente un n mayor que 10\ny menor que 50.\n"
                                                                            + "2. Generar vector aleatorio de n elementos\nenteros entre 1 y 100.\n"
                                                                            + "3. Mostrar por pantalla el valor de n, y el vector generado\n"
                                                                            + "4. Ordenar ascendentemente el vector generado\n usando el método sortMerge iterativo.\n"
                                                                            + "5. Mostrar por pantalla el vector, antes de hacer el último proceso de intercalación.\n"
                                                                            + "6. Mostrar por pantalla el vector ordenado.\n"
                                                                            + "7. Elaborar algoritmo que lea un dato n y un dato k. n es el número de \nelementos de un vector cuyos datos están en desorden. Su algoritmo debe \ndeterminar el dato que debe quedar en la posición k después de ordenar los \ndatos descendentemente. Cree un vector de prueba con datos generados \naleatoriamente, muestre el vector generado y muestre el dato que debe \nquedar en la k-ésima posición.\n"
                                                                            + "8. Salir"                                                                
                                                                            ));
                            try{
                                switch(op){
                                    case 1:
                                        Metodos.aleatorio();
                                        break;
                                    
                                    case 2:
                                        p = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño del vector"));
                                        va = Metodos.vectorAleatorio(p);
                                        JOptionPane.showMessageDialog(null, "Vector creado exitosamente.");                                        
                                        break;
                                        
                                    case 3:
                                        try{
                                            int n = va[p-1];
                                            JOptionPane.showMessageDialog(null, "valor del vector en la posicion n: " + n + "\n\nEl vector generado es " + Arrays.toString(va));
                                        }catch(NullPointerException e){
                                            JOptionPane.showMessageDialog(null, "Aun no se ha generado el vector primero usar opcion 2");
                                        }
                                        
                                        break;
                                    
                                    case 4:
                                        try{
                                            A = va;
                                            M = new int[A.length];
                                            for (int j = 0; j < A.length; j++) {
                                                M[j] = A[j];
                                            }
                                            Metodos.mergesort(M);
                                            JOptionPane.showMessageDialog(null, "vector ordenado ascendentemente mediante merge-sort iterativo");
                                        }catch(NullPointerException e){
                                            JOptionPane.showMessageDialog(null, "Aun no se ha generado el vector primero usar opcion 2");
                                        }
                                        break;        
                                    
                                    case 5:
                                        if (A != null) {
                                            JOptionPane.showMessageDialog(null, "Arreglo antes de ordenarlo :  " + Arrays.toString(A));
                                            
                                        }else{
                                        JOptionPane.showMessageDialog(null, "Primero se debe crear el vector" );
                                        }
                                        break;    
                                    
                                    case 6:
                                        if (M != null) {
                                            JOptionPane.showMessageDialog(null, "Arreglo ordenado mediantemMergeSort :  " + Arrays.toString(M));
                                        }else{
                                            JOptionPane.showMessageDialog(null, "Primero se debe ordenar ascendentemente el vector" );
                                        }
                                        
                                        break;
                                    
                                    case 7:
                                        int n = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño del vector"));
                                        int k = Integer.parseInt(JOptionPane.showInputDialog("ingrese la posicion en el vector que se desea conocer"));
                                        if (k <= n) {
                                            vo = Metodos.vectorAleatorio(n);
                                            int[] copia = new int[vo.length];
                                            for (int i = 0; i < vo.length; i++) {
                                                copia[i] = vo[i];
                                            }
                                            
                                            Metodos.ordenarDescendentemente(vo);
                                            int pos = vo[k-1];
                                            JOptionPane.showMessageDialog(null, "Vector en desorden: "+Arrays.toString(copia) + "\n\nVector ordenado descendentemente: "
                                                    + Arrays.toString(vo) + "\nValor de K: " + pos);
                                            
                                           
                                            
                                        }else{
                                            JOptionPane.showMessageDialog(null, "el dato K no puede ser mayor que n ya que no estaria contenido en el vector");
                                        }
                                        
                                        
                                        
                                        break;
                                        
                                    case 8:
                                        a = false;
                                        break;    
                                        
                                    default:
                                        JOptionPane.showMessageDialog(null, "solo opciones 1 al 8","alerta",JOptionPane.ERROR_MESSAGE);
                                    
                                    break;
                                }
                            }catch(NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "solo opciones numericas","alerta",JOptionPane.ERROR_MESSAGE);
                            }
                        }while(a == true);
                        
                        
                        
                    break;    
                        
                case 2: //construir un vector con todos los números primos desde 1 hasta 1000 usando la técnica de programación dinámica
                    int[] primos = Metodos.primos();
                    int count = 0;
                    for (int i = 0; i < primos.length; i++) {
                        if ((count%20) == 0 && primos[i] != 0) {
                            System.out.println("");
                        }
                        if (primos[i] != 0) {
                            System.out.print(" "+primos[i]);
                            count++;
                        }
                    }
                    System.out.println("\n");
                    
                    
                        int co = 0;
                        int i = 0;
                        int[] prueba = {100,200,300,400,500,600,700,800,900,1000};
                        for (int j = 1; j < primos.length; j++) {                             
                            
                            if (primos[j] <= prueba[i] && primos[j] != 0) {
                                co++;
                            }else if(primos[j] > prueba[i] || primos[j] == 997){
                                if (i == 0) {
                                   System.out.println("la cantidad de numeros primos entre " + (i+1) + " y " + prueba[i] + " es: " + co);
                                    co = 0;
                                    i++; 
                                }else{
                                    System.out.println("la cantidad de numeros primos entre " + (prueba[i-1]+1) + " y " + prueba[i] + " es: " + (co+1));
                                    co = 0;
                                    i++;
                                }
                            }
                        }
                        System.out.println("la cantidad de numeros primos entre " + (prueba[i-1]+1) + " y " + prueba[i] + " es: " + (co+1));
                    
                        
                    
                    
                
                    break;
                    
                case 3:
                       boolean a1 = true;
                        int op1;
                        do{
                                                       
                            
                            
                            op1 =  Integer.parseInt(JOptionPane.showInputDialog("        Escribe una de las opciones\n\n"
                                                                            + "1. conbinaciones con el String = \"abcdef\".\n"
                                                                            + "2. Problema de las monedas (muestra las soluciones usando una vez\ncada denominacion).\n"
                                                                            + "3. Salir"                                                                
                                                                            ));
                            try{
                                switch(op1){
                                    case 1:
                                        int n = Integer.parseInt(JOptionPane.showInputDialog("ingrese de cuantas maneras debe realizarce combinaciones\nsin repeticiones de los elementos \"abcdef\""));
                                        if (n > 0 && n <=6) {
                                            Metodos.combinaciones(n);
                                            
                                            
                                        }else{
                                            JOptionPane.showMessageDialog(null, "El valor no puede ser mayor a 6 ni menor a 1");
                                        }
                                        
                                        break;
                                    
                                    case 2: // problema de las monedas ingresar maximo 5 denominaciones y un valor con el cual
                                            // se calculara mediante las denominaciones cuantas formas hay de completar ese valor ingresado
                                            // se calcula las sumas posibles usando unicamente una vez cada denominacion.
                                        int count1 = 0;                                        
                                        int[]numeros;
                                        boolean aa = true;
                                        int n2 = Integer.parseInt(JOptionPane.showInputDialog("cuantas denominaciones desea ingresar entre 1-5"));
                                        if (n2 > 0 && n2 <= 5) {
                                            numeros = new int[20]; // n2 
                                            while(count1 < n2){
                                                int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una denominacion"));
                                                numeros[count1] = n1;
                                                count1++;
                                            }
                                            int suma = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a completar con las denominaciones dadas"));
                                            
                                            int n1 = numeros.length; // numeros.length
                                            int[] solucion = new int[20];  // n1    debe ir 
                                            for (int j = 0; j < solucion.length; j++) {
                                                solucion[j] = 0;
                                            }
                                            int k = 0;
                                            int j = 0;
                                            int total = suma;
                                        
                                            Metodos.monedas(solucion,suma,numeros,k,j,n1,total);
                                        }else{
                                            JOptionPane.showMessageDialog(null, "la cantidad que ingreso no esta permitida solo entre 1-5");
                                        }
                                          
                                        break;
                                    
                                    case 3:
                                        a1 = false;
                                        
                                        break;
                                    
                                    default:
                                        JOptionPane.showMessageDialog(null, "solo opciones 1 ó 2","alerta",JOptionPane.ERROR_MESSAGE);
                                    
                                    break;
                                }
                            }catch(NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "solo opciones numericas","alerta",JOptionPane.ERROR_MESSAGE);
                            }
                        }while(a1 == true);                
                    
                    break;                  
                    
                
                case 4:                    
                    salir = true;
                    break;   
                   
                   
                default:
                   JOptionPane.showMessageDialog(null, "Solo opciones entre 1 y 4");
           
        }
                }catch(NumberFormatException e){
                     JOptionPane.showMessageDialog(null, " Presiono cancelar, aceptar sin seleccionar opcion validad ó ingreso un dato no numerico", "Solo datos numericos", JOptionPane.ERROR_MESSAGE);
                }
               
               
       }while(!salir);
    }
}





// aplicacion de los metodos anteriores

                
