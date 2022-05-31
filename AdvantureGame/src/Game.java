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
        System.out.println("----------------------------------------------");
        System.out.println("Karakterler");
        player.selectChar();
        Location location = null;
        while(true){
            player.printInfo();
            System.out.println();
            System.out.println("########### Bolgeler ###########\n");
            System.out.println("1 - Guvenli Ev --> Burasi sizin için guvenli bir evdir, dusman yok ! ");
            System.out.println("2 - Magaza --> Silah veya Zirh Satin alabilirsiniz !");
            System.out.println("3 - Magara --> Ödül <Yemek>, Dikkatli ol karsina Zombi cikabilir !");
            System.out.println("4 - Orman --> Ödül <Odun>, Dikkatli ol karsina Vampir cikabilir !");
            System.out.println("5 - Nehir --> Ödül <Su>, Dikkatli ol karsina Ayi cikabilir !");
            System.out.println("0 - Cikis yap --> Oyunu sonlandir");
            
            System.out.println("Lutfen gitmek istediginiz bolgeyi seciniz ! ");
            int selectLoc = input.nextInt();
            switch(selectLoc) {
                case 0 :
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default :
                    System.out.println("Lutfen gecerli bir bolge giriniz !");
                    location = new SafeHouse(player);
            }

            if(location == null){
                System.out.println("Bu karanlik ve sisli adadan cabuk vazgectin ! ");
                break;
            }

            if(!location.onLocation()) {
                System.out.println("GAME OVER");
                break;
            }
        }   
    }
}
