public class GenericClass {
public void genericMethod () throws Throwable{
    switch(8) {
        case 7:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
            break;
        default:
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
            break;
    }
}
}