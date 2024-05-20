public class PlanoOperadora {
  public static void main(String[] args) {
    String plano = "M";

    switch (plano) {
      case "T":
        System.out.println("Whatsap ilimitado + 5Gb Youtube");
      case "M":
        System.out.println("Whatsap e instagram ilimitados");
        break;
      case "B":
        System.out.println("100 minutos de ligação");
        break;
    }
  }
}
