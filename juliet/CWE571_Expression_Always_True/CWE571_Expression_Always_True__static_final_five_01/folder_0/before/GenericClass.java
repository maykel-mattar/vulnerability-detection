public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to true */
    if (IO.STATIC_FINAL_FIVE == 5) {
        IO.writeLine("always prints");
    }
}
}