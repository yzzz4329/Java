package com.yj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 品牌实体类
 */
@Data
//@Data	等价于 @Setter、@Getter、@RequiredArgsConstructor、@ToString、@Equals And HashCode
@NoArgsConstructor
@AllArgsConstructor
public class Brand {
    // id 主键
    private Integer id;
    // 品牌名称
    private String brandName;
    // 企业名称
    private String companyName;
    // 排序字段
    private Integer ordered;
    // 描述信息
    private String description;
    // 状态：0：禁用  1：启用
    private Integer status;

}
