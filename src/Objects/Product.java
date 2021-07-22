/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @Sujan Chaudhary
 * @Version(NetBeans IDE 8.2 (Build 201609300101))
 */
public class Product {
   //Declaration of the variables
    private int product_id; 
    private String product_name;
    private String category;
    private String description;
    private long price;
    private int quantity;
    private int discount;
    private String recommendationBy;

    public Product() {
    }

    //constructor class for product
    
    public Product(int product_id, String product_name, String description, String category, long price, int quantity, int discount, String recommendationBy) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
        this.recommendationBy = recommendationBy;
    }
    //getter method for product_id
    public int getProduct_id() {
        return product_id;
    }
    //setter method for product_id
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
    //getter method for product_name
    public String getProduct_name() {
        return product_name;
    }
    //setter method for product_name
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    //getter method for category
    public String getCategory() {
        return category;
    }
    //setter method for category
    public void setCategory(String category) {
        this.category = category;
    }
    //getter method for description
    public String getDescription() {
        return description;
    }
    //setter method for description
    public void setDescription(String description) {
        this.description = description;
    }
    //getter method for price
    public long getPrice() {
        return price;
    }
    //setter method for price
    public void setPrice(long price) {
        this.price = price;
    }
    //getter method for quantity
    public int getQuantity() {
        return quantity;
    }
    //setter method for quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    //getter method for discount
    public int getDiscount() {
        return discount;
    }
    //setter method for discount
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    //getter method for recommendation
    public String getRecommendationBy() {
        return recommendationBy;
    }
    //setter method for recommendation
    public void setRecommendationBy(String recommendationBy) {
        this.recommendationBy = recommendationBy;
    }
    
    //creation of object to get the info from the objects
    public Object[] getObjectData() {
        return new Object[]{ getProduct_id(), getProduct_name(), getDescription(), getCategory(), getPrice(), getQuantity(),getDiscount(), getRecommendationBy() };
    }
}
