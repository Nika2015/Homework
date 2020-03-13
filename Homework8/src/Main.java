public class Main {
    public static void main(String[] args) {
        Person Tom= new Person();
        Tom.name= " Tom";
        Tom.balance= 56;

        Company A= new Company();
        A.nameCompany= "A";
        Company B= new Company();
        B.nameCompany= "B";

        Person employee_1= new Person();
        employee_1.name= "emloyee1";
        Person emlpoyee_2= new Person();
        emlpoyee_2.name=" employee2";
        Person employee_3= new Person();
        employee_3.name= " employee3";
        Person employee_4= new Person();
        employee_4.name= " employee4";
        Person employee_5= new Person();
        employee_5.name= " employee5";
        Person employee_6= new Person();
        employee_6.name=" employee6";

        employee_1.balance=100;
        emlpoyee_2.balance=100;
        employee_3.balance=100;
        employee_4.balance=200;
        employee_5.balance=200;
        employee_6.balance=200;

        employee_1.company= A;
        emlpoyee_2.company=A;
        employee_3.company=A;
        employee_4.company=B;
        employee_5.company=B;
        employee_6.company=B;

        employee_1.sendMoney(employee_4, 20);
        employee_5.sendMoney(employee_6, 40);
        employee_3.sendMoney(employee_1, 80);
        employee_5.sendMoney(emlpoyee_2,60);

        Person[] persons= new Person[] { employee_1,emlpoyee_2, employee_3, employee_4,employee_5, employee_6};
        Company [] companies= new Company[] {A, B};


        double balanceA=0;
        double balanceB=0;
        Person personMaxbalance= employee_1;
        for( int i=1; i <6; i++)
        {if (persons[i].balance> personMaxbalance.balance){ personMaxbalance=persons[i];}
        if( persons[i].company== A){ balanceA+= persons[i].balance;} else { balanceB+= persons[i].balance;}}
            System.out.println(personMaxbalance.name + " is a reachest");
        if ( balanceA> balanceB){
            System.out.println("More reach company is a "+A.nameCompany);}
        else {
            System.out.println("More reach company is a "+B.nameCompany);}





    }
}
