package pl.edu.vistula.firstrestapi.product.support;

import pl.edu.vistula.firstrestapi.product.support.exeption.ProductNotFoundExeption;

import java.util.function.Supplier;

public class ProductExceptionSupplier {

    public static Supplier<ProductNotFoundExeption> productNotFound(Long id) {
        return () -> new ProductNotFoundExeption(id);
    }
}
