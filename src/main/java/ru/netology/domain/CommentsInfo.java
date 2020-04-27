package ru.netology.domain;

public class CommentsInfo {
    private PostComment[] comments;

    private boolean groupsCanPost;  //  information whether communities can comment this post

    public boolean isGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public PostComment[] getComments() {
        return comments;
    }

    public void setComments(PostComment[] comments) {
        this.comments = comments;
    }
}
