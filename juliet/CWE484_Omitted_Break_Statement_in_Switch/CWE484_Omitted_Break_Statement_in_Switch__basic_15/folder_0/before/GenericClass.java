public class GenericClass {
public void genericMethod () throws Throwable{
    switch(7) {
        case 7:
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
            break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
            break;
    }
}
}