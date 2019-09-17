package com.example.demo;

import org.example.demo.foo.FooConfig;
import org.example.demo.foo.inner.FooItem;
import org.example.demo.foo.inner.FooService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {DemoApplication.class, FooConfig.class})
public class FooTest {

    @Autowired
    private FooService fooService;

    @Before
    public void setUp() throws Exception {
        fooService.save(new FooItem());
    }

    @Test
    public void name() {
        List<FooItem> all = fooService.findAll();
        System.out.println(all);
    }

}
