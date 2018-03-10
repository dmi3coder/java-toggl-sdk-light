
package io.github.dmitrychaban.java_toggl_sdk_light.model;

import java.io.Serializable;
import java.util.HashMap;
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
    "wid",
    "name",
    "billable",
    "active",
    "at",
    "color"
})
public class Project implements Serializable
{

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("wid")
    private Integer wid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("billable")
    private Boolean billable;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("at")
    private String at;
    @JsonProperty("color")
    private String color;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1056152897078042882L;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Project withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("wid")
    public Integer getWid() {
        return wid;
    }

    @JsonProperty("wid")
    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public Project withWid(Integer wid) {
        this.wid = wid;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Project withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("billable")
    public Boolean getBillable() {
        return billable;
    }

    @JsonProperty("billable")
    public void setBillable(Boolean billable) {
        this.billable = billable;
    }

    public Project withBillable(Boolean billable) {
        this.billable = billable;
        return this;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    public Project withActive(Boolean active) {
        this.active = active;
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

    public Project withAt(String at) {
        this.at = at;
        return this;
    }

    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    public Project withColor(String color) {
        this.color = color;
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

    public Project withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("wid", wid).append("name", name).append("billable", billable).append("active", active).append("at", at).append("color", color).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(color).append(wid).append(additionalProperties).append(name).append(at).append(active).append(billable).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Project) == false) {
            return false;
        }
        Project rhs = ((Project) other);
        return new EqualsBuilder().append(id, rhs.id).append(color, rhs.color).append(wid, rhs.wid).append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(at, rhs.at).append(active, rhs.active).append(billable, rhs.billable).isEquals();
    }

}
