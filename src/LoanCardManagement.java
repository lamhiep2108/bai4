import java.util.ArrayList;
import java.util.List;

public class LoanCardManagement {
    List<LoanCard>loanCards=new ArrayList<>();
    public void add(LoanCard loanCard){
        loanCards.add(loanCard);
    }
    public void update(LoanCard loanCard){
        for (LoanCard l:loanCards) {
            if (loanCard.getId()==l.getId()){
                l.setCouponNumber(loanCard.getCouponNumber());
                l.setDateOfBorrowing(loanCard.getDateOfBorrowing());
                l.setDueDate(loanCard.getDueDate());
                l.setBookstoreNumber(loanCard.getBookstoreNumber());
                l.setStudent(loanCard.getStudent());
            }
        }
    }
    public void delete(int id){
        loanCards.removeIf(l -> l.getId() == id);
    }
    public  LoanCard search(int id){
        LoanCard loanCard = null;
        for (LoanCard l:
             loanCards) {
            if (l.getId()==id){
                loanCard=l;
            }
        }return loanCard;
    }
    public Student search(String name){
        Student student = new Student();
        for (LoanCard loanCard : loanCards) {
            if (loanCard.getStudent().getName().equals(name)) {
                student = loanCard.getStudent();
            }
        }
        return student;
    }
    public void showAll(){
        for (LoanCard l:
             loanCards) {
            System.out.println(l.toString());
        }
    }
}
