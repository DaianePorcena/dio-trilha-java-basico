public class Usuario {
  public static void main(String[] args) {
    SmartTv smartTv = new SmartTv();

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.aumentarVolume();

    smartTv.mudarCanal(5);
    System.out.println("Canal Atual: " + smartTv.canal);

    System.out.println("TV está ligada? " + smartTv.ligada);
    System.out.println("Volume Atual: " + smartTv.volume);

    smartTv.ligar();
    System.out.println("Novo Status - TV está ligada? " + smartTv.ligada);
  }
}
