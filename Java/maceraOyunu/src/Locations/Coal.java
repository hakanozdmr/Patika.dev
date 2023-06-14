package Locations;

import Obstacles.Zombie;
import Player.Player;

import java.util.Random;

public class Coal extends BatteLoc{


    public Coal(Player player) {
        super(player, "Maden", 4, "Savaş ve Ganimet", new Zombie(), "Money,Weapon,Armor",5);
    }
}
