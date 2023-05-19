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
 * 软件信息表
 *
 * @author micah
 * @email mxmicah@qq.com
 * @date 2023-05-09 17:32:00
 */
@Data
@ApiModel(value = "com.micah.aocakbackend.entity.Software软件信息表实体")
@Accessors(chain = true)
@TableName("software")
public class SoftwareEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 软件ID
	 */
	@TableId
	@ApiModelProperty(value = "软件ID")
private Integer id;
	/**
	 * 软件名称
	 */
	@ApiModelProperty(value = "软件名称")
private String name;
	/**
	 * 软件版本号
	 */
	@ApiModelProperty(value = "软件版本号")
private String version;
	/**
	 * 软件下载地址
	 */
	@ApiModelProperty(value = "软件下载地址")
private String downloadUrl;
	/**
	 * 软件作者
	 */
	@ApiModelProperty(value = "软件作者")
private String author;

}
