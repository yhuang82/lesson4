package exceptionExample;

public class Phone {
    private final String phoneType;
    private final String phoneNumber;
    public Phone(String phoneType, String phoneNumber){
        super();
        this.phoneType = phoneType;
        this.phoneNumber = phoneNumber;

        if (phoneType == null || phoneNumber == null){
            throw new IllegalArgumentException("The type and number cannot be null");
        }
    }
    public String getPhoneType() {
        return phoneType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return phoneType + "" + phoneNumber;
    }
}
