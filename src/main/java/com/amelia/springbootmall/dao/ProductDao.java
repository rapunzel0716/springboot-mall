package com.amelia.springbootmall.dao;

import com.amelia.springbootmall.model.Product;
public interface ProductDao {
    Product getProductById(Integer productId);
}
