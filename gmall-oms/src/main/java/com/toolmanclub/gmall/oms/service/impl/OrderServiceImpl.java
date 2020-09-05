package com.toolmanclub.gmall.oms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.toolmanclub.gmall.oms.entity.Order;
import com.toolmanclub.gmall.oms.mapper.OrderMapper;
import com.toolmanclub.gmall.oms.service.OrderService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Yujie Wang
 * @since 2020-09-05
 */
@Service
@Component
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
