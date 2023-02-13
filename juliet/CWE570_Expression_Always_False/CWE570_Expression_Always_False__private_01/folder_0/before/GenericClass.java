public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to false */
    if (privateFalse) {
        IO.writeLine("never prints");
    }
}
}