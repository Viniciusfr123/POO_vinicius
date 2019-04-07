/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;

/**
 *
 * @author vinic
 */

import javax.swing.JOptionPane;
public class QuestaoSoma extends Questao {

    @Override
    public boolean confereResposta() {
        return (this.operador1 + this.operador2 == this.resposta);
    }
    
    @Override
    public void constroiPergunta() {
        String resposta = JOptionPane.showInputDialog("Quanto é: " + this.operador1 + "+" + this.operador2);
        this.resposta = Integer.parseInt(resposta);
    }
    
}


