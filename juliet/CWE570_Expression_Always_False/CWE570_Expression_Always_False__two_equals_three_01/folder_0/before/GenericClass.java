public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to false */
    if (2 == 3) {
        IO.writeLine("never prints");
    }
}
}