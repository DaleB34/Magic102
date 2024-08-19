public class Knight extends Character
{
    //instance variables
    String swordMaterial;
    int bench; //pounds
    boolean onGear; //gear refers to performance enhancing potions

    //constructor

    public Knight(String name, int money, int attack, String swordMaterial, int bench, boolean onGear) {
        super(name, money, attack);
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

    //toString
    @Override
    public String toString() {
        String output = super.toString() +
                "\nSword Material: " + swordMaterial +
                "\nBench Max: " + bench +
                "\nOn The Gear: " + onGear;
        return output;
    }
}
