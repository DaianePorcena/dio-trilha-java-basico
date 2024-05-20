public class SistemaMedida {
  public static void main(String[] args) {
    String sigla = "P";

    // if (sigla == "P") {
    // System.out.println("pequeno");
    // } else if (sigla == "M") {
    // System.out.println("médio");
    // } else if (sigla == "G") {
    // System.out.println("grande");
    // } else {
    // System.out.println("Indefinido!");
    // }

    switch (sigla) {
      case "P":
        System.out.println("pequeno");
        break;
      case "M":
        System.out.println("médio");
        break;
      case "G":
        System.out.println("grande");
        break;
      default:
        System.out.println("Indefinido!");
    }
  }
}
