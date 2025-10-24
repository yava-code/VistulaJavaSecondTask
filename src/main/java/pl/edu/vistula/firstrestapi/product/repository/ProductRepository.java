package pl.edu.vistula.firstrestapi.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.vistula.firstrestapi.product.domain.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
