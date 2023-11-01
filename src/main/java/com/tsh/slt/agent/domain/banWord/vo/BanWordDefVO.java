package com.tsh.slt.agent.domain.banWord.vo;

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
@Schema(name = "SltrLcBanWordDefVO", description = "TBD")
public class BanWordDefVO {

    @Schema(name = "OBJ_ID", description = "TBD")
    @JsonProperty("OBJ_ID")
    private String OBJ_ID;
    @Schema(name = "USER_OBJ_ID", description = "TBD")
    @JsonProperty("USER_OBJ_ID")
    private String USER_OBJ_ID;
    @Schema(name = "BAN_WORD", description = "TBD")
    @JsonProperty("BAN_WORD")
    private String BAN_WORD;
    @Schema(name = "LANG_CD", description = "다국어 코드 (KO, EN, ZH, JA)")
    @JsonProperty("LANG_CD")
    private String LANG_CD;
    @Schema(name = "WORD_CATE_CD", description = "BAN(금칙어), EXC(제외어), ALT(대체어)")
    @JsonProperty("WORD_CATE_CD")
    private String WORD_CATE_CD;
    @Schema(name = "ALTER_WORD", description = "BAN_WORD 의 LANG_CD 와 동일한 언어가 아니어도 무방, WORD_CATE_CD 가 ALT 일 때 사용되며 Nullable 은 유지 (공백으로 대체함)")
    @JsonProperty("ALTER_WORD")
    private String ALTER_WORD;
    @Schema(name = "USE_YN", description = "Y: Usable, N: Disable")
    @JsonProperty("USE_YN")
    private String USE_YN;
    @Schema(name = "CREATE_USER_ID", description = "TBD")
    @JsonProperty("CREATE_USER_ID")
    private String CREATE_USER_ID;
    @Schema(name = "UPDATE_USER_ID", description = "TBD")
    @JsonProperty("UPDATE_USER_ID")
    private String UPDATE_USER_ID;

}


