package com.djtu.loandemo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.djtu.loandemo.entity.LoanEntity;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author vwater
 * @since 2018-06-29
 */
@Repository
public interface LoanMapper extends BaseMapper<LoanEntity> {

    boolean insertLoanUser(Map map);
}
