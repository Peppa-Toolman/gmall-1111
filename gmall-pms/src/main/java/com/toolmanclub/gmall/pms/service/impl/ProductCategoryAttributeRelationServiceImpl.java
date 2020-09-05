package com.toolmanclub.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.toolmanclub.gmall.pms.entity.ProductCategoryAttributeRelation;
import com.toolmanclub.gmall.pms.mapper.ProductCategoryAttributeRelationMapper;
import com.toolmanclub.gmall.pms.service.ProductCategoryAttributeRelationService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品的分类和属性的关系表，用于设置分类筛选条件 服务实现类
 * </p>
 *
 * @author Yujie Wang
 * @since 2020-09-05
 */
@Service
public class ProductCategoryAttributeRelationServiceImpl extends ServiceImpl<ProductCategoryAttributeRelationMapper, ProductCategoryAttributeRelation> implements ProductCategoryAttributeRelationService {

}
