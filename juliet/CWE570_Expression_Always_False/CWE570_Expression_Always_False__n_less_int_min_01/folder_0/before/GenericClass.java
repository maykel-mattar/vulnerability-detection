public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to false */
    int intSecureRandom = (new SecureRandom()).nextInt();
    if (intSecureRandom < Integer.MIN_VALUE) {
        IO.writeLine("never prints");
    }
}
}