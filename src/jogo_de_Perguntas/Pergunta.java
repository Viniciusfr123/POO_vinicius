/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo_de_Perguntas;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author vinic
 */
public class Pergunta {
    public void criaPergunta() {
        int tipoQuestao = ThreadLocalRandom.current().nextInt(0,3);
        
        if (tipoQuestao == 0) {
            int primeiro_Operador = ThreadLocalRandom.current().nextInt(0,100);
            int segundo_Operador = ThreadLocalRandom.current().nextInt(0,20);
            String resposta = JOptionPane.showInputDialog("Quanto é: \n " + primeiro_Operador + " + " + segundo_Operador);
            int resposta_Int = Integer.parseInt(resposta);
            
            if( primeiro_Operador + segundo_Operador == resposta_Int) {
                JOptionPane.showMessageDialog(null,"Você acertou!!!");
            }
            else {
                JOptionPane.showMessageDialog(null,"Você errou!");
            }
        }
        else if (tipoQuestao == 1) {
            int primeiro_Operador = ThreadLocalRandom.current().nextInt(0,100);
            int segundo_Operador = ThreadLocalRandom.current().nextInt(0,20);
            String resposta = JOptionPane.showInputDialog("Quanto é: \n " + primeiro_Operador + " - " + segundo_Operador);
            int resposta_Int = Integer.parseInt(resposta);
            int Resultado_Conferencia = primeiro_Operador - segundo_Operador;
            
            if( primeiro_Operador - segundo_Operador == resposta_Int) {
                JOptionPane.showMessageDialog(null,"Você acertou!!!");
            }
            else {
                JOptionPane.showMessageDialog(null,"Você errou!");
            }
        }
        else {
            int primeiro_Operador = ThreadLocalRandom.current().nextInt(0,10);
            int segundo_Operador = ThreadLocalRandom.current().nextInt(0,10);
            String resposta = JOptionPane.showInputDialog("Quanto é: \n " + primeiro_Operador + " x " + segundo_Operador);
            int resposta_Int = Integer.parseInt(resposta);
            int Resultado_Conferencia = primeiro_Operador * segundo_Operador;
            
            if( primeiro_Operador * segundo_Operador == resposta_Int) {
                JOptionPane.showMessageDialog(null,"Você acertou!!!");
            }
            else {
                JOptionPane.showMessageDialog(null,"Você errou!");
            }
        }
        
    }
    
}
