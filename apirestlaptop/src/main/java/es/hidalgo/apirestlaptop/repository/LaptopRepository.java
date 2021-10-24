package es.hidalgo.apirestlaptop.repository;

import es.hidalgo.apirestlaptop.entitites.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
