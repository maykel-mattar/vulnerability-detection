public class GenericClass {
public void genericMethod (){
    /* FIX: may evaluate to true or false */
    if ((new SecureRandom()).nextInt() != IO.staticFive) {
        IO.writeLine("sometimes prints");
    }
}
}