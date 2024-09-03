public class Weapon
{
    //instance variables
    String name;
    int offense;
    int defense;
    int minMana;
    int maxMana;
    private static int count;

    //constructor

    public Weapon(String name, int offense, int defense, int minMana, int maxMana) {
        this.name = name;
        this.offense = offense;
        this.defense = defense;
        this.minMana = minMana;
        this.maxMana = maxMana;
        count++;
    }

    //default constructor
    public Weapon()
    {
        name = "";
        offense = 0;
        defense = 0;
        minMana = 0;
        maxMana = 0;
    }

    //brain methods
    public String whack(Character target)
    {
        String output = target + " has been whacked on the head for ";

        if(defense > offense)
        {
            output+= offense/15 + " damage!";
        }
        else
            output+= offense/7.5 + " damage!";

        return output;
    }

    public void destroy()
    {
        System.out.println("The weapon " + name + " has been destroyed! All of its power has been diminished!");
        offense = 0;
        defense = 0;
        minMana = 0;
        maxMana = 0;
        System.out.println("Weapon " + toString());
    }

    //getters

    public String getName() {
        return name;
    }

    public int getOffense() {
        return offense;
    }

    public int getDefense() {
        return defense;
    }

    public int getMinMana() {
        return minMana;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public static int getCount()
    {
        return count;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setOffense(int offense) {
        this.offense = offense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setMinMana(int minMana) {
        this.minMana = minMana;
    }

    public void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
    }

    //toString

    @Override
    public String toString() {
        return "Name: " + name +
                "\nOffense: " + offense +
                "\nDefense: " + defense +
                "\nMinimum Mana Required: " + minMana +
                "\nMaximum Mana: " + maxMana;
    }
}
