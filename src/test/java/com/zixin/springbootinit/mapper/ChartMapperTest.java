package com.zixin.springbootinit.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@SpringBootTest
class ChartMapperTest {

    @Resource
    private ChartMapper chartMapper;
    @Test
    void queryChartData() {
        String querySql = "select * from chart";
        List<Map<String,Object> > resultData = chartMapper.queryChartData(querySql);
        System.out.println(resultData);
    }
}