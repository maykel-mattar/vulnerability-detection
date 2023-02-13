public class GenericClass {
public void genericMethod () throws Throwable{
    if (IO.staticReturnsTrueOrFalse()) {
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