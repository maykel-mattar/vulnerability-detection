public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to true */
    if (IO.STATIC_FINAL_TRUE) {
        IO.writeLine("always prints");
    }
}
}