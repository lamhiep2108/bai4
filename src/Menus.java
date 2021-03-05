import java.util.Scanner;

public class Menus {
    static Scanner scanner=new Scanner(System.in);
    public static LoanCard getManagement(){
        System.out.println("----------");
        System.out.println("enter id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("enter name ");
        String name = scanner.nextLine();
        System.out.println("enter student code");
        int studentCode=Integer.parseInt(scanner.nextLine());
        System.out.println("enter date of birth");
        String dateOfBirth=scanner.nextLine();
        System.out.println("enter grade");
        String grade = scanner.nextLine();
        System.out.println("enter coupon number");
        int couponNumber=Integer.parseInt(scanner.nextLine());
        System.out.println("enter date of borrowing");
        int dateOfBorrowing=Integer.parseInt(scanner.nextLine());
        System.out.println("enter due date");
        int dueDate=Integer.parseInt(scanner.nextLine());
        System.out.println("enter bookstore number");
        int bookstoreNumber=Integer.parseInt(scanner.nextLine());
        Student student=new Student(name,studentCode,dateOfBirth,grade);
        LoanCard loanCard=new LoanCard(id,couponNumber,dateOfBorrowing,dueDate,bookstoreNumber,student);
        return loanCard;
    }
}
