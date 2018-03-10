package io.github.dmitrychaban.java_toggl_sdk_light.model.remote;

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
import io.github.dmitrychaban.java_toggl_sdk_light.model.UserContext;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "since",
        "data"
})
public class ResponseWrapper implements Serializable
{

    @JsonProperty("since")
    private Integer since;
    @JsonProperty("data")
    @Valid
    private UserContext data;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4940464417623493558L;

    @JsonProperty("since")
    public Integer getSince() {
        return since;
    }

    @JsonProperty("since")
    public void setSince(Integer since) {
        this.since = since;
    }

    public ResponseWrapper withSince(Integer since) {
        this.since = since;
        return this;
    }

    @JsonProperty("data")
    public UserContext getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(UserContext data) {
        this.data = data;
    }

    public ResponseWrapper withData(UserContext data) {
        this.data = data;
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

    public ResponseWrapper withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("since", since).append("data", data).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(data).append(since).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResponseWrapper) == false) {
            return false;
        }
        ResponseWrapper rhs = ((ResponseWrapper) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(data, rhs.data).append(since, rhs.since).isEquals();
    }

}
