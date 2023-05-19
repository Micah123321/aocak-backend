package com.micah.aocakbackend.entity.dao;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 发布记录表
 *
 * @author micah
 * @email mxmicah@qq.com
 * @date 2023-05-09 17:32:00
 */
@Data
@ApiModel(value = "com.micah.aocakbackend.entity.ReleaseNotes发布记录表实体")
@Accessors(chain = true)
@TableName("release_notes")
public class ReleaseNotesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 发布记录ID
	 */
	@TableId
	@ApiModelProperty(value = "发布记录ID")
private Integer id;
	/**
	 * 软件ID
	 */
	@ApiModelProperty(value = "软件ID")
private Integer softwareId;
	/**
	 * 发布日期
	 */
	@ApiModelProperty(value = "发布日期")
private Date releaseDate;
	/**
	 * 发布公告
	 */
	@ApiModelProperty(value = "发布公告")
private String releaseNotes;
	/**
	 * 解决的问题
	 */
	@ApiModelProperty(value = "解决的问题")
private String issuesResolved;

}
