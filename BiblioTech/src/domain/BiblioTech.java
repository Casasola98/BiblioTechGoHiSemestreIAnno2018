
package domain;

import java.util.ArrayList;

public class BiblioTech {
    
    private ArrayList<User> users;
    private ArrayList<Student> students;
    private ArrayList<Book> books;
    private ArrayList<Audiovisual> audiovisuals;
    private ArrayList<AudiovisualReservation> audioReserve;
    private ArrayList<BookReservation> bookReserve;
    private String password;

    public BiblioTech(){
        users = new ArrayList<User>();
        students = new ArrayList<Student>();
        books = new ArrayList<Book>();
        audiovisuals = new ArrayList<Audiovisual>();
        audioReserve = new ArrayList<AudiovisualReservation>();
        bookReserve = new ArrayList<BookReservation>();
        password = "prueba";
    }
    
    public boolean fieldIsEmpty(String evaluate){
        evaluate = evaluate.replace(" ", "");
        if(evaluate.isEmpty())
            return true;
        return false;
    }

    public boolean isCorrectPassword(String evaluate){
        if(password.equals(evaluate))
            return true;
        return false;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Audiovisual> getAudiovisuals() {
        return audiovisuals;
    }

    public ArrayList<AudiovisualReservation> getAudioReserve() {
        return audioReserve;
    }

    public ArrayList<BookReservation> getBookReserve() {
        return bookReserve;
    }

    public String getPassword() {
        return password;
    }
    
}
