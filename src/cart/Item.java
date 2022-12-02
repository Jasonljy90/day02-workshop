package cart;

public class Item {
    // members
    private String name;
    private String code;
    private Float price = 1f; 
    private int quantity = 0;
    
    // constructors first
    public Item (String code, String name){
        this.code = code;
        this.name = name;
    }

    // next getters and setters
    public String getName() {
        return this.name; 
    }

    // setter for members-colour
    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Float totalCost() {
        return(this.price*this.quantity);
    }
}
