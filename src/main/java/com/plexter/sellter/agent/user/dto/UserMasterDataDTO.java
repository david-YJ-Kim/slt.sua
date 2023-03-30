package com.plexter.sellter.agent.user.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper = false)
@JsonInclude(value = JsonInclude.Include.ALWAYS)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserMasterDataDTO {
    private String userId;
    private String userName;
    private Integer usdExchRate;
    private Integer cnyExchRate;
    private Integer baseMgnRate;
    private Integer baseMgnValue;
    private Integer custmExcdMgnRate;
    private Integer custmExcdMgnValue;
    private String shipFeeType;
    private Integer baseShipFee;
    private Integer rtrnShipFee;
    private Integer excdShipFee;
    private Integer jejuShipFee;
    private Integer remoteAreaShipFee;
    private String mfrName;
    private String brandName;
    private String undrPurAvailFlag;
    private String thumbOptionYn;
    private String topImgUseFlag;
    private String baseTopImgUseFlag;
    private String topImgFilePath;
    private String botImgUseFlag;
    private String baseBotImgUseFlag;
    private String botImgFilePath;
    private String hashTagAutoYn;

}
