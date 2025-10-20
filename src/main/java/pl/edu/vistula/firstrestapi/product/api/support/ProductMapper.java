package pl.edu.vistula.firstrestapi.product.api.support;

import org.springframework.stereotype.Component;
import pl.edu.vistula.firstrestapi.product.api.domain.Product;
import pl.edu.vistula.firstrestapi.product.api.request.ProductRequest;
import pl.edu.vistula.firstrestapi.product.api.response.ProductResponse;

@Component
public class ProductMapper {

    public Product toProduct(ProductRequest productRequest) {
        return new Product(productRequest.getId(), productRequest.getName());
    }
}
