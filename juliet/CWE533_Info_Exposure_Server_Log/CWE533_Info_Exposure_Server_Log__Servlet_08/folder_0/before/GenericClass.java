public class GenericClass {
public void genericMethod () throws Throwable{
    if (privateReturnsTrue()) {
        if (request.getParameter("username") == null) {
            return;
        }
        String username = request.getParameter("username");
        if (username.matches("[a-zA-Z0-9]*")) {
            HttpSession session = request.getSession(true);
            /* FLAW: Expose the session ID to server log */
            log("Username: " + username + " Session ID:" + session.getId());
        } else {
            response.getWriter().println("Invalid characters");
        }
    }
}
}