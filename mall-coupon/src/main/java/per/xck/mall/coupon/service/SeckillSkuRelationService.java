package per.xck.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.xck.common.utils.PageUtils;
import per.xck.mall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author kazemi
 * @email 1367173922@qq.com
 * @date 2020-09-12 13:28:56
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

