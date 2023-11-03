package com.tsh.slt.agent.domain.keyword.vo;

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
@Schema(name = "SltrLcKeywordVO", description = "USER 단위로 등록하는 키워드 정보")
public class SltrLcKeywordVO {

    @Schema(name = "OBJ_ID", description = "TBD")
    @JsonProperty("OBJ_ID")
    private String OBJ_ID;
    @Schema(name = "USER_OBJ_ID", description = "TBD")
    @JsonProperty("USER_OBJ_ID")
    private String USER_OBJ_ID;

    @Schema(name = "PROD_KEYWORD", description = "등록할 관리 키워드")
    @JsonProperty("PROD_KEYWORD")
    private String PROD_KEYWORD;

    @Schema(name = "SRC_MKT_ID", description = "STLR_LC_MKT_DEF.MKT_ID 연결")
    @JsonProperty("SRC_MKT_ID")
    private String SRC_MKT_ID;

    @Schema(name = "KEYWORD_URL", description = "수집 URL")
    @JsonProperty("KEYWORD_URL")
    private String KEYWORD_URL;

    @Schema(name = "SEARCH_KEYWORD", description = "소싱 사이트에서 찾을 때 사용한 키워드 (검색어)")
    @JsonProperty("SEARCH_KEYWORD")
    private String SEARCH_KEYWORD;

    @Schema(name = "SUBJECT_KEYWORD", description = "상품 제목에 들어갈 키워드 (* 키워드1,키워드2,키워드3,…,키워드n)")
    @JsonProperty("SUBJECT_KEYWORD")
    private String SUBJECT_KEYWORD;

    @Schema(name = "SUBJECT_LOC_TYPE", description = "FRONT: 맨 앞, RANDOM: 랜덤, FIRST: 1번 맨 앞 나머지 랜덤")
    @JsonProperty("SUBJECT_LOC_TYPE")
    private String SUBJECT_LOC_TYPE;

    @Schema(name = "HASH_TAG", description = "해시 태그 (* 해시태그1,해시태그2,…,해시태그n)")
    @JsonProperty("HASH_TAG")
    private String HASH_TAG;

    @Schema(name = "AUTO_SEARCH_YN", description = "Y: 설정, N: 해제")
    @JsonProperty("AUTO_SEARCH_YN")
    private String AUTO_SEARCH_YN;

    @Schema(name = "COLLECT_START_PAGE", description = "수집 페이지 설정 (시작 페이지)")
    @JsonProperty("COLLECT_START_PAGE")
    private Integer COLLECT_START_PAGE;

    @Schema(name = "COLLECT_END_PAGE", description = "수집 페이지 설정 (마지막 페이지)")
    @JsonProperty("COLLECT_END_PAGE")
    private Integer COLLECT_END_PAGE;

    @Schema(name = "BASE_MGN_RATE", description = "키워드 기본 마진률. 값이 없는 경우는 마켓 설정을 따름")
    @JsonProperty("BASE_MGN_RATE")
    private Integer BASE_MGN_RATE;

    @Schema(name = "BASE_MGN_VALUE", description = "키워드 최조 기본 마진, 값이 없을 경우는 마켓 설정을 따름")
    @JsonProperty("BASE_MGN_VALUE")
    private Integer BASE_MGN_VALUE;

    @Schema(name = "REGIST_DATE", description = "등록일자")
    @JsonProperty("REGIST_DATE")
    private Date REGIST_DATE;

    @Schema(name = "COLLECT_PROD_YN", description = "키워드 상품 수집 여부")
    @JsonProperty("COLLECT_PROD_YN")
    private String COLLECT_PROD_YN;

    @Schema(name = "LAST_COLLECT_DATE", description = "키워드로 상품 최초 수집일")
    @JsonProperty("LAST_COLLECT_DATE")
    private Date LAST_COLLECT_DATE;

    @Schema(name = "PROD_QTY", description = "키워드로 등록된 전체 제품 수")
    @JsonProperty("PROD_QTY")
    private Integer PROD_QTY;

    @Schema(name = "COLLECT_QTY", description = "상품 수집이 최종적으로 완료된 제품 수")
    @JsonProperty("COLLECT_QTY")
    private String COLLECT_QTY;

    @Schema(name = "CP_CATEGORY", description = "쿠팡 추천 카테고리")
    @JsonProperty("CP_CATEGORY")
    private String CP_CATEGORY;

    @Schema(name = "SS_CATEGORY", description = "스마트스토어 추천 카테고리")
    @JsonProperty("SS_CATEGORY")
    private String SS_CATEGORY;

    @Schema(name = "E11ST_CATEGORY", description = "11번가 추천 카테고리")
    @JsonProperty("E11ST_CATEGORY")
    private String E11ST_CATEGORY;

    @Schema(name = "GM_CATEGORY", description = "지마켓 추천 카테고리")
    @JsonProperty("GM_CATEGORY")
    private String GM_CATEGORY;

    @Schema(name = "INTPK_CATEGORY", description = "인터파트 추천 카테고리")
    @JsonProperty("INTPK_CATEGORY")
    private String INTPK_CATEGORY;

    @Schema(name = "FAV_KEYWARD_YN", description = "핵심 키워드 여부")
    @JsonProperty("FAV_KEYWARD_YN")
    private String FAV_KEYWARD_YN;

    @Schema(name = "CREATE_USER_ID", description = "생성자")
    @JsonProperty("CREATE_USER_ID")
    private String CREATE_USER_ID;

    @Schema(name = "UPDATE_USER_ID", description = "수정자")
    @JsonProperty("UPDATE_USER_ID")
    private String UPDATE_USER_ID;

}


