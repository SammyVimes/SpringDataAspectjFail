package net.example.demo.bar.inner;


import javax.persistence.*;

@Entity
@Table(name = "bar_item")
public class BarItem {

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
