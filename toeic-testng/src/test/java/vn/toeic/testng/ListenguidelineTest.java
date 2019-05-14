package vn.toeic.testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import vn.toeic.core.dao.ListenGuidelineDao;
import vn.toeic.core.daoimpl.ListenGuidelineDaoImpl;

import java.util.HashMap;
import java.util.Map;

public class ListenguidelineTest {
    ListenGuidelineDao listenGuidelineDao;
    @BeforeTest
    public  void  initData(){
        listenGuidelineDao = new ListenGuidelineDaoImpl();
    }
    @Test
    public void testFindByProperties(){


    }


    @Test
    public void checkApiFindByProperties(){
        Map<String,Object> property = new HashMap<String, Object>();
        property.put("title","Bài hướng dẫn 8");
        property.put("content","Nội dung bài hướng dẫn 8");
        Object[] objects = listenGuidelineDao.findByProperty(property,null,null,null,null);
    }
}
