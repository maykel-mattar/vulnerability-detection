public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to false */
    if (privateReturnsFalse()) {
        IO.writeLine("never prints");
    }
}
}