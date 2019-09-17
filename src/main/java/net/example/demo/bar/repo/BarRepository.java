package net.example.demo.bar.repo;

import net.example.demo.bar.inner.BarItem;
import org.example.demo.foo.inner.FooItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional(propagation = Propagation.MANDATORY)
public interface BarRepository extends JpaRepository<BarItem, Long> {

    @Transactional(propagation = Propagation.MANDATORY)
    BarItem save(BarItem s);

}
