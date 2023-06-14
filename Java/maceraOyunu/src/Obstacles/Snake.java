//package Obstacles;
//
//public class Snake extends Obstacle {
//    public Snake() {
//        super(4, "Yılan", getRandomDamage(), 12, getRandomItem(), 12);
//    }
//
//    private int getRandomDamage() {
//        // Rastgele bir hasar değeri seçin (3 ve 6 arasında)
//        return (int) (Math.random() * (6 - 3 + 1) + 3);
//    }
//
//    private Item getRandomItem() {
//        // Eşya kazanma ihtimaline göre rastgele bir eşya seçin
//        double itemChance = Math.random();
//
//        if (itemChance <= 0.15) {
//            return Item.SILAH;
//        } else if (itemChance <= 0.35) {
//            return Item.TUFEK;
//        } else if (itemChance <= 0.65) {
//            return Item.KILIC;
//        } else if (itemChance <= 0.9) {
//            return Item.TABANCA;
//        } else if (itemChance <= 0.925) {
//            return Item.ZIRH;
//        } else if (itemChance <= 0.975) {
//            return Item.AGIR_ZIRH;
//        } else if (itemChance <= 0.975) {
//            return Item.ORTA_ZIRH;
//        } else if (itemChance <= 0.975) {
//            return Item.HAFIF_ZIRH;
//        } else if (itemChance <= 1.0) {
//            return Item.PARA;
//        } else {
//            return Item.NONE;
//        }
//    }
//}
//
