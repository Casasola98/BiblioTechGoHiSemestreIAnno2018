
package domain;

import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.Date;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

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
        //password = "";
        //readXML();
        //System.out.println("--------");
        //System.out.println(password);
        //System.out.println("--------");
        password = "prueba";
        users.add(new User("123","prueba","jose"));
        users.add(new User("321","prueba2","orlando"));
        //writeXML();
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
    
    private void writeXML() 
    {
        try 
        {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            // root elements
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("BiblioTech");
            doc.appendChild(rootElement);

            
            Element passwordNode = doc.createElement("System");
            rootElement.appendChild(passwordNode);

	    // set attribute to user element
            Attr attribute = doc.createAttribute("ID");
            attribute.setValue("1");
            passwordNode.setAttributeNode(attribute);
                
                // name elements
            Element passwordElement = doc.createElement("Password");
            passwordElement.appendChild(doc.createTextNode(password));
            passwordNode.appendChild(passwordElement);
            
            for(User user: users)
            {
                // user elements
                Element userNode = doc.createElement("User");
		rootElement.appendChild(userNode);

		// set attribute to user element
	        Attr attr = doc.createAttribute("ID");
                attr.setValue(user.getId());
		userNode.setAttributeNode(attr);
                
                // name elements
                Element firstname = doc.createElement("Name");
                firstname.appendChild(doc.createTextNode(user.getName()));
		userNode.appendChild(firstname);

		// password elements
		Element userPassword = doc.createElement("Password");
		userPassword.appendChild(doc.createTextNode(user.getPassword()));
		userNode.appendChild(userPassword);
            }
            
            for(Student student: students)
            {
                // user elements
                Element studentNode = doc.createElement("Student");
		rootElement.appendChild(studentNode);

		// set attribute to user element
	        Attr attr = doc.createAttribute("ID");
                attr.setValue(student.getId());
		studentNode.setAttributeNode(attr);
                
                // name elements
                Element name = doc.createElement("Name");
                name.appendChild(doc.createTextNode(student.getName()));
		studentNode.appendChild(name);
            }
		
            for(Book book: books)
            {
                // user elements
                Element bookNode = doc.createElement("Book");
		rootElement.appendChild(bookNode);

		// set attribute to user element
	        Attr attr = doc.createAttribute("ID");
                attr.setValue(book.getIsbn());
		bookNode.setAttributeNode(attr);
                
                // name elements
                Element name = doc.createElement("Name");
                name.appendChild(doc.createTextNode(book.getName()));
		bookNode.appendChild(name);

		// year elements
		Element year = doc.createElement("Year");
		year.appendChild(doc.createTextNode(Integer.toString(book.getYear())));
		bookNode.appendChild(year);
                
                // editorial elements
		Element editorial = doc.createElement("Editorial");
		editorial.appendChild(doc.createTextNode(book.getEditorial()));
		bookNode.appendChild(editorial);
                
                // type elements
		Element type = doc.createElement("Type");
		type.appendChild(doc.createTextNode(book.getType()));
		bookNode.appendChild(type);
            }
            
            for(Audiovisual audiovisual: audiovisuals)
            {
                // user elements
                Element audiovisualNode = doc.createElement("Audiovisual");
		rootElement.appendChild(audiovisualNode);
    
		// set attribute to user element
	        Attr attr = doc.createAttribute("ID");
                attr.setValue(audiovisual.getId());
		audiovisualNode.setAttributeNode(attr);
                
                // type elements
		Element type = doc.createElement("Type");
		type.appendChild(doc.createTextNode(audiovisual.getType()));
		audiovisualNode.appendChild(type);
                
                // brand elements
                Element name = doc.createElement("Brand");
                name.appendChild(doc.createTextNode(audiovisual.getBrand()));
		audiovisualNode.appendChild(name);

                // description elements
		Element editorial = doc.createElement("Description");
		editorial.appendChild(doc.createTextNode(audiovisual.getDescription()));
		audiovisualNode.appendChild(editorial);
                
		// stock elements
		Element year = doc.createElement("Stock");
		year.appendChild(doc.createTextNode(Integer.toString(audiovisual.getStock())));
		audiovisualNode.appendChild(year);
            }
            
            int count = 0;
            for(AudiovisualReservation audiovisualReservation: audioReserve)
            {
                // user elements
                Element audiovisualResNode = doc.createElement("AudiovisualReservation");
		rootElement.appendChild(audiovisualResNode);
    
		// set attribute to user element
	        Attr attr = doc.createAttribute("ID");
                attr.setValue(Integer.toString(count++));
		audiovisualResNode.setAttributeNode(attr);
                
                // idAudiovisual elements
		Element idAudiovisual = doc.createElement("ID_Audiovisual");
		idAudiovisual.appendChild(doc.createTextNode(audiovisualReservation.getReservedAudiov().getId()));
		audiovisualResNode.appendChild(idAudiovisual);
                
                // idStudent elements
                Element idStudent = doc.createElement("ID_Student");
                idStudent.appendChild(doc.createTextNode(audiovisualReservation.getTheStudent().getId()));
		audiovisualResNode.appendChild(idStudent);
                
		// date elements
		Element date = doc.createElement("Date");
		date.appendChild(doc.createTextNode(Long.toString(audiovisualReservation.getDeliveryDate().getTime())));
		audiovisualResNode.appendChild(date);
            }
            
            count = 0;
            for(BookReservation bookReservation: bookReserve)
            {
                // user elements
                Element bookResNode = doc.createElement("BookReservation");
		rootElement.appendChild(bookResNode);
    
		// set attribute to user element
	        Attr attr = doc.createAttribute("ID");
                attr.setValue(Integer.toString(count++));
		bookResNode.setAttributeNode(attr);
                
                // idAudiovisual elements
		Element idBook = doc.createElement("ID_Book");
		idBook.appendChild(doc.createTextNode(bookReservation.getReservedBook().getIsbn()));
		bookResNode.appendChild(idBook);
                
                // idStudent elements
                Element idStudent = doc.createElement("ID_Student");
                idStudent.appendChild(doc.createTextNode(bookReservation.getTheStudent().getId()));
		bookResNode.appendChild(idStudent);
                
		// date elements
		Element date = doc.createElement("Date");
		date.appendChild(doc.createTextNode(Long.toString(bookReservation.getDeliveryDate().getTime())));
		bookResNode.appendChild(date);
            }
            
            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("storage.xml"));

            // Output to console for testing
            // StreamResult result = new StreamResult(System.out);

            transformer.transform(source, result);
            System.out.println("File saved!");
        } 
        catch (ParserConfigurationException | TransformerException pce) 
        {
            pce.printStackTrace();
        }
    }
    
    public void readXML() 
    {
        try 
        {
            File fXmlFile = new File("storage.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            //System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
        
            NodeList userList = doc.getElementsByTagName("User");
            NodeList studentList = doc.getElementsByTagName("Student");
            NodeList bookList = doc.getElementsByTagName("Book");
            NodeList audiosvList = doc.getElementsByTagName("Audiovisual");
            NodeList audioResList = doc.getElementsByTagName("AudiovisualReservation");
            NodeList bookResList = doc.getElementsByTagName("BookReservation");
            NodeList passwordList = doc.getElementsByTagName("System");
        
            for (int temp = 0; temp < userList.getLength(); temp++) 
            {
                Node nNode = userList.item(temp);

                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;
                
                    String id = eElement.getAttribute("ID");
                    String name = eElement.getElementsByTagName("Name").item(0).getTextContent();
                    String pass = eElement.getElementsByTagName("Password").item(0).getTextContent();
                    User u = new User(id,pass,name);
                
                    users.add(u);
                
                    System.out.println("User ID : " + id);
                    System.out.println("Name : " + name);
                    System.out.println("Password : " + pass);
                }
            }

            for (int temp = 0; temp < studentList.getLength(); temp++) 
            {
                Node nNode = studentList.item(temp);
                
                System.out.println("\nCurrent Element :" + nNode.getNodeName());
                
                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;
                
                    String id = eElement.getAttribute("ID");
                    String name = eElement.getElementsByTagName("Name").item(0).getTextContent();
                    
                    Student s = new Student(id,name);
                    
                    students.add(s);
                    
                    System.out.println("Student ID : " + id);
                    System.out.println("Name : " + name);
                }
            }
       
            for (int temp = 0; temp < bookList.getLength(); temp++) 
            {
                Node nNode = bookList.item(temp);
                
                System.out.println("\nCurrent Element :" + nNode.getNodeName());
                
                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;
                
                    String id = eElement.getAttribute("ID");
                    String name = eElement.getElementsByTagName("Name").item(0).getTextContent();
                    int year = Integer.parseInt(eElement.getElementsByTagName("Year").item(0).getTextContent());
                    String editorial = eElement.getElementsByTagName("Editorial").item(0).getTextContent();
                    String type = eElement.getElementsByTagName("Type").item(0).getTextContent();
                    
                    Book b = new Book(id,name,year,editorial,type);
                    
                    books.add(b);
                }
            }
        
            for (int temp = 0; temp < audiosvList.getLength(); temp++) 
            {
                Node nNode = audiosvList.item(temp);
                
                System.out.println("\nCurrent Element :" + nNode.getNodeName());
                
                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;
                
                    String id = eElement.getAttribute("ID");
                    String type = eElement.getElementsByTagName("Type").item(0).getTextContent();
                    String brand = eElement.getElementsByTagName("Brand").item(0).getTextContent();
                    String description = eElement.getElementsByTagName("Description").item(0).getTextContent();
                    int stock = Integer.parseInt(eElement.getElementsByTagName("Stock").item(0).getTextContent());
                    
                    Audiovisual a = new Audiovisual(id,type,brand,description,stock);
                    
                    audiovisuals.add(a);
                    
                }
            }
        
            for (int temp = 0; temp < audioResList.getLength(); temp++) 
            {
                Node nNode = audioResList.item(temp);
                
                System.out.println("\nCurrent Element :" + nNode.getNodeName());
                
                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;
                
                    String idAudiovisual = eElement.getElementsByTagName("ID_Audiovisual").item(0).getTextContent();
                    String idStudent = eElement.getElementsByTagName("ID_Student").item(0).getTextContent();
                    Date date = new Date(Long.valueOf(eElement.getElementsByTagName("Date").item(0).getTextContent()));
                    if (existAudiovisual(idAudiovisual) && existStudent(idStudent))
                    {
                        AudiovisualReservation a = new AudiovisualReservation(obtainAudiovisual(idAudiovisual),obtainStudent(idStudent),date);
                        audioReserve.add(a);
                    }
                }
            }

            for (int temp = 0; temp < bookResList.getLength(); temp++) 
            {
                Node nNode = bookResList.item(temp);
                
                System.out.println("\nCurrent Element :" + nNode.getNodeName());
                
                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;
                
                    String idBook = eElement.getElementsByTagName("ID_Book").item(0).getTextContent();
                    String idStudent = eElement.getElementsByTagName("ID_Student").item(0).getTextContent();
                    Date date = new Date(Long.valueOf(eElement.getElementsByTagName("Date").item(0).getTextContent()));
                    if (existAudiovisual(idBook) && existStudent(idStudent))
                    {
                        BookReservation b = new BookReservation(obtainBook(idBook),obtainStudent(idStudent),date);
                        bookReserve.add(b);
                    }
                }
            }
        
            for (int temp = 0; temp < passwordList.getLength(); temp++) 
            {
                Node nNode = passwordList.item(temp);
                
                System.out.println("\nCurrent Element :" + nNode.getNodeName());
                
                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;
                
                    String id = eElement.getAttribute("ID");
                    String password1 = eElement.getElementsByTagName("Password").item(0).getTextContent();
                    System.out.println("Password leido: " + password1);
                    password = password1;
                }
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        } 
    } 
    public Student obtainStudent(String id)
    {
        for(Student s: students)
        {
            if(s.getId().equals(id))
                return s;
        }
        return null;
    }
    public Audiovisual obtainAudiovisual(String id)
    {
        for(Audiovisual a: audiovisuals)
        {
            if(a.getId().equals(id))
                return a;
        }
        return null;
    }
    public Book obtainBook(String id)
    {
        for(Book b: books)
        {
            if(b.getIsbn().equals(id))
                return b;
        }
        return null;
    }
}
