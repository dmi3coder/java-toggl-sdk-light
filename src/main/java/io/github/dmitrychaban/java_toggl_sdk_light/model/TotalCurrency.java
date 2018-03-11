
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
    "currency",
    "amount"
})
public class TotalCurrency implements Serializable
{

    @JsonProperty("currency")
    private String currency;
    @JsonProperty("amount")
    private Double amount;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7040414546356578815L;

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public TotalCurrency withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public TotalCurrency withAmount(Double amount) {
        this.amount = amount;
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

    public TotalCurrency withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("currency", currency).append("amount", amount).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(amount).append(additionalProperties).append(currency).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TotalCurrency) == false) {
            return false;
        }
        TotalCurrency rhs = ((TotalCurrency) other);
        return new EqualsBuilder().append(amount, rhs.amount).append(additionalProperties, rhs.additionalProperties).append(currency, rhs.currency).isEquals();
    }

}
