public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to true */
    if (true) {
        IO.writeLine("always prints");
    }
}
}