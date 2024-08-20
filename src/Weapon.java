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
