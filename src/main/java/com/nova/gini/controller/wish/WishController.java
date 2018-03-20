package com.nova.gini.controller.wish;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nova.gini.wish.domain.WishType;

@RestController
@RequestMapping("/rest")
public class WishController {

    // @Autowired
    // private WishTypeService wishTypeService;

    private static Long nextId;

    private static Map<Long, WishType> wishTypes;

    private static WishType save(WishType wishType) {

        if (wishTypes == null) {
            wishTypes = new HashMap<Long, WishType>();
            nextId = 1L;
        }
        wishType.setId(nextId);
        wishTypes.put(wishType.getId(), wishType);
        nextId = nextId + 1;

        return wishType;
    }

    static {
        WishType financialWishType = new WishType();
        financialWishType.setName("Financial");
        financialWishType.setDescription("Financial Wish");
        save(financialWishType);

        WishType skillWishType = new WishType();
        skillWishType.setName("Skill");
        skillWishType.setDescription("Skill Wish");
        save(skillWishType);
    }

    @RequestMapping(value = "/wishtype", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<WishType>> getAllWishTypes() {

        // Collection<WishType> wishTypes = wishTypeService.getAll();
        //
        // return new ResponseEntity<Collection<WishType>>(wishTypes, HttpStatus.OK);

        Collection<WishType> responseWishTypes = wishTypes.values();

        return new ResponseEntity<Collection<WishType>>(responseWishTypes, HttpStatus.OK);
    }
}
