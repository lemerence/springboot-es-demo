package com.demo;

import com.demo.dao.PersonEsDao;
import com.demo.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: YST
 * @Date: 2021/12/7 2:22
 * @Version: 1.0
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class EsTest {

    @Autowired
    PersonEsDao personEsDao;

    @Test
    public void findAll(){
        Iterable<Person> all = personEsDao.findAll();

        System.out.println(all);
    }

}
