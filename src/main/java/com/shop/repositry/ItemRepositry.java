package com.shop.repositry;

import com.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepositry extends JpaRepository <Item,Long>{

    List<Item> findByItemName(String itemName);

    List<Item> findByItemNameOrItemDetail(String itemName, String itemDetail);

}
