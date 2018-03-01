
package domain;

public class Student {
    
    private int id;
    private String name;
    
    public Student(int pId, String pName){
        setId(pId);
        setName(pName);
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
    
    
    
}
