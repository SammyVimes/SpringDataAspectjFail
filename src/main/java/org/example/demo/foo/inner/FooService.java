package org.example.demo.foo.inner;

import org.example.demo.foo.repo.FooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class FooService {

    @Autowired
    private FooRepository repository;


    public List<FooItem> findAll() {
        return repository.findAll();
    }


    public FooItem save(FooItem s) {
        return repository.save(s);
    }

}
