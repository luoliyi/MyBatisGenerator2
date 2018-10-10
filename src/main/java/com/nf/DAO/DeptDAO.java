package com.nf.DAO;

import MyBatisUtils.MyBatisUtil;
import com.nf.Entities.Dept;
import com.nf.Entities.DeptExample;
import com.nf.mapper.DeptMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class DeptDAO implements DeptMapper {
    public int countByExample(DeptExample example) {
        return 0;
    }

    public int deleteByExample(DeptExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer deptid) {
        return 0;
    }

    public int insert(Dept record) {
        return 0;
    }

    public int insertSelective(Dept record) {
        return 0;
    }

    public List<Dept> selectByExample(DeptExample example) {
        SqlSession session=MyBatisUtil.openSqlSession(true);
        DeptMapper mapper=session.getMapper(DeptMapper.class);
        List<Dept> depts= mapper.selectByExample(example);
        return depts;
    }

    public Dept selectByPrimaryKey(Integer deptid) {
        return null;
    }

    public int updateByExampleSelective(Dept record, DeptExample example) {
        return 0;
    }

    public int updateByExample(Dept record, DeptExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(Dept record) {
        return 0;
    }

    public int updateByPrimaryKey(Dept record) {
        return 0;
    }
}
