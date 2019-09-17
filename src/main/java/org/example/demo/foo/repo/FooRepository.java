package org.example.demo.foo.repo;

import org.example.demo.foo.inner.FooItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional(propagation = Propagation.MANDATORY)
public interface FooRepository extends JpaRepository<FooItem, Long> {

    @Transactional(propagation = Propagation.MANDATORY)
    FooItem save(FooItem s);
}
