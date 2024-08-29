public class Main {
    public static void main(String[] args)
    {
        Weapon horn = new Weapon("Meep", 45, 35, 30, 100);
        Staff flow = new Staff("Staff of Flowing Water", 85, 30, 200, 400, "League", "Water");
        Bard bard = new Bard("Bard", 1000, 10, horn, 100);
        Bard poo = new Bard("Poo", 1000, 10, horn, 100);

        System.out.println(bard.toString());
        flow.destroy();
    }
}