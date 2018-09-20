package com.tiantianmeitu.background.bean.post;

import java.io.Serializable;

public class PostImageRel implements Serializable {
    private Integer postImageRelId;

    private Integer postId;

    private Integer imageId;

    private Integer orderNo;

    private static final long serialVersionUID = 1L;

    public Integer getPostImageRelId() {
        return postImageRelId;
    }

    public void setPostImageRelId(Integer postImageRelId) {
        this.postImageRelId = postImageRelId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", postImageRelId=").append(postImageRelId);
        sb.append(", postId=").append(postId);
        sb.append(", imageId=").append(imageId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}