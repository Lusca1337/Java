import java.util.Scanner;

public class exercicio2 {
  //  Verifique se o valor é par ou ímpar. Apresente o resultado em tela.
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número inteiro: ");
    int numeroInteiro = scanner.nextInt();

    if (numeroInteiro % 2 == 0) {
        System.out.println("É Par");
    } else {
        System.out.println("É impar");
    }
    scanner.close();
  }
}