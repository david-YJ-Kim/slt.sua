package com.tsh.slt.sua.domain.user.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@EqualsAndHashCode(callSuper = false)
@JsonInclude(value = JsonInclude.Include.ALWAYS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Schema(name = "SltrLcUserVO", description = "User 정보는 기본적으로 Server 에 저장하고 단위 Agent 에서 수행 시, 단독으로 필요한 정보와 연계되어야 하는 정보로 구분" +
                                                " * Server 의 USER Def 정보는 로그인 및 사용자 인증 등의 목적으로 사용" +
                                                " * Local 의 USER Def 정보는 USER 단위로 설정하는 기능에 매핑되는 기준정보")
public class SltrLcUserVO {

    @Schema(name = "OBJ_ID", description = "TBD")
    @JsonProperty("OBJ_ID")
    private String OBJ_ID;

    @Schema(name = "USER_ID", description = "Value : Email Address  *String Format checker 필요")
    @JsonProperty("USER_ID")
    private String USER_ID;

    @Schema(name = "USER_NAME", description = "사용자 이름")
    @JsonProperty("USER_NAME")
    private String USER_NAME;

    @Schema(name = "ACTV_LIC_ID", description = "사용자에게 활성화 되어 있는 이용권 정보")
    @JsonProperty("ACTV_LIC_ID")
    private String ACTV_LIC_ID;

    @Schema(name = "ACTV_DATE", description = "이용권 활성화 시간")
    @JsonProperty("ACTV_DATE")
    private Date ACTV_DATE;

    @Schema(name = "USD_EXCH_RATE", description = "가격설정 > 미국 달러 환율. USER 공통 설정")
    @JsonProperty("USD_EXCH_RATE")
    private Integer USD_EXCH_RATE;

    @Schema(name = "CNY_EXCH_RATE", description = "가격설정 > 중국 위안 환율. USER 공통 설정")
    @JsonProperty("CNY_EXCH_RATE")
    private Integer CNY_EXCH_RATE;

    @Schema(name = "BASE_MGN_RATE", description = "가격설정 > 기본 마진율")
    @JsonProperty("BASE_MGN_RATE")
    private Integer BASE_MGN_RATE;

    @Schema(name = "BASE_MGN_VALUE", description = "가격설정 > 기본 마진 금액")
    @JsonProperty("BASE_MGN_VALUE")
    private Integer BASE_MGN_VALUE;

    @Schema(name = "CUSTM_EXCD_MGN_RATE", description = "가격설정 > 관세 초과 마진율")
    @JsonProperty("CUSTM_EXCD_MGN_RATE")
    private Integer CUSTM_EXCD_MGN_RATE;

    @Schema(name = "CUSTM_EXCD_MGN_VALUE", description = "가격설정 > 관세 초과 마진 금액")
    @JsonProperty("CUSTM_EXCD_MGN_VALUE")
    private Integer CUSTM_EXCD_MGN_VALUE;

    @Schema(name = "SHIP_FEE_TYPE", description = "배송비 설정 > FREE, CHARGED")
    @JsonProperty("SHIP_FEE_TYPE")
    private String SHIP_FEE_TYPE;

    @Schema(name = "BASE_SHIP_FEE", description = "배송비 설정 > 기본 배송비")
    @JsonProperty("BASE_SHIP_FEE")
    private Integer BASE_SHIP_FEE;

    @Schema(name = "RTRN_SHIP_FEE", description = "배송비 설정 > 반품 배송비")
    @JsonProperty("RTRN_SHIP_FEE")
    private Integer RTRN_SHIP_FEE;

    @Schema(name = "EXCD_SHIP_FEE", description = "배송비 설정 > 교환 배송비")
    @JsonProperty("EXCD_SHIP_FEE")
    private Integer EXCD_SHIP_FEE;

    @Schema(name = "MFR_NAME", description = "상품설정 > 제조사")
    @JsonProperty("MFR_NAME")
    private String MFR_NAME;

    @Schema(name = "BRAND_NAME", description = "상품설정 > 브랜드")
    @JsonProperty("BRAND_NAME")
    private String BRAND_NAME;

    @Schema(name = "UNDR_PUR_AVAIL_FLAG", description = "상품설정 > 미성년자 구매 USABLE:가능, DISABLE:불가능")
    @JsonProperty("UNDR_PUR_AVAIL_FLAG")
    private String UNDR_PUR_AVAIL_FLAG;

    @Schema(name = "THUMB_OPTION_YNl", description = "상품설정 > 썸네일옵션 이미지 사용 여부\n" +
                                                        "옵션이미지 설정 (디폴트값 = 사용하기)\n" +
                                                        "1. \"사용하기\" 선택 시 : 쿠팡, ESM(G마켓/옥션)의 경우, 정책에 따라 썸네일에 옵션이미지를 사용합니다.\n" +
                                                        "2. \"사용하지 않기\" 선택 시 : 옵션이미지를 썸네일로 사용하지 않고, 대표이미지를 그대로 유지합니다.")
    @JsonProperty("THUMB_OPTION_YNl")
    private String THUMB_OPTION_YNl;

    @Schema(name = "HASH_TAG_AUTO_YN", description = "상품설정 > 썸네일옵션 이미지 사용 여부")
    @JsonProperty("HASH_TAG_AUTO_YN")
    private String HASH_TAG_AUTO_YN;

    @Schema(name = "TOP_IMG_USE_FLAG", description = "상품설정 > 상단 이미지> SLTR_LC_IMG_DTL.OBJ_ID 와 연계. USE:사용, UNUSE:미사용")
    @JsonProperty("TOP_IMG_USE_FLAG")
    private String TOP_IMG_USE_FLAG;

    @Schema(name = "BASE_TOP_IMG_USE_FLAG", description = "상품설정 > 상단 이미지를 SELLTER 제공 기본 이미지를 사용하는 경우 USE/UNUSE")
    @JsonProperty("BASE_TOP_IMG_USE_FLAG")
    private String BASE_TOP_IMG_USE_FLAG;

    @Schema(name = "BOT_IMG_USE_FLAG", description = "상품설정 > 하단 이미지 정보 > SLTR_LC_IMG_DTL.OBJ_ID 와 연계  USE:사용, UNUSE:미사용")
    @JsonProperty("BOT_IMG_USE_FLAG")
    private String BOT_IMG_USE_FLAG;

    @Schema(name = "BASE_BOT_IMG_USE_FLAG", description = "상품설정 > 하단 이미지를 SELLTER 제공 기본 이미지를 사용하는 경우 USE/UNUSE")
    @JsonProperty("BASE_BOT_IMG_USE_FLAG")
    private String BASE_BOT_IMG_USE_FLAG;

    @Schema(name = "CREATE_USER_ID", description = "생성자")
    @JsonProperty("CREATE_USER_ID")
    private String CREATE_USER_ID;

    @Schema(name = "UPDATE_USER_ID", description = "수정자")
    @JsonProperty("UPDATE_USER_ID")
    private String UPDATE_USER_ID;

}
