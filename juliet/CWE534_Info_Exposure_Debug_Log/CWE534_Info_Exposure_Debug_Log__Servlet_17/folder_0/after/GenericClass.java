public class GenericClass {
public void genericMethod () throws Throwable{
    for (int k = 0; k < 1; k++) {
        Logger logger = Logger.getLogger("cwe_testcases_logger");
        if (request.getParameter("username") == null) {
            return;
        }
        String username = request.getParameter("username");
        if (username.matches("[a-zA-Z0-9]*")) {
            /* FIX: logged message does not contain session id */
            logger.log(Level.FINEST, "Username: " + username);
        } else {
            response.getWriter().println("Invalid characters");
        }
    }
}
}