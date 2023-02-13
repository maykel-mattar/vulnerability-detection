public class GenericClass {
public void genericMethod (){
    String stringTrue = "true";
    /* FLAW: always evaluates to true */
    if (stringTrue.equals("true")) {
        IO.writeLine("always prints");
    }
}
}