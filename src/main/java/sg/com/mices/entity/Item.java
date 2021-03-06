package sg.com.mices.entity;

import sg.com.mices.controller.dto.ItemDTO;

import javax.persistence.*;

@Entity
@Table(name = "Items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Only for MySQL, it doesnt support database sequence
    private Integer id;
    private Integer sold, quantity;
    private String name, description, imageUrl, style;
    private Double price;

    public Item() {
    }

    public Item(ItemDTO itemDTO) {
        //Transfer the object (with the data) to Entity Class for mapping with the
        // database table columns and to be able to save the data in the columns
        this.name = itemDTO.getName();
        this.description = itemDTO.getDescription();
        this.imageUrl = itemDTO.getImageUrl();
        this.price = itemDTO.getPrice();
        this.sold = itemDTO.getSold();
        this.quantity = itemDTO.getQuantity();
        this.style = itemDTO.getStyle();
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", price=" + price +
                '}';
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
