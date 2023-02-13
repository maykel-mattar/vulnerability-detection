public class GenericClass {
public void genericMethod (){
    /* FIX: may evaluate to true or false */
    int intSecureRandom = (new SecureRandom()).nextInt();
    if (intSecureRandom < 5000) {
        IO.writeLine("sometimes prints");
    }
}
}