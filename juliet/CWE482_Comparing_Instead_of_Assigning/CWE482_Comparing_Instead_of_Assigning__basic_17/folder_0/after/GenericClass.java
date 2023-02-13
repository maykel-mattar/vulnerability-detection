public class GenericClass {
public void genericMethod () throws Throwable{
    for (int k = 0; k < 1; k++) {
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