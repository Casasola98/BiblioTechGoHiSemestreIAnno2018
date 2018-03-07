
package domain;

public class Audiovisual {
    
    private String id;
    private String type;
    private String brand;
    private String description;
    private int stock;
    
    //Constructor
    public Audiovisual(String pId, String pType, String pBrand, String pDesc, int pStock){
        setId(pId);
        setType(pType);
        setBrand(pBrand);
        setDescription(pDesc);
        setStock(pStock);
    }

    //Getters and Setters
    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    private void setStock(int stock) {
        this.stock = stock;
    }
    
    //reduce el stock del material audiovisual
    public void reduceStock(){
        stock--;
    }
    
    //aumenta el stock del material audiovisual
    public void increaseStock(int increase){
        stock += increase;
    }
    
}
