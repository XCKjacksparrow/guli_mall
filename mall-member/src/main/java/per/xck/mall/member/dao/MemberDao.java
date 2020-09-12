package per.xck.mall.member.dao;

import per.xck.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author kazemi
 * @email 1367173922@qq.com
 * @date 2020-09-12 13:34:15
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
