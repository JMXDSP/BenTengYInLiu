package org.springblade.douyin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("dsp_user")
public class DspUser implements Serializable {
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
	 * 视频地址 无码
	 */
	private String awemePlayVideoUrl;

	/**
	 * 视频地址 有码
	 */
	private String awemeDownloadVideoUrl;

	/**
	 * 视频封面
	 */
	private String awemeVideoCoverUrl;

	/**
	 * 作者id
	 */
	private String awemeAuthorUid;

	/**
	 * 作者名称
	 */
	private String awemeAuthorNickname;

	/**
	 * 作者签名
	 */
	private String awemeAuthorSignature;

	/**
	 *
	 */
	private String awemeAuthorFavortingCount;

	/**
	 *
	 */
	private String awemeAuthorTotalFavorited;

	/**
	 * 作者短id
	 */
	private String awemeAuthorShortId;

	/**
	 * 作者头像100*100
	 */
	private String awemeAuthorAvatarThumb;

	/**
	 * 作者头像720*720
	 */
	private String awemeAuthorAvatarMedium;

	/**
	 * 作者头像1080*1080
	 */
	private String awemeAuthorAvatarLarger;

	/**
	 * 作者粉丝
	 */
	private String awemeAuthorFollowingCount;

	/**
	 * 作者视频数
	 */
	private String awemeAuthorAwemeCount;

	/**
	 * 作者抖音id
	 */
	private String awemeAuthorUniqueId;

	/**
	 * 作者国家缩写
	 */
	private String awemeAuthorRegion;

	/**
	 * 评论数
	 */
	private String awemeStatisticsCommentCount;

	/**
	 * 点赞数
	 */
	private Integer awemeStatisticsDiggCount;

	/**
	 * 分享数
	 */
	private Integer awemeStatisticsShareCount;

	/**
	 * 转发数
	 */
	private Integer awemeStatisticsForwardCount;

	/**
	 *
	 */
	private Integer awemeStatisticsPlayCount;

	private String name;
}
