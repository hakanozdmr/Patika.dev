package Locations;

import Player.Player;

public class Empty extends NormalLoc{

    public Empty(Player player) {
        super(player, "Boş", 6, "boş");
    }
    @Override
    public boolean onLocation() {
        return true;
    }
}
