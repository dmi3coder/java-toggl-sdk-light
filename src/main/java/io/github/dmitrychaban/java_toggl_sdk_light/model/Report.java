
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
    "total_grand",
    "total_billable",
    "total_count",
    "per_page",
    "total_currencies",
    "data"
})
public class Report implements Serializable
{

    @JsonProperty("total_grand")
    private Integer totalGrand;
    @JsonProperty("total_billable")
    private Integer totalBillable;
    @JsonProperty("total_count")
    private Integer totalCount;
    @JsonProperty("per_page")
    private Integer perPage;
    @JsonProperty("total_currencies")
    @Valid
    private List<TotalCurrency> totalCurrencies = null;
    @JsonProperty("data")
    @Valid
    private List<Timer> data = null;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1519126759710595386L;

    @JsonProperty("total_grand")
    public Integer getTotalGrand() {
        return totalGrand;
    }

    @JsonProperty("total_grand")
    public void setTotalGrand(Integer totalGrand) {
        this.totalGrand = totalGrand;
    }

    public Report withTotalGrand(Integer totalGrand) {
        this.totalGrand = totalGrand;
        return this;
    }

    @JsonProperty("total_billable")
    public Integer getTotalBillable() {
        return totalBillable;
    }

    @JsonProperty("total_billable")
    public void setTotalBillable(Integer totalBillable) {
        this.totalBillable = totalBillable;
    }

    public Report withTotalBillable(Integer totalBillable) {
        this.totalBillable = totalBillable;
        return this;
    }

    @JsonProperty("total_count")
    public Integer getTotalCount() {
        return totalCount;
    }

    @JsonProperty("total_count")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Report withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    @JsonProperty("per_page")
    public Integer getPerPage() {
        return perPage;
    }

    @JsonProperty("per_page")
    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    public Report withPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }

    @JsonProperty("total_currencies")
    public List<TotalCurrency> getTotalCurrencies() {
        return totalCurrencies;
    }

    @JsonProperty("total_currencies")
    public void setTotalCurrencies(List<TotalCurrency> totalCurrencies) {
        this.totalCurrencies = totalCurrencies;
    }

    public Report withTotalCurrencies(List<TotalCurrency> totalCurrencies) {
        this.totalCurrencies = totalCurrencies;
        return this;
    }

    @JsonProperty("data")
    public List<Timer> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Timer> data) {
        this.data = data;
    }

    public Report withData(List<Timer> data) {
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

    public Report withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("totalGrand", totalGrand).append("totalBillable", totalBillable).append("totalCount", totalCount).append("perPage", perPage).append("totalCurrencies", totalCurrencies).append("data", data).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalCount).append(additionalProperties).append(data).append(perPage).append(totalBillable).append(totalGrand).append(totalCurrencies).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Report) == false) {
            return false;
        }
        Report rhs = ((Report) other);
        return new EqualsBuilder().append(totalCount, rhs.totalCount).append(additionalProperties, rhs.additionalProperties).append(data, rhs.data).append(perPage, rhs.perPage).append(totalBillable, rhs.totalBillable).append(totalGrand, rhs.totalGrand).append(totalCurrencies, rhs.totalCurrencies).isEquals();
    }

}
