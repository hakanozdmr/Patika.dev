package Locations;

import Player.*;
public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(player, "Ev",1,"Güvenli bir ev , düşman yoktur");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Güvenli Evdesiniz !");

        System.out.println("Canınız Yenilendi !");
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        return true;
    }
}
