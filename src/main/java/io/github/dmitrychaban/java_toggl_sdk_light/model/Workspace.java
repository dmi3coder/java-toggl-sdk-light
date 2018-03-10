
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
    "name",
    "at",
    "default_hourly_rate",
    "default_currency",
    "projects_billable_by_default",
    "rounding",
    "rounding_minutes",
    "api_token"
})
public class Workspace implements Serializable
{

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("at")
    private String at;
    @JsonProperty("default_hourly_rate")
    private Integer defaultHourlyRate;
    @JsonProperty("default_currency")
    private String defaultCurrency;
    @JsonProperty("projects_billable_by_default")
    private Boolean projectsBillableByDefault;
    @JsonProperty("rounding")
    private Integer rounding;
    @JsonProperty("rounding_minutes")
    private Integer roundingMinutes;
    @JsonProperty("api_token")
    private String apiToken;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1842550024030768070L;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Workspace withId(Integer id) {
        this.id = id;
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

    public Workspace withName(String name) {
        this.name = name;
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

    public Workspace withAt(String at) {
        this.at = at;
        return this;
    }

    @JsonProperty("default_hourly_rate")
    public Integer getDefaultHourlyRate() {
        return defaultHourlyRate;
    }

    @JsonProperty("default_hourly_rate")
    public void setDefaultHourlyRate(Integer defaultHourlyRate) {
        this.defaultHourlyRate = defaultHourlyRate;
    }

    public Workspace withDefaultHourlyRate(Integer defaultHourlyRate) {
        this.defaultHourlyRate = defaultHourlyRate;
        return this;
    }

    @JsonProperty("default_currency")
    public String getDefaultCurrency() {
        return defaultCurrency;
    }

    @JsonProperty("default_currency")
    public void setDefaultCurrency(String defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public Workspace withDefaultCurrency(String defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
        return this;
    }

    @JsonProperty("projects_billable_by_default")
    public Boolean getProjectsBillableByDefault() {
        return projectsBillableByDefault;
    }

    @JsonProperty("projects_billable_by_default")
    public void setProjectsBillableByDefault(Boolean projectsBillableByDefault) {
        this.projectsBillableByDefault = projectsBillableByDefault;
    }

    public Workspace withProjectsBillableByDefault(Boolean projectsBillableByDefault) {
        this.projectsBillableByDefault = projectsBillableByDefault;
        return this;
    }

    @JsonProperty("rounding")
    public Integer getRounding() {
        return rounding;
    }

    @JsonProperty("rounding")
    public void setRounding(Integer rounding) {
        this.rounding = rounding;
    }

    public Workspace withRounding(Integer rounding) {
        this.rounding = rounding;
        return this;
    }

    @JsonProperty("rounding_minutes")
    public Integer getRoundingMinutes() {
        return roundingMinutes;
    }

    @JsonProperty("rounding_minutes")
    public void setRoundingMinutes(Integer roundingMinutes) {
        this.roundingMinutes = roundingMinutes;
    }

    public Workspace withRoundingMinutes(Integer roundingMinutes) {
        this.roundingMinutes = roundingMinutes;
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

    public Workspace withApiToken(String apiToken) {
        this.apiToken = apiToken;
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

    public Workspace withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("at", at).append("defaultHourlyRate", defaultHourlyRate).append("defaultCurrency", defaultCurrency).append("projectsBillableByDefault", projectsBillableByDefault).append("rounding", rounding).append("roundingMinutes", roundingMinutes).append("apiToken", apiToken).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(projectsBillableByDefault).append(id).append(roundingMinutes).append(apiToken).append(additionalProperties).append(defaultCurrency).append(name).append(at).append(rounding).append(defaultHourlyRate).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Workspace) == false) {
            return false;
        }
        Workspace rhs = ((Workspace) other);
        return new EqualsBuilder().append(projectsBillableByDefault, rhs.projectsBillableByDefault).append(id, rhs.id).append(roundingMinutes, rhs.roundingMinutes).append(apiToken, rhs.apiToken).append(additionalProperties, rhs.additionalProperties).append(defaultCurrency, rhs.defaultCurrency).append(name, rhs.name).append(at, rhs.at).append(rounding, rhs.rounding).append(defaultHourlyRate, rhs.defaultHourlyRate).isEquals();
    }

}
