public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to false */
    if (IO.STATIC_FINAL_FALSE) {
        IO.writeLine("never prints");
    }
}
}