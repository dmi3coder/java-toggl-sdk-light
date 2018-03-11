
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
    "pid",
    "tid",
    "uid",
    "description",
    "start",
    "end",
    "updated",
    "dur",
    "user",
    "use_stop",
    "client",
    "project",
    "task",
    "billable",
    "is_billable",
    "cur",
    "tags"
})
public class Timer implements Serializable
{

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("pid")
    private Integer pid;
    @JsonProperty("tid")
    private Integer tid;
    @JsonProperty("uid")
    private Integer uid;
    @JsonProperty("description")
    private String description;
    @JsonProperty("start")
    private String start;
    @JsonProperty("end")
    private String end;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("dur")
    private Integer dur;
    @JsonProperty("user")
    private String user;
    @JsonProperty("use_stop")
    private Boolean useStop;
    @JsonProperty("client")
    private String client;
    @JsonProperty("project")
    private String project;
    @JsonProperty("task")
    private String task;
    @JsonProperty("billable")
    private Double billable;
    @JsonProperty("is_billable")
    private Boolean isBillable;
    @JsonProperty("cur")
    private String cur;
    @JsonProperty("tags")
    @Valid
    private List<String> tags = null;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7643454716765063107L;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Timer withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("pid")
    public Integer getPid() {
        return pid;
    }

    @JsonProperty("pid")
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Timer withPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    @JsonProperty("tid")
    public Integer getTid() {
        return tid;
    }

    @JsonProperty("tid")
    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Timer withTid(Integer tid) {
        this.tid = tid;
        return this;
    }

    @JsonProperty("uid")
    public Integer getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Timer withUid(Integer uid) {
        this.uid = uid;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Timer withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("start")
    public String getStart() {
        return start;
    }

    @JsonProperty("start")
    public void setStart(String start) {
        this.start = start;
    }

    public Timer withStart(String start) {
        this.start = start;
        return this;
    }

    @JsonProperty("end")
    public String getEnd() {
        return end;
    }

    @JsonProperty("end")
    public void setEnd(String end) {
        this.end = end;
    }

    public Timer withEnd(String end) {
        this.end = end;
        return this;
    }

    @JsonProperty("updated")
    public String getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Timer withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    @JsonProperty("dur")
    public Integer getDur() {
        return dur;
    }

    @JsonProperty("dur")
    public void setDur(Integer dur) {
        this.dur = dur;
    }

    public Timer withDur(Integer dur) {
        this.dur = dur;
        return this;
    }

    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public Timer withUser(String user) {
        this.user = user;
        return this;
    }

    @JsonProperty("use_stop")
    public Boolean getUseStop() {
        return useStop;
    }

    @JsonProperty("use_stop")
    public void setUseStop(Boolean useStop) {
        this.useStop = useStop;
    }

    public Timer withUseStop(Boolean useStop) {
        this.useStop = useStop;
        return this;
    }

    @JsonProperty("client")
    public String getClient() {
        return client;
    }

    @JsonProperty("client")
    public void setClient(String client) {
        this.client = client;
    }

    public Timer withClient(String client) {
        this.client = client;
        return this;
    }

    @JsonProperty("project")
    public String getProject() {
        return project;
    }

    @JsonProperty("project")
    public void setProject(String project) {
        this.project = project;
    }

    public Timer withProject(String project) {
        this.project = project;
        return this;
    }

    @JsonProperty("task")
    public String getTask() {
        return task;
    }

    @JsonProperty("task")
    public void setTask(String task) {
        this.task = task;
    }

    public Timer withTask(String task) {
        this.task = task;
        return this;
    }

    @JsonProperty("billable")
    public Double getBillable() {
        return billable;
    }

    @JsonProperty("billable")
    public void setBillable(Double billable) {
        this.billable = billable;
    }

    public Timer withBillable(Double billable) {
        this.billable = billable;
        return this;
    }

    @JsonProperty("is_billable")
    public Boolean getIsBillable() {
        return isBillable;
    }

    @JsonProperty("is_billable")
    public void setIsBillable(Boolean isBillable) {
        this.isBillable = isBillable;
    }

    public Timer withIsBillable(Boolean isBillable) {
        this.isBillable = isBillable;
        return this;
    }

    @JsonProperty("cur")
    public String getCur() {
        return cur;
    }

    @JsonProperty("cur")
    public void setCur(String cur) {
        this.cur = cur;
    }

    public Timer withCur(String cur) {
        this.cur = cur;
        return this;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Timer withTags(List<String> tags) {
        this.tags = tags;
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

    public Timer withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("pid", pid).append("tid", tid).append("uid", uid).append("description", description).append("start", start).append("end", end).append("updated", updated).append("dur", dur).append("user", user).append("useStop", useStop).append("client", client).append("project", project).append("task", task).append("billable", billable).append("isBillable", isBillable).append("cur", cur).append("tags", tags).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tags).append(uid).append(client).append(task).append(useStop).append(pid).append(billable).append(id).append(project).append(dur).append(updated).append(start).append(additionalProperties).append(isBillable).append(description).append(cur).append(tid).append(user).append(end).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Timer) == false) {
            return false;
        }
        Timer rhs = ((Timer) other);
        return new EqualsBuilder().append(tags, rhs.tags).append(uid, rhs.uid).append(client, rhs.client).append(task, rhs.task).append(useStop, rhs.useStop).append(pid, rhs.pid).append(billable, rhs.billable).append(id, rhs.id).append(project, rhs.project).append(dur, rhs.dur).append(updated, rhs.updated).append(start, rhs.start).append(additionalProperties, rhs.additionalProperties).append(isBillable, rhs.isBillable).append(description, rhs.description).append(cur, rhs.cur).append(tid, rhs.tid).append(user, rhs.user).append(end, rhs.end).isEquals();
    }

}
