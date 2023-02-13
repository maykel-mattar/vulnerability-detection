public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to true */
    if (PRIVATE_STATIC_FINAL_TRUE) {
        IO.writeLine("always prints");
    }
}
}