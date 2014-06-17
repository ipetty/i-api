package net.ipetty.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 消息VO
 *
 * @author luocanfeng
 * @date 2014年5月9日
 */
public class FeedVO extends BaseVO {

    private Long id;
    private Integer createdBy;
    private Date createdOn;

    private String text; // 文本内容

    // private Long imageId; // 图片ID，图片不会修改，客户端缓存起来，一直从缓存获取
    private String imageSmallURL;
    private String imageOriginalURL;

    private Long locationId; // 发表位置ID，位置不会修改，客户端缓存起来，一直从缓存获取

    private List<CommentVO> comments = new ArrayList<CommentVO>(); // 评论列表
    private List<FeedFavorVO> favors = new ArrayList<FeedFavorVO>(); // 赞列表

    // 统计信息
    private int commentCount; // 评论数
    private int favorCount; // 赞的数量

    private boolean favored; // 我是否赞过；游客全部显示未赞，点赞时提示需要注册或登录

    public FeedVO() {
        super();
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImageSmallURL() {
        return Constant.FILE_SERVER_BASE + imageSmallURL;
    }

    public void setImageSmallURL(String imageSmallURL) {
        this.imageSmallURL = imageSmallURL;
    }

    public String getImageOriginalURL() {
        return Constant.FILE_SERVER_BASE + imageOriginalURL;
    }

    public void setImageOriginalURL(String imageOriginalURL) {
        this.imageOriginalURL = imageOriginalURL;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public List<CommentVO> getComments() {
        return comments;
    }

    public void setComments(List<CommentVO> comments) {
        this.comments = comments;
    }

    public List<FeedFavorVO> getFavors() {
        return favors;
    }

    public void setFavors(List<FeedFavorVO> favors) {
        this.favors = favors;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getFavorCount() {
        return favorCount;
    }

    public void setFavorCount(int favorCount) {
        this.favorCount = favorCount;
    }

    public boolean isFavored() {
        return favored;
    }

    public void setFavored(boolean favored) {
        this.favored = favored;
    }

}
