public class GenericClass {
public void genericMethod () throws Throwable{
    if (IO.staticReturnsTrueOrFalse()) {
        Cookie cookie = new Cookie("SecretMessage", "test");
        /* FLAW: Make the cookie persistent, by setting the expiration to 5 years */
        cookie.setMaxAge(60 * 60 * 24 * 365 * 5);
    } else {
        Cookie cookie = new Cookie("SecretMessage", "test");
        /* FIX: Set the max age to a negative value, so that it will only persist until the browser is shutdown */
        cookie.setMaxAge(-1);
    }
}
}