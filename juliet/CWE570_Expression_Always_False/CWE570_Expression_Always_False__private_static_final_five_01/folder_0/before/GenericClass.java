public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to false */
    if (PRIVATE_STATIC_FINAL_FIVE != 5) {
        IO.writeLine("never prints");
    }
}
}