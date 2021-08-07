package com.nju.service;

import com.nju.entity.MymallRole;
import com.nju.mapper.MymallMapper;
import org.apache.ibatis.cursor.Cursor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.weekend.Weekend;

import java.util.List;

/**
 * @author maw-b
 * @date 2021/6/6 18:07
 */
@Service
public class MymallService {

    @Autowired
    private MymallMapper mymallMapper;

    public List<MymallRole> getRoles() {
        Weekend<MymallRole> mymallRoleMyWeekend = Weekend.of(MymallRole.class);
        Weekend<MymallRole> weekend = Weekend.of(MymallRole.class);
        weekend.weekendCriteria().andEqualTo(MymallRole::getId,1);
        //mymallMapper.updateByPrimaryKeySelective()
        return mymallMapper.selectByExample(weekend);
    }

}
