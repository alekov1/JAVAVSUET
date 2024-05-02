package ru.vsuet.events.data.model;

import jakarta.persistence.*;
import java.util.Date;

@lombok.Data
@Entity
public class Data {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    @Column(unique = true)
    private String name;
    private Date createdAt;
    private String param;

    public Date getCreatedAt() {
        Date date = new Date();
        createdAt = date;
        return createdAt;
    }
}
