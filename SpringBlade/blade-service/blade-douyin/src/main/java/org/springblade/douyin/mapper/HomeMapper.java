package org.springblade.douyin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springblade.douyin.entity.Home;

import java.util.List;

public interface HomeMapper extends BaseMapper<Home> {
	List<Home> homeList();
}
