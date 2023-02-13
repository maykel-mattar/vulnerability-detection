public class GenericClass {
public void genericMethod () throws Throwable{
    if (PRIVATE_STATIC_FINAL_TRUE) {
        Logger logger = Logger.getLogger("cwe_testcases_logger");
        if (request.getParameter("username") == null) {
            return;
        }
        String username = request.getParameter("username");
        if (username.matches("[a-zA-Z0-9]*")) {
            HttpSession session = request.getSession(true);
            /* FLAW: Expose the session ID to debug log */
            logger.log(Level.FINEST, "Username: " + username + " Session ID:" + session.getId());
        } else {
            response.getWriter().println("Invalid characters");
        }
    }
}
}