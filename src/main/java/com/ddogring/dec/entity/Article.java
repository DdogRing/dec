package com.ddogring.dec.entity;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    /**
     * 文章id
	 * 2021-03-16T10:58:15.197
     */
    private Integer id;

    /**
     * 专栏id
	 * 2021-03-16T10:58:15.199
     */
    private Integer specialColumnId;

    /**
     * 文章标题
	 * 2021-03-16T10:58:15.199
     */
    private String articleTitle;

    /**
     * 文章内容
	 * 2021-03-16T10:58:15.199
     */
    private String articleContent;

    /**
     * 是否启用(0否 1是)
	 * 2021-03-16T10:58:15.199
     */
    private Boolean isEnable;

    /**
     * 创建时间
	 * 2021-03-16T10:58:15.199
     */
    private Date createTime;

    /**
     * 更新时间
	 * 2021-03-16T10:58:15.199
     */
    private Date updTime;

    /**
    
	 * 2021-03-16T10:58:15.200
     */
    private static final long serialVersionUID = 1L;

    /**
     * 文章id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 文章id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 专栏id
     */
    public Integer getSpecialColumnId() {
        return specialColumnId;
    }

    /**
     * 专栏id
     */
    public void setSpecialColumnId(Integer specialColumnId) {
        this.specialColumnId = specialColumnId;
    }

    /**
     * 文章标题
     */
    public String getArticleTitle() {
        return articleTitle;
    }

    /**
     * 文章标题
     */
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    /**
     * 文章内容
     */
    public String getArticleContent() {
        return articleContent;
    }

    /**
     * 文章内容
     */
    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
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
        sb.append(", specialColumnId=").append(specialColumnId);
        sb.append(", articleTitle=").append(articleTitle);
        sb.append(", articleContent=").append(articleContent);
        sb.append(", isEnable=").append(isEnable);
        sb.append(", createTime=").append(createTime);
        sb.append(", updTime=").append(updTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}