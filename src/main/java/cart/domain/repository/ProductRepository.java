package cart.domain.repository;

import cart.domain.Product;

import java.util.List;

public interface ProductRepository {
    Product getProductById(Long productId);

    List<Product> findAll();

    Product findById(Long productId);

    Long create(Product product);

    void update(Long productId, Product product);

    void delete(Long productId);
}
