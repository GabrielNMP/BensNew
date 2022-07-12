package pro.sky.java.course2.bensnew.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GoodsService {

    List<List<Integer>> addGoods(List<Integer> id);
    List<Integer> getGoods();
}
