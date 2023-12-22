package com.tsh.slt.sua.query.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ManualCarrListVO {
    String objId;
    String carrId;
    String zoneId;
    String lotId;
    String carrClsNm;
    Integer slotQty;
    String workStatCd;
    String returnAbleYn;
    String crntEqpId;
    String crntPortId;



    // 조회 파라미터
    String siteId;

}
