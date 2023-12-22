package com.tsh.slt.sua.domain.code.vo.dto;

import com.tsh.slt.sua.domain.code.model.SltrLcCodeDef;
import com.tsh.slt.sua.util.code.UseYn;
import com.tsh.slt.sua.util.common.dto.CommonDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Getter
public class SltrLcCodeDefSaveRequestDto implements CommonDto<SltrLcCodeDef> {

    private String codeClassId;
    private String codeId;
    private String korCodeName;
    private String engCodeName;
    private String useYn;
    private String description;
    private Timestamp createDate;
    private String createUserId;
    private Timestamp updateDate;
    private String updateUserId;

    @Builder
    public SltrLcCodeDefSaveRequestDto(String codeClassId, String codeId, String korCodeName, String engCodeName, String useYn, String description, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
        this.codeClassId = codeClassId;
        this.codeId = codeId;
        this.korCodeName = korCodeName;
        this.engCodeName = engCodeName;
        this.useYn = useYn;
        this.description = description;
        this.createDate = createDate;
        this.createUserId = createUserId;
        this.updateDate = updateDate;
        this.updateUserId = updateUserId;
    }


    @Override
    public SltrLcCodeDef toEntity() {
        return SltrLcCodeDef.builder()
                .codeClassId(codeClassId)
                .codeId(codeId)
                .korCodeName(korCodeName)
                .engCodeName(engCodeName)
                .useYn(UseYn.valueOf(useYn))
                .description(description)
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
