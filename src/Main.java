//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("==============");
        Author A = new Author("SarinCheav","cheavsarien65@gmail.com",'M');
        System.out.println("Enter your name:"+ A.getName());
        System.out.println("Enter your email:"+A.getEmail());
        System.out.println("Enter your genders:"+A.getGender());
        System.out.println("This is your:" + A.toString());



        Students_Management SM = new Students_Management(12, "cheavsarin",70);

System.out.println("This is your ID"+ SM.getGrade());
SM.displayInfo();
        Bank_Account acc = new Bank_Account(101, "Sarin", 150);

        acc.displayAccount();
        acc.deposit(150);
        acc.withdraw(150);
        acc.displayAccount();


}}