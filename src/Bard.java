public class Bard
{
     String instrument;
     int money;
     int mana;

    public Bard(java.lang.String instrument, int money, int mana) {
        this.instrument = instrument;
        this.money = money;
        this.mana = mana;
    }

    public java.lang.String getInstrument() {
        return instrument;
    }

    public void setInstrument(java.lang.String instrument) {
        this.instrument = instrument;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
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
                "\nmoney " + money +
                "\nmana " + mana;
        return output;
    }

}
