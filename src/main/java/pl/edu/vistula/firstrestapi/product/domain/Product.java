package pl.edu.vistula.firstrestapi.product.domain;

public class Product {
    private Long id;

    private String name;


    public Product(String name) {this.name = name;}


    public Product() {}

    //getters and setters
    public Long getId() {return id;}

    public String getName() {return name;}

    public void setId(Long id) {this.id = id;}

    public void setName(String name) {this.name = name;}
}