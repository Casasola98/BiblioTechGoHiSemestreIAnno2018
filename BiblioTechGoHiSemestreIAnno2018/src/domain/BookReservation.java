
package domain;

import java.util.Date;

public class BookReservation {
    
    Book reservedBook;
    Student theStudent;
    Date deliveryDate;
    
    //Constructor
    public BookReservation(Book pBook, Student pStudent, Date pDelivery){
        setReservedBook(pBook);
        setTheStudent(pStudent);
        setDeliveryDate(pDelivery);
    }

    //Getters and Setters
    public Book getReservedBook() {
        return reservedBook;
    }

    private void setReservedBook(Book reservedBook) {
        this.reservedBook = reservedBook;
    }

    public Student getTheStudent() {
        return theStudent;
    }

    private void setTheStudent(Student theStudent) {
        this.theStudent = theStudent;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    private void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    
}
