public class GenericClass {
public void genericMethod () throws Throwable{
    if (privateReturnsTrue()) {
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            /* FIX: ensure the connection is secure (https) */
            writer.println("<form action='https://hostname.com/j_security_check' method='post'>");
            writer.println("<table>");
            writer.println("<tr><td>Name:</td>");
            writer.println("<td><input type='text' name='j_username'></td></tr>");
            writer.println("<tr><td>Password:</td>");
            writer.println("<td><input type='password' name='j_password' size='8'></td>");
            writer.println("</tr>");
            writer.println("</table><br />");
            writer.println("<input type='submit' value='login'>");
            writer.println("</form>");
        } catch (IOException exceptIO) {
            IO.logger.log(Level.WARNING, "There was a problem writing", exceptIO);
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
}