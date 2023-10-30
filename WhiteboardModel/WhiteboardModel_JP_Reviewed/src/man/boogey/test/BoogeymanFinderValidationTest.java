package man.boogey.test;

import man.boogey.BoogeymanFinder;

/**
 * JR: perfect.
 */
class BoogeymanFinderValidationTest {

    public static void main(String[] args) {
        BoogeymanFinder bm = new BoogeymanFinder();
        bm.setHeight(1);
        System.out.println(bm);

        bm.setHeight(100);
        System.out.println(bm);

        bm.setHeight(0);
        System.out.println(bm);
        bm.setHeight(101);
        System.out.println(bm);
    }
}