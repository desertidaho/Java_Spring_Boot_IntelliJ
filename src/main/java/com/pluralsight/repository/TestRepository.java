package com.pluralsight.repository;

import com.pluralsight.entity.Test;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository<Test, Long> {
}
