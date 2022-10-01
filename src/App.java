// Cálculo de horas trabalhadas
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        double horas;
        double valor;
        double salario;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva abaixo quanto você ganha em horas: ");
        valor = teclado.nextDouble();


        System.out.print("Escreva abaixo quantas horas você trabalhou no mês: ");
        horas = teclado.nextDouble();

        salario = valor * horas;

        System.out.print("Seu salário do mês é: R$ " + salario);
        

        teclado.close();
        








    }





}
