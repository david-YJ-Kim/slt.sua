package com.tsh.slt.agent.domain.user.vo;

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
@Schema(name = "SLTUserImgVO", description = "User 정보는 기본적으로 Server 에 저장하고 단위 Agent 에서 수행 시, 단독으로 필요한 정보와 연계되어야 하는 정보로 구분" +
                                            " * Server 의 USER Def 정보는 로그인 및 사용자 인증 등의 목적으로 사용" +
                                            " * Local 의 USER Def 정보는 USER 단위로 설정하는 기능에 매핑되는 기준정보")
public class SltrLcImgDtlVO {

    @Schema(name = "OBJ_ID", description = "TBD")
    @JsonProperty("OBJ_ID")
    private String OBJ_ID;

    @Schema(name = "USER_ID", description = "Value : Email Address  *String Format checker 필요")
    @JsonProperty("USER_ID")
    private String USER_ID;

    @Schema(name = "IMG_TYPE", description = "이미지 파일 유형 (TOP:상단이미지, BOT:하단이미지, Thumb:썸네일, DTL:상세페이지)")
    @JsonProperty("IMG_TYPE")
    private String IMG_TYPE;

    @Schema(name = "IMG_FILE_PATH", description = "이미지 로컬 파일 경로")
    @JsonProperty("IMG_FILE_PATH")
    private String IMG_FILE_PATH;

    @Schema(name = "IMG_SEQ", description = "USER_ID + IMG_TYPE + IMG_FILE_PATH 내에서 File 간의 순서 정보")
    @JsonProperty("IMG_SEQ")
    private String IMG_SEQ;

    @Schema(name = "IMG_FILE_NAME", description = "이미지 파일 이름")
    @JsonProperty("IMG_FILE_NAME")
    private String IMG_FILE_NAME;

    @Schema(name = "IMG_FILE_SIZE", description = "단위 KB")
    @JsonProperty("IMG_FILE_SIZE")
    private Integer IMG_FILE_SIZE;

    @Schema(name = "CREATE_USER_ID", description = "생성자")
    @JsonProperty("CREATE_USER_ID")
    private String CREATE_USER_ID;

    @Schema(name = "UPDATE_USER_ID", description = "수정자")
    @JsonProperty("UPDATE_USER_ID")
    private String UPDATE_USER_ID;

}
