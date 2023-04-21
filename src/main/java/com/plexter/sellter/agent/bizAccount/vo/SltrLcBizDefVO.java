package com.plexter.sellter.agent.bizAccount.vo;

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
@Schema(name = "SltrLcBizDefVO", description = "사업자 등록 정보 및 사업자 단위로 설정하는 공통 속성")
public class SltrLcBizDefVO {

    @Schema(name = "OBJ_ID", description = "TBD")
    @JsonProperty("OBJ_ID")
    private String OBJ_ID;
    @Schema(name = "USER_OBJ_ID", description = "사용자 ID")
    @JsonProperty("USER_OBJ_ID")
    private String USER_OBJ_ID;
    @Schema(name = "BIZ_REG_NUM", description = "사업자 등록번호")
    @JsonProperty("BIZ_REG_NUM")
    private String BIZ_REG_NUM;
    @Schema(name = "BIZ_NAME", description = "법인명/상호명")
    @JsonProperty("BIZ_NAME")
    private String BIZ_NAME;
    @Schema(name = "REP_USE_NAME", description = "대표자/성명")
    @JsonProperty("REP_USE_NAME")
    private String REP_USE_NAME;
    @Schema(name = "BIZ_ADDR", description = "사업장 소재지")
    @JsonProperty("BIZ_ADDR")
    private String BIZ_ADDR;
    @Schema(name = "BIZ_START_DATE", description = "개업년월일")
    @JsonProperty("BIZ_START_DATE")
    private Date BIZ_START_DATE;
    @Schema(name = "DISP_SEQ", description = "USER 단위로 사업자를 화면에 보여줄 때, SEQUENCE")
    @JsonProperty("DISP_SEQ")
    private Integer DISP_SEQ;
    @Schema(name = "USE_YN", description = "등록 유지 여부 (사업자 추가 후, 인증 완료 시, Y 그 외에 당장은 변경 관리 필요하진 않음)")
    @JsonProperty("USE_YN")
    private String USE_YN;
    @Schema(name = "LAST_VALID_DATE", description = "마지막에 해당 사업자 유효성 체크한 날짜")
    @JsonProperty("LAST_VALID_DATE")
    private Date LAST_VALID_DATE;
    @Schema(name = "BASE_MGN_RATE", description = "가격설정 > 기본 마진율")
    @JsonProperty("BASE_MGN_RATE")
    private Integer BASE_MGN_RATE;
    @Schema(name = "BASE_MGN_VALUE", description = "가격설정 > 기본 마진 금액")
    @JsonProperty("BASE_MGN_VALUE")
    private Integer BASE_MGN_VALUE;
    @Schema(name = "CREATE_USER_ID", description = "TBD")
    @JsonProperty("CREATE_USER_ID")
    private String CREATE_USER_ID;
    @Schema(name = "UPDATE_USER_ID", description = "TBD")
    @JsonProperty("UPDATE_USER_ID")
    private String UPDATE_USER_ID;
}
