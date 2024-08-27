public class Weapon
{
    //instance variables
    String name;
    int offense;
    int defense;
    int minMana;
    int maxMana;

    //constructor

    public Weapon(String name, int offense, int defense, int minMana, int maxMana) {
        this.name = name;
        this.offense = offense;
        this.defense = defense;
        this.minMana = minMana;
        this.maxMana = maxMana;
    }

    //brain methods
    public String whack(Character target)
    {
        String output = "whacked " + target + " on the head for ";

        if(defense > offense)
        {
            output+= offense/15 + " damage!";
        }
        else
            output+= offense/7.5 + " damage!";

        return output;
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
