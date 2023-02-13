public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to false */
    if (IO.staticFalse) {
        IO.writeLine("never prints");
    }
}
}