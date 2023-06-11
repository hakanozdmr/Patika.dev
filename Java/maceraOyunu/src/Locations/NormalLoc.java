public abstract class NormalLoc extends Location{
    public NormalLoc(Player player,String name,int id,String info) {
        super(player,name,id,info);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
