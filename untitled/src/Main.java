import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10,20);

        Rectangle rectangle2 = new Rectangle(10,20);

        System.out.println(rectangle);

//        equals() method: automatically gets created
        System.out.println(rectangle.equals(rectangle2));

//        getters: automatically get created
        System.out.println(rectangle.length());

        System.out.println(rectangle.width());

        System.out.println(Rectangle.PIE);

        Rectangle.staticMethod();

        Student student = new Student("Bob",90,'A',"Java","Germany");
        Student student2 = new Student("Bob",81,'A',"Java","Germany");

        System.out.println(student2.equals(student));



        AccountType myAccountType = AccountType.PLATINUM;

        System.out.println(myAccountType);


//        checking equality in a if statement
        if(myAccountType == AccountType.GOLD){
            System.out.println("You have a gold account");
        }
        else if(myAccountType == AccountType.SILVER){
            System.out.println("You have a silver account");
        }
        else if(myAccountType == AccountType.PLATINUM){
            System.out.println("congrats you have the best plan: Platinum");
        }


//        .values()

        System.out.println(Arrays.toString(AccountType.values()));


        for( AccountType accountType : AccountType.values()){
            System.out.println(accountType);
        }


        Account myAccount = new Account(10000, AccountType.SILVER);

        System.out.println(myAccount.getAccountType().getDepositLimit());

        myAccount.displayLimits();

        int amountIWantToWithdraw = 100;

        if(myAccount.getAccountType().getDepositLimit() > amountIWantToWithdraw){
            myAccount.setBalance(myAccount.getBalance()-amountIWantToWithdraw);
        }


//        name(): return our enum constant in string format

        String enumAsString = myAccount.getAccountType().name();

        System.out.println(enumAsString.toLowerCase());

//        valueof(): returns an enum that matches the string

        System.out.println(AccountType.valueOf("GOLD"));

        Account mySecondAccount = null;
        try{
            mySecondAccount = new Account(10000, AccountType.valueOf("silver".toUpperCase()));
            System.out.println(mySecondAccount);

        }
        catch(IllegalArgumentException e){
            System.out.println("Please input either SILVER, GOLD, or PLATINUM");
        }

        System.out.println(mySecondAccount.getAccountType().name().substring(0,1) + mySecondAccount.getAccountType().name().substring(1).toLowerCase());


        System.out.println(Days.SUNDAY.isWeekend());






    }
}

/*
    1. Create a Student record that takes the following: name, grade (1-100), gradeLetter, course, country
    2. write a static field for teacher that should be the same for all students
    3. Create 3 students
    4. use the .equals() to check if they're the same student
    5. BONUS: write a compact constructor that checks if any of the values are: 0, null or something we don't want than throw a RuntimeException
*/


/*
    Exercise 2:

    1. Create an Enum class for the days of the week: SATURDAY, SUNDAY, MONDAY, TUESDAY, etc.
    2. Write a method that will return if an enum constant is a weekday or not. Should return true if the constant is a weekday
*/