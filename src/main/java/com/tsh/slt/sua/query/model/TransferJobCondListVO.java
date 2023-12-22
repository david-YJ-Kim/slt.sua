package com.tsh.slt.sua.query.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class TransferJobCondListVO {

    String objId;
    String jobId;
    String transferType;
    String crntEqpId;
    String crntPortId;
    String srcPortId;
    String destPortId;
    String evntNm;
    String crtDt;
    String eventUserId;


    // 조회 파라미터
    String siteId;
    String srcEqpId;
    String destEqpId;
    String carrId;
    String moveStatCd;
    String zoneId;

}
