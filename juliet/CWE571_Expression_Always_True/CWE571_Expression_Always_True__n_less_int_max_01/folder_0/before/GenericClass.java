public class GenericClass {
public void genericMethod (){
    int intSecureRandom = (new SecureRandom()).nextInt();
    /* FLAW: always evaluates to true */
    if (intSecureRandom < Integer.MAX_VALUE) {
        IO.writeLine("always prints");
    }
}
}