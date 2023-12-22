package com.tsh.slt.sua.query.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class WorkStatSlotListVO {

    String objId;
    String slotNo;
    String jobSeqId;
    String prodMtrlId;
    String prodMtrlStrtTm;
    String prodMtrlEndTm;
    String selfInspYn;
    String fromSlot;
    String toSlot;
    String mtrlFaceCd;
    String evntNm;



    // 조회 파라미터
    String siteId;
    String workId;

}
