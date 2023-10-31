package com.tsh.slt.agent.domain.code.vo;

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
@Schema(name = "SltrLcCodeDefVO", description = "SELLTER Table에서 사용하는 Code 관리. Agent 기동 시, SLTR_SVR_CODE_DEF 에서 I/F")
public class SltrLcCodeDefVO {

    @Schema(name = "OBJ_ID", description = "TBD")
    @JsonProperty("OBJ_ID")
    private String OBJ_ID;
    @Schema(name = "CODE_CLASS_ID", description = "Code Class ID")
    @JsonProperty("CODE_CLASS_ID")
    private String CODE_CLASS_ID;
    @Schema(name = "CODE_ID", description = "Code ID")
    @JsonProperty("CODE_ID")
    private String CODE_ID;
    @Schema(name = "KOR_CODE_NAME", description = "한글 설명")
    @JsonProperty("KOR_CODE_NAME")
    private String KOR_CODE_NAME;
    @Schema(name = "ENG_CODE_NAME", description = "영문 설명")
    @JsonProperty("ENG_CODE_NAME")
    private String ENG_CODE_NAME;
    @Schema(name = "USE_YN", description = "Y: Usable, N: Disable")
    @JsonProperty("USE_YN")
    private String USE_YN;
    @Schema(name = "DESCRIPT", description = "상세 설명 (CODE 사용처 등)")
    @JsonProperty("DESCRIPT")
    private String DESCRIPT;

    @Schema(name = "CREATE_USER_ID", description = "")
    @JsonProperty("CREATE_USER_ID")
    private String CREATE_USER_ID;

    @Schema(name = "UPDATE_USER_ID", description = "")
    @JsonProperty("UPDATE_USER_ID")
    private String UPDATE_USER_ID;
}
