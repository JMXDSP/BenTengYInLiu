package org.springblade.douyin.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Home implements Serializable {
	/**
	 * 视频id
	 */
	private String awemeId;

	/**
	 * 视频名称
	 */
	private String awemeDesc;
}
