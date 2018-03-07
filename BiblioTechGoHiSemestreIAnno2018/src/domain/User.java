
package domain;

public class User {
    
    private String id;
    private String password;
    private String name;
    
    //Constructor
    public User(String pId, String pPassword, String pName){
        setId(pId);
        setPassword(pPassword);
        setName(pName);
    }
    
    //Dice si la contrasenna ingresada es o no la correcta del usuario en el sistema
    public boolean isCorrectPassword(String evaluate){
        if(password.equals(evaluate))
            return true;
        return false;
    }

    //Getters and Setters
    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

}
