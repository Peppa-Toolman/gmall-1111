package com.toolmanclub.gmall.oms.service.impl;

import com.toolmanclub.gmall.oms.entity.OrderItem;
import com.toolmanclub.gmall.oms.mapper.OrderItemMapper;
import com.toolmanclub.gmall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author Yujie Wang
 * @since 2020-09-05
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
