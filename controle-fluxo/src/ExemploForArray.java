public class ExemploForArray {

  public static void main(String[] args) {
    String alunos[] = { "João", "Maria", "José", "Ana", "Pedro" };

    for (int x = 1; x < alunos.length; x++) {
      System.out.println("O aluno no índice x = " + x + " é " + alunos[x]);
    }

    // for each
    for (String aluno : alunos) {
      System.out.println("Nome do aluno é: " + aluno);
    }
  }
}
