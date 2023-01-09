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
@Schema(name = "MonthlyRecordListVo", description = "[Out] View My All Monthly Sales")
public class MonthlyRecordListVo {
    @Schema(name = "LICENSE_NAME", description = "User License Name")
    @JsonProperty("LICENSE_NAME")
    private String LICENSE_NAME;
    @Schema(name = "MARKET_NAME_CD", description = "Market Code")
    @JsonProperty("MARKET_NAME_CD")
    private String MARKET_NAME_CD;

    @Schema(name = "CREATE_DATE", description = "생성 날짜를 기재한거 같아용...")
    @JsonProperty("CREATE_DATE")
    private Integer CREATE_DATE;

    @Schema(name = "AMOUNT", description = "TOTAL_SALES by market.")
    @JsonProperty("AMOUNT")
    private Integer AMOUNT;
}
