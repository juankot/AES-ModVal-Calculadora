
package co.edu.javeriana.calc;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Terms
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "num1",
    "num2"
})
public class Terms {

    /**
     * First operation term.
     * (Required)
     * 
     */
    @JsonProperty("num1")
    @JsonPropertyDescription("First operation term.")
    private Integer num1;
    /**
     * Second operation term.
     * (Required)
     * 
     */
    @JsonProperty("num2")
    @JsonPropertyDescription("Second operation term.")
    private Integer num2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * First operation term.
     * (Required)
     * 
     */
    @JsonProperty("num1")
    public Integer getNum1() {
        return num1;
    }

    /**
     * First operation term.
     * (Required)
     * 
     */
    @JsonProperty("num1")
    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Terms withNum1(Integer num1) {
        this.num1 = num1;
        return this;
    }

    /**
     * Second operation term.
     * (Required)
     * 
     */
    @JsonProperty("num2")
    public Integer getNum2() {
        return num2;
    }

    /**
     * Second operation term.
     * (Required)
     * 
     */
    @JsonProperty("num2")
    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public Terms withNum2(Integer num2) {
        this.num2 = num2;
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

    public Terms withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
