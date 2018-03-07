
package domain;

import XML.XML;
import java.util.ArrayList;

public class BiblioTech {
    
    private ArrayList<User> users;
    private ArrayList<Student> students;
    private ArrayList<Book> books;
    private ArrayList<Audiovisual> audiovisuals;
    private ArrayList<AudiovisualReservation> audioReserve;
    private ArrayList<BookReservation> bookReserve;
    private String password;
    
    private int fine = 150; //multa por dia en caso de atraso de retorno del material
    private int days = 5; //cantidad de dias que se presta el material

    //Constructor
    public BiblioTech(){
        setUsers(new ArrayList<User>());
        setStudents(new ArrayList<Student>());
        setBooks(new ArrayList<Book>());
        setAudiovisuals(new ArrayList<Audiovisual>());
        setAudioReserve(new ArrayList<AudiovisualReservation>());
        setBookReserve(new ArrayList<BookReservation>());
        password = "pr";
        XML.readXML(this);
        
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
    
    //Retorna si el Audiovisual existe
    public boolean existAudiovisual(String theID){
        for(Audiovisual theAudio : audiovisuals){
            if(theAudio.getId().equals(theID)){
                return true;
            }
        }
        return false;
    }
    
    //Retorna si el Book existe
    public boolean existBook(String theID){
        for(Book theBook : books){
            if(theBook.getIsbn().equals(theID)){
                return true;
            }
        }
        return false;
    }
    
    //Retorna si el Estudiante existe
    public boolean existStudent(String theID){
        for(Student theStudent : students){
            if(theStudent.getId().equals(theID)){
                return true;
            }
        }
        return false;
    }
    
    //Retorna si el ISBN es valido, los codigos ISBN deben tener 10 digitos
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
    
    //Retorna si String ingresado esta formado de solo numeros
    public boolean isNumber(String theNumber){
        try{
            int possible = Integer.parseInt(theNumber);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    //Agrega un libro digital al sistema
    public void addDigitalBook(String pIsbn, String pName, int pYear, String pEdit){
        books.add(new Book(pIsbn, pName, pYear, pEdit, "digital"));
    }
    
    //Agrega un libro fisico al sistema
    public void addPhysicBook(String pIsbn, String pName, int pYear, String pEdit, int pStock){
        books.add(new Physical(pIsbn, pName, pYear, pEdit, "physic", pStock));   
    }
    
    //Agrega un material audiovisual al sistema
    public void addAudiovisual(String pId, String pType, String pBrand, String pDesc, int pStock){
        audiovisuals.add(new Audiovisual(pId, pType, pBrand, pDesc, pStock));   
    }
    
    //Agrega un estudiante al sistema
    public void addStudent(String pId, String career, String name){
        students.add(new Student( career + pId, name));   
    }
    
    //Retorna el estudiante solicitado
    public Student obtainStudent(String id)
    {
        for(Student s: students)
        {
            if(s.getId().equals(id))
                return s;
        }
        return null;
    }
    
    //retorna el audiovisual solicitado
    public Audiovisual obtainAudiovisual(String id)
    {
        for(Audiovisual a: audiovisuals)
        {
            if(a.getId().equals(id))
                return a;
        }
        return null;
    }
    
    //retorna el libro solicitado
    public Book obtainBook(String id)
    {
        for(Book b: books)
        {
            if(b.getIsbn().equals(id))
                return b;
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

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    
}
