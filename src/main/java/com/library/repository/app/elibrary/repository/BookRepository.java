package com.library.repository.app.elibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.repository.app.elibrary.model.DisplayModel;

@Repository
public interface BookRepository extends JpaRepository<DisplayModel, Long> {
    // Basic CRUD methods like findById are automatically provided by JpaRepository
}

