package com.nova.gini.wish;

import static org.easymock.EasyMock.expect;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import com.nova.gini.wish.dao.WishTypeDao;
import com.nova.gini.wish.domain.WishType;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(EasyMockRunner.class)
public class WishTypeServiceImplTest {

    @Mock
    private WishTypeDao wishTypeDaoMock;

    @TestSubject
    private WishTypeService wishTypeService = new WishTypeServiceImpl();

    @Test
    public void testGetAllWishTypesNoWishType() {

        expect(wishTypeDaoMock.findAll()).andReturn(createWishTypes(0));
        EasyMock.replay(wishTypeDaoMock);

        List<WishType> wishTypes = wishTypeService.getAll();
        EasyMock.verify(wishTypeDaoMock);

        assertEquals(0, wishTypes.size());
    }

    @Test
    public void testGetAllWishTypesOneWishTypes() {

        expect(wishTypeDaoMock.findAll()).andReturn(createWishTypes(1));
        EasyMock.replay(wishTypeDaoMock);

        List<WishType> wishTypes = wishTypeService.getAll();
        EasyMock.verify(wishTypeDaoMock);

        assertEquals(1, wishTypes.size());
    }

    @Test
    public void testGetAllWishTypesTwoWishTypes() {

        expect(wishTypeDaoMock.findAll()).andReturn(createWishTypes(2));
        EasyMock.replay(wishTypeDaoMock);

        List<WishType> wishTypes = wishTypeService.getAll();
        EasyMock.verify(wishTypeDaoMock);

        assertEquals(2, wishTypes.size());
    }

    private List<WishType> createWishTypes(int number) {

        int count = 0;
        List<WishType> wishTypes = new ArrayList<>();

        while (count < number) {
            wishTypes.add(new WishType());
            count++;
        }

        return wishTypes;
    }
}
