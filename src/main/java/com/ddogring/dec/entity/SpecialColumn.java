package com.ddogring.dec.entity;

import java.io.Serializable;
import java.util.Date;

public class SpecialColumn implements Serializable {
    /**
     * 专栏id
	 * 2021-03-16T10:58:15.206
     */
    private Integer id;

    /**
     * 专栏名称
	 * 2021-03-16T10:58:15.206
     */
    private String specialColumnName;

    /**
     * 是否启用(0否 1是)
	 * 2021-03-16T10:58:15.206
     */
    private Boolean isEnable;

    /**
     * 创建时间
	 * 2021-03-16T10:58:15.206
     */
    private Date createTime;

    /**
     * 更新时间
	 * 2021-03-16T10:58:15.206
     */
    private Date updTime;

    /**
    
	 * 2021-03-16T10:58:15.206
     */
    private static final long serialVersionUID = 1L;

    /**
     * 专栏id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 专栏id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 专栏名称
     */
    public String getSpecialColumnName() {
        return specialColumnName;
    }

    /**
     * 专栏名称
     */
    public void setSpecialColumnName(String specialColumnName) {
        this.specialColumnName = specialColumnName == null ? null : specialColumnName.trim();
    }

    /**
     * 是否启用(0否 1是)
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    /**
     * 是否启用(0否 1是)
     */
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     */
    public Date getUpdTime() {
        return updTime;
    }

    /**
     * 更新时间
     */
    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", specialColumnName=").append(specialColumnName);
        sb.append(", isEnable=").append(isEnable);
        sb.append(", createTime=").append(createTime);
        sb.append(", updTime=").append(updTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}