public class GenericClass {
public void genericMethod () throws Throwable{
    if (privateFive == 5) {
        if (request.getParameter("username") == null) {
            return;
        }
        String username = request.getParameter("username");
        if (username.matches("[a-zA-Z0-9]*")) {
            /* FIX: logged message does not contain session id */
            log("Username: " + username + " logged in");
        } else {
            response.getWriter().println("Invalid characters");
        }
    }
}
}