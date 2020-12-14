package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;

import com.atguigu.gmall.pms.mapper.OrderReturnReasonMapper;
import com.atguigu.gmall.pms.entity.OrderReturnReasonEntity;
import com.atguigu.gmall.pms.service.OrderReturnReasonService;


@Service("orderReturnReasonService")
public class OrderReturnReasonServiceImpl extends ServiceImpl<OrderReturnReasonMapper, OrderReturnReasonEntity> implements OrderReturnReasonService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<OrderReturnReasonEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<OrderReturnReasonEntity>()
        );

        return new PageResultVo(page);
    }

}