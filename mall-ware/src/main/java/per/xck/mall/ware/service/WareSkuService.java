package per.xck.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.xck.common.utils.PageUtils;
import per.xck.mall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author kazemi
 * @email 1367173922@qq.com
 * @date 2020-09-12 13:45:01
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

