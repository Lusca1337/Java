import java.util.Scanner;

public class exercicio4 {
    // Verifique se os dois textos do tipo String são iguais e apresente o resultado em tela
  public static void main(String[] args) {

    Scanner leitor = new Scanner ( System . in ) ;
    System.out.print("Digite uma palavra: ");
    String text1 = leitor.nextLine();
    System.out.print("Digite outra palavra: ");
    String text2 = leitor.nextLine();

    if (text1.equals(text2)) {
        System.out.println("São iguais");
    } else {
        System.out.println("Não são iguais");
    }

    leitor.close();
 
}
}