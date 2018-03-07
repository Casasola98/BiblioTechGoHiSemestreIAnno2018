
package domain;

public class Student {
    
    private String id;
    private String name;
    
    //Constructor
    public Student(String pId, String pName){
        setId(pId);
        setName(pName);
    }

    //Getters and Setters
    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
       
}
