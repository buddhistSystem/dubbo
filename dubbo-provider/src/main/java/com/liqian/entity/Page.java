/**
 * @Title: Pages.java
 * @Package com.gx.erp.entity
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: 杭州国鑫信息科技
 * @date: 2018年8月7日 上午10:29:15
 * @version V1.0
 * @Copyright: 2018
 * 注意：本内容仅限于杭州国信信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
package com.liqian.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Page {

    private Integer createUser;

    private Date createTime;

    private Integer updateUser;

    private Date updateTime;

    private Integer page;

    private Integer rows;

    private Integer start;

    private String startDate;// 开始时间,数据操作相关

    private String endDate;// 结束时间,数据操作相关

    private Long orgNo;//组织架构id

    public Integer getStart() {
        if (page == null || "".equals(page)) {
            return start;
        }
        if (page == 0) {
            page = 1;
        }
        start = (page - 1) * rows;
        return start;
    }

}
