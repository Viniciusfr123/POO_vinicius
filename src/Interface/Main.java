/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.*; 

/**
 *
 * @author Vinicius
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList();
        lista.add(14);
        lista.add(5);
        lista.add(20);
        Collections.sort(lista); //Para o metodo de mediana funcionar adequadamente
        
        CalculaMedia calculaMedia = new CalculaMedia();    
        CalculaMediana calculaMediana = new CalculaMediana();
        
        calcula(calculaMedia, lista);
        calcula(calculaMediana, lista);
    }
    
    public static void calcula(MedidasDeDispersao tipo, List<Integer> lista) {
        double resultado;
        resultado = tipo.calcular(lista);
        System.out.println(resultado);
    }
    
}
