package net.example.demo.bar.inner;

import net.example.demo.bar.repo.BarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class BarService {

    @Autowired
    private BarRepository repository;


    public List<BarItem> findAll() {
        return repository.findAll();
    }

    public BarItem save(BarItem s) {
        return repository.save(s);
    }
}
