public class GenericClass {
public void genericMethod (){
    /* FIX: may evaluate to true or false */
    if (IO.staticReturnsTrueOrFalse() == privateTrue) {
        IO.writeLine("sometimes prints");
    }
}
}