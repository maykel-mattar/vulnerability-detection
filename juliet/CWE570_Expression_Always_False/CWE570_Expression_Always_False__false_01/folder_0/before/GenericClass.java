public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to false */
    if (false) {
        IO.writeLine("never prints");
    }
}
}