package per.xck.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.xck.common.utils.PageUtils;
import per.xck.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author kazemi
 * @email 1367173922@qq.com
 * @date 2020-09-12 13:41:18
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

