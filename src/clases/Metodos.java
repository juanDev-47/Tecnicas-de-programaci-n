/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author JUAN
 */
public class Metodos {
    
    
    public Metodos(){
    
    }
    
    public static void merge(int[] V, int[] temp, int inicio, int mitad, int fin)
	{
		int x = inicio, i = inicio, j = mitad + 1;

		while (i <= mitad && j <= fin) {
			if (V[i] < V[j]) {
				temp[x++] = V[i++];
			} else {
				temp[x++] = V[j++];
			}
		}

		while (i < V.length && i <= mitad) {
			temp[x++] = V[i++];
		}
                
		for (i = inicio; i <= fin; i++) {
			V[i] = temp[i];
		}
	}

	public static void mergesort(int[] V)
	{
		int menor = 0;
		int mayor = V.length - 1;
                
		int[] temp = Arrays.copyOf(V, V.length);
                
		for (int m = 1; m <= mayor - menor; m = 2*m)
		{
			
			for (int i = menor; i < mayor; i += 2*m)
			{
				int inicio = i;
				int mitad = i + m - 1;
				int fin = Integer.min(i + 2 * m - 1, mayor);

				merge(V, temp, inicio, mitad, fin);
			}
		}
	}
        
        public static void aleatorio(){
            Random aleatorio = new Random(System.currentTimeMillis());
            int intAleatorio = aleatorio.nextInt(49)+11;
            
            JOptionPane.showMessageDialog(null, " 10 < X < 50:  " + intAleatorio);
        }
        
        public static int[] vectorAleatorio(int n){     
            int[] va = new int[n];
            Random aleatorio = new Random(System.currentTimeMillis());
            for (int i = 0; i < n; i++) {                
                int intAleatorio = aleatorio.nextInt(100)+1;
                va[i] = intAleatorio;
            }
            
            
            return va;
        }
        
        public static void ordenarDescendentemente(int[] j){
            int l = j.length;
            for (int i = 0; i < l; i++) {
                for (int k = 0; k < l-1; k++) {
                    if (j[k] < j[k+1]) {
                        int aux = j[k];
                        j[k] = j[k+1];
                        j[k+1] = aux;
                    }
                }
            }
        }
        
        public static int[] primos(){
            int[] primos = new int[1001];
            for (int i = 0; i < primos.length; i++) {
                primos[i] = 0;
            }
            int count = 0;
            for (int i = 1; i <= 1000; i++) {
                count = 0;
                for (int j = 1; j <= i; j++) {
                    if ((i%j) == 0) {
                        count++;
                    }
                    
                }
                if (count<=2 && count > 0) {
                        primos[i] = i;
                    }
            } // for para calcular los primos

            return primos;
        }
        
        public static void combinaciones(int j){            
            ArrayList<String> c = new ArrayList<>();
            String arr[] = { "A", "B", "C", "D","E","F" };
            int r = arr.length;
            int N = (int) Math.pow(2d, Double.valueOf(r));  
            for (int m = 1; m < N; m++) {
                String aux = "";
                String code = Integer.toBinaryString(N | m).substring(1);
                for (int jj = 0; jj < r; jj++) {
                    if (code.charAt(jj) == '1') {
                        aux += arr[jj];
                        
                    }
                }
                c.add(aux);
            }
            
            for (int i = 0; i < c.size(); i++) {
                if (c.get(i).length() == j) {
                      System.out.println(c.get(i));
                }
            }            
            
        }
        
        public static void monedas(int[] solucion, int suma,int[] numeros,int k,int j,int n, int total){
            int i;            
            if (suma == 0) {
                for ( i = 0; i < j; i++) {
                    if (i == j-1) {
                        System.out.print(solucion[i] + " = "+ total);
                    }else{
                        System.out.print(solucion[i] + " + ");
                    }
                }
                System.out.println("");
            }else{
                while(k < n && suma > 0){
                    solucion[j] = numeros[k];
                    j = j +1;
                    monedas(solucion,suma-numeros[k],numeros,k+1,j,n,total);
                    k = k + 1;
                    j = j - 1;
                }
            }
        }
        
        
}
