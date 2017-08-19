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
 * Post
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-08-18T19:17:30.017Z")

public class Post {
	@JsonProperty("_id")
	private String id = null;

	@JsonProperty("head")
	private String head = null;

	@JsonProperty("content")
	private String content = null;

	@JsonProperty("createdUser")
	private Long createdUser = null;

	@JsonProperty("usersTagged")
	private List<Long> usersTagged = null;

	@JsonProperty("placesTagged")
	private List<String> placesTagged = null;

	@JsonProperty("createdOn")
	private DateTime createdOn = null;

	@JsonProperty("updatedOn")
	private DateTime updatedOn = null;

	@JsonProperty("tags")
	private List<Tag> tags = null;

	@JsonProperty("resources")
	private List<Resource> resources = null;

	@JsonProperty("comments")
	private List<Comment> comments = null;

	public Post id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "")

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Post head(String head) {
		this.head = head;
		return this;
	}

	/**
	 * Get head
	 * 
	 * @return head
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public Post content(String content) {
		this.content = content;
		return this;
	}

	/**
	 * Get content
	 * 
	 * @return content
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Post createdUser(Long createdUser) {
		this.createdUser = createdUser;
		return this;
	}

	/**
	 * Get createdUser
	 * 
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

	public Post usersTagged(List<Long> usersTagged) {
		this.usersTagged = usersTagged;
		return this;
	}

	public Post addUsersTaggedItem(Long usersTaggedItem) {
		if (this.usersTagged == null) {
			this.usersTagged = new ArrayList<Long>();
		}
		this.usersTagged.add(usersTaggedItem);
		return this;
	}

	/**
	 * Get usersTagged
	 * 
	 * @return usersTagged
	 **/
	@ApiModelProperty(value = "")

	public List<Long> getUsersTagged() {
		return usersTagged;
	}

	public void setUsersTagged(List<Long> usersTagged) {
		this.usersTagged = usersTagged;
	}

	public Post placesTagged(List<String> placesTagged) {
		this.placesTagged = placesTagged;
		return this;
	}

	public Post addPlacesTaggedItem(String placesTaggedItem) {
		if (this.placesTagged == null) {
			this.placesTagged = new ArrayList<String>();
		}
		this.placesTagged.add(placesTaggedItem);
		return this;
	}

	/**
	 * Get placesTagged
	 * 
	 * @return placesTagged
	 **/
	@ApiModelProperty(value = "")

	public List<String> getPlacesTagged() {
		return placesTagged;
	}

	public void setPlacesTagged(List<String> placesTagged) {
		this.placesTagged = placesTagged;
	}

	public Post createdOn(DateTime createdOn) {
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

	public Post updatedOn(DateTime updatedOn) {
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

	public Post tags(List<Tag> tags) {
		this.tags = tags;
		return this;
	}

	public Post addTagsItem(Tag tagsItem) {
		if (this.tags == null) {
			this.tags = new ArrayList<Tag>();
		}
		this.tags.add(tagsItem);
		return this;
	}

	/**
	 * Get tags
	 * 
	 * @return tags
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public Post resources(List<Resource> resources) {
		this.resources = resources;
		return this;
	}

	public Post addResourcesItem(Resource resourcesItem) {
		if (this.resources == null) {
			this.resources = new ArrayList<Resource>();
		}
		this.resources.add(resourcesItem);
		return this;
	}

	/**
	 * Get resources
	 * 
	 * @return resources
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public Post comments(List<Comment> comments) {
		this.comments = comments;
		return this;
	}

	public Post addCommentsItem(Comment commentsItem) {
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
		Post post = (Post) o;
		return Objects.equals(this.id, post.id) && Objects.equals(this.head, post.head)
				&& Objects.equals(this.content, post.content) && Objects.equals(this.createdUser, post.createdUser)
				&& Objects.equals(this.usersTagged, post.usersTagged)
				&& Objects.equals(this.placesTagged, post.placesTagged)
				&& Objects.equals(this.createdOn, post.createdOn) && Objects.equals(this.updatedOn, post.updatedOn)
				&& Objects.equals(this.tags, post.tags) && Objects.equals(this.resources, post.resources)
				&& Objects.equals(this.comments, post.comments);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, head, content, createdUser, usersTagged, placesTagged, createdOn, updatedOn, tags,
				resources, comments);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Post {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    head: ").append(toIndentedString(head)).append("\n");
		sb.append("    content: ").append(toIndentedString(content)).append("\n");
		sb.append("    createdUser: ").append(toIndentedString(createdUser)).append("\n");
		sb.append("    usersTagged: ").append(toIndentedString(usersTagged)).append("\n");
		sb.append("    placesTagged: ").append(toIndentedString(placesTagged)).append("\n");
		sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
		sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
		sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
