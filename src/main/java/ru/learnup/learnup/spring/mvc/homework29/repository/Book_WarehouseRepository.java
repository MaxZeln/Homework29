package ru.learnup.learnup.spring.mvc.homework29.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.learnup.learnup.spring.mvc.homework29.entity.Book_Warehouse;

@Repository
public interface Book_WarehouseRepository extends JpaRepository<Book_Warehouse, Integer> {
}