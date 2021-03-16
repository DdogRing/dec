package com.ddogring.dec.service;

import com.ddogring.dec.entity.SpecialColumn;
import com.ddogring.dec.mapper.SpecialColumnMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DdogRing
 * @date 2021/3/16 13:18
 * @description
 */
@Service
public class SpecialColumnServiceImpl implements SpecialColumnService {

    @Autowired
    private SpecialColumnMapper specialColumnMapper;

    @Override
    public int remove(Integer id) {
        return specialColumnMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int add(SpecialColumn specialColumn) {
        return specialColumnMapper.insertSelective(specialColumn);
    }

    @Override
    public SpecialColumn get(Integer id) {
        return specialColumnMapper.selectByPrimaryKey(id);
    }

    @Override
    public int modify(SpecialColumn specialColumn) {
        return specialColumnMapper.updateByPrimaryKeySelective(specialColumn);
    }

    @Override
    public List<SpecialColumn> specialColumnList() {
        return specialColumnMapper.selectSpecialColumnList();
    }
}
