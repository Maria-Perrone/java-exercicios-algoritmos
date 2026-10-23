
package excercicios;
import java.util.Scanner;

public class exercicio22 {

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    double aumento = 0;
    
        System.out.println("Digite o nome do funcionario: ");
        String nome = sc.nextLine();
        
        System.out.println("Informe a função do funcionario: ");
        String função = sc.nextLine();
        
        System.out.println("Informe o salario atual do funcionario: ");
        double salario = sc.nextDouble();
           
        if (salario <= 1280.00) {
        aumento = 0.20;
        } else if (salario >= 1280.01 && salario <= 1700.00) {
        aumento = 0.15;
        } else if (salario >= 1700.01 && salario <= 2500.00) {
        aumento = 0.10;
        } else if (salario >= 2500.01) {
        aumento = 0.5;
}
      // Cálculos do reajuste
        double valorAumento = salario * (aumento);
        double novoSalario = salario + valorAumento; 
        
        System.out.println("Olá, colaborador " +nome 
                +" Cargo: "+função
                + " seu salario atual é de R$" +salario
                + " A porcentagem do acrescimo é %" +(aumento*100)
                + " com o adicional, seu novo salario será de: R$ "+novoSalario );
    }
    }
    
