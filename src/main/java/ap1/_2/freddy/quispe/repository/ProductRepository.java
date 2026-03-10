package ap1._2.freddy.quispe.repository;

import ap1._2.freddy.quispe.model.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
    
}