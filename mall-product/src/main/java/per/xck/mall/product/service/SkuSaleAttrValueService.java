package per.xck.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.xck.common.utils.PageUtils;
import per.xck.mall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author kazemi
 * @email 1367173922@qq.com
 * @date 2020-09-12 08:59:56
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

