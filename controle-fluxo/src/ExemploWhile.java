import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

  public static void main(String[] args) {
    double mesada = 50.0;
    int quantidadeDoces = 0;
    while (mesada > 0) {
      Double valorDoce = valorAleatorio();
      if (valorDoce > mesada) {
        valorDoce = mesada;
      }
      System.out.println("Doce de valor: " + valorDoce + " adicionado ao carrinho.");
      mesada = mesada - valorDoce;
      quantidadeDoces++;
    }
    System.out.println("Mesada: " + mesada);
    System.out.println("Quantidade de doces: " + quantidadeDoces);
  }

  private static double valorAleatorio() {
    return ThreadLocalRandom.current().nextDouble(2, 15);
  }
}
