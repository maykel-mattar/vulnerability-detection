public class GenericClass {
public void genericMethod (){
    Object[] objectArray = new Object[] { new Random(), new SecureRandom(), new SecureRandom() };
    int intSecureRandom = (new SecureRandom()).nextInt(3);
    /* FIX: may evaluate to true or false */
    if (objectArray[1].getClass().equals(objectArray[intSecureRandom].getClass())) {
        IO.writeLine("sometimes prints");
    }
}
}