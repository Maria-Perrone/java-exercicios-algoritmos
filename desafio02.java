package excercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Maria Perrone :)
 */
public class desafio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String model1 = "Ar-condicionado portátil";
        String model2 = "Chuveiro elétrico";
        String model3 = "Torneira elétrica";
        double tensao = 0;
        double watts = 0;
        String escolha;
        String aparelho = "none";
        int resposta = 0;

        //inicio da estrutura de repetição do codigo inteiro
        while (true) {

            // ELETRO_CALC_PRO 
            escolha = JOptionPane.showInputDialog(null,  "Insira o aparelho:"
                    + "\n1 - Ar-condicionado portátil"
                    + "\n2 - Chuveiro elétrico"
                    + "\n3 - Torneira elétrica");
            int nEscolha = Integer.parseInt(escolha);

            switch (nEscolha) {
                case 1 -> {
                    aparelho = model1;
                }
                case 2 -> {
                    aparelho = model2;
                }
                case 3 -> {
                    aparelho = model3;
                }
                default ->
                    JOptionPane.showMessageDialog(null, "Opção invalida!");
            }

            //repetição input potencia W
            while (true) {
                //captura de erros
                try {
                    String w = JOptionPane.showInputDialog(null, "Digite a potência do equipamento (W): ");
                    watts = Double.parseDouble(w);
                    if (watts > 0) {
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Potencia deverá ser maior que 0");
                    }
                    //erro capturado de: sem numero, numero nao inteiro
                } catch (java.lang.NumberFormatException erro) {
                    JOptionPane.showMessageDialog(null, "Informe apenas numeros inteiros ");
                } catch (java.lang.NullPointerException erro) {
                    JOptionPane.showMessageDialog(null, "insira algum valor valido. ");
                }

            }
            //repetição input tensão A
            while (true) {
                try {
                    String A = JOptionPane.showInputDialog(null, "Digite a tensão de alimentação (V): ");
                    tensao = Double.parseDouble(A);

                    if (tensao > 0) {
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Tensão deverá ser maior que 0");
                    }
                } //erro capturado de: sem numero, numero nao inteiro
                catch (java.lang.NumberFormatException erro) {
                    JOptionPane.showMessageDialog(null, "Digite apenas numeros inteiros ");
                } catch (java.lang.NullPointerException erro) {
                    JOptionPane.showMessageDialog(null, "insira algum valor valido. ");
                }
            }

            //calculo da corrente
            double correnteCalc = watts / tensao;
            //definição do fio e disjuntor.
            double disjuntor = 0;
            double fio = 0;

            if (correnteCalc
                    <= 10) {
                disjuntor = 10;
                fio = 1.5;
            } else if (correnteCalc > 10 && correnteCalc
                    <= 16) {
                disjuntor = 16;
                fio = 2.5;
            } else if (correnteCalc > 16 && correnteCalc
                    <= 20) {
                disjuntor = 20;
                fio = 2.5;
            } else if (correnteCalc > 20 && correnteCalc
                    <= 25) {
                disjuntor = 25;
                fio = 4;
            } else if (correnteCalc > 25 && correnteCalc
                    <= 32) {
                disjuntor = 32;
                fio = 6;
            } else if (correnteCalc > 32 && correnteCalc
                    <= 40) {
                disjuntor = 40;
                fio = 6;
            } else if (correnteCalc > 40 && correnteCalc
                    <= 50) {
                disjuntor = 50;
                fio = 10;
            } else {
                JOptionPane.showMessageDialog(null, "Parametros não definidos");
            }

            //saida dos dados
            JOptionPane.showMessageDialog(
                    null, "Aparelho escolhido : " + aparelho
                    + "\nPotência : " + tensao + " W"
                    + "\nTensão: " + watts + " V"
                    + "\nCorrente calculada: " + correnteCalc + " A"
                    + "\nDisjuntor recomendado: " + disjuntor + " A"
                    + "\nBitola do fio recomendada: " + fio + " mm2");
            //repetir sistema novamente
            resposta = JOptionPane.showConfirmDialog(null, "deseja calcular novamente");

            if (resposta == JOptionPane.NO_OPTION) {
                break;
            }
        }
    }
}
