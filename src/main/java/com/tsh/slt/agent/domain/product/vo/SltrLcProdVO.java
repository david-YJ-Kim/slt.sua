package com.tsh.slt.agent.domain.product.vo;

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
@Schema(name = "SltrLcProdVO", description = "해당 USER 가 등록한 키워드로 수집한 개별 상품 정보. 사업자 구분 및 등록하려는 대상 마켓 정보와 무관하게 USER/Keyword 단위로 수집")
public class SltrLcProdVO {

    @Schema(name = "OBJ_ID", description = "TBD")
    @JsonProperty("OBJ_ID")
    private String OBJ_ID;

    @Schema(name = "PROD_ID", description = "개별 상품의 Unique 한 정보,  Sourcing Market의 Item ID")
    @JsonProperty("PROD_ID")
    private String PROD_ID;

    @Schema(name = "KEYWORD_OBJ_ID", description = "연결 키워드 정보")
    @JsonProperty("KEYWORD_OBJ_ID")
    private String KEYWORD_OBJ_ID;

    @Schema(name = "PRD_TITLE", description = "상품 제목")
    @JsonProperty("PRD_TITLE")
    private String PRD_TITLE;

    @Schema(name = "PRD_CONTENT", description = "상품에 대한 설명")
    @JsonProperty("PRD_CONTENT")
    private String PRD_CONTENT;

    @Schema(name = "PRICE_CURRENCY", description = "KRW : 한화, CNY :  위완화, USD : 달러")
    @JsonProperty("PRICE_CURRENCY")
    private String PRICE_CURRENCY;

    @Schema(name = "PRD_PRICE", description = "상품 대표적인 가격, 대표 가격 부재 시, 옵션 가격 중 가작 적은 금액으로 대체")
    @JsonProperty("PRD_PRICE")
    private Integer PRD_PRICE;

    @Schema(name = "DELIVERY_OPT", description = "상품에 해당 하는 배송 옵션\n" +
                                                "Aliexpress 기준) Aliexpress Standard or Aliexpress Selection이 존재. 해당 옵션으로 수집 여부 결정\n" +
                                                "                      - 위 두가지 Delivery Type이 아니면, 수집 포기\n")
    @JsonProperty("DELIVERY_OPT")
    private String DELIVERY_OPT;

    @Schema(name = "DELIVERY_YN", description = "Delivery Option 별로, Target 마켓에 올릴 수 있는 여부가 다름")
    @JsonProperty("DELIVERY_YN")
    private String DELIVERY_YN;

    @Schema(name = "SRC_MKT_ID", description = "소싱처 아이템 URI")
    @JsonProperty("SRC_MKT_ID")
    private String SRC_MKT_ID;

    @Schema(name = "PROD_STATUS", description = "WIP: 데이터 수집 상태, DEL: 미사용 상태 (수집 이 후, 해당 상품을 Disable 시킬 때)")
    @JsonProperty("PROD_STATUS")
    private String PROD_STATUS;

    @Schema(name = "FAV_PROD_YN", description = "핵심 상품 등록 여부. (키워드가 핵심 키워드로 등록되면 일괄 변경되고 개별 상품 별로 조작 가능)")
    @JsonProperty("FAV_PROD_YN")
    private String FAV_PROD_YN;

    @Schema(name = "CREATE_USER_ID", description = "생성자")
    @JsonProperty("CREATE_USER_ID")
    private String CREATE_USER_ID;

    @Schema(name = "UPDATE_USER_ID", description = "수정자")
    @JsonProperty("UPDATE_USER_ID")
    private String UPDATE_USER_ID;

}
