package patterns.creational.abstractFactory;

public class AmexPlatinumValidator implements Validator {
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
