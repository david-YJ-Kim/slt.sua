package com.tsh.slt.agent.domain.bizAccount.vo.dto;

import com.tsh.slt.agent.domain.bizAccount.model.SltrLcBizDef;
import com.tsh.slt.agent.util.code.UseYn;
import com.tsh.slt.agent.util.common.dto.CommonDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.sql.Timestamp;

@NoArgsConstructor
@Getter
public class SltrLcBizDefSaveRequestDto implements CommonDto<SltrLcBizDef> {

    private String userObjId;
    private String bizRegNum;
    private String bizName;
    private String repUseName;
    private String bizAddr;
    private Timestamp bizStartDate;
    private Integer dispSeq;
    private String useYn;
    private Timestamp lastValidDate;
    private Integer baseMgnRate;
    private Integer baseMgnValue;
    private Timestamp createDate;
    private String createUserId;
    private Timestamp updateDate;
    private String updateUserId;

    @Builder
    public SltrLcBizDefSaveRequestDto(String userObjId, String bizRegNum, String bizName, String repUseName, String bizAddr, Timestamp bizStartDate, Integer dispSeq, String useYn, Timestamp lastValidDate, Integer baseMgnRate, Integer baseMgnValue, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
        this.userObjId = userObjId;
        this.bizRegNum = bizRegNum;
        this.bizName = bizName;
        this.repUseName = repUseName;
        this.bizAddr = bizAddr;
        this.bizStartDate = bizStartDate;
        this.dispSeq = dispSeq;
        this.useYn = useYn;
        this.lastValidDate = lastValidDate;
        this.baseMgnRate = baseMgnRate;
        this.baseMgnValue = baseMgnValue;
        this.createDate = createDate;
        this.createUserId = createUserId;
        this.updateDate = updateDate;
        this.updateUserId = updateUserId;
    }

    @Override
    public SltrLcBizDef toEntity() {

        return SltrLcBizDef.builder()
                .userObjId(userObjId)
                .bizRegNum(bizRegNum)
                .bizName(bizName)
                .repUseName(repUseName)
                .bizAddr(bizAddr)
                .bizStartDate(bizStartDate)
                .dispSeq(dispSeq)
                .useYn(UseYn.valueOf(useYn))
                .lastValidDate(lastValidDate)
                .baseMgnRate(baseMgnRate)
                .baseMgnValue(baseMgnValue)
                .createDate(createDate)
                .createUserId(createUserId)
                .updateDate(updateDate)
                .updateUserId(updateUserId)
                .build();
    }

    @Override
    public String getSamplePayload() {
        return null;
    }

    @Override
    public String getSamplePayload(String objId) {
        return null;
    }
}
