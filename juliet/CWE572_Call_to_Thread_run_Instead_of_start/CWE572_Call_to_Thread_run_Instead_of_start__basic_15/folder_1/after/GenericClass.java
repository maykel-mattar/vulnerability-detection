public class GenericClass {
public void genericMethod () throws Throwable{
    switch(7) {
        case 7:
            IO.writeLine("good() Main thread name is: " + Thread.currentThread().getName());
            Thread threadTwo = new Thread() {

                public void run() {
                    IO.writeLine("good() In thread: " + Thread.currentThread().getName());
                }
            };
            threadTwo.start();
            /* FIX: Correctly called Thread.start() */
            break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
            break;
    }
}
}