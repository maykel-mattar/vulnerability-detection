public class GenericClass {
public void genericMethod () throws Throwable{
    if (IO.staticFive != 5) {
        /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
        IO.writeLine("Benign, fixed string");
    } else {
        int intRandom = (new SecureRandom()).nextInt(3);
        String stringValue;
        switch(intRandom) {
            case 1:
                stringValue = "one";
                break;
            case 2:
                stringValue = "two";
                break;
            /* FIX: Case 2 has a break statement */
            default:
                stringValue = "Default";
                break;
        }
        IO.writeLine(stringValue);
    }
}
}