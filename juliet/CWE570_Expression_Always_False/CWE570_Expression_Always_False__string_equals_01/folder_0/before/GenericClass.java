public class GenericClass {
public void genericMethod (){
    String stringFalse = "false";
    /* FLAW: always evaluates to false */
    if (stringFalse.equals("true")) {
        IO.writeLine("never prints");
    }
}
}