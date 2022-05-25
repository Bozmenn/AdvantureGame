import java.util.*;

public class Game {
    
    private Scanner input = new Scanner(System.in);

    public void start(){
        System.out.println("Macera Oyununa Hosgeldiniz !");
        System.out.println("Lutfen bir isim giriniz : ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Sayin " + player.getName() + " bu karanlik ve sisli adaya hosgeldiniz ! ");
        System.out.println("Burada yasananlarin hepsi gerçek !");
        System.out.println("Lütfen bir karakter seciniz !");
        player.selectChar();
    }
}
