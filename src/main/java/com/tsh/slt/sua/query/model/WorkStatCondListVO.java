package com.tsh.slt.sua.query.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class WorkStatCondListVO {
    String objId;
    String siteId;
    String workId;
    String batchYn;
    String inlineYn;
    String jobSeqId;
    String lotId;
    String rcpDefId;
    String eqpId;
    String carrId;
    String eqpInlineId;
    String inPortId;
    String inCarrId;
    String outPortId;
    String outCarrId;
    Integer jobQty;
    String workFaceCd;
    String workStatCd;
    String evntNm;


}
