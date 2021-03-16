package com.ddogring.dec.mapper;

import com.ddogring.dec.entity.SpecialColumn;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpecialColumnMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SpecialColumn record);

    int insertSelective(SpecialColumn record);

    SpecialColumn selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpecialColumn record);

    int updateByPrimaryKey(SpecialColumn record);

    List<SpecialColumn> selectSpecialColumnList();

}