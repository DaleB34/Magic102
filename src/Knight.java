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

    //default constructor
    public Knight()
    {
        name = "";
        money = 0;
        attack = 0;
        sword = null;
        bench = 0;
        onGear = false;
    }

    //brain methods
    @Override
    public void attack(Character target)
    {
        System.out.println(name + " has cut down " + target.getName() +
                " with their sword " + sword.getName() + "!");
    }

    public void spin(Character target)
    {
        int secondsSpinning = (int) (bench * sword.getOffense() * 0.01);
        System.out.println(name + " spins to win on " + target.getName() + " for " +
                secondsSpinning + " seconds, making them uninstall!");
    }

    public void flashR(Character target)
    {
        int damageDone = (int) (bench * attack * money * 0.01);
        if (onGear)
            damageDone*= 3;
        System.out.println(name + "has pressed the F key, followed by the R key to do " + damageDone
        + " to " + target + "!");
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
                "\nSword " + sword.toString() +
                "\nMax Bench: " + bench +
                "\nOn The Gear: " + onGear;
        return output;
    }
}
