package com.amelia.springbootmall.service.impl;

import com.amelia.springbootmall.dao.ProductDao;
import com.amelia.springbootmall.model.Product;
import com.amelia.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
