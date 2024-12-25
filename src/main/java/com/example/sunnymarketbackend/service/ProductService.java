package com.example.sunnymarketbackend.service;

import com.example.sunnymarketbackend.constant.ProductCategory;
import com.example.sunnymarketbackend.entity.Product;
import com.example.sunnymarketbackend.dto.ProductRequest;
import com.github.pagehelper.PageInfo;

public interface ProductService {

    PageInfo<Product> getAllProductsWithPaginationNew(Integer pageNum,
                                                      Integer pageSize,
                                                      ProductCategory category,
                                                      String sort,
                                                      String order);

    Long addProduct(ProductRequest productRequest);

    Product getProductById(Long productId);

    void updateProduct(Long productId, ProductRequest productRequest);

    void deleteProductById(Long productId);

}
