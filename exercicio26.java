package excercicios;

import javax.swing.JOptionPane;

public class exercicio26 {

    public static void main(String[] args) {
        //exercicio18
        int unidades = 0, loop = 0;

        do {
            String maça = JOptionPane.showInputDialog(null, "Informe a quantidade das maças: ");
            unidades = Integer.parseInt(maça);

            double valorUnit = 0;

            if (unidades < 12) {
                valorUnit = 0.30;
            } else {
                valorUnit = 0.25;
            }
            JOptionPane.showMessageDialog(null, "O valor é de : " + (unidades * valorUnit));

            loop = JOptionPane.showConfirmDialog(null, "Queres calcular novamente? ");
        } while (loop == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null, "Programa finalizado! :( ");
    }
}
