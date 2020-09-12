package per.xck.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.xck.common.utils.PageUtils;
import per.xck.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author kazemi
 * @email 1367173922@qq.com
 * @date 2020-09-12 08:59:57
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

