package com.zixin.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zixin.springbootinit.mapper.ChartMapper;
import com.zixin.springbootinit.model.entity.Chart;
import com.zixin.springbootinit.service.ChartService;
import org.springframework.stereotype.Service;

/**
* @author lenovo
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2023-12-03 14:23:35
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




