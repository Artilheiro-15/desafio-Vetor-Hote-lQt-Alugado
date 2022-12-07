import java.util.Locale;
import java.util.Scanner;

import entidades.Aluguel;

class Main {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Aluguel[] Vetor = new Aluguel[10];

    System.out.println("Quantos quarto voce quer alugar? ");
    int N = sc.nextInt();

    for (int i = 1; i <= N; i++) {
      System.out.println();
      
      System.out.println("Quarto #" + i + ":");
      System.out.print("Nome: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("Email: ");
      String email = sc.next();
      System.out.print("Quarto: ");
      int numeroQuarto = sc.nextInt();

      Vetor[numeroQuarto] = new Aluguel(name, email);
    }
    System.out.println();
    System.out.println("RELATORIO DE TODAS OCUPAÇOES");
    
    for (int i = 1; i < 10; i++) {
      if (Vetor[i] != null) {
        System.out.println(i + ":" + Vetor[i]);
      }
    }

    sc.close();

  }
}