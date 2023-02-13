public class GenericClass {
public void genericMethod () throws Throwable{
    if (PRIVATE_STATIC_FINAL_FIVE == 5) {
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