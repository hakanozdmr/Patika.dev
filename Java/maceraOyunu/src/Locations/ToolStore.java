package Locations;

import Player.*;

import Items.*;

public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Eşya Dükkanı",2, "Silah veya Zırh satın alabilirsiniz");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Mağazaya Hoşgeldiniz");
        boolean showMenu = true;
        while (showMenu){
            System.out.println("1 - Silahlar");
            System.out.println("2 - Zırhlar");
            System.out.println("3 - Çıkış Yap");
            System.out.print("Seçiminiz : ");
            int selectCase = input.nextInt();
            while (selectCase < 1 || selectCase >3){
                System.out.println("Geçersiz değer , tekrar değer giriniz");
                selectCase = input.nextInt();
            }
            switch (selectCase){
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Yine bekleriz ...");
                    showMenu = false;
                    break;
            }
        }

        return true;
    }
    public void printWeapon(){
        System.out.println("Silahlar");
        System.out.println();
        for (Weapon w : Weapon.weapons()){
            w.weaponInfo();
        }
        System.out.println("4 Üst Menuye Dön");



    }
    public void buyWeapon(){
        System.out.println("Bir silah seçiniz : ");
        int selectWeaponId = input.nextInt();
        while (selectWeaponId < 1 || selectWeaponId > Weapon.weapons().length+1){
            System.out.println("Geçersiz değer , tekrar değer giriniz");
            selectWeaponId = input.nextInt();
        }
        if (selectWeaponId != 4){
            Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponId);
            if (selectedWeapon !=null){
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()){
                    System.out.println("Yeterli paranız bulunmamaktadir !!!");
                }else{
                    System.out.println(selectedWeapon.getName() + " silahını satın aldınız!");
                    this.getPlayer().setMoney(this.getPlayer().getMoney()-selectedWeapon.getPrice());
                    System.out.println("Kalan Paranız : "+ getPlayer().getMoney());
                    System.out.println("Önceki Silahınız : "+this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
//                this.getPlayer().setDamage(this.getPlayer().getDamage()+this.getPlayer().getInventory().getWeapon().getDamage());
                    System.out.println("Yeni Silahınız : "+ this.getPlayer().getInventory().getWeapon().getName());
                }
            }
        }

    }
    public void printArmor(){
        System.out.println("Zırhlar");
        System.out.println();
        for (Armor a : Armor.armors()){
            a.armorInfo();
        }
        System.out.println("4 Üst Menuye Dön");
    }
    public void buyArmor(){
        System.out.println("Bir Zırh seçiniz : ");
        int selectArmorId = input.nextInt();
        while (selectArmorId < 1 || selectArmorId > Armor.armors().length+1){
            System.out.println("Geçersiz değer , tekrar değer giriniz");
            selectArmorId = input.nextInt();
        }
        if (selectArmorId !=4){
            Armor selectedArmor = Armor.getArmorObjById(selectArmorId);
            if (selectedArmor !=null){
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()){
                    System.out.println("Yeterli paranız bulunmamaktadir !!!");
                }else{
                    System.out.println(selectedArmor.getName() + " zırhını satın aldınız!");
                    this.getPlayer().setMoney(this.getPlayer().getMoney()-selectedArmor.getPrice());
                    System.out.println("Kalan Paranız : "+ getPlayer().getMoney());
                    System.out.println("Önceki Zırhınız : "+this.getPlayer().getInventory().getArmor().getName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Yeni Zırhınız : "+ this.getPlayer().getInventory().getArmor().getName());
                }
            }
        }

    }
}
