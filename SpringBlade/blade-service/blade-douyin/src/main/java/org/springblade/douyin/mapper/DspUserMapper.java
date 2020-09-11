package org.springblade.douyin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springblade.douyin.entity.DspUser;

import java.util.List;

public interface DspUserMapper extends BaseMapper<DspUser>{
//	@Select("select * from dsp_user where id = #{id}")
//	@Results({
//		@Result(property = "dsp_user", column = "aweme_desc")
//	})

//	List<DspUser> getDspById(Integer id);

	List<DspUser> dspUserList(String name);

}
