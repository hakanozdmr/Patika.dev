import java.util.Scanner;

public abstract class Location {
    private Player player;
    private String name;

    private int id;
    private String info;

    protected Scanner input = new Scanner(System.in);


    public Location(Player player, String name, int id, String info) {
        this.player = player;
        this.name = name;
        this.id = id;
        this.info = info;
    }
    public abstract boolean onLocation();

    public void locationInfo(){
        System.out.println("###################################################################");
        System.out.println("ID : "+
                this.getId() +"\t Bölge : "+ this.getName()+"\t Bilgi : " + this.getInfo() );
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
