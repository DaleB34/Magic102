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
                "\nElement " + element;
        return output;
    }
}
