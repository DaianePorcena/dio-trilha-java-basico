import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
  public static void main(String[] args) {
    // String name = args[0];
    // String lastName = args[1];
    // int age = Integer.valueOf(args[2]);
    // double height = Double.valueOf(args[3]);

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite seu nome: ");
    String name = scanner.next();

    System.out.println("Digite seu sobrenome");
    String lastName = scanner.next();

    System.out.println("Digite a sua idade: ");
    int age = scanner.nextInt();

    System.out.println("Digite a sua altura: ");
    double height = scanner.nextDouble();

    scanner.close();

    System.out.println("Olá, me chamo " + name + " " + lastName);
    System.out.println("Tenho " + age + " anos de idade");
    System.out.println("Minha altura é " + height + "m");

  }
}
