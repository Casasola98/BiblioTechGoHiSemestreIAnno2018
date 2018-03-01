
package domain;

public class Book {
    
    private String isbn;
    private String name;
    private int year;
    private String editorial;
    private String type;
    
    public Book(String pIsbn, String pName, int pYear, String pEdit, String pType){
        setIsbn(pIsbn);
        setName(pName);
        setYear(pYear);
        setEditorial(pEdit);
        setType(pType);
    }

    public String getIsbn() {
        return isbn;
    }

    private void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public String getEditorial() {
        return editorial;
    }

    private void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
    }
    
    
    
}
