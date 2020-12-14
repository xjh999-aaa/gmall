package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.pms.entity.SkuEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author xujinhai
 * @email xujinhai@qq.com
 * @date 2020-12-14 20:28:46
 */
public interface SkuService extends IService<SkuEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

