package com.gexingw.shop.product.service.interfaces;

import com.gexingw.shop.product.interfaces.feign.ProductFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * shop-cloud-ddd.
 *
 * @author GeXingW
 * @date 2023/11/12 13:41
 */
@Slf4j
@RestController
@RequestMapping("product")
public class ProductController implements ProductFeign {

    @Override
    @PostMapping("/{id}/decr-stock")
    public boolean decrStock(@PathVariable Long id) {
        log.info("Decr product stock: {}", id);
        return false;
    }

}
