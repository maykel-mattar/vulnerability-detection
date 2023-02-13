public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to true */
    if (2 == 2) {
        IO.writeLine("always prints");
    }
}
}