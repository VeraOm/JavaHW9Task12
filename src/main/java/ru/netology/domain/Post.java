package ru.netology.domain;


import java.util.Date;

public class Post {
    private long id;
    private long ownerId;  // Wall owner ID
    private Date publicationTime;
    private String text;
    private MediaContent mediaContent;
    private long[] likesIdInfo;
    private int shareCount;
    private long viewCount;
    private CommentsInfo commentsInfo;

    private long fromId;  // ID of the author
    private long createdBy; // ID of the administrator who posted the post
    private long replyOwnerId;  // Replied post's owner id
    private long replyPostId;  // Replied post's id.
    private boolean friendsOnly;  // if a post is marked "Friends only".
    private String post_type;  // Type of the post, can be: post, copy, reply, postpone, suggest.
    private PostSource postSource;  // Information about the means of posting
    private GeoLocation geo;  // Information about location
    private long signerId;  // author ID (if the post has been published by the community name with the author sign)
    private boolean canPin;  // Shows if current user can pin a post
    private boolean canDelete; // Shows if current user can delete the post
    private boolean canEdit; // Shows if current user can edit the post
    private boolean pinned; // Shows if the post is pinned
    private boolean markedAsAds; // Information whether the post is marked as ads
    private boolean favorite;  // if object is added to favorites by current users.

    public long getFromId() {
        return fromId;
    }

    public void setFromId(long fromId) {
        this.fromId = fromId;
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public long getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(long replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public long getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(long replyPostId) {
        this.replyPostId = replyPostId;
    }

    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getPost_type() {
        return post_type;
    }

    public void setPost_type(String post_type) {
        this.post_type = post_type;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public GeoLocation getGeo() {
        return geo;
    }

    public void setGeo(GeoLocation geo) {
        this.geo = geo;
    }

    public long getSignerId() {
        return signerId;
    }

    public void setSignerId(long signerId) {
        this.signerId = signerId;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public long[] getLikesIdInfo() {
        return likesIdInfo;
    }

    public void setLikesIdInfo(long[] likesIdInfo) {
        this.likesIdInfo = likesIdInfo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public Date getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(Date publicationTime) {
        this.publicationTime = publicationTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public MediaContent getMediaContent() {
        return mediaContent;
    }

    public void setMediaContent(MediaContent mediaContent) {
        this.mediaContent = mediaContent;
    }

    public int getShareCount() {
        return shareCount;
    }

    public void setShareCount(int shareCount) {
        this.shareCount = shareCount;
    }

    public long getViewCount() {
        return viewCount;
    }

    public void setViewCount(long viewCount) {
        this.viewCount = viewCount;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }
}
