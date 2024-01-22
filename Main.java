import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    // String fruta = "banana";
    // double valor = 2.50;
    Scanner teclado = new Scanner(System.in); // Inicializa a leitura do teclado
    System.out.println("Digite o seu nome: ");

    String nome = teclado.nextLine();

    System.out.println("Seja bem-vindo " + nome);
    teclado.close(); // Finaliza a leitura do teclado
  }

}
