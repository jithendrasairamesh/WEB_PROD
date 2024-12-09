package com.fashion.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Products {

    @Id
    private String id; // MongoDB uses String for IDs by default
    private String name;
    private String dis;
    private String quantity;
    private String price;
    private String gender;
    private String category;
    private String image_url;
    private byte[] image;

    // Constructor
    public Products(String id, String name, String dis, String quantity, String price, String gender, 
                    String category, byte[] image, String image_url) {
        this.id = id;
        this.name = name;
        this.dis = dis;
        this.quantity = quantity;
        this.price = price;
        this.gender = gender;
        this.category = category;
        this.image = image;
        this.image_url = image_url;
    }

    public Products() {
        // Default constructor
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDis() {
        return dis;
    }

    public void setDis(String dis) {
        this.dis = dis;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    // toString Method
    @Override
    public String toString() {
        return "Products [id=" + id + ", name=" + name + ", dis=" + dis + ", quantity=" + quantity + ", price=" + price
                + ", gender=" + gender + ", category=" + category + ", image_url=" + image_url + "]";
    }
}
