public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to false */
    if (IO.staticReturnsFalse()) {
        IO.writeLine("never prints");
    }
}
}