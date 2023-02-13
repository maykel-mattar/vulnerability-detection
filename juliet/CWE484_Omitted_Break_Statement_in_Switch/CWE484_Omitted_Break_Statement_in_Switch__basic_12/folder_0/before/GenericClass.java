public class GenericClass {
public void genericMethod () throws Throwable{
    if (IO.staticReturnsTrueOrFalse()) {
        int intRandom = (new SecureRandom()).nextInt(3);
        String stringValue;
        switch(intRandom) {
            case 1:
                stringValue = "one";
                break;
            case 2:
                stringValue = "two";
            /* INCIDENTAL: CWE563 Unused Variable (actually unused value) since s gets overwritten in the default case */
            /* FLAW: Case 2 is missing a break statement */
            default:
                stringValue = "Default";
                break;
        }
        IO.writeLine(stringValue);
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