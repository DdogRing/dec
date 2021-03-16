package com.ddogring.dec.service;

import com.ddogring.dec.entity.SpecialColumn;

import java.util.List;

/**
 * @author DdogRing
 * @date 2021/3/16 13:17
 * @description 专栏业务层
 */
public interface SpecialColumnService {

    int remove(Integer id);

    int add(SpecialColumn record);

    SpecialColumn get(Integer id);

    int modify(SpecialColumn record);

    List<SpecialColumn> specialColumnList();

}
