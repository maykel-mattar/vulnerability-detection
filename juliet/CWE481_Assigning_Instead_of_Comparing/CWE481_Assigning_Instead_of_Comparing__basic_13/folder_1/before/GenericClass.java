public class GenericClass {
public void genericMethod () throws Throwable{
    if (IO.STATIC_FINAL_FIVE == 5) {
        int zeroOrOne = (new SecureRandom()).nextInt(2);
        boolean isZero = (zeroOrOne == 0);
        if (isZero = true) /* FLAW: should be == and INCIDENTIAL CWE 571 Expression Is Always True */
        {
            IO.writeLine("zeroOrOne is 0");
        }
        IO.writeLine("isZero is: " + isZero);
    }
}
}