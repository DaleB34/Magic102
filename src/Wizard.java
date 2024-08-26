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

    //brain methods
    @Override
    public void attack(Character target)
    {
        System.out.println(name + " has attacked " + target.getName() + " with the " + castSpell());
    }

    public String castSpell()
    {
        //start of the message
        String output = staff.getName() + "! They have used the " + house;

        //addons to the message
        if(staff.getElement().equals("Air"))
        {
            output+= " wind ball special thingy spell!";
        }
        else if (staff.getElement().equals("Fire"))
        {
            output+= " fireball of death spell!";
        }
        else if (staff.getElement().equals("Earth"))
        {
            output+= " Ancient Power Spell!";
        }
        else if(staff.getElement().equals("Water"))
        {
            output+= " tsunami spell!";
        }
        else
        {
            output+= " Avada Kadavra!";
        }

        return output;
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
