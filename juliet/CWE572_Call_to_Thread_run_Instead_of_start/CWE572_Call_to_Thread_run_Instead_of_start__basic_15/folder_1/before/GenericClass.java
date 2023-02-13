public class GenericClass {
public void genericMethod () throws Throwable{
    switch(7) {
        case 7:
            IO.writeLine("bad() Main thread name is: " + Thread.currentThread().getName());
            Thread threadOne = new Thread() {

                public void run() {
                    IO.writeLine("bad() In thread: " + Thread.currentThread().getName());
                }
            };
            threadOne.run();
            /* FLAW: Called Thread.run() instead of Thread.start() */
            break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
            break;
    }
}
}