package ap1._2.freddy.quispe.service;

import ap1._2.freddy.quispe.model.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {

    Flux<Product> findAll();

    Mono<Product> findById(String id);

    Mono<Product> save(Product product);

    Mono<Product> update(Product product);

    Mono<Void> delete(String id); 
}