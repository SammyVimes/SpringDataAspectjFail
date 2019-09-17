package org.example.demo.foo.inner;

import javax.persistence.*;

@Entity
@Table(name= "foo_item")
public class FooItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
