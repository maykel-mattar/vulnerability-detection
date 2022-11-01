public class GenericClass {
public void genericMethod () throws Throwable{
    if (IO.staticReturnsTrue()) {
        Cookie cookie = new Cookie("SecretMessage", "test");
        /* FLAW: Make the cookie persistent, by setting the expiration to 5 years */
        cookie.setMaxAge(60 * 60 * 24 * 365 * 5);
    }
}
}