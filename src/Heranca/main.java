/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author vinic
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tipoQuestao = ThreadLocalRandom.current().nextInt(0,3);
        switch(tipoQuestao) {
            case 1:
                QuestaoMultiplicacao mult = new QuestaoMultiplicacao();
                mult.constroiPergunta();
                mult.confereResposta();
                mult.mostraResultado();
                break;
            case 2:
                QuestaoSoma soma = new QuestaoSoma();
                soma.constroiPergunta();
                soma.confereResposta();
                soma.mostraResultado();
                break;
            case 3:
                QuestaoSubtracao sub = new QuestaoSubtracao();
                sub.constroiPergunta();
                sub.confereResposta();
                sub.mostraResultado();
                break;    
        }
    }
}
