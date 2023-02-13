public class GenericClass {
public void genericMethod () throws Throwable{
    if (IO.STATIC_FINAL_FIVE == 5) {
        Cookie cookie = new Cookie("SecretMessage", "test");
        /* FLAW: Make the cookie persistent, by setting the expiration to 5 years */
        cookie.setMaxAge(60 * 60 * 24 * 365 * 5);
    }
}
}