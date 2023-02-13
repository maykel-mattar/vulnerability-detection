public class GenericClass {
public void genericMethod () throws Throwable{
    while (true) {
        int zeroOrOne = (new SecureRandom()).nextInt(2);
        boolean isZero = false;
        if ((isZero == (zeroOrOne == 0)) == true) /* FLAW: should be (isZero = (zeroOrOne == 0)) */
        {
            IO.writeLine("zeroOrOne is 0");
        }
        IO.writeLine("isZero is: " + isZero);
        break;
    }
}
}