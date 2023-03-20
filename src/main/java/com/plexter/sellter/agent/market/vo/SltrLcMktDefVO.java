package com.plexter.sellter.agent.market.vo;

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
@Schema(name = "SltrLcMktDefVO", description = "SELLTER 에서 관리하는 오픈 마켓 기준 정보")
public class SltrLcMktDefVO {


    @Schema(name = "OBJ_ID", description = "TBD")
    @JsonProperty("OBJ_ID")
    private String OBJ_ID;
    @Schema(name = "MKT_ID", description = "Alias >> 쿠팡:CP, 스스:SS, 11번가:11st,G마켓:GM, 옥션:AC, 인터파크:INTPK")
    @JsonProperty("MKT_ID")
    private String MKT_ID;
    @Schema(name = "MKT_NAME", description = "마켓 Full Name")
    @JsonProperty("MKT_NAME")
    private String MKT_NAME;
    @Schema(name = "MKT_TYP", description = "소싱처, 등록 마켓 구분자")
    @JsonProperty("MKT_TYP")
    private String MKT_TYP;
    @Schema(name = "CREATE_USER_ID", description = "생성자")
    @JsonProperty("CREATE_USER_ID")
    private String CREATE_USER_ID;
    @Schema(name = "UPDATE_USER_ID", description = "수정자")
    @JsonProperty("UPDATE_USER_ID")
    private String UPDATE_USER_ID;


}


