package com.bqla.product.repository;

import com.bqla.product.ProductApplicationTests;
import com.bqla.product.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ProductCategoryRepositoryTest extends ProductApplicationTests {

    @Autowired
    ProductCategoryRepository productCategoryRepository;

    @Test
    public void findByCategoryTypeIn(){
        List<ProductCategory> list = productCategoryRepository.findByCategoryTypeIn(Arrays.asList(11,12));
        Assert.assertTrue(list.size()>0);
    }

}