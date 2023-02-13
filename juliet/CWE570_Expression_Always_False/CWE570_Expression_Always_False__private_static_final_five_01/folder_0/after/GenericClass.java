public class GenericClass {
public void genericMethod (){
    /* FIX: may evaluate to true or false */
    if ((new SecureRandom()).nextInt() != PRIVATE_STATIC_FINAL_FIVE) {
        IO.writeLine("sometimes prints");
    }
}
}