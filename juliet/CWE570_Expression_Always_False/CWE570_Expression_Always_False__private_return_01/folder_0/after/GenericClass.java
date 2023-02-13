public class GenericClass {
public void genericMethod (){
    /* FIX: may evaluate to true or false */
    if (IO.staticReturnsTrueOrFalse() == privateReturnsFalse()) {
        IO.writeLine("sometimes prints");
    }
}
}