
package domain;

public class User {
    
    private String id;
    private String password;
    private String name;
    
    public User(String pId, String pPassword, String pName){
        setId(pId);
        setPassword(pPassword);
        setName(pName);
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
    
    //Review if the password is valid
    
    public boolean isPassword(String possibleP){
        if (password.equals(possibleP)){
            return true;
        }
        else
            return false;
    }
    
    
}
