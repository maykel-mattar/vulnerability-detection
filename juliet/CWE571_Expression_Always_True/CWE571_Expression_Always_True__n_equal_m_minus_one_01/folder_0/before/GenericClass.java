public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to true */
    int intThirty = 30;
    int intThirtyOne = 31;
    if (intThirty == (intThirtyOne - 1)) {
        IO.writeLine("always prints");
    }
}
}