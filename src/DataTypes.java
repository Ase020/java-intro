public class DataTypes {
    public static  void main(String[] args){
//        integer types
        byte aSingleByte = 100; // -128 to 127
        short aSmallNumber = 20000; // -32,768 to 32,767
        int anInteger = 2147483647; // -2147483648 to 2147483647
        long aLargeNumber = 9223372036854775807L;

//        decimal types
        double aDouble = 1.79769313;
        float aFloat = 3.4028F;

//        booleans
        boolean isWeekend = false;
        boolean isWeekday = true;

//        characters
        char copyrightSymbol = '\u00A9';
        String name = "Felix Olali";

        int number2 = (int)aDouble;
        double number3 = anInteger;

        System.out.println(number3);

    }
}
