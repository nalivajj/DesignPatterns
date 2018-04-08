package patterns.creational.abstractFactory;

public class VisaValidator implements Validator {
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
