public class GenericClass {
public void genericMethod (){
    String stringInput = "";
    IO.writeLine("Enter a string: ");
    boolean isError = false;
    BufferedReader readerBuffered = null;
    InputStreamReader readerInputStream = null;
    try {
        readerInputStream = new InputStreamReader(System.in, "UTF-8");
        readerBuffered = new BufferedReader(readerInputStream);
        stringInput = readerBuffered.readLine();
    } catch (IOException exceptIO) {
        IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
    } finally {
        try {
            if (readerBuffered != null) {
                readerBuffered.close();
            }
        } catch (IOException exceptIO) {
            IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
            isError = true;
        }
        try {
            if (readerInputStream != null) {
                readerInputStream.close();
            }
        } catch (IOException exceptIO) {
            IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
            isError = true;
        }
    }
    if (isError) {
        return;
    }
    /* FIX: may evaluate to true or false */
    if (stringInput.contentEquals("true")) {
        IO.writeLine("sometimes prints");
    }
}
}