package com.plexter.sellter.agent.product.vo;

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
@Schema(name = "SltrLcProdDtlVO", description = "SLTR_LC_PROD 에 수집한 상품 정보의 상세 정보 테이블. 옵션(색상, 사이즈 등) 등")
public class SltrLcProdDtlVO {

    @Schema(name = "OBJ_ID", description = "TBD")
    @JsonProperty("OBJ_ID")
    private String OBJ_ID;
    @Schema(name = "USER_OBJ_ID", description = "TBD")
    @JsonProperty("USER_OBJ_ID")
    private String USER_OBJ_ID;
    @Schema(name = "KEYWORD_OBJ_ID", description = "TBD")
    @JsonProperty("KEYWORD_OBJ_ID")
    private String KEYWORD_OBJ_ID;
    @Schema(name = "OPT_TYP", description = "옵션에 대한 Type\n" +
                                            "ex) 색성, 사이즈 혹은 색상 &사이즈 (복합 옵션)\n" +
                                            "복합 옵션은 어떻게… DB에 적재할 수 있을까요…?")
    @JsonProperty("OPT_TYP")
    private String OPT_TYP;
    @Schema(name = "OPT_NAME", description = "옵션 이름\n" +
                                                "ex) 베이지색, Camel 색, XL")
    @JsonProperty("OPT_NAME")
    private Integer OPT_NAME;
    @Schema(name = "OPT_PRICE", description = "옵션에 대한 가격")
    @JsonProperty("OPT_PRICE")
    private Integer OPT_PRICE;
    @Schema(name = "OPT_CURRENCY", description = "TBD")
    @JsonProperty("OPT_CURRENCY")
    private String OPT_CURRENCY;
    @Schema(name = "SOURCE_ITEM_ID", description = "소싱처 아이템 ID")
    @JsonProperty("SOURCE_ITEM_ID")
    private String SOURCE_ITEM_ID;
    @Schema(name = "SOURCE_ITEM_URL", description = "소싱처 아이템 URI")
    @JsonProperty("SOURCE_ITEM_URL")
    private String SOURCE_ITEM_URL;
    @Schema(name = "OBJ_STATE_CD", description = "WIP : 데이터 수집 상태, PRD : 배포 가능 상태, ITM : 배포된 상태")
    @JsonProperty("OBJ_STATE_CD")
    private String OBJ_STATE_CD;
    @Schema(name = "PRODUCT_FILE_NAME", description = "파일 OBJECT KEY 인, File_name")
    @JsonProperty("PRODUCT_FILE_NAME")
    private String PRODUCT_FILE_NAME;
    @Schema(name = "DEPLOY_CP_KEY", description = "쿠팡에서 받은 MKT_ITEM_ID")
    @JsonProperty("DEPLOY_CP_KEY")
    private String DEPLOY_CP_KEY;
    @Schema(name = "DEPLOY_CP_DATE", description = "해당 사이트로 배포한 시간")
    @JsonProperty("DEPLOY_CP_DATE")
    private Date DEPLOY_CP_DATE;
    @Schema(name = "DEPLOY_SS_KEY", description = "SS(스마트스토어)에서 받은 MKT_ITEM_ID")
    @JsonProperty("DEPLOY_SS_KEY")
    private String DEPLOY_SS_KEY;
    @Schema(name = "DEPLOY_SS_DATE", description = "해당 사이트로 배포한 시간")
    @JsonProperty("DEPLOY_SS_DATE")
    private Date DEPLOY_SS_DATE;
    @Schema(name = "DEPLOY_11_KEY", description = "11에서 받은 MKT_ITEM_ID")
    @JsonProperty("DEPLOY_11_KEY")
    private String DEPLOY_11_KEY;
    @Schema(name = "DEPLOY_11_DATE", description = "해당 사이트로 배포한 시간")
    @JsonProperty("DEPLOY_11_DATE")
    private Date DEPLOY_11_DATE;
    @Schema(name = "DEPLOY_GM_KEY", description = "GM(G마켓)에서 받은 MKT_ITEM_ID")
    @JsonProperty("DEPLOY_GM_KEY")
    private String DEPLOY_GM_KEY;
    @Schema(name = "DEPLOY_GM_DATE", description = "해당 사이트로 배포한 시간")
    @JsonProperty("DEPLOY_GM_DATE")
    private Date DEPLOY_GM_DATE;
    @Schema(name = "DEPLOY_AC_KEY", description = "AC(옥션)에서 받은 MKT_ITEM_ID")
    @JsonProperty("DEPLOY_AC_KEY")
    private String DEPLOY_AC_KEY;
    @Schema(name = "DEPLOY_AC_DATE", description = "해당 사이트로 배포한 시간")
    @JsonProperty("DEPLOY_AC_DATE")
    private Date DEPLOY_AC_DATE;
    @Schema(name = "DEPLOY_INT_KEY", description = "INT(인터파크)에서 받은 MKT_ITEM_ID")
    @JsonProperty("DEPLOY_INT_KEY")
    private String DEPLOY_INT_KEY;
    @Schema(name = "DEPLOY_INT_DATE", description = "해당 사이트로 배포한 시간")
    @JsonProperty("DEPLOY_INT_DATE")
    private Date DEPLOY_INT_DATE;
    @Schema(name = "DEPLOY_EXT_KEY", description = "기 설정된 마켓 외 배포 관리를 위해 외부 연결고리")
    @JsonProperty("DEPLOY_EXT_KEY")
    private String DEPLOY_EXT_KEY;
    @Schema(name = "CREATE_USER_ID", description = "생성자")
    @JsonProperty("CREATE_USER_ID")
    private String CREATE_USER_ID;
    @Schema(name = "UPDATE_USER_ID", description = "수정자")
    @JsonProperty("UPDATE_USER_ID")
    private String UPDATE_USER_ID;
}
