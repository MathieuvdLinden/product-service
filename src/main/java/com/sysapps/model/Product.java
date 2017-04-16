package com.sysapps.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import java.util.Date;

@Data
@NoArgsConstructor
@Table(value = "products")
public class Product {

    @Column("brand")
    private String brand;
    @Column("gtin")
    private String gtin;
    @Column("leveranciers_artikelnr")
    private String supplierNumber;
    @Column("catalogusnr")
    private String catalogNumber;
    @PrimaryKey
    private Long id;
    @Column("kenmerk_1")
    private String label_1;
    @Column("kenmerk_2")
    private String label_2;
    @Column("kenmerk_3")
    private String label_3;
    @Column("ah_category")
    private String category;
    @Column("ah_subcategory")
    private String subCategory;
    @Column("ah_productcategory")
    private String productCategory;
    @Column("ah_productgroup")
    private String productGroup;
    @Column("product_title")
    private String productTitle;
    @Column("availability")
    private String available;
    @Column("condition")
    private String condition;
    @Column("price")
    private Float price;
    @Column("bonus")
    private String bonus;
    @Column("description")
    private String name;
    @Column("link")
    private String link;
    @Column("type_korting")
    private String discountType;
    @Column("sales_price")
    private Float salesPrice;
    @Column("sales_price_effective_date")
    private Date salesPriceEffectiveDate;
    @Column("sales_price_end_date")
    private Date salesPriceEndDate;
    @Column("hoeveelheid")
    private String QuantityDescription;
    @Column("inhoud_en_gewicht")
    private String measurements;
    @Column("image_link")
    private String imageLink;
    @Column("identifier_exists")
    private boolean identifierExists;
    @Column("ah_category_url")
    private String categoryUrl;
    @Column("ah_subcategory_url")
    private String subCategoryUrl;
    @Column("ah_productcategory_url")
    private String productCategoryUrl;
    @Column("ah_productgroup_url")
    private String productGroupUrl;
    @Column("ah_category_merk_url")
    private String categoryBrandUrl;
    @Column("ah_subcategory_merk_url")
    private String subCategoryBrandUrl;
    @Column("ah_productcategory_merk_url")
    private String productCategoryBrandUrl;
    @Column("ah_productgroup_merk_url")
    private String productGroupBrandUrl;

    public Product(Long id) {
        this.setId(id);
    }
}
