package org.springblade.douyin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springblade.douyin.entity.DspAweme;

import java.util.List;

public interface DspAwemeMapper extends BaseMapper<DspAweme> {

	List<DspAweme> dspAwemeList(String name);

	List<DspAweme> aspAwemeMusic(String name);

	List<DspAweme> homeDspAwemeList();

	List<DspAweme> homeDspAwemeMusic();
}
