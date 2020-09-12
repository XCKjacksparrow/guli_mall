package per.xck.mall.order.dao;

import per.xck.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author kazemi
 * @email 1367173922@qq.com
 * @date 2020-09-12 13:41:18
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
