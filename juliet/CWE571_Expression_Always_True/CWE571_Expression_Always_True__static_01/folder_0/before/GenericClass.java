public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to true */
    if (IO.staticTrue) {
        IO.writeLine("always prints");
    }
}
}