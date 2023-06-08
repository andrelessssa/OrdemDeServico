package com.andre.os.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andre.os.domain.OS;

public interface OsRepository extends JpaRepository<OS, Integer> {

}
