
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

    //Constructor
    public BiblioTech(){
        setUsers(new ArrayList<User>());
        setStudents(new ArrayList<Student>());
        setBooks(new ArrayList<Book>());
        setAudiovisuals(new ArrayList<Audiovisual>());
        setAudioReserve(new ArrayList<AudiovisualReservation>());
        setBookReserve(new ArrayList<BookReservation>());
        password = "prueba";
        users.add(new User("123","prueba","jose"));
    }
    
    //Revisa si el String esta vacio o lleno de solo espacios
    public boolean fieldIsEmpty(String evaluate){
        evaluate = evaluate.replace(" ", "");
        if(evaluate.isEmpty())
            return true;
        return false;
    }

    //Revisa si la contrasenna ingresada como contrasenna del sistema es correcta
    public boolean isCorrectPassword(String evaluate){
        if(password.equals(evaluate))
            return true;
        return false;
    }
    
    //Revisa si el usuario ingresado existe, es decir, que se encuentra dentro de su lista de usuarios
    public boolean isCorrectUser(String pUser){
        for(User theUser : users){
            if(theUser.getId().equals(pUser)){
                return true;
            }
        }
        return false;
    }
    
    //Devuelve el usuario solicitado
    public User obtainUser(String pUser){
        for(User theUser : users){
            if(theUser.getId().equals(pUser)){
                return theUser;
            }
        }
        return null;
    }
    
    //Getters and Setters
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    private void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    private void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    private void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Audiovisual> getAudiovisuals() {
        return audiovisuals;
    }

    private void setAudiovisuals(ArrayList<Audiovisual> audiovisuals) {
        this.audiovisuals = audiovisuals;
    }

    public ArrayList<AudiovisualReservation> getAudioReserve() {
        return audioReserve;
    }

    private void setAudioReserve(ArrayList<AudiovisualReservation> audioReserve) {
        this.audioReserve = audioReserve;
    }

    public ArrayList<BookReservation> getBookReserve() {
        return bookReserve;
    }

    private void setBookReserve(ArrayList<BookReservation> bookReserve) {
        this.bookReserve = bookReserve;
    }
    
}
