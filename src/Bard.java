public class Bard extends Character
{
     Weapon weapon;
     int mana;

    public Bard(String name, int money, int attack, Weapon weapon, int mana) {
        super(name, money, attack);
        this.weapon = weapon;
        this.mana = mana;
    }

    //brain methods
    public void attack(Character target)
    {
        System.out.println(name + " has attacked " + target.getName() + " with their weapon "
                + weapon.getName() + " for " + weapon.getOffense() + " damage!");
    }


    //getters
    public String getWeapon() {
        return weapon.toString();
    }

    public int getMana() {
        return mana;
    }

    //setters

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        String output = super.toString() +
                "\nWeapon " + getWeapon() +
                "\nMana: " + mana;
        return output;
    }

}
