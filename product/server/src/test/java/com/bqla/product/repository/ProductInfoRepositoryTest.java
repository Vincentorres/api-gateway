package com.bqla.product.repository;

import com.bqla.product.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {
    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void findProductInfosByProductStatus() throws Exception{
        List<ProductInfo> productInfos = productInfoRepository.findProductInfosByProductStatus(0);
        Assert.assertTrue(productInfos.size()>0);
    }
}