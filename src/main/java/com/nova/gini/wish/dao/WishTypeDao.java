package com.nova.gini.wish.dao;

import org.springframework.data.repository.CrudRepository;

import com.nova.gini.wish.domain.WishType;

/**
 * Data access object for {@link WishType}, which <i>extends</i> {@link CrudRepository}. The CRUD
 * operations are handled by the Spring Data API, taking out the need to implement them
 */
public interface WishTypeDao
    extends
    CrudRepository<WishType, Long> {

}
