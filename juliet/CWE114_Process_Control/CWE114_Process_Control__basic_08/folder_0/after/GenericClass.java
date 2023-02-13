public class GenericClass {
public void genericMethod () throws Throwable{
    if (privateReturnsFalse()) {
        /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
        IO.writeLine("Benign, fixed string");
    } else {
        String root;
        String libraryName = "test.dll";
        if (System.getProperty("os.name").toLowerCase().indexOf("win") >= 0) {
            /* running on Windows */
            root = "C:\\libs\\";
        } else {
            /* running on non-Windows */
            root = "/home/user/libs/";
        }
        /* FIX: Use System.load() which allows you to specify a full path to the library */
        System.load(root + libraryName);
    }
}
}