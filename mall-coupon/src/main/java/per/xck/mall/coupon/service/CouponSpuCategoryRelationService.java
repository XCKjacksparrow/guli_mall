package per.xck.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.xck.common.utils.PageUtils;
import per.xck.mall.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author kazemi
 * @email 1367173922@qq.com
 * @date 2020-09-12 13:28:57
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

