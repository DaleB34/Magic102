public class Staff extends Weapon
{

    //instance variables
    String brand;
    String element;

    //constructor

    public Staff(String name, int offense, int defense, int minMana, int maxMana, String brand, String element) {
        super(name, offense, defense, minMana, maxMana);
        this.brand = brand;
        this.element = element;
    }

    //default constructor
    public Staff()
    {
        name = "";
        offense = 0;
        defense = 0;
        minMana = 0;
        maxMana = 0;
        brand = "";
        element = "";
    }

    //brain methods
    @Override
    public void destroy()
    {
        System.out.println("The weapon " + name + " has been destroyed! All of its power has been diminished!");
        offense = 0;
        defense = 0;
        minMana = 0;
        maxMana = 0;
        element = "None";
        System.out.println("Weapon " + toString());
    }

    //getters

    public String getBrand() {
        return brand;
    }

    public String getElement() {
        return element;
    }

    //setters

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setElement(String element) {
        this.element = element;
    }

    //toString
    @Override
    public String toString() {
        String output = super.toString() +
                "\nBrand: " + brand +
                "\nElement: " + element;
        return output;
    }
}
