package pro.sky.java.course2.bensnew.basket;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Goods {
    private final List<Integer> goods;

    public Goods() {
        this.goods = new ArrayList<>();
    }

    public List<Integer> getGoods() {
        return Collections.unmodifiableList(goods);
    }

    @Override
    public String toString() {
        return "Товар " +
                "номер = " + goods +
                '}';
    }

    public List<List<Integer>> addGood(List<Integer> id) {
        goods.addAll(id);
        return Collections.singletonList(id);
    }
}
