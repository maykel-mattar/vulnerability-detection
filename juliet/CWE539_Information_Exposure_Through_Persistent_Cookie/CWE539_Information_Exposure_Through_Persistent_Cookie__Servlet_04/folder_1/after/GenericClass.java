public class GenericClass {
public void genericMethod () throws Throwable{
    if (PRIVATE_STATIC_FINAL_TRUE) {
        Cookie cookie = new Cookie("SecretMessage", "test");
        /* FIX: Set the max age to a negative value, so that it will only persist until the browser is shutdown */
        cookie.setMaxAge(-1);
    }
}
}