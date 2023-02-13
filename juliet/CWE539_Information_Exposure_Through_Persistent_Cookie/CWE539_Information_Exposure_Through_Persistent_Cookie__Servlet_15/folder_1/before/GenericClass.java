public class GenericClass {
public void genericMethod () throws Throwable{
    switch(7) {
        case 7:
            Cookie cookie = new Cookie("SecretMessage", "test");
            /* FLAW: Make the cookie persistent, by setting the expiration to 5 years */
            cookie.setMaxAge(60 * 60 * 24 * 365 * 5);
            break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
            break;
    }
}
}