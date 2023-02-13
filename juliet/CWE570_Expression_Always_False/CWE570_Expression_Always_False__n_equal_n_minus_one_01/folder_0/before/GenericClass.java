public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to false */
    int intThirty = 30;
    if (intThirty == (intThirty - 1)) {
        IO.writeLine("never prints");
    }
}
}