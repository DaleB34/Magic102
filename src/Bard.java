public class Bard extends Character
{
     Weapon weapon;
     int mana;

     //constructor
    public Bard(String name, int money, int attack, Weapon weapon, int mana) {
        super(name, money, attack);
        this.weapon = weapon;
        this.mana = mana;
    }

    //default constructor
    public Bard()
    {
        name = "";
        money = 0;
        attack = 0;
        weapon = null;
        mana = 0;
    }

    //brain methods
    public void attack(Character target)
    {
        System.out.println(name + " has attacked " + target.getName() + " with their weapon "
                + weapon.getName() + " for " + weapon.getOffense() + " damage!");
    }

    public void sing(String song, Character target)
    {
        int songAmount = (int) (mana * money * 0.1);
        System.out.println(name + " has forcefully sang the song " + song + " to " +
                target.getName() + songAmount + " times, making their eardrums blow out!");
    }

    public void gankMid(int manaUsed, Character target)
    {
        if(manaUsed > mana )
        {
            System.out.println("You have no mana!! You have no mana!!");
        }
        else
        {
            System.out.println(target.getName() + " has been slain.");
        }
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
