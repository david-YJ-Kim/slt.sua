package com.tsh.slt.agent.domain.user.vo.dto;

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
    private String USER_ID;
    private String USER_NAME;
    private Integer USD_EXCH_RATE;
    private Integer CNY_EXCH_RATE;
    private Integer BASE_MGN_RATE;
    private Integer BASE_MGN_VALUE;
    private Integer CUSTM_EXCD_MGN_RATE;
    private Integer CUSTM_EXCD_MGN_VALUE;
    private String SHIP_FEE_TYPE;
    private Integer BASE_SHIP_FEE;
    private Integer RTRN_SHIP_FEE;
    private Integer EXCD_SHIP_FEE;
    private Integer JEJU_SHIP_FEE;
    private Integer REMOTE_AREA_SHIP_FEE;
    private String MFR_NAME;
    private String BRAND_NAME;
    private String UNDR_PUR_AVAIL_FLAG;
    private String THUMB_OPTION_YN;
    private String TOP_IMG_USE_FLAG;
    private String BASE_TOP_IMG_USE_FLAG;
    private String TOP_IMG_FILE_PATH;
    private String BOT_IMG_USE_FLAG;
    private String BASE_BOT_IMG_USE_FLAG;
    private String BOT_IMG_FILE_PATH;
    private String HASH_TAG_AUTO_YN;


}
//public class UserMasterDataDTO {
//    private String userId;
//    private String userName;
//    private Integer usdExchRate;
//    private Integer cnyExchRate;
//    private Integer baseMgnRate;
//    private Integer baseMgnValue;
//    private Integer custmExcdMgnRate;
//    private Integer custmExcdMgnValue;
//    private String shipFeeType;
//    private Integer baseShipFee;
//    private Integer rtrnShipFee;
//    private Integer excdShipFee;
//    private Integer jejuShipFee;
//    private Integer remoteAreaShipFee;
//    private String mfrName;
//    private String brandName;
//    private String undrPurAvailFlag;
//    private String thumbOptionYn;
//    private String topImgUseFlag;
//    private String baseTopImgUseFlag;
//    private String topImgFilePath;
//    private String botImgUseFlag;
//    private String baseBotImgUseFlag;
//    private String botImgFilePath;
//    private String hashTagAutoYn;
//
//}
