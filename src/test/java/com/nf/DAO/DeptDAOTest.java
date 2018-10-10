package com.nf.DAO;

import com.nf.Entities.Dept;
import com.nf.Entities.DeptExample;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.DATA_CONVERSION;

import java.util.List;

import static org.junit.Assert.*;

public class DeptDAOTest {
    DeptDAO dao=null;

    @Before
    public void  before(){dao=new DeptDAO();}

    @Test
    public void selectByExample() {

        List<Dept> depts=dao.selectByExample(new DeptExample());
        System.out.println(depts);
    }
}