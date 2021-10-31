package stringbasic;

public class Person {

    private String name;
    private String email;
    private String tajNumber;
    private String bankAccount;
    private String PhoneNumber;

    public Person(String name, String email, String tajNumber, String bankAccount, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.tajNumber = tajNumber;
        this.bankAccount = bankAccount;
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "name: " + name +" \t| email: " + email + "\t|TAJ: " + tajNumber + "\t| BankAccount: " + bankAccount + "\t| Phone: " + PhoneNumber ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTajNumber() {
        return tajNumber;
    }

    public void setTajNumber(String tajNumber) {
        this.tajNumber = tajNumber;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
