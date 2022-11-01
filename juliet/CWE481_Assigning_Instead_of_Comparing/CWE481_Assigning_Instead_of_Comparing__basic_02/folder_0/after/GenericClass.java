public class GenericClass {
public void genericMethod () throws Throwable{
    if (false) {
        /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
        IO.writeLine("Benign, fixed string");
    } else {
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