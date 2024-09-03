public class Main {
    public static void main(String[] args)
    {
        //weapons
        Weapon horn = new Weapon("Meep", 45, 35, 30, 100);
        Staff flow = new Staff("Staff of Flowing Water", 50, 0, 200, 400, "League", "Water");
        Weapon bfs = new Weapon("B.F. Sword", 40, 0, 0, 0);
        Staff voidS = new Staff("Void Staff", 65, 0, 200, 400, "League", "Void");

        //characters
        Knight laios = new Knight("Laios", 100, 68, bfs, 225, false);
        Knight garen = new Knight("Garen", 1337, 145, bfs, 405, true);
        Bard bard = new Bard("Bard", 1000, 54, horn, 429); //bard is a character in league of legends
        Bard milio = new Bard("Not Milio", 10000, 43, horn, 1734);
        Wizard ryze = new Wizard("Ryze", 900, 45, flow, "League of Legends", 3000);
        Wizard velkoz = new Wizard("Vel'Koz", 314, 31, voidS, "Hufflepuff", 314);

        //Singly Linked List
        LinkedList list = new LinkedList();

        LinkedList.insert(list, laios);
        LinkedList.insert(list, garen);
        LinkedList.insert(list,bard);
        LinkedList.insert(list, milio);
        LinkedList.insert(list, ryze);
        LinkedList.insert(list, velkoz);

        LinkedList.printList(list);

        //Calling brain methods
        laios.attack(garen);

        System.out.println();

        laios.die("barked too loudly");

        System.out.println();

        bard.sing("Renai Circulation", ryze);

        System.out.println();

        milio.gankMid(500, bard);
        bard.gankMid(1000, milio);

        System.out.println();

        garen.spin(ryze);

        System.out.println();

        garen.flashR(velkoz);

        System.out.println();

        laios.crashout(garen, bfs);
        bfs.destroy();

        System.out.println();

        ryze.attack(garen);
        velkoz.attack(milio);

        System.out.println();

        velkoz.turnEvil();
        ryze.turnEvil();

    }
}