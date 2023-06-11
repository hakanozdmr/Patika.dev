import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money ;
    private String name;
    private String charName;
    private Inventory inventory;

    private Scanner input = new Scanner(System.in);


    public Player(String name){
        this.name = name;
        this.inventory = new Inventory();
    }
    public void selectChar(){
        Chars.GameChar[] charlist = {new Chars.Samurai(), new Chars.Knight(),new Chars.Archer()};
        for ( Chars.GameChar gameChar: charlist){
            gameChar.charInfo();
        }
        System.out.println("###################################################################");
        System.out.println("Lütfen Bir Karakter Seçiniz");
        int selectChar = input.nextInt();
        switch (selectChar){
            case 1:
                initPlayer(new Chars.Samurai());
                break;
            case 2:
                initPlayer(new Chars.Knight());
                break;
            case 3:
                initPlayer(new Chars.Archer());
                break;
            default:
                initPlayer(new Chars.Samurai());
        }
        System.out.println("Karakter Seçildi!");
        playerCharInfo();
    }

    public void selectLocation(){

    }
    public void initPlayer(Chars.GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }
    public void playerCharInfo(){
        System.out.println("###################################################################");
        System.out.println(
                "Karakter : "+this.getCharName()+
                "\t Hasar : "+this.getDamage()+
                "\t Sağlık : "+this.getHealth()+
                "\t Para : "+this.getMoney());
        System.out.println("###################################################################");
    }
    public void playerInfo(){
        System.out.println("###################################################################");
        System.out.println(
                "Silahınız : "+this.getInventory().getWeapon().getName()+
                        "\t Zırhınız : "+this.getInventory().getArmor().getName()+
                        "\t Hasarınız : "+this.getDamage()+
                        "\t Defansınız : "+this.getInventory().getArmor().getDefence()+
                        "\t Sağlık : "+this.getHealth()+
                        "\t Para : "+this.getMoney());
        System.out.println("###################################################################");
    }
    public int getDamage() {
        return damage+this.getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
