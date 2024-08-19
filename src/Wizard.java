public class Wizard extends Character
{
    //instance variables
    String staffName;
    String house;
    int mana;

    //constructor


    public Wizard(String name, int money, int attack, String staffName, String house, int mana) {
        super(name, money, attack);
        this.staffName = staffName;
        this.house = house;
        this.mana = mana;
    }

    //getters
    public String getStaffName() {
        return staffName;
    }

    public String getHouse() {
        return house;
    }

    public int getMana() {
        return mana;
    }

    //setters
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
