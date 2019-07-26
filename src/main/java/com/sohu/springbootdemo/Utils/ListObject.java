package com.sohu.springbootdemo.Utils;


import com.sohu.springbootdemo.POJO.PNewsCtJson;

import java.util.List;

/**
 * @author haochen
 * @date 2019/4/2 3:21 PM
 */
public class ListObject extends PNewsCtJson {
    private List<?> items;

    public List<?> getItems() {
        return items;
    }

    public void setItems(List<?> items) {
        this.items = items;
    }
}
