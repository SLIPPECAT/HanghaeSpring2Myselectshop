package com.example.hanghaespring2myselectshop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequestDto {
    // 관심상품 관련
    private String title;
    private String image;
    private String link;
    private int lprice;
}
