public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to false */
    if (PRIVATE_STATIC_FINAL_FALSE) {
        IO.writeLine("never prints");
    }
}
}