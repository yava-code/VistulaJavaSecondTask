package pl.edu.vistula.firstrestapi.product.support.exeption;

public class ProductNotFoundExeption extends RuntimeException {
    public ProductNotFoundExeption(Long id) {
        super(String.format("Product with id %d not found", id));
    }
}
