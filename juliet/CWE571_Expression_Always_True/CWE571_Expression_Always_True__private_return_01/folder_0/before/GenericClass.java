public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to true */
    if (privateReturnsTrue()) {
        IO.writeLine("always prints");
    }
}
}