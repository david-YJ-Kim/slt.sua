package com.tsh.slt.sua.domain.main.vo;

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
@Schema(name = "OrderDashBoardListVo", description = "[Out] View My Order BashBoard")
public class OrderDashBoardListVo {

    @Schema(name = "LICENSE_NAME", description = "User License Name")
    @JsonProperty("LICENSE_NAME")
    private String LICENSE_NAME;
    @Schema(name = "MARKET_NAME_CD", description = "Market Code")
    @JsonProperty("MARKET_NAME_CD")
    private String MARKET_NAME_CD;

    @Schema(name = "ORDER_STATE_CD", description = "Order Status")
    @JsonProperty("ORDER_STATE_CD")
    private String ORDER_STATE_CD;

    @Schema(name = "ITEM_CNT", description = "Saled Item Count.")
    @JsonProperty("ITEM_CNT")
    private Integer ITEM_CNT;

}
