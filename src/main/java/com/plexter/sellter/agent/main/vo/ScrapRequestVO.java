package com.plexter.sellter.agent.main.vo;

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
@Schema(name = "ScrapRequestVO", description = "상품 Scrap 요청 VO")
public class ScrapRequestVO {

    @Schema(name = "COLLECT_URL", description = "TBD")
    @JsonProperty("COLLECT_URL")
    private String COLLECT_URL;

    @Schema(name = "COLLECT_SUBJECT", description = "TBD")
    @JsonProperty("COLLECT_SUBJECT")
    private String COLLECT_SUBJECT;
    @Schema(name = "COLLECT_KEYWORD", description = "TBD")
    @JsonProperty("COLLECT_KEYWORD")
    private String COLLECT_KEYWORD;
    @Schema(name = "SUBJECT_KEY", description = "TBD")
    @JsonProperty("SUBJECT_KEY")
    private String SUBJECT_KEY;
    @Schema(name = "SUBJECT_KEY_LOC", description = "TBD")
    @JsonProperty("SUBJECT_KEY_LOC")
    private String SUBJECT_KEY_LOC;
    @Schema(name = "HASH_TAG", description = "TBD")
    @JsonProperty("HASH_TAG")
    private String HASH_TAG;
    @Schema(name = "START_PAGE", description = "TBD")
    @JsonProperty("START_PAGE")
    private String START_PAGE;
    @Schema(name = "END_PAGE", description = "TBD")
    @JsonProperty("END_PAGE")
    private String END_PAGE;
    @Schema(name = "BASIC_MARGIN_RATE", description = "TBD")
    @JsonProperty("BASIC_MARGIN_RATE")
    private String BASIC_MARGIN_RATE;
    @Schema(name = "BASIC_MARGIN", description = "TBD")
    @JsonProperty("BASIC_MARGIN")
    private String BASIC_MARGIN;
    @Schema(name = "AUTO_SEARCH_OPTION", description = "TBD")
    @JsonProperty("AUTO_SEARCH_OPTION")
    private String AUTO_SEARCH_OPTION;
    @Schema(name = "CP_CATEGORY", description = "TBD")
    @JsonProperty("CP_CATEGORY")
    private String CP_CATEGORY;
    @Schema(name = "SS_CATEGORY", description = "TBD")
    @JsonProperty("SS_CATEGORY")
    private String SS_CATEGORY;
    @Schema(name = "ELEVEN_CATEGORY", description = "TBD")
    @JsonProperty("ELEVEN_CATEGORY")
    private String ELEVEN_CATEGORY;
    @Schema(name = "GM_CATEGORY", description = "TBD")
    @JsonProperty("GM_CATEGORY")
    private String GM_CATEGORY;
    @Schema(name = "AU_CATEGORY", description = "TBD")
    @JsonProperty("AU_CATEGORY")
    private String AU_CATEGORY;
    @Schema(name = "IP_CATEGORY", description = "TBD")
    @JsonProperty("IP_CATEGORY")
    private String IP_CATEGORY;




}
