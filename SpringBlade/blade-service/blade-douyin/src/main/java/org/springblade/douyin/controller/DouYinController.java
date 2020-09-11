package org.springblade.douyin.controller;

import lombok.AllArgsConstructor;
import org.springblade.core.tool.api.R;
import org.springblade.douyin.entity.DspAweme;
import org.springblade.douyin.entity.DspUser;
import org.springblade.douyin.entity.Home;
import org.springblade.douyin.mapper.DspAwemeMapper;
import org.springblade.douyin.mapper.DspUserMapper;
import org.springblade.douyin.mapper.HomeMapper;
import org.springblade.douyin.service.DspAwemeService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("douyin")
@AllArgsConstructor
public class DouYinController {

	private DspAwemeService dspAwemeService;
	private DspAwemeMapper dspAwemeMapper;
	private DspUserMapper dspUserMapper;
	private HomeMapper homeMapper;

//	@GetMapping("info")
//	@Cacheable(cacheNames =  "douyin-info", key = "#name") // redis 缓存
//	public String info(String name){
//		return "test" + name;
//	}

	@GetMapping("aweme/info")
	public R<DspAweme> detail(Integer id){
		DspAweme detail = dspAwemeService.getById(id);
		return R.data(detail);
	}

	@GetMapping("aweme/list")
	public R<List<DspAweme>> dspAwemeList(String name){
		return R.data(dspAwemeMapper.dspAwemeList(name));
	}

//	@GetMapping("aweme/user")
//	public R<List<DspUser>> dspUser(Integer id){
//		return R.data(dspUserMapper.getDspById(id));
//	}

	@GetMapping("aweme/home/list")
	public R<List<Home>> homeList(){
		return R.data(homeMapper.homeList());
	}

	@GetMapping("home/aweme/list")
	public R<List<DspAweme>> homeAwemeList(){
		return R.data(dspAwemeMapper.homeDspAwemeList());
	}

	@GetMapping("home/aweme/music")
	public R<List<DspAweme>> homeAwemeMusic(){
		return R.data(dspAwemeMapper.homeDspAwemeMusic());
	}

	@GetMapping("user/list")
	public R<List<DspUser>> dspUserList(String name){
		return R.data(dspUserMapper.dspUserList(name));
	}

	@GetMapping("music/list")
	public R<List<DspAweme>> aspAwemeMusic(String name){
		return R.data(dspAwemeMapper.aspAwemeMusic(name));
	}
}
