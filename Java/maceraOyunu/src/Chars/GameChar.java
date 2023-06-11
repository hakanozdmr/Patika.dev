package Chars;

public abstract class GameChar {
    private int damage;
    private int id;
    private String name;
    private int health;
    private int money ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameChar(int id,String name, int damage, int health, int money) {
        this.id=id;
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.name = name;
    }
    public void charInfo(){
        System.out.println("###################################################################");
        System.out.println("ID : "+this.getId()+
                "\t Karakter : "+this.getName()+
                "\t Hasar : "+this.getDamage()+
                "\t Sağlık : "+this.getHealth()+
                "\t Para : "+this.getMoney());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
