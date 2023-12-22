package com.tsh.slt.sua.query.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class TransferJobListVO {
    String objId;
    String jobId;
    String transferType;
    String carrId;
    String crntEqpId;
    String crntPortId;
    String srcEqpId;
    String srcPortId;
    String destEqpId;
    String destPortId;
    String moveStatCd;
    String evntNm;
    String crtDt;
    String eventUserId;


    // 조회 파라미터
    String siteId;

}
