package pro.sky.java.course2.bensnew.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.bensnew.service.GoodsService;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/order")
public class GoodsController {

    private final GoodsService goodsService;

    public GoodsController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }
    @GetMapping("/add")
    public List<List<Integer>> addGoods (@RequestParam Integer id) {
        return goodsService.addGoods(Collections.singletonList(id));
    }
    @GetMapping("/get")
    public List<Integer> getGoods(){
        return goodsService.getGoods();
    }



}
