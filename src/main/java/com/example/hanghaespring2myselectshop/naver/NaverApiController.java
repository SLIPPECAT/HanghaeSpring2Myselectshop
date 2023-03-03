package com.example.hanghaespring2myselectshop.naver;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class NaverApiController {

    private final NaverApiService naverApiService;

    //List<ItemDto>는 Json으로 반환되는 것인가?
    @GetMapping("/search")
    // ?query=
    public List<ItemDto> searchItems(@RequestParam String query){
        return naverApiService.searchItems(query);
    }
}
