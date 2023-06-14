import Locations.*;
import Player.Player;

import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    public void start(){
        System.out.println("Macera Oyununua Hoşgeldiniz");
        System.out.println("Lütfen bir isim giriniz : ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Kullanıcı "+player.getName() + " bu karanlık ve sisli adaya hoşgeldiniz.");
        System.out.println("Burada yaşananların hepsi gerçek!!!");
        System.out.println("Lütfen bir karakter seçiniz.");
        System.out.println();
        player.selectChar();
        Location location = new Empty(player);
        while (true){
            player.playerInfo();
            Location [] loclist = {new SafeHouse(player), new ToolStore(player),new Cave(player),new Forest(player),new River(player)};
            System.out.println();
            System.out.println("######## Bölgeler ##########");
            System.out.println();
            System.out.println("0 - Çıkış Yap");
            for (Location loc: loclist){
                loc.locationInfo();
            }
            System.out.println("###################################################################");
            System.out.println("Lütfen Gitmek İstediğiniz Yeri Seçiniz");
            System.out.println("Envantere Bakmak için 6 yı Seçiniz");
            int selectLoc = input.nextInt();
            switch (selectLoc){
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    if (player.getInventory().isFood() == false){
                        location = new Cave(player);
                    }else {
                        System.out.println("Burayı Temizlediniz Birdaha Giremezsiniz");
                        location = new Empty(player);
                    }
                    break;
                case 4:
                    if (player.getInventory().isFirewood() == false){
                        location = new Forest(player);
                    }else {
                        System.out.println("Burayı Temizlediniz Birdaha Giremezsiniz");
                        location = new Empty(player);
                    }
                    break;
                case 5:
                    if (player.getInventory().isWater() == false){
                        location = new River(player);
                    }else {
                        System.out.println("Burayı Temizlediniz Birdaha Giremezsiniz");
                        location = new Empty(player);
                    }
                    break;
                case 6:
                    player.playerInverntoryInfo();
                    location = new Empty(player);
                    break;
                default:
                    System.out.println("Lütfen geçerli bir değer giriniz !");
            }
            if (location == null){
                System.out.println("Bu karanlık ve sisli adadan çabuk vazgeçtin.");
                break;
            }
            if (! location.onLocation()){
                System.out.println("GAME OVER!");
                break;
            }
            if(player.getInventory().isFood() && player.getInventory().isWater() && player.getInventory().isFirewood() ){
                location = null;
                System.out.println("Oyunu bitirdin tebrikler !!!");
                break;
            }
        }
    }
}
