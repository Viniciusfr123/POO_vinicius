/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.List;

/**
 *
 * @author Vinicius
 */
public class CalculaMedia implements MedidasDeDispersao {
    
    public CalculaMedia() {
    }
    
    @Override
    public double calcular(List<Integer> lista) {
        System.out.println("Calculando a media \n");
        int total=0;
        for(Integer item : lista){
            total+= item;
        }        
        double media = total/lista.size();
        return media;       
    }
    }
    
    
