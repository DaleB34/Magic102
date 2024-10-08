public class Character
{
    //instance variables
    String name;
    int money;
    int attack;
    private static int count;

    // constructor
    public Character(String name, int money, int attack) {
        this.name = name;
        this.money = money;
        this.attack = attack;
        count++;
    }

    //default constructor
    public Character()
    {
        name = "";
        money = 0;
        attack = 0;
    }

    //brain methods
    public void attack(Character target)
    {
        System.out.println(name + " has attacked " + target.getName() + "!\n"
                + target.getName() + " has taken " + attack + " damage!");
    }

    public void die(String reason)
    {
        System.out.println(name + " has died because of " + reason + "!");
    }

    public void crashout(Character target, Weapon weapon)
    {
        System.out.println(name + " " + weapon.whack(target));
    }


    //getters
    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public int getAttack() {
        return attack;
    }

    public static int getCount()
    {
        return count;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    //toString
    @Override
    public String toString() {
        String output = "Name: " + name +
                "\nMoney: " + money +
                "\nAttack: " + attack;
        return output;
    }

}//end Character class
