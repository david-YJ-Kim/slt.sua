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
@Schema(name = "TopSellingItemListVo", description = "[Out] View My Top Selling Item List")
public class TopSellingItemListVo {

    @Schema(name = "LICENSE_NAME", description = "User License Name")
    @JsonProperty("LICENSE_NAME")
    private String LICENSE_NAME;
    @Schema(name = "MARKET_NAME_CD", description = "Market Code")
    @JsonProperty("MARKET_NAME_CD")
    private String MARKET_NAME_CD;

    @Schema(name = "MARKET_ITEM_ID", description = "Market ITem Id")
    @JsonProperty("MARKET_ITEM_ID")
    private String MARKET_ITEM_ID;

    @Schema(name = "CREATE_DATE", description = "생성 날짜를 기재한거 같아용...")
    @JsonProperty("CREATE_DATE")
    private Integer CREATE_DATE;

    @Schema(name = "ITEM_CNT", description = "Saled Item Count.")
    @JsonProperty("ITEM_CNT")
    private Integer ITEM_CNT;

}
