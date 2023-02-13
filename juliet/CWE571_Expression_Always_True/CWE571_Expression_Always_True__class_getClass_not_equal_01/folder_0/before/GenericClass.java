public class GenericClass {
public void genericMethod (){
    /* FLAW: always evaluates to true */
    Random random = new Random();
    SecureRandom secureRandom = new SecureRandom();
    if (!random.getClass().equals(secureRandom.getClass())) {
        IO.writeLine("always prints");
    }
}
}