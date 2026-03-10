package ap1._2.freddy.quispe.service.impl;

import ap1._2.freddy.quispe.model.Product;
import ap1._2.freddy.quispe.repository.ProductRepository;
import ap1._2.freddy.quispe.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Flux<Product> findAll() {
        log.info("Mostrando lista de productos");
        return productRepository.findAll();
    }

    @Override
    public Mono<Product> findById(String id) {
        log.info("Mostrando producto por ID " );
        return productRepository.findById(id);
    }

    @Override
    public Mono<Product> save(Product product) {
        log.info("Registrando producto: " + product.toString());
        product.setIsActive(true);
        if (product.getCreatedAt() == null) {
            product.setCreatedAt(LocalDateTime.now());
        }
        return productRepository.save(product);
    }

    @Override
    public Mono<Product> update(Product product) {
        log.info("Actualizando producto: " + product.toString());
        product.setIsActive(true);
        return productRepository.save(product);
    }

    @Override
    public Mono<Void> delete(String id) {
        log.info("Eliminando producto por ID: " );
        return productRepository.deleteById(id);
    }
}