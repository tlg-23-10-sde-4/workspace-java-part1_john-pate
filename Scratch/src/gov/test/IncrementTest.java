package gov.test;

class IncrementTest {

    public static void main(String[] args) {
        int i = 3;
        System.out.println(i);

        System.out.println(++i);
        System.out.println();

        int x = 18;
        int y = x;

        x++;
        System.out.println(y); //y is still 18 despite y being set to x, it is not dynamic
    }
}