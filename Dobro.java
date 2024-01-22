import java.util.Scanner;
public class Dobro {
    
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            System.out.print("Digite um número: ");
            double numero = ler.nextDouble();
            double dobro = numero * 2;

            System.out.println("O dobro de " + numero + " é " + dobro);
            ler.close();
        }
    
}
