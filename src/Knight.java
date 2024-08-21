public class Knight extends Character
{
    //instance variables
    Weapon sword;
    int bench; //pounds
    boolean onGear; //gear refers to performance enhancing potions

    //constructor

    public Knight(String name, int money, int attack, Weapon sword, int bench, boolean onGear) {
        super(name, money, attack);
        this.sword = sword;
        this.bench = bench;
        this.onGear = onGear;
    }


    //getters

    public String getSword() {
        return sword.toString();
    }

    public int getBench() {
        return bench;
    }

    public boolean isOnGear() {
        return onGear;
    }

    //setters
    public void setSword(Weapon sword) {
        this.sword = sword;
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
                "\nSword: " + sword +
                "\nBench Max: " + bench +
                "\nOn The Gear: " + onGear;
        return output;
    }
}
