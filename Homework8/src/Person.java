public class Person {
    String name;
    double balance;
    Company company;

    public void sendMoney(Person otherPerson,double amount ){
        otherPerson.balance += amount;
        balance-=amount;

    }

}
