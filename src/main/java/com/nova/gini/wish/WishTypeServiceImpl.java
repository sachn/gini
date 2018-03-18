package com.nova.gini.wish;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nova.gini.wish.dao.WishTypeDao;
import com.nova.gini.wish.domain.WishType;

/**
 * Provides services for {@link WishType}
 */
public class WishTypeServiceImpl
    implements
    WishTypeService {

    @Autowired
    private WishTypeDao wishTypeDao;

    @Override
    public List<WishType> getAll() {

        List<WishType> wishTypes = new ArrayList<>();

        // route the call to the DAO/Repository to get the wishTypes and add it to the List
        wishTypeDao.findAll()
            .forEach(wishTypes::add);

        return wishTypes;
    }

}
