package Locations;

import Obstacles.Obstacle;
import Obstacles.Vampire;
import Player.Player;

public class Forest extends BatteLoc{
    public Forest(Player player) {
        super(player, "Orman", 4, "Tekinsiz mekan", new Vampire(), "firewood",3);
    }
}
