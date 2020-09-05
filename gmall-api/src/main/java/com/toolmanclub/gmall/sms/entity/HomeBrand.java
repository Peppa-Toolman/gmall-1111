package com.toolmanclub.gmall.sms.entity;

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
 * 首页推荐品牌表
 * </p>
 *
 * @author Yujie Wang
 * @since 2020-09-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sms_home_brand")
@ApiModel(value="HomeBrand对象", description="首页推荐品牌表")
public class HomeBrand implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("brand_id")
    private Long brandId;

    @TableField("brand_name")
    private String brandName;

    @TableField("recommend_status")
    private Integer recommendStatus;

    @TableField("sort")
    private Integer sort;


}
