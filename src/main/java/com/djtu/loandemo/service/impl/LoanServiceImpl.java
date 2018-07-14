package com.djtu.loandemo.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.djtu.loandemo.entity.LoanEntity;
import com.djtu.loandemo.mapper.LoanMapper;
import com.djtu.loandemo.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author vwater
 * @since 2018-06-29
 */
@Service
@Transactional(readOnly = true)
public class LoanServiceImpl extends ServiceImpl<LoanMapper, LoanEntity> implements LoanService {

   @Autowired
   private LoanMapper loadMapper;

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public boolean addLoadUser(Map map) {
        return loadMapper.insertLoanUser(map);
    }
}
