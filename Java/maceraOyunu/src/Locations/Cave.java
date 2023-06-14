package Locations;

import Obstacles.Obstacle;
import Obstacles.Zombie;
import Player.Player;

public class Cave extends BatteLoc{
    public Cave(Player player) {
        super(player, "Mağara", 3, "Yemek bulabilirsin ama zombilerle yüzleşmen gerek", new Zombie(), "food",3);
    }
}
