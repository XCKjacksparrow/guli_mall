package per.xck.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.xck.common.utils.PageUtils;
import per.xck.mall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author kazemi
 * @email 1367173922@qq.com
 * @date 2020-09-12 13:34:15
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

