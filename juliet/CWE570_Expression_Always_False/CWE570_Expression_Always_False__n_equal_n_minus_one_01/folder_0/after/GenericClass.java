public class GenericClass {
public void genericMethod (){
    int intSecureRandom1 = (new SecureRandom()).nextInt();
    int intSecureRandom2 = (new SecureRandom()).nextInt();
    /* FIX: may evaluate to true or false */
    if (intSecureRandom1 != intSecureRandom2) {
        IO.writeLine("sometimes prints");
    }
}
}