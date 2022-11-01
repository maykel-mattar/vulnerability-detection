public class GenericClass {
public void genericMethod () throws Throwable{
    for (int k = 0; k < 1; k++) {
        if (request.getParameter("username") == null) {
            return;
        }
        String username = request.getParameter("username");
        OutputStreamWriter writerOutputStream = null;
        PrintWriter writerPrint = null;
        if (username.matches("[a-zA-Z0-9]*")) {
            writerOutputStream = new OutputStreamWriter(System.err, "UTF-8");
            writerPrint = new PrintWriter(writerOutputStream);
            /* FIX: message to stderr does not contain session id */
            writerPrint.println("Username: " + username + " logged in");
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