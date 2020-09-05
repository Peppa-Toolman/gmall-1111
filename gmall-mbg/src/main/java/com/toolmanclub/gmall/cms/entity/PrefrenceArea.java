package com.toolmanclub.gmall.cms.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 优选专区
 * </p>
 *
 * @author Yujie Wang
 * @since 2020-09-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("cms_prefrence_area")
@ApiModel(value="PrefrenceArea对象", description="优选专区")
public class PrefrenceArea implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;

    @TableField("sub_title")
    private String subTitle;

    @ApiModelProperty(value = "展示图片")
    @TableField("pic")
    private byte[] pic;

    @TableField("sort")
    private Integer sort;

    @TableField("show_status")
    private Integer showStatus;


}
