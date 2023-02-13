public class GenericClass {
public void genericMethod () throws Throwable{
    switch(8) {
        case 7:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
            break;
        default:
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
            break;
    }
}
}