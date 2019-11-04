package com.rebo.person.respository;

import com.rebo.person.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findByLastNameAndFirstName( @Param("lastName") String lastName, @Param("firstname") String firstname);
}
