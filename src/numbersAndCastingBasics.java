public class numbersAndCastingBasics {

    public static void main(String[] args) {

        // Int limits
        int intMin = Integer.MIN_VALUE;
        int intMax = Integer.MAX_VALUE;
        System.out.println("Int Min: " + intMin); // if you minus 1, it will under-flow to min.
        System.out.println("Int Max: " + intMax); // if you add 1, it will overflow to max.

        // byte has +/- 128, 8 bits. Short has +/- 32,768, 16 bits. Int is 32 bits. Long is 64, and +- 9 quadrillion.
        // full list of 8 primitives in Java: byte, short, int, long, float, double, char, boolean

        // Casting
        byte thisByte = 124;
        byte newByteValue = (byte) (thisByte / 2); // error if byte not cast cuz Java assumes all numbers operated on are int.

        // Floats/Doubles
        float thisFloat = (float) 12.345; // Java assumes all decimals are doubles, so just use doubles to avoid having to do this.
        float justPutF = 12.345f; // or you can just put an f as well
        double thisDouble = 12.345;
        int remainderNotHandled = 5 / 2;
        System.out.println("remainderNotHandled equals " + remainderNotHandled + " instead of 2.5 because int cannot have decimals");

        // String + Num
        String aNumWillBeAdded = "gonna append int to this: ";
        String numAppended = aNumWillBeAdded + 10;
        System.out.println(numAppended); // Java will auto convert number types to string if added to string.
    }
}
