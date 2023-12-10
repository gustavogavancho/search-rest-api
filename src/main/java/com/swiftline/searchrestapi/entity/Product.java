package com.swiftline.searchrestapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "sk")
    private String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "product_description")
    private String productDescription;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "imageUrl")
    private String imageUrl;

    @Column(name = "date_created")
    @CreationTimestamp
    private LocalDateTime dateCreated;

    @Column(name = "date_updated")
    @CreationTimestamp
    private LocalDateTime dateUpdated;
}
