public class GenericClass {
public void genericMethod () throws Throwable{
    switch(8) {
        case 7:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
            break;
        default:
            IO.writeLine("good() Main thread name is: " + Thread.currentThread().getName());
            Thread threadTwo = new Thread() {

                public void run() {
                    IO.writeLine("good() In thread: " + Thread.currentThread().getName());
                }
            };
            threadTwo.start();
            /* FIX: Correctly called Thread.start() */
            break;
    }
}
}