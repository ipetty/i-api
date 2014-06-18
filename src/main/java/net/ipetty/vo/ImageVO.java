package net.ipetty.vo;

import java.util.Date;

/**
 * 图片VO
 *
 * @author luocanfeng
 * @date 2014年5月9日
 */
public class ImageVO extends BaseVO {

    private Long id;
    private Integer createdBy;
    private Date createdOn;

    private String smallURL; // 缩略图
    private String cutURL; // 裁剪图；据说客户端不需要裁剪的正方形图，目前值等同于smallURL；有需要的话再截图。
    private String originalURL; // 原图

    public ImageVO() {
        super();
    }

    public ImageVO(Long id, Integer createdBy, Date createdOn, String smallURL, String cutURL, String originalURL) {
        super();
        this.id = id;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.smallURL = smallURL;
        this.cutURL = cutURL;
        this.originalURL = originalURL;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getSmallURL() {

        return smallURL;
    }

    public void setSmallURL(String smallURL) {
        this.smallURL = smallURL;
    }

    public String getCutURL() {
        return cutURL;
    }

    public void setCutURL(String cutURL) {
        this.cutURL = cutURL;
    }

    public String getOriginalURL() {
        return originalURL;
    }

    public void setOriginalURL(String originalURL) {
        this.originalURL = originalURL;
    }

}
