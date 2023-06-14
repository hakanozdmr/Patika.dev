package Player;

import java.util.Scanner;

import Chars.*;

public class Player {
    private int damage;
    private int health;
    private int money ;
    private String name;
    private String charName;
    private Inventory inventory;

    private int originalHealth;

    private Scanner input = new Scanner(System.in);


    public Player(String name){
        this.name = name;
        this.inventory = new Inventory();
    }
    public void selectChar(){
        GameChar[] charlist = {new Samurai(), new Knight(),new Archer()};
        for ( GameChar gameChar: charlist){
            gameChar.charInfo();
        }
        System.out.println("###################################################################");
        System.out.println("Lütfen Bir Karakter Seçiniz");
        int selectChar = input.nextInt();
        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Knight());
                break;
            case 3:
                initPlayer(new Archer());
                break;
            default:
                initPlayer(new Samurai());
        }
        System.out.println("Karakter Seçildi!");
        playerCharInfo();
    }

    public void selectLocation(){

    }
    public void initPlayer(Chars.GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setOriginalHealth(gameChar.getHealth());
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
                        "\t Hasarınız : "+this.getTotalDamage()+
                        "\t Defansınız : "+this.getInventory().getArmor().getDefence()+
                        "\t Sağlık : "+this.getHealth()+
                        "\t Para : "+this.getMoney());
        System.out.println("###################################################################");
    }
    public void playerInverntoryInfo(){
        String isWater = this.getInventory().isWater() ? "var" : "yok";
        String isFood = this.getInventory().isFood() ? "var" : "yok";
        String isFirewood = this.getInventory().isFirewood() ? "var" : "yok";
        System.out.println("###################################################################");
        System.out.println(
                "Silahınız : "+this.getInventory().getWeapon().getName()+
                        "\t Zırhınız : "+this.getInventory().getArmor().getName()+
                        "\t Hasarınız : "+this.getTotalDamage()+
                        "\t Defansınız : "+this.getInventory().getArmor().getDefence()+
                        "\t Sağlık : "+this.getHealth()+
                        "\t Para : "+this.getMoney()+
                        "\n Su Var mı ? : "+ isFood+
                        "\n Yemek Var mı ? : "+isFood+
                        "\n Odun Var mı ? : "+isFirewood);
        System.out.println("###################################################################");
    }
    public int getTotalDamage() {
        return damage+this.getInventory().getWeapon().getDamage();
    }
    public int getDamage() {
        return damage;
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

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}
