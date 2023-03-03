package com.example.hanghaespring2myselectshop.dto;

import com.example.hanghaespring2myselectshop.entity.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ProductResponseDto {

    private Long id;
    private String title;
    private String link;
    private String image;
    private int lprice;
    private int myprcie;

    public ProductResponseDto(Product product){
        this.id = product.getId();
        this.title = product.getTitle();
        this.link = product.getLink();
        this.image = product.getImage();
        this.lprice = product.getLprice();
        this.myprcie = product.getMyprice();
    }

}
