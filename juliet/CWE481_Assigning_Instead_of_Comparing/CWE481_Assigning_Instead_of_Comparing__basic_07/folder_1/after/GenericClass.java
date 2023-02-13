public class GenericClass {
public void genericMethod () throws Throwable{
    if (privateFive == 5) {
        int zeroOrOne = (new SecureRandom()).nextInt(2);
        /* i will be 0 or 1 */
        boolean isZero = (zeroOrOne == 0);
        if (isZero == true) /* FIX: using == instead of = */
        {
            IO.writeLine("zeroOrOne is 0");
        }
        IO.writeLine("isZero is: " + isZero);
    }
}
}