package com.zixin.springbootinit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zixin.springbootinit.model.entity.Chart;

import java.util.List;
import java.util.Map;

/**
* @author lenovo
* @description 针对表【chart(图表信息表)】的数据库操作Mapper
* @createDate 2023-12-03 14:23:35
* @Entity com.zixin.springbootinit.model.entity.Chart
*/
public interface ChartMapper extends BaseMapper<Chart> {

    List<Map<String,Object>> queryChartData(String querySql);

}




