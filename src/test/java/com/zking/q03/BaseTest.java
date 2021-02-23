package com.zking.q03;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Q03Application.class)//App.class指的是springboot的起动类
//@WebAppConfiguration//可选的，测试service可以不需要
public class BaseTest {

}