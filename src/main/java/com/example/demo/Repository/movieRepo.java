package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.movieEntity;

@Repository
public interface movieRepo extends JpaRepository<movieEntity, Integer>{

}
