package com.nova.gini.wish;

import java.util.List;

import com.nova.gini.wish.domain.WishType;

/**
 * The interface provides services for {@link WishType}
 *
 */
public interface WishTypeService {

    /**
     * Retrives all the {@link WishType} if available
     *
     * @return Return list of {@link WishType}
     */
    List<WishType> getAll();
}
