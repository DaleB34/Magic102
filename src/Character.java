public class Character
{
    //instance variables
    String name;
    int money;
    int attack;

    // constructor
    public Character(String name, int money, int attack) {
        this.name = name;
        this.money = money;
        this.attack = attack;
    }

    //brain methods
    public void attack(Character target)
    {
        System.out.println(name + " has attacked " + target.getName() + "!\n"
                + target.getName() + " has taken " + attack + " damage!");
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
