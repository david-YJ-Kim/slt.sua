package com.tsh.slt.sua.query.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ManualCarrCondListVO {
    String objId;
    String carrClsNm;
    Integer slotQty;
    String workStatCd;
    String returnAbleYn;
    String crntEqpId;
    String crntPortId;


    // 조회 파라미터
    String siteId;
    String eqpId;
    String carrId;
    String lotId;
    String zoneId;

}
