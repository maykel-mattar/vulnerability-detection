public class GenericClass {
public void genericMethod (){
    /* FIX: may evaluate to true or false */
    if ((new SecureRandom()).nextInt() == privateFive) {
        IO.writeLine("sometimes prints");
    }
}
}