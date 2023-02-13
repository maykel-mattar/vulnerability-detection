public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to false */
    if (privateFive != 5) {
        IO.writeLine("never prints");
    }
}
}