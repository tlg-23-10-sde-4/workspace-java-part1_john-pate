package gov.test;

class WrappersTest {

    public static void main(String[] args) {
        String ageInput = "56";
        int age = Integer.parseInt(ageInput);
        Integer ageInteger = Integer.valueOf(ageInput);     //object wrapper

        String brainCellsInput = "86000000000";
        long brainCells = Long.parseLong(brainCellsInput);
        long brainCellsLong = Long.valueOf(brainCellsInput);

        String shoesSizeInput = "9.5";
        double shoeSize = Double.parseDouble(shoesSizeInput);
        Double shoesSizeDouble = Double.valueOf(shoesSizeInput);

        String sunnyInput = "true";
        boolean sunny = Boolean.parseBoolean(sunnyInput);
        Boolean sunnyBoolean = Boolean.valueOf(sunnyInput);

        Integer size = Integer.valueOf(9);
    }
}