public class GenericClass {
public void genericMethod () throws Throwable{
    if (IO.staticTrue) {
        String libraryName = "test.dll";
        /* FLAW: Attempt to load a library with System.loadLibrary() without
             * the full path to the library. */
        System.loadLibrary(libraryName);
    }
}
}