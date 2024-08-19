public class Knight
{
    //instance variables
    String swordMaterial;
    int bench; //pounds
    boolean onGear; //gear refers to performance enhancing potions

    //constructor

    public Knight(String swordMaterial, int bench, boolean onGear) {
        this.swordMaterial = swordMaterial;
        this.bench = bench;
        this.onGear = onGear;
    }

    //getters

    public String getSwordMaterial() {
        return swordMaterial;
    }

    public int getBench() {
        return bench;
    }

    public boolean isOnGear() {
        return onGear;
    }

    //setters


    public void setSwordMaterial(String swordMaterial) {
        this.swordMaterial = swordMaterial;
    }

    public void setBench(int bench) {
        this.bench = bench;
    }

    public void setOnGear(boolean onGear) {
        this.onGear = onGear;
    }
}
