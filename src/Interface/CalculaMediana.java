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
public class CalculaMediana implements MedidasDeDispersao {
    
    @Override
    public double calcular(List<Integer> lista) {
        System.out.println("Calculando a mediana \n");
         double mediana =0;
         if(lista.size() % 2 == 0){//par         
             mediana = (lista.get((lista.size()/2)-1) + lista.get((lista.size()/2)))/2;             
         }else{//impar
            int meio = (lista.size()/2);
            mediana = lista.get(meio);
         }
        return mediana;
    }
}
