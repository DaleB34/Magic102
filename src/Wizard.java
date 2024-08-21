public class Wizard extends Character
{
    //instance variables
    Staff staff;
    String house;
    int mana;

    //constructor


    public Wizard(String name, int money, int attack, Staff staff, String house, int mana) {
        super(name, money, attack);
        this.staff = staff;
        this.house = house;
        this.mana = mana;
    }

    //getters
    public String getStaff() {
        return staff.toString();
    }

    public String getHouse() {
        return house;
    }

    public int getMana() {
        return mana;
    }

    //setters
    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    //toString
    @Override
    public String toString() {
        String output = super.toString() +
                "\nStaff: " + staff +
                "\nHouse: " + house +
                "\nmana " + mana;
        return output;
    }
}
