package Locations;

import Obstacles.*;
import Player.Player;

public class River extends BatteLoc{
    public River(Player player) {
        super(player, "Nehir", 5, "Su Doldurabilirsiniz ama ayı çıkabilir", new Bear(), "water",2);
    }
}
