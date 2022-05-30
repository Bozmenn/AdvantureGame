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
        Location location = null;
        while(true){
            player.printInfo();
            System.out.println("########### Bolgeler ###########\n");
            System.out.println("1 - Guvenli Ev --> Burasi sizin için guvenli bir evdir, dusman yok ! ");
            System.out.println("2 - Magaza --> Siah veya Zirh Satin alabilirsiniz !");
            System.out.println("Lutfen gitmek istediginiz bolgeyi seciniz ! ");
            int selectLoc = input.nextInt();
            switch(selectLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default :
                    location = new SafeHouse(player);
            }

            if(!location.onLocation()) {
                System.out.println("GAME OVER");
                break;
            }
        }   
    }
}
