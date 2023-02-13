public class GenericClass {
public void genericMethod (){
    /* FIX: may evaluate to true or false */
    if (IO.staticReturnsTrueOrFalse() == PRIVATE_STATIC_FINAL_TRUE) {
        IO.writeLine("sometimes prints");
    }
}
}