package man.boogey.client;

import man.boogey.BoogeymanFinder;
import man.boogey.MonsterBehavior;

class BoogeymanFinderClient {

    public static void main(String[] args) {
        BoogeymanFinder b1 = new BoogeymanFinder();
        b1.setHeight(8);
        b1.setAppearance("an imposing figure carrying a sack");
        b1.setName("The Sack Man");
        b1.setBehavior(MonsterBehavior.CHASE);
        b1.setTarget("disobedient children");

        b1.terrorize();
        b1.description();
        System.out.println(b1);
        //b1.details();
        System.out.println(BoogeymanFinder.getMonsterCount() + " instances.");
        System.out.println();

        BoogeymanFinder b2 = new BoogeymanFinder(10, "giant chicken", "el Pollo Maligno");

        b2.terrorize();
        b2.description();
        System.out.println(b2);
        System.out.println(BoogeymanFinder.getMonsterCount() + " instances.");
        System.out.println();

        BoogeymanFinder b3 = new BoogeymanFinder(12, "eldrazi horror", "Brisela", MonsterBehavior.HAUNT, "villagers");
        b3.terrorize();
        b3.description();
        System.out.println(b3);
        System.out.println(BoogeymanFinder.getMonsterCount() + " instances.");

    }
}