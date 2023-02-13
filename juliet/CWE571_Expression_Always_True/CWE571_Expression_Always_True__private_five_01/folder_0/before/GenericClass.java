public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to true */
    if (privateFive == 5) {
        IO.writeLine("always prints");
    }
}
}