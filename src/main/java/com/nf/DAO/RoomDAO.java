package com.nf.DAO;

import MyBatisUtils.MyBatisUtil;
import com.nf.Entities.Room;
import com.nf.Entities.RoomExample;
import com.nf.mapper.DeptMapper;
import com.nf.mapper.RoomMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class RoomDAO  implements RoomMapper {
    public int countByExample(RoomExample example) {
        return 0;
    }

    public int deleteByExample(RoomExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer rid) {
        SqlSession session=MyBatisUtil.openSqlSession(true);
        RoomMapper mapper=session.getMapper(RoomMapper.class);
        int result=mapper.deleteByPrimaryKey(rid);
        return result;
    }

    public int insert(Room record) {
        SqlSession session=MyBatisUtil.openSqlSession(true);
        RoomMapper mapper=session.getMapper(RoomMapper.class);
        int result=mapper.insert(record);
        return result;
    }

    public int insertSelective(Room record) {
        SqlSession session=MyBatisUtil.openSqlSession(true);
        RoomMapper mapper=session.getMapper(RoomMapper.class);
        int result=mapper.insertSelective(record);
        return result;
    }

    public List<Room> selectByExample(RoomExample example) {
        SqlSession session=MyBatisUtil.openSqlSession(true);
        RoomMapper mapper=session.getMapper(RoomMapper.class);
        List<Room> rooms=mapper.selectByExample(example);
        return rooms;
    }

    public Room selectByPrimaryKey(Integer rid) {
        SqlSession session=MyBatisUtil.openSqlSession(true);
        RoomMapper mapper=session.getMapper(RoomMapper.class);
        Room room=mapper.selectByPrimaryKey(rid);
        return room;
    }

    public int updateByExampleSelective(Room record, RoomExample example) {
        return 0;
    }

    public int updateByExample(Room record, RoomExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(Room record) {
        SqlSession session=MyBatisUtil.openSqlSession(true);
        RoomMapper mapper=session.getMapper(RoomMapper.class);
        int r=mapper.updateByPrimaryKeySelective(record);
        return r;
    }

    public int updateByPrimaryKey(Room record) {
        SqlSession session=MyBatisUtil.openSqlSession(true);
        RoomMapper mapper=session.getMapper(RoomMapper.class);
        int r=mapper.updateByPrimaryKey(record);
        return r;
    }
}
