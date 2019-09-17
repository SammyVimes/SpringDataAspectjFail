package com.example.demo;

import net.example.demo.bar.BarConfig;
import net.example.demo.bar.inner.BarItem;
import net.example.demo.bar.inner.BarService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {DemoApplication.class, BarConfig.class})
public class BarTest {

    @Autowired
    private BarService barService;

    @Before
    public void setUp() throws Exception {
        barService.save(new BarItem());
    }

    @Test
    public void name() {
        List<BarItem> all = barService.findAll();
        System.out.println(all);
    }

}
