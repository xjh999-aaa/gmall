package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xujinhai
 * @email xujinhai@qq.com
 * @date 2020-12-14 20:55:59
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {
	
}
