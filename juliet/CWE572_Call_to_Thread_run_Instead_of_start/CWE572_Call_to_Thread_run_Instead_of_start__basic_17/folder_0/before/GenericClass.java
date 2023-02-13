public class GenericClass {
public void genericMethod () throws Throwable{
    for (int j = 0; j < 1; j++) {
        IO.writeLine("bad() Main thread name is: " + Thread.currentThread().getName());
        Thread threadOne = new Thread() {

            public void run() {
                IO.writeLine("bad() In thread: " + Thread.currentThread().getName());
            }
        };
        threadOne.run();
        /* FLAW: Called Thread.run() instead of Thread.start() */
    }
}
}