package com.tiantianmeitu.background.bean.post;

import java.io.Serializable;

public class PostKeywordRel implements Serializable {
    private Integer postKeywordRelId;

    private Integer postId;

    private Integer keywordId;

    private static final long serialVersionUID = 1L;

    public Integer getPostKeywordRelId() {
        return postKeywordRelId;
    }

    public void setPostKeywordRelId(Integer postKeywordRelId) {
        this.postKeywordRelId = postKeywordRelId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getKeywordId() {
        return keywordId;
    }

    public void setKeywordId(Integer keywordId) {
        this.keywordId = keywordId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", postKeywordRelId=").append(postKeywordRelId);
        sb.append(", postId=").append(postId);
        sb.append(", keywordId=").append(keywordId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}