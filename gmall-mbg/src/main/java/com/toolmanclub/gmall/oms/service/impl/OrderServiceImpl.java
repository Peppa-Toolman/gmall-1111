package com.toolmanclub.gmall.oms.service.impl;

import com.toolmanclub.gmall.oms.entity.Order;
import com.toolmanclub.gmall.oms.mapper.OrderMapper;
import com.toolmanclub.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Yujie Wang
 * @since 2020-09-05
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
