package com.travelogue.posts.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Comment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-08-18T19:17:30.017Z")

public class Comment   {
  @JsonProperty("_id")
  private String id = null;

  @JsonProperty("createdUser")
  private Long createdUser = null;

  @JsonProperty("line")
  private String line = null;

  @JsonProperty("createdOn")
  private DateTime createdOn = null;

  @JsonProperty("updatedOn")
  private DateTime updatedOn = null;

  @JsonProperty("likes")
  private List<Long> likes = null;

  @JsonProperty("comments")
  private List<Comment> comments = null;

  public Comment id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Comment createdUser(Long createdUser) {
    this.createdUser = createdUser;
    return this;
  }

   /**
   * Get createdUser
   * @return createdUser
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getCreatedUser() {
    return createdUser;
  }

  public void setCreatedUser(Long createdUser) {
    this.createdUser = createdUser;
  }

  public Comment line(String line) {
    this.line = line;
    return this;
  }

   /**
   * Get line
   * @return line
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getLine() {
    return line;
  }

  public void setLine(String line) {
    this.line = line;
  }

  public Comment createdOn(DateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public DateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(DateTime createdOn) {
    this.createdOn = createdOn;
  }

  public Comment updatedOn(DateTime updatedOn) {
    this.updatedOn = updatedOn;
    return this;
  }

   /**
   * Get updatedOn
   * @return updatedOn
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DateTime getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(DateTime updatedOn) {
    this.updatedOn = updatedOn;
  }

  public Comment likes(List<Long> likes) {
    this.likes = likes;
    return this;
  }

  public Comment addLikesItem(Long likesItem) {
    if (this.likes == null) {
      this.likes = new ArrayList<Long>();
    }
    this.likes.add(likesItem);
    return this;
  }

   /**
   * Get likes
   * @return likes
  **/
  @ApiModelProperty(value = "")


  public List<Long> getLikes() {
    return likes;
  }

  public void setLikes(List<Long> likes) {
    this.likes = likes;
  }

  public Comment comments(List<Comment> comments) {
    this.comments = comments;
    return this;
  }

  public Comment addCommentsItem(Comment commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<Comment>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Comment> getComments() {
    return comments;
  }

  public void setComments(List<Comment> comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comment comment = (Comment) o;
    return Objects.equals(this.id, comment.id) &&
        Objects.equals(this.createdUser, comment.createdUser) &&
        Objects.equals(this.line, comment.line) &&
        Objects.equals(this.createdOn, comment.createdOn) &&
        Objects.equals(this.updatedOn, comment.updatedOn) &&
        Objects.equals(this.likes, comment.likes) &&
        Objects.equals(this.comments, comment.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdUser, line, createdOn, updatedOn, likes, comments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdUser: ").append(toIndentedString(createdUser)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

