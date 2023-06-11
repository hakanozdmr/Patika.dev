package Items;

public class Armor {
    private int id;
    private int defence;
    private String name;
    private int price;

    public Armor(int id, int defence, String name, int price) {
        this.id = id;
        this.defence = defence;
        this.name = name;
        this.price = price;
    }
    public static Armor[] armors(){
        Armor[] armorList = new Armor[3];
        armorList[0] = new Armor(1,1,"Hafif",15);
        armorList[1] = new Armor(2,3,"Orta",25);
        armorList[2] = new Armor(3,5,"Ağır",40);
        return armorList;
    }
    public void armorInfo(){
        System.out.println(this.getId()+" "+this.getName()+" <Defans : "+this.getDefence()+", Fiyat : "+this.getPrice()+">");
    }
    public static Armor getArmorObjById(int id){
        for(Armor a:Armor.armors()){
            if (a.getId() ==id){
                return a;
            }
        }
        return null;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
