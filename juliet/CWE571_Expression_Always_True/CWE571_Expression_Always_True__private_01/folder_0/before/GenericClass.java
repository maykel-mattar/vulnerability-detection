public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to true */
    if (privateTrue) {
        IO.writeLine("always prints");
    }
}
}