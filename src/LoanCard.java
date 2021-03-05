public class LoanCard {
    private int id;
    private int couponNumber;
    private int dateOfBorrowing;
    private int dueDate;
    private int bookstoreNumber;
    private Student student;

    public LoanCard(int id,int couponNumber, int dateOfBorrowing, int dueDate, int bookstoreNumber, Student student) {
      this.id=id;
        this.couponNumber = couponNumber;
        this.dateOfBorrowing = dateOfBorrowing;
        this.dueDate = dueDate;
        this.bookstoreNumber = bookstoreNumber;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCouponNumber() {
        return couponNumber;
    }

    public void setCouponNumber(int couponNumber) {
        this.couponNumber = couponNumber;
    }

    public int getDateOfBorrowing() {
        return dateOfBorrowing;
    }

    public void setDateOfBorrowing(int dateOfBorrowing) {
        this.dateOfBorrowing = dateOfBorrowing;
    }

    public int getDueDate() {
        return dueDate;
    }

    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }

    public int getBookstoreNumber() {
        return bookstoreNumber;
    }

    public void setBookstoreNumber(int bookstoreNumber) {
        this.bookstoreNumber = bookstoreNumber;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "LoanCard{" +
                "id=" + id +
                ", couponNumber=" + couponNumber +
                ", dateOfBorrowing=" + dateOfBorrowing +
                ", dueDate=" + dueDate +
                ", bookstoreNumber=" + bookstoreNumber +
                ", student=" + student +
                '}';
    }
}
