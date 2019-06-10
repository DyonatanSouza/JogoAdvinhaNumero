import javax.swing.JOptionPane;
/*
Autor: Dyonatan Diogo Dias Souza
*/

public class JogoDeAdivinhar {
  public static void main(String[] args) {
    // define um número qualquer entre 0 e 10
    int rndNr = (int) Math.ceil(Math.random() * 5);
    // lista de opções para o combo box da caixa de diálogo
    Object[] opcoes = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
    // string onde será retornado o resultado
    String resposta;
    while (true) {
    // loop para evitar que o jogo feche depois da primeira resposta
      resposta = (String) JOptionPane.showInputDialog(null,
                          "Em que número estou pensando?", "Jogo de Advinhar",
                          JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
      if (resposta == null) {
      /*
       * se clicar no botão Cancel, mostrar uma mensagem de Game Over
       * e sair do loop para finalizar o programa
       */
        JOptionPane.showMessageDialog(null,
                          "Game Over!\nVocê desistiu do jogo!");
        break;
      }
      if (Integer.valueOf(resposta) > rndNr) {
      /*
       * Interpreta string como inteiro e compara com o número sorteado
       * para ver se é maior
       */
        JOptionPane.showMessageDialog(null,
                          "Errado!\nO número que eu pensei é menor.");
      } else if (Integer.valueOf(resposta) < rndNr) {
      /*
       * Interpreta string como inteiro e compara com o número sorteado
       * para ver se é maior
       */
        JOptionPane.showMessageDialog(null,
                          "Errado!\nO número que eu pensei é maior.");
      } else {
      /*
       * se não for nem maior e nem menor, então é igual.
       * Finaliza o jogo saindo do loop
       */
        JOptionPane.showMessageDialog(null,
                          "Parabéns\nVocê adivinhou!\n"
                          + "Eu realmente pensei no número " + rndNr);
        break;
      }
    }
  }
}