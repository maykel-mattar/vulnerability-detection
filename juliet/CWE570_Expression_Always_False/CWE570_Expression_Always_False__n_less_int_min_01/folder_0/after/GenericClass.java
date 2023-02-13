public class GenericClass {
public void genericMethod (){
    int intSecureRandom = (new SecureRandom()).nextInt();
    /* FIX: may evaluate to true or false */
    if (intSecureRandom < 5000) {
        IO.writeLine("sometimes prints");
    }
}
}