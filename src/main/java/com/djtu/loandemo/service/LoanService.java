package com.djtu.loandemo.service;



import com.baomidou.mybatisplus.service.IService;
import com.djtu.loandemo.entity.LoanEntity;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author vwater
 * @since 2018-06-29
 */
public interface LoanService extends IService<LoanEntity> {

    boolean addLoadUser(Map map);
}

