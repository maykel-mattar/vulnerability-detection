public class GenericClass {
public void genericMethod () throws Throwable{
    if (PRIVATE_STATIC_FINAL_TRUE) {
        int zeroOrOne = (new SecureRandom()).nextInt(2);
        boolean isZero = false;
        if ((isZero = (zeroOrOne == 0)) == true) /* FIX: correct assignment */
        {
            IO.writeLine("zeroOrOne is 0");
        }
        IO.writeLine("isZero is: " + isZero);
    }
}
}