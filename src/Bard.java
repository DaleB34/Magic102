public class Bard extends Character
{
     String instrument;
     int mana;

    public Bard(String name, int money, int attack, String instrument, int mana) {
        super(name, money, attack);
        this.instrument = instrument;
        this.mana = mana;
    }

    public java.lang.String getInstrument() {
        return instrument;
    }

    public void setInstrument(java.lang.String instrument) {
        this.instrument = instrument;
    }


    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        String output = "instrument " + instrument +
                "\nmana " + mana;
        return output;
    }

}
