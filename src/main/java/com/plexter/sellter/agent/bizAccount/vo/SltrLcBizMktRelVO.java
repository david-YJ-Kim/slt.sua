package com.plexter.sellter.agent.bizAccount.vo;

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
@Schema(name = "SltrLcBizMktRelVO", description = "TBD")
public class SltrLcBizMktRelVO {

    @Schema(name = "OBJ_ID", description = "TBD")
    @JsonProperty("OBJ_ID")
    private String OBJ_ID;

    @Schema(name = "USER_OBJ_ID", description = "TBD")
    @JsonProperty("USER_OBJ_ID")
    private String USER_OBJ_ID;
    @Schema(name = "USER_ID", description = "(복합 UK) 사용자 정보")
    @JsonProperty("USER_ID")
    private String USER_ID;
    @Schema(name = "BIZ_OBJ_ID", description = "사용자의 사업자 정보 (1 User : N Biz)")
    @JsonProperty("BIZ_OBJ_ID")
    private String BIZ_OBJ_ID;
    @Schema(name = "MKT_ID", description = "한 사용자가 한 사업자로 등록할 수 있는 개별 오픈 마켓 쿠팡:CP, 스스:SS, 11번가:11st,G마켓:GM, 옥션:AC, 인터파크:INTPK")
    @JsonProperty("MKT_ID")
    private String MKT_ID;
    @Schema(name = "MKT_USER_ID", description = "사용자의 마켓에 접속하기 위한 ID")
    @JsonProperty("MKT_USER_ID")
    private String MKT_USER_ID;
    @Schema(name = "MKT_USER_PWD", description = "사용자의 마켓에 접속하기 위한 PW")
    @JsonProperty("MKT_USER_PWD")
    private String MKT_USER_PWD;
    @Schema(name = "API_ACCESS_KEY", description = "쿠팡의 ACCESSS KEY / 스스 API 연동용 판매자 ID / 11번가 OPEN API KEY / 인터파크 업체코드")
    @JsonProperty("API_ACCESS_KEY")
    private String API_ACCESS_KEY;
    @Schema(name = "API_SECRET_KEY", description = "쿠팡의 SECRET KEY / 스스 API ID / 인터파크 공급계약번호")
    @JsonProperty("API_SECRET_KEY")
    private  String API_SECRET_KEY;
    @Schema(name = "MKT_COMPANY_CODE", description = "각 마켓에서 정의하는 사업자 코드 EX) 쿠팡 업체코드 A00763631")
    @JsonProperty("MKT_COMPANY_CODE")
    private String MKT_COMPANY_CODE;
    @Schema(name = "AUTO_CONNECT_YN", description = "TBD")
    @JsonProperty("AUTO_CONNECT_YN")
    private String AUTO_CONNECT_YN;
    @Schema(name = "AUTO_PROD_UPLOAD_YN", description = "TBD")
    @JsonProperty("AUTO_PROD_UPLOAD_YN")
    private String AUTO_PROD_UPLOAD_YN;
    @Schema(name = "MGN_RATE", description = "사업자별 기본마진률")
    @JsonProperty("MGN_RATE")
    private  Integer MGN_RATE;
    @Schema(name = "MGN_BASIC", description = "사업자별 최조 기본 마진")
    @JsonProperty("MGN_BASIC")
    private Integer MGN_BASIC;
    @Schema(name = "CREATE_USER_ID", description = "생성자")
    @JsonProperty("CREATE_USER_ID")
    private String CREATE_USER_ID;
    @Schema(name = "UPDATE_USER_ID", description = "수정자")
    @JsonProperty("UPDATE_USER_ID")
    private String UPDATE_USER_ID;
}
