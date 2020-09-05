package com.toolmanclub.gmall.pms.service.impl;

import com.toolmanclub.gmall.pms.entity.Product;
import com.toolmanclub.gmall.pms.mapper.ProductMapper;
import com.toolmanclub.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author Yujie Wang
 * @since 2020-09-05
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
