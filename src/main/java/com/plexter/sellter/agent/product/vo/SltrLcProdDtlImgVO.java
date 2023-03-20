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
@Schema(name = "SltrLcProdDtlImgVO", description = "SLTR_LC_PROD, SLTR_LC_PROD_DTL 에 수집된 상품 정보에서 이미지 파일의 경로와 유형, SEQ 의 모음")
public class SltrLcProdDtlImgVO {

    @Schema(name = "OBJ_ID", description = "TBD")
    @JsonProperty("OBJ_ID")
    private String OBJ_ID;
    @Schema(name = "USER_OBJ_ID", description = "사용자 고유 식별 정보 ")
    @JsonProperty("USER_OBJ_ID")
    private String USER_OBJ_ID;
    @Schema(name = "PROD_OBJ_ID", description = "SLTR_LC_PROD.OBJ_ID")
    @JsonProperty("PROD_OBJ_ID")
    private String PROD_OBJ_ID;
    @Schema(name = "PROD_DTL_OBJ_ID", description = "SLTR_LC_PROD_DTL_OBJ_ID")
    @JsonProperty("PROD_DTL_OBJ_ID")
    private String PROD_DTL_OBJ_ID;
    @Schema(name = "IMG_TYPE", description = "이미지 유형. (THUMB: 썸네일, MAIN: 상세페이지, TOP:상단 상세페이지, BOT:하단 상세 페이지)")
    @JsonProperty("IMG_TYPE")
    private String IMG_TYPE;
    @Schema(name = "IMG_SEQ", description = "이미지 디스플레이 순서.")
    @JsonProperty("IMG_SEQ")
    private Integer IMG_SEQ;
    @Schema(name = "VALUE_TYPE", description = "썸네일을 제외한 나머지 이미지 유형에서 이미지 대신 텍스트를 쓰기 위한 구분자 (IMG:이미지, TXT:텍스트)")
    @JsonProperty("VALUE_TYPE")
    private String VALUE_TYPE;
    @Schema(name = "DEFAULT_YN", description = "Y/N. 썸네일의 경우 메인 디폴트 이미지를 고르기 위함")
    @JsonProperty("DEFAULT_YN")
    private String DEFAULT_YN;
    @Schema(name = "FILE_PATH", description = "로컬 또는 소싱 사이트 이미지 경로. 파일명 포함. 단, ValueType 이 TXT 인 경우, 해당 컬럼에 String Value 를 넣는다")
    @JsonProperty("FILE_PATH")
    private String FILE_PATH;
    @Schema(name = "FILE_SIZE", description = "(Optional) 이미지 파일 사이즈 (단위 KB)")
    @JsonProperty("FILE_SIZE")
    private Integer FILE_SIZE;
    @Schema(name = "IMG_VER", description = "이미지 버전 정보. 최초 1로 생성하고(수집할 때), 사용자에 의해 해당 이미지가 변경되면 count +1")
    @JsonProperty("IMG_VER")
    private Integer IMG_VER;
    @Schema(name = "CREATE_USER_ID", description = "생셩자")
    @JsonProperty("CREATE_USER_ID")
    private String CREATE_USER_ID;
    @Schema(name = "UPDATE_USER_ID", description = "수정자")
    @JsonProperty("UPDATE_USER_ID")
    private String UPDATE_USER_ID;
}
