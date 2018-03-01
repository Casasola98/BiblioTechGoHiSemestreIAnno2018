
package domain;

public class Physical extends Book {

    private int stock;
    
    public Physical(String pIsbn, String pName, int pYear, String pEdit, String pType, int pStock) {
        super(pIsbn, pName, pYear, pEdit, pType);
        setStock(pStock);
    }

    public int getStock() {
        return stock;
    }

    private void setStock(int stock) {
        this.stock = stock;
    }
    
    public void reduceStock(){
        stock--;
    }
    
    public void increaseStock(int increase){
        stock += increase;
    }
    
}
