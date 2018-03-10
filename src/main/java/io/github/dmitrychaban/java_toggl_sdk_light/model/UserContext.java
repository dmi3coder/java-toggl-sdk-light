
package io.github.dmitrychaban.java_toggl_sdk_light.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "api_token",
    "default_wid",
    "email",
    "fullname",
    "jquery_timeofday_format",
    "jquery_date_format",
    "timeofday_format",
    "date_format",
    "store_start_and_stop_time",
    "beginning_of_week",
    "language",
    "duration_format",
    "image_url",
    "at",
    "created_at",
    "timezone",
    "retention",
    "new_blog_post",
    "projects",
    "tags",
    "tasks",
    "workspaces",
    "clients"
})
public class UserContext implements Serializable
{

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("api_token")
    private String apiToken;
    @JsonProperty("default_wid")
    private Integer defaultWid;
    @JsonProperty("email")
    private String email;
    @JsonProperty("fullname")
    private String fullname;
    @JsonProperty("jquery_timeofday_format")
    private String jqueryTimeofdayFormat;
    @JsonProperty("jquery_date_format")
    private String jqueryDateFormat;
    @JsonProperty("timeofday_format")
    private String timeofdayFormat;
    @JsonProperty("date_format")
    private String dateFormat;
    @JsonProperty("store_start_and_stop_time")
    private Boolean storeStartAndStopTime;
    @JsonProperty("beginning_of_week")
    private Integer beginningOfWeek;
    @JsonProperty("language")
    private String language;
    @JsonProperty("duration_format")
    private String durationFormat;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("at")
    private String at;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("retention")
    private Integer retention;
    @JsonProperty("new_blog_post")
    @Valid
    private NewBlogPost newBlogPost;
    @JsonProperty("projects")
    @Valid
    private List<Project> projects = null;
    @JsonProperty("tags")
    @Valid
    private List<Tag> tags = null;
    @JsonProperty("tasks")
    @Valid
    private List<Object> tasks = null;
    @JsonProperty("workspaces")
    @Valid
    private List<Workspace> workspaces = null;
    @JsonProperty("clients")
    @Valid
    private List<Object> clients = null;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4152216331602570089L;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public UserContext withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("api_token")
    public String getApiToken() {
        return apiToken;
    }

    @JsonProperty("api_token")
    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public UserContext withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }

    @JsonProperty("default_wid")
    public Integer getDefaultWid() {
        return defaultWid;
    }

    @JsonProperty("default_wid")
    public void setDefaultWid(Integer defaultWid) {
        this.defaultWid = defaultWid;
    }

    public UserContext withDefaultWid(Integer defaultWid) {
        this.defaultWid = defaultWid;
        return this;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public UserContext withEmail(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty("fullname")
    public String getFullname() {
        return fullname;
    }

    @JsonProperty("fullname")
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public UserContext withFullname(String fullname) {
        this.fullname = fullname;
        return this;
    }

    @JsonProperty("jquery_timeofday_format")
    public String getJqueryTimeofdayFormat() {
        return jqueryTimeofdayFormat;
    }

    @JsonProperty("jquery_timeofday_format")
    public void setJqueryTimeofdayFormat(String jqueryTimeofdayFormat) {
        this.jqueryTimeofdayFormat = jqueryTimeofdayFormat;
    }

    public UserContext withJqueryTimeofdayFormat(String jqueryTimeofdayFormat) {
        this.jqueryTimeofdayFormat = jqueryTimeofdayFormat;
        return this;
    }

    @JsonProperty("jquery_date_format")
    public String getJqueryDateFormat() {
        return jqueryDateFormat;
    }

    @JsonProperty("jquery_date_format")
    public void setJqueryDateFormat(String jqueryDateFormat) {
        this.jqueryDateFormat = jqueryDateFormat;
    }

    public UserContext withJqueryDateFormat(String jqueryDateFormat) {
        this.jqueryDateFormat = jqueryDateFormat;
        return this;
    }

    @JsonProperty("timeofday_format")
    public String getTimeofdayFormat() {
        return timeofdayFormat;
    }

    @JsonProperty("timeofday_format")
    public void setTimeofdayFormat(String timeofdayFormat) {
        this.timeofdayFormat = timeofdayFormat;
    }

    public UserContext withTimeofdayFormat(String timeofdayFormat) {
        this.timeofdayFormat = timeofdayFormat;
        return this;
    }

    @JsonProperty("date_format")
    public String getDateFormat() {
        return dateFormat;
    }

    @JsonProperty("date_format")
    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public UserContext withDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    @JsonProperty("store_start_and_stop_time")
    public Boolean getStoreStartAndStopTime() {
        return storeStartAndStopTime;
    }

    @JsonProperty("store_start_and_stop_time")
    public void setStoreStartAndStopTime(Boolean storeStartAndStopTime) {
        this.storeStartAndStopTime = storeStartAndStopTime;
    }

    public UserContext withStoreStartAndStopTime(Boolean storeStartAndStopTime) {
        this.storeStartAndStopTime = storeStartAndStopTime;
        return this;
    }

    @JsonProperty("beginning_of_week")
    public Integer getBeginningOfWeek() {
        return beginningOfWeek;
    }

    @JsonProperty("beginning_of_week")
    public void setBeginningOfWeek(Integer beginningOfWeek) {
        this.beginningOfWeek = beginningOfWeek;
    }

    public UserContext withBeginningOfWeek(Integer beginningOfWeek) {
        this.beginningOfWeek = beginningOfWeek;
        return this;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    public UserContext withLanguage(String language) {
        this.language = language;
        return this;
    }

    @JsonProperty("duration_format")
    public String getDurationFormat() {
        return durationFormat;
    }

    @JsonProperty("duration_format")
    public void setDurationFormat(String durationFormat) {
        this.durationFormat = durationFormat;
    }

    public UserContext withDurationFormat(String durationFormat) {
        this.durationFormat = durationFormat;
        return this;
    }

    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public UserContext withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    @JsonProperty("at")
    public String getAt() {
        return at;
    }

    @JsonProperty("at")
    public void setAt(String at) {
        this.at = at;
    }

    public UserContext withAt(String at) {
        this.at = at;
        return this;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public UserContext withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public UserContext withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    @JsonProperty("retention")
    public Integer getRetention() {
        return retention;
    }

    @JsonProperty("retention")
    public void setRetention(Integer retention) {
        this.retention = retention;
    }

    public UserContext withRetention(Integer retention) {
        this.retention = retention;
        return this;
    }

    @JsonProperty("new_blog_post")
    public NewBlogPost getNewBlogPost() {
        return newBlogPost;
    }

    @JsonProperty("new_blog_post")
    public void setNewBlogPost(NewBlogPost newBlogPost) {
        this.newBlogPost = newBlogPost;
    }

    public UserContext withNewBlogPost(NewBlogPost newBlogPost) {
        this.newBlogPost = newBlogPost;
        return this;
    }

    @JsonProperty("projects")
    public List<Project> getProjects() {
        return projects;
    }

    @JsonProperty("projects")
    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public UserContext withProjects(List<Project> projects) {
        this.projects = projects;
        return this;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public UserContext withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("tasks")
    public List<Object> getTasks() {
        return tasks;
    }

    @JsonProperty("tasks")
    public void setTasks(List<Object> tasks) {
        this.tasks = tasks;
    }

    public UserContext withTasks(List<Object> tasks) {
        this.tasks = tasks;
        return this;
    }

    @JsonProperty("workspaces")
    public List<Workspace> getWorkspaces() {
        return workspaces;
    }

    @JsonProperty("workspaces")
    public void setWorkspaces(List<Workspace> workspaces) {
        this.workspaces = workspaces;
    }

    public UserContext withWorkspaces(List<Workspace> workspaces) {
        this.workspaces = workspaces;
        return this;
    }

    @JsonProperty("clients")
    public List<Object> getClients() {
        return clients;
    }

    @JsonProperty("clients")
    public void setClients(List<Object> clients) {
        this.clients = clients;
    }

    public UserContext withClients(List<Object> clients) {
        this.clients = clients;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public UserContext withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("apiToken", apiToken).append("defaultWid", defaultWid).append("email", email).append("fullname", fullname).append("jqueryTimeofdayFormat", jqueryTimeofdayFormat).append("jqueryDateFormat", jqueryDateFormat).append("timeofdayFormat", timeofdayFormat).append("dateFormat", dateFormat).append("storeStartAndStopTime", storeStartAndStopTime).append("beginningOfWeek", beginningOfWeek).append("language", language).append("durationFormat", durationFormat).append("imageUrl", imageUrl).append("at", at).append("createdAt", createdAt).append("timezone", timezone).append("retention", retention).append("newBlogPost", newBlogPost).append("projects", projects).append("tags", tags).append("tasks", tasks).append("workspaces", workspaces).append("clients", clients).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(jqueryDateFormat).append(imageUrl).append(storeStartAndStopTime).append(id).append(timezone).append(apiToken).append(createdAt).append(retention).append(durationFormat).append(dateFormat).append(fullname).append(tags).append(jqueryTimeofdayFormat).append(newBlogPost).append(at).append(beginningOfWeek).append(tasks).append(timeofdayFormat).append(projects).append(email).append(additionalProperties).append(workspaces).append(language).append(defaultWid).append(clients).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserContext) == false) {
            return false;
        }
        UserContext rhs = ((UserContext) other);
        return new EqualsBuilder().append(jqueryDateFormat, rhs.jqueryDateFormat).append(imageUrl, rhs.imageUrl).append(storeStartAndStopTime, rhs.storeStartAndStopTime).append(id, rhs.id).append(timezone, rhs.timezone).append(apiToken, rhs.apiToken).append(createdAt, rhs.createdAt).append(retention, rhs.retention).append(durationFormat, rhs.durationFormat).append(dateFormat, rhs.dateFormat).append(fullname, rhs.fullname).append(tags, rhs.tags).append(jqueryTimeofdayFormat, rhs.jqueryTimeofdayFormat).append(newBlogPost, rhs.newBlogPost).append(at, rhs.at).append(beginningOfWeek, rhs.beginningOfWeek).append(tasks, rhs.tasks).append(timeofdayFormat, rhs.timeofdayFormat).append(projects, rhs.projects).append(email, rhs.email).append(additionalProperties, rhs.additionalProperties).append(workspaces, rhs.workspaces).append(language, rhs.language).append(defaultWid, rhs.defaultWid).append(clients, rhs.clients).isEquals();
    }

}
