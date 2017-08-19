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
 * Resource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-08-18T19:17:30.017Z")

public class Resource {
	@JsonProperty("_id")
	private String id = null;

	@JsonProperty("type")
	private String type = null;

	@JsonProperty("createdOn")
	private DateTime createdOn = null;

	@JsonProperty("updatedOn")
	private DateTime updatedOn = null;

	@JsonProperty("likes")
	private List<Long> likes = null;

	@JsonProperty("comments")
	private List<Comment> comments = null;

	public Resource id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
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

	public Resource type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Resource createdOn(DateTime createdOn) {
		this.createdOn = createdOn;
		return this;
	}

	/**
	 * Get createdOn
	 * 
	 * @return createdOn
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public DateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(DateTime createdOn) {
		this.createdOn = createdOn;
	}

	public Resource updatedOn(DateTime updatedOn) {
		this.updatedOn = updatedOn;
		return this;
	}

	/**
	 * Get updatedOn
	 * 
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

	public Resource likes(List<Long> likes) {
		this.likes = likes;
		return this;
	}

	public Resource addLikesItem(Long likesItem) {
		if (this.likes == null) {
			this.likes = new ArrayList<Long>();
		}
		this.likes.add(likesItem);
		return this;
	}

	/**
	 * Get likes
	 * 
	 * @return likes
	 **/
	@ApiModelProperty(value = "")

	public List<Long> getLikes() {
		return likes;
	}

	public void setLikes(List<Long> likes) {
		this.likes = likes;
	}

	public Resource comments(List<Comment> comments) {
		this.comments = comments;
		return this;
	}

	public Resource addCommentsItem(Comment commentsItem) {
		if (this.comments == null) {
			this.comments = new ArrayList<Comment>();
		}
		this.comments.add(commentsItem);
		return this;
	}

	/**
	 * Get comments
	 * 
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
		Resource resource = (Resource) o;
		return Objects.equals(this.id, resource.id) && Objects.equals(this.type, resource.type)
				&& Objects.equals(this.createdOn, resource.createdOn)
				&& Objects.equals(this.updatedOn, resource.updatedOn) && Objects.equals(this.likes, resource.likes)
				&& Objects.equals(this.comments, resource.comments);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, type, createdOn, updatedOn, likes, comments);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Resource {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
