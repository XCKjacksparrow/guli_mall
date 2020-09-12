package per.xck.mall.product.dao;

import per.xck.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author kazemi
 * @email 1367173922@qq.com
 * @date 2020-09-12 08:59:56
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
