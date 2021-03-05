import java.util.Scanner;

public class Main {
static LoanCardManagement lm=new LoanCardManagement();

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        do {
            System.out.println("-------------");
            System.out.println("1.add");
            System.out.println("2.update");
            System.out.println("3.delete");
            System.out.println("4.search loan card");
            System.out.println("5.search Student");
            System.out.println("6.show all");
            int choice=Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    LoanCard loanCard = Menus.getManagement();
                    lm.add(loanCard);
                    break;
                case 2:
                    LoanCard loanCard1=Menus.getManagement();
                    lm.update(loanCard1);
                    break;
                case 3:
                    System.out.println("enter id");
                    int id = Integer.parseInt(input.nextLine());
                    lm.delete(id);
                    break;
                case 4:
                    int id1=Integer.parseInt(input.nextLine());
                    System.out.println(lm.search(id1));
                    break;
                case 5:
                    System.out.println("enter name");
                    String name =input.nextLine();
                    System.out.println(lm.search(name));
                    break;
                case 6:
                    lm.showAll();
                    break;
                case 0:
                    continue;
            }
        }while (true);
    }
}
