package com.interview.service.repository;

import com.interview.service.models.Person;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CustomerRepository extends CrudRepository<Person, Long> {
    List<Person> findByNameAndCategoryAndDescription(String name, int category, String description);
}
