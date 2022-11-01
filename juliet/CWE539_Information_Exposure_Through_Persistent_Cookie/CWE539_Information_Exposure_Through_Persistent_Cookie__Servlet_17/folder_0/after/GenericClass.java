public class GenericClass {
public void genericMethod () throws Throwable{
    for (int k = 0; k < 1; k++) {
        Cookie cookie = new Cookie("SecretMessage", "test");
        /* FIX: Set the max age to a negative value, so that it will only persist until the browser is shutdown */
        cookie.setMaxAge(-1);
    }
}
}