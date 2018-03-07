
package domain;

public class Physical extends Book {

    private int stock;
    
    //Constructor
    public Physical(String pIsbn, String pName, int pYear, String pEdit, String pType, int pStock) {
        super(pIsbn, pName, pYear, pEdit, pType);
        setStock(pStock);
    }

    //Getters and Setters
    public int getStock() {
        return stock;
    }

    private void setStock(int stock) {
        this.stock = stock;
    }
    
    //reduce stock del libro al ser reservado
    public void reduceStock(){
        stock--;
    }
    
    //aumenta el stock del libro al ser devuelto por el usuario
    public void increaseStock(int increase){
        stock += increase;
    }
    
}
