package com.durvisha.exception;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonSerialize
@JsonDeserialize
@JsonIgnoreProperties
@JsonIgnoreType
@JsonPOJOBuilder
@JsonAutoDetect
@EqualsAndHashCode
@Slf4j
@JsonClassDescription("Aim Exception Json")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "statusCode",
        "timestamp",
        "message",
        "description"
})
public class AimException extends Exception {
    @JsonProperty("statusCode")
    private int statusCode;
    @JsonProperty("timestamp")
    private Date timestamp;
    @JsonProperty("message")
    private  String message;
    @JsonProperty("description")
    private String description;

}