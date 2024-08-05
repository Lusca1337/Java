import java.util.Scanner;

public class exercicio3 {
    //  Realize a divisão entre dois números inteiros e apresente o resultado em tela.
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número inteiro: ");
    int numeroInteiro = scanner.nextInt();
    System.out.print("Digite outro numero inteiro: ");
    int numeroInteiro1 = scanner.nextInt();

    System.out.println("Resultado: " + numeroInteiro / numeroInteiro1);
    scanner.close();
 }
}

