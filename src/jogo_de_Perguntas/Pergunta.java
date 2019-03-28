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
    int primeiro_Operador;
    int segundo_Operador;
    
    public void criaPergunta() {
        int tipoQuestao = ThreadLocalRandom.current().nextInt(0,3);
        
        if (tipoQuestao == 0) {
            if (resposta('+') == primeiro_Operador + segundo_Operador) {
                 JOptionPane.showMessageDialog(null,"Você acertou!!!");
            }
            else {
                JOptionPane.showMessageDialog(null,"Você errou");
            }
        }
        else if (tipoQuestao == 1) {
            if (resposta('-') == primeiro_Operador - segundo_Operador) {
                 JOptionPane.showMessageDialog(null,"Você acertou!!!");
            }
            else {
                JOptionPane.showMessageDialog(null,"Errou de novo");
            }
        }
        else {
            if (resposta('x') == primeiro_Operador * segundo_Operador) {
                 JOptionPane.showMessageDialog(null,"Você acertou!!!");
            }
            else {
                JOptionPane.showMessageDialog(null,"Burro");                
            }
        }
}
    public int resposta (char operador) {
        if (operador == 'x')  {
            primeiro_Operador = ThreadLocalRandom.current().nextInt(0,10);
            segundo_Operador = ThreadLocalRandom.current().nextInt(0,10);
        }
        else {
            primeiro_Operador = ThreadLocalRandom.current().nextInt(0,100);
            segundo_Operador = ThreadLocalRandom.current().nextInt(0,50);           
        }
        String resposta = JOptionPane.showInputDialog("Quanto é: \n " + primeiro_Operador + operador + segundo_Operador);
        int resposta_Int = Integer.parseInt(resposta);
        return resposta_Int;
    }
}
