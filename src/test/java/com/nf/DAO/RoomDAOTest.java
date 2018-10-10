package com.nf.DAO;

import com.nf.Entities.Room;
import com.nf.Entities.RoomExample;
import com.nf.mapper.RoomMapper;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RoomDAOTest {

    RoomMapper dao=null;
    @Before
    public void  before(){
        dao=new RoomDAO();
    }

    @Test
    public void selectByExample() {
        List<Room> rooms=dao.selectByExample(new RoomExample());
        System.out.println(rooms);
    }

    @Test
    public void selectByPrimaryKey(){
        Room room=dao.selectByPrimaryKey(3);
        System.out.println(room);
    }


    @Test
    public void selectByExample2(){
        RoomExample roomExample=new RoomExample();
        //范围
        roomExample.createCriteria().andRidBetween(1,4);
        List<Room> rooms=dao.selectByExample(roomExample);
        System.out.println(rooms);
    }

    @Test
    public void selectByExample3(){
        RoomExample roomExample=new RoomExample();
        //范围
        roomExample.createCriteria().andRidBetween(5,16).andTidIsNotNull();
        List<Room> rooms=dao.selectByExample(roomExample);
        System.out.println(rooms);
    }

    @Test
    public void selectByExample4(){
        RoomExample roomExample=new RoomExample();
        //范围
        roomExample.createCriteria().andRbednumberNotBetween((byte)2,(byte)3);
        List<Room> rooms=dao.selectByExample(roomExample);
        System.out.println(rooms);
    }

    @Test
    public void insert(){
        Room room1=new Room("总统套房3",(byte)2,(BigDecimal.valueOf( 900.9)),3);
        System.out.println(room1.toString());
        int result=dao.insert(room1);
        System.out.println("固定参数添加:"+result);
        Room room2=new Room("总统套房3", (byte) 0,(BigDecimal.valueOf( 900)),3);
        int result1=dao.insertSelective(room2);
        System.out.println("动态参数添加："+result1);
    }

    @Test
    public void update(){
        Room room=new Room(27,"makwehauw",(byte)2,(BigDecimal.valueOf( 1333)),3);
        int re=dao.updateByPrimaryKey(room);
        System.out.println("修改："+re);
    }

    @Test
    public void updateactive(){
        Room room=new Room(27,"jiajwe",(byte)0,(BigDecimal.valueOf( 1333)),3);
        int re=dao.updateByPrimaryKeySelective(room);
        System.out.println("修改："+re);
    }

    @Test
    public void  delete(){
        int re=dao.deleteByPrimaryKey(27);
        System.out.println("删除："+re);
    }
}