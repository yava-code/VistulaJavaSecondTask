package pl.edu.vistula.firstrestapi.product.api.domain;

public class Product {
    private Long id;

    private String name;

    public Product() {this.name = name;}
    //getters and setters
    public Long getId() {return id;}

    public String getName() {return name;}

    public void setId(Long id) {this.id = id;}

    public void setName(String name) {this.name = name;}
}

//class that represents main package(product)