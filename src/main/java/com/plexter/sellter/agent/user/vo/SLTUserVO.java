package com.plexter.sellter.agent.user.vo;

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
@Schema(name = "SLTUserVO", description = "TBD")
public class SLTUserVO {

    @Schema(name = "OBJ_ID", description = "TBD")
    @JsonProperty("OBJ_ID")
    private String OBJ_ID;

    @Schema(name = "OBJ_ID", description = "TBD")
    @JsonProperty("OBJ_ID")
    private String USER_ID;
    @Schema(name = "OBJ_ID", description = "TBD")
    @JsonProperty("OBJ_ID")
    private String USER_NAME;
    @Schema(name = "OBJ_ID", description = "TBD")
    @JsonProperty("OBJ_ID")
    private String ACTV_LIC_ID;
    ACTV_DATE
    USD_EXCH_RATE
    CNY_EXCH_RATE
    BASE_MGN_RATE
    BASE_MGN_VALUE
    CUSTM_EXCD_MGN_RATE
    CUSTM_EXCD_MGN_VALUE
    SHIP_FEE_TYPE
    BASE_SHIP_FEE
    RTRN_SHIP_FEE
    EXCD_SHIP_FEE
    MFR_NAME
    BRAND_NAME
    UNDR_PUR_AVAIL_FLAG
    HASH_TAG_AUTO_YN
    TOP_IMG_USE_FLAG
    BASE_TOP_IMG_USE_FLAG
    BOT_IMG_USE_FLAG
    BASE_BOT_IMG_USE_FLAG
    HASH_TAG_AUTO_YN

}
