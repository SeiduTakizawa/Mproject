package org.example.mproject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<CarEntity,Long> {
    @Query("SELECT c FROM  CarEntity c WHERE c.name= ?1")
    Optional<CarEntity> findByName(String name);
}
