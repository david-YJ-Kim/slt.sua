package com.tsh.slt.sua.query.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class WipQueryCondListVO {
    String objId;
    String rcpDefId;
    String eqpId;
    String portId;
    String workId;
    String resvEqpId;
    String resvPortId;
    String evntNm;
    String mdfyDt;



    // 조회 파라미터
    String siteId;
    String carrId;
    String lotId;
    String workStatCd;

}
