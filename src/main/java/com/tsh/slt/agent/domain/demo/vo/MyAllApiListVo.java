package com.tsh.slt.agent.domain.demo.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper = false)
@JsonInclude(value = Include.ALWAYS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Schema(name = "MyAllApiListVo", description = "[OUT] View My All API.")
public class MyAllApiListVo {

    @Schema(name = "HTTP_URL", description = "OPEN API HTTP URL")
    @JsonProperty("HTTP_URL")
    private String HTTP_URL;

    @Schema(name = "HTTP_METHOD_TYP", description = "OPEN API HTTP METHOD TYPE")
    @JsonProperty("HTTP_METHOD_TYP")
    private String HTTP_METHOD_TYP;

    @Schema(name = "TGT_API_ID", description = "OPEN API ID")
    @JsonProperty("TGT_API_ID")
    private String TGT_API_ID;

    @Schema(name = "OPEN_API_NM", description = "OPEN API NAME")
    @JsonProperty("OPEN_API_NM")
    private String OPEN_API_NM;

    @Schema(name = "OPEN_API_DESC", description = "OPEN API DESCRIPTION")
    @JsonProperty("OPEN_API_DESC")
    private String OPEN_API_DESC;

    @Schema(name = "REQ_SYS_ID", description = "REQUEST SYSTEM ID")
    @JsonProperty("REQ_SYS_ID")
    private String REQ_SYS_ID;

    @Schema(name = "CRT_DT", description = "CREATED DATE")
    @JsonProperty("CRT_DT")
    private String CRT_DT;

    @Schema(name = "CHG_DT", description = "CHANGED DATE")
    @JsonProperty("CHG_DT")
    private String CHG_DT;

    @Schema(name = "CRT_USER_ID", description = "THE MAN WHO IS CHARGE")
    @JsonProperty("CRT_USER_ID")
    private String CRT_USER_ID;

    @Schema(name = "CRT_USER_NM", description = "THE MAN'S NAME WHO IS IN CHARGE")
    @JsonProperty("CRT_USER_NM")
    private String CRT_USER_NM;

}
