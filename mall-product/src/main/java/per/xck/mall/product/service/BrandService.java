package per.xck.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.xck.common.utils.PageUtils;
import per.xck.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author kazemi
 * @email 1367173922@qq.com
 * @date 2020-09-12 08:59:57
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

