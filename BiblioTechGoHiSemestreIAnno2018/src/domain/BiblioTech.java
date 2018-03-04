
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
    
    public boolean existAudiovisual(String theID){
        for(Audiovisual theAudio : audiovisuals){
            if(theAudio.getId().equals(theID)){
                return true;
            }
        }
        return false;
    }
    
    public boolean existBook(String theID){
        for(Book theBook : books){
            if(theBook.getIsbn().equals(theID)){
                return true;
            }
        }
        return false;
    }
    
    public boolean existStudent(String theID){
        for(Student theStudent : students){
            if(theStudent.getId().equals(theID)){
                return true;
            }
        }
        return false;
    }
    
    public boolean isValidISBN(String theID){
        try{
            double possible = Double.parseDouble(theID);
            if(theID.length() == 10)
                return true;
            return false;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public boolean isNumber(String theNumber){
        try{
            int possible = Integer.parseInt(theNumber);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public void addDigitalBook(String pIsbn, String pName, int pYear, String pEdit){
        books.add(new Book(pIsbn, pName, pYear, pEdit, "digital"));
    }
    
    public void addPhysicBook(String pIsbn, String pName, int pYear, String pEdit, int pStock){
        books.add(new Physical(pIsbn, pName, pYear, pEdit, "physic", pStock));   
    }
    
    public void addAudiovisual(String pId, String pType, String pBrand, String pDesc, int pStock){
        audiovisuals.add(new Audiovisual(pId, pType, pBrand, pDesc, pStock));   
    }
    
    public void addStudent(String pId, String career, String name){
        students.add(new Student( career + pId, name));   
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
