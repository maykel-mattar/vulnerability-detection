public class GenericClass {
public void genericMethod (){
    /* FIX: may evaluate to true or false */
    int intSecureRandom1 = (new SecureRandom()).nextInt();
    int intSecureRandom2 = (new SecureRandom()).nextInt();
    if (intSecureRandom1 != intSecureRandom2) {
        IO.writeLine("sometimes prints");
    }
}
}