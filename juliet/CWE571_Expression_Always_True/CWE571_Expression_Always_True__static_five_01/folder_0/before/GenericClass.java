public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to true */
    if (IO.staticFive == 5) {
        IO.writeLine("always prints");
    }
}
}