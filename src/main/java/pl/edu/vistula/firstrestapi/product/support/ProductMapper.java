package pl.edu.vistula.firstrestapi.product.support;

import org.springframework.stereotype.Component;
import pl.edu.vistula.firstrestapi.product.domain.Product;
import pl.edu.vistula.firstrestapi.product.api.request.ProductRequest;
import pl.edu.vistula.firstrestapi.product.api.response.ProductResponse;

@Component
public class ProductMapper {


    public Product toProduct(ProductRequest productRequest) {

        return new Product(productRequest.getName());
    }


    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse(product.getId(), product.getName());
    }
}