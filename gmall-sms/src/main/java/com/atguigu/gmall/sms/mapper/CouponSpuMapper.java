package com.atguigu.gmall.sms.mapper;

import com.atguigu.gmall.sms.entity.CouponSpuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author xujinhai
 * @email xujinhai@qq.com
 * @date 2020-12-14 22:13:31
 */
@Mapper
public interface CouponSpuMapper extends BaseMapper<CouponSpuEntity> {
	
}
