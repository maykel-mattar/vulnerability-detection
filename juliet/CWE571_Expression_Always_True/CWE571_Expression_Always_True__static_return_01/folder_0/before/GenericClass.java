public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to true */
    if (IO.staticReturnsTrue()) {
        IO.writeLine("always prints");
    }
}
}