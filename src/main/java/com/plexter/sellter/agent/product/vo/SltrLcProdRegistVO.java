package com.plexter.sellter.agent.product.vo;

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
@Schema(name = "SltrLcProdRegistVO", description = "키워드 단위로 수집한 상품들을 전체 혹은 개별로 오픈 마켓에 등록한 정보")
public class SltrLcProdRegistVO {

    @Schema(name = "OBJ_ID", description = "TBD")
    @JsonProperty("OBJ_ID")
    private String OBJ_ID;
    @Schema(name = "USER_OBJ_ID", description = "사용자 고유 식별 정보 ")
    @JsonProperty("USER_OBJ_ID")
    private String USER_OBJ_ID;
    @Schema(name = "REG_PROD_ID", description = "등록한 오픈 마켓의 고유 제품 정보. (쿠팡: sellerProductId)")
    @JsonProperty("REG_PROD_ID")
    private String REG_PROD_ID;
    @Schema(name = "COLLECT_PROD_OBJ_ID", description = "등록한 제품의 소싱처 제품 연결 정보 (SLTR_LC_PROD.OBJ_ID)")
    @JsonProperty("COLLECT_PROD_OBJ_ID")
    private String COLLECT_PROD_OBJ_ID;
    @Schema(name = "TRGT_MKT_ID", description = "등록한 오픈 마켓 식별 정보")
    @JsonProperty("TRGT_MKT_ID")
    private String TRGT_MKT_ID;
    @Schema(name = "REG_VERSION", description = "수집한 제품의 버전 정보. 등록 시점의 버전을 기록함")
    @JsonProperty("REG_VERSION")
    private Integer REG_VERSION;
    @Schema(name = "REG_PRICE", description = "TBD")
    @JsonProperty("REG_PRICE")
    private Integer REG_PRICE;
    @Schema(name = "PRICE_CURRENCY", description = "KRW:원, USD:달러")
    @JsonProperty("PRICE_CURRENCY")
    private String PRICE_CURRENCY;
    @Schema(name = "TRGT_PROD_URL", description = "등록 제품의 페이지 URL (쿠팡: https://www.coupang.com/vp/products/[sellerProductId]")
    @JsonProperty("TRGT_PROD_URL")
    private String TRGT_PROD_URL;
    @Schema(name = "CREATE_USER_ID", description = "생성자")
    @JsonProperty("CREATE_USER_ID")
    private String CREATE_USER_ID;
    @Schema(name = "UPDATE_USER_ID", description = "수정자")
    @JsonProperty("UPDATE_USER_ID")
    private String UPDATE_USER_ID;
}
