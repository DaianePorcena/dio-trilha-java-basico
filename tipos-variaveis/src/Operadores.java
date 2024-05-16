public class Operadores {
  public static void main(String[] args) {
    boolean condition1 = true;

    boolean condition2 = false;

    if (condition1 && condition2) {
      System.out.println("as duas condições são verdadeiras");
    }

    if (condition2 || condition1) {
      System.out.println("pelo menos uma condição é verdadeira");
    }

    System.out.println("fim");
  }
}
