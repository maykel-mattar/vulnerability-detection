public class GenericClass {
public void genericMethod () throws Throwable{
    for (int j = 0; j < 1; j++) {
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