public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to false */
    if (IO.STATIC_FINAL_FIVE != 5) {
        IO.writeLine("never prints");
    }
}
}