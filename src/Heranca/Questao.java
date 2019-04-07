/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author vinic
 */

public abstract class Questao {
    int pontos;
    int operador1;
    int operador2;
    int resposta;
    int pontuacao;

    public Questao() {
        this.operador1 = ThreadLocalRandom.current().nextInt(0,101);
        this.operador2 = ThreadLocalRandom.current().nextInt(0,21);
    }
    public abstract boolean confereResposta();//comportamento abstrato imprementacao obrigatoria em cada classe filha 
    public abstract void constroiPergunta();
    
    public void mostraResultado() {
        if(this.confereResposta())
            JOptionPane.showMessageDialog(null,"Você acertou, parabéns");
        else
            JOptionPane.showMessageDialog(null,"Você errou.");
    }
}
