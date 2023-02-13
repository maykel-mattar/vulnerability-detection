public class GenericClass {
public void genericMethod (){
    /* FIX: may evaluate to true or false */
    if ((new SecureRandom()).nextInt() == IO.STATIC_FINAL_FIVE) {
        IO.writeLine("sometimes prints");
    }
}
}