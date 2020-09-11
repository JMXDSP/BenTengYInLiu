package org.springblade.douyin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("dsp_aweme")
public class DspAweme implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;

	/**
	 * 视频id
	 */
	private String awemeId;

	/**
	 * 视频名称
	 */
	private String awemeDesc;

	/**
	 * 视频类型
	 */
	private String awemeType;

	/**
	 * 视频时长
	 */
	private String awemeDuration;

	/**
	 * 视频发布者id
	 */
	private String awemeAuthorUserId;

	/**
	 * 视频发布者id
	 */
	private String awemeAuthorUid;

	/**
	 * 视频发布者抖音号
	 */
	private String awemeAuthorUniqueId;

	/**
	 * 视频发布者名称
	 */
	private String awemeAuthorNickname;

	/**
	 * 视频发布者签名
	 */
	private String awemeAuthorSignature;

	/**
	 *
	 */
	private String awemeAuthorShortId;

	/**
	 * 视频发布者头像 100*100
	 */
	private String awemeAuthorAvatarThumb;

	/**
	 * 视频发布者头像 720*720
	 */
	private String awemeAuthorAvatarMedium;

	/**
	 * 视频发布者头像 1080*1080
	 */
	private String awemeAuthorLarger;

	/**
	 * 音乐名称
	 */
	private String awemeMusicTitle;

	/**
	 * 音乐发布者
	 */
	private String awemeMusicAuthor;

	/**
	 * 音乐地址
	 */
	private String awemeMusicUrl;

	/**
	 * 音乐id
	 */
	private String awemeMusicId;

	/**
	 *
	 */
	private String awemeMusicMid;

	/**
	 * 音乐时长
	 */
	private String awemeMusicDuration;

	/**
	 * 音乐发布者头像 100*100
	 */
	private String awemeMusicCoverThumb;

	/**
	 * 音乐发布者头像 1080*1080
	 */
	private String awemeMusicCoverLarge;

	/**
	 * 音乐发布者头像 720*720
	 */
	private String awemeMusicCoverMedium;

	/**
	 * 音乐发布者头像 1080*1080
	 */
	private String awemeMusicCoverHd;

	/**
	 * 音乐状态
	 */
	private String awemeMusicStatus;

	/**
	 * 视频时长
	 */
	private String awemeVideoDuration;

	/**
	 * 视频 有码
	 */
	private String awemeVideoPayAddrUrl;

	/**
	 * 视频图片
	 */
	private String awemeVideoCover;

	/**
	 * 视频动态图片
	 */
	private String awemeVideoDynamicCover;

	/**
	 * 视频图片原图
	 */
	private String awemeVideoOriginCover;

	/**
	 *
	 */
	private String awemeVideoVid;

	/**
	 * 视频分享地址
	 */
	private String awemeVideUrl;

	/**
	 * 视频评论数
	 */
	private Integer awemeStatisticsCommentCount;

	/**
	 * 视频点赞数
	 */
	private Integer awemeStatisticsDiggCount;

	/**
	 * 视频发布时间
	 */
	private String awemeCreateTime;

	private Integer con;
}
