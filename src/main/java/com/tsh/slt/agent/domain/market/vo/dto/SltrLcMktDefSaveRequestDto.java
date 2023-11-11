package com.tsh.slt.agent.domain.market.vo.dto;

import com.tsh.slt.agent.domain.market.model.SltrLcMktDef;
import com.tsh.slt.agent.util.code.MktCode;
import com.tsh.slt.agent.util.code.MktTyp;
import com.tsh.slt.agent.util.common.dto.CommonDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Getter
public class SltrLcMktDefSaveRequestDto implements CommonDto<SltrLcMktDef> {

    private String mktCode;
    private String mktName;
    private String mktTyp;
    private Timestamp createDate;
    private String createUserId;
    private Timestamp updateDate;
    private String updateUserId;

    @Builder
    public SltrLcMktDefSaveRequestDto(String mktCode, String mktName, String mktTyp, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
        this.mktCode = mktCode;
        this.mktName = mktName;
        this.mktTyp = mktTyp;
        this.createDate = createDate;
        this.createUserId = createUserId;
        this.updateDate = updateDate;
        this.updateUserId = updateUserId;
    }

    @Override
    public SltrLcMktDef toEntity() {
        return SltrLcMktDef.builder()
                .mktCode(MktCode.valueOf(mktCode))
                .mktName(mktName)
                .mktTyp(MktTyp.valueOf(mktTyp))
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
