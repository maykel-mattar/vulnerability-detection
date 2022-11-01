public class GenericClass {
public void genericMethod () throws Throwable{
    if (IO.staticFive == 5) {
        if (request.getParameter("username") == null) {
            return;
        }
        String username = request.getParameter("username");
        OutputStreamWriter writerOutputStream = null;
        PrintWriter writerPrint = null;
        if (username.matches("[a-zA-Z0-9]*")) {
            HttpSession session = request.getSession(true);
            writerOutputStream = new OutputStreamWriter(System.err, "UTF-8");
            writerPrint = new PrintWriter(writerOutputStream);
            /* FLAW: Expose the session ID to stderr */
            writerPrint.println("Username: " + username + " Session ID:" + session.getId());
        } else {
            response.getWriter().println("Invalid characters");
        }
        try {
            if (writerOutputStream != null) {
                writerOutputStream.close();
            }
        } catch (IOException exceptIO) {
            IO.logger.log(Level.WARNING, "Error closing OutputStreamWriter", exceptIO);
        }
    }
}
}