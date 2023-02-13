public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to false */
    if (IO.staticFive != 5) {
        IO.writeLine("never prints");
    }
}
}