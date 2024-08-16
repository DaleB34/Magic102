public class Bard extends Character
{
     String instrument;
     int mana;

    public Bard(String name, int money, int attack, String instrument, int mana) {
        super(name, money, attack);
        this.instrument = instrument;
        this.mana = mana;
    }

    //getters
    public String getInstrument() {
        return instrument;
    }

    public int getMana() {
        return mana;
    }

    //setters
    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        String output = super.toString() +
                "\nInstrument: " + instrument +
                "\nMana: " + mana;
        return output;
    }

}
