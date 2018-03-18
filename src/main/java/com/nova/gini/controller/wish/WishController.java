package com.nova.gini.controller.wish;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nova.gini.wish.WishTypeService;
import com.nova.gini.wish.domain.WishType;

@RestController
@RequestMapping("/rest")
public class WishController {

    @Autowired
    private WishTypeService wishTypeService;

    @RequestMapping(method = RequestMethod.GET, value = "/wishtype")
    public List<WishType> getAllWishTypes() {

        return wishTypeService.getAll();
    }
}
