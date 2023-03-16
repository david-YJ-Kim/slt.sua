package com.plexter.sellter.agent.banWord.vo;

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
@Schema(name = "BanWordVO", description = "TBD")
public class BanWordVO {


    @Schema(name = "OBJ_ID", description = "TBD")
    @JsonProperty("OBJ_ID")
    private String OBJ_ID;
    @Schema(name = "USER_OBJ_ID", description = "TBD")
    @JsonProperty("USER_OBJ_ID")
    private String USER_OBJ_ID;
    @Schema(name = "BAN_WORD", description = "TBD")
    @JsonProperty("BAN_WORD")
    private String BAN_WORD;
    @Schema(name = "LANG_CD", description = "TBD")
    @JsonProperty("LANG_CD")
    private String LANG_CD;
    @Schema(name = "WORD_CATE_CD", description = "TBD")
    @JsonProperty("WORD_CATE_CD")
    private String WORD_CATE_CD;
    @Schema(name = "ALTER_WORD", description = "TBD")
    @JsonProperty("ALTER_WORD")
    private String ALTER_WORD;
    @Schema(name = "USE_YN", description = "TBD")
    @JsonProperty("USE_YN")
    private String USE_YN;

}


