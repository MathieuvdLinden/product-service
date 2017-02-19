package com.sysapps.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Data
@NoArgsConstructor
@Table(value = "products")
public class Product {
    @PrimaryKey
    Long id;
    @Column("name")
    String name;
    @Column("description")
    String description;
    @Column("gtin")
    String gtin;

    public Product(Long id) {
        this.setId(id);
    }
}
