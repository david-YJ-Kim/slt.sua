package com.plexter.sellter.agent.main.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper = false)
@JsonInclude(value = JsonInclude.Include.ALWAYS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Schema(name = "MothRecordListVo", description = "[Out] View My All Month Sales")
public class MonthRecordListVo {
    @Schema(name = "LICENSE_NAME", description = "User License Name")
    @JsonProperty("LICENSE_NAME")
    private String LICENSE_NAME;
    @Schema(name = "MARKET_NAME_CD", description = "Market Code")
    @JsonProperty("MARKET_NAME_CD")
    private String MARKET_NAME_CD;

    @Schema(name = "AMOUNT", description = "TOTAL_SALES by market.")
    @JsonProperty("AMOUNT")
    private Integer AMOUNT;
}
