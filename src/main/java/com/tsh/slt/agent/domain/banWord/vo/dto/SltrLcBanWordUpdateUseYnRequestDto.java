package com.tsh.slt.agent.domain.banWord.vo.dto;

import com.tsh.slt.agent.domain.banWord.model.SltrLcBanWordDef;
import com.tsh.slt.agent.util.common.dto.CommonDto;
import com.tsh.slt.agent.util.code.UseYn;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Getter
public class SltrLcBanWordUpdateUseYnRequestDto implements CommonDto {

    private String objId;
    private String useYn;
    private Timestamp updateDate;
    private String updateUserId;

    @Builder
    public SltrLcBanWordUpdateUseYnRequestDto(String objId, String useYn, Timestamp updateDate, String updateUserId) {
        this.objId = objId;
        this.useYn = useYn;
        this.updateDate = updateDate;
        this.updateUserId = updateUserId;
    }

    @Override
    public SltrLcBanWordDef toEntity() {
        return SltrLcBanWordDef.builder()
                .objId(objId)
                .useYn(UseYn.valueOf(useYn))
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

    @Override
    public String toString() {
        return "SltrLcBanWordUpdateUseYnRequestDto{" +
                "objId='" + objId + '\'' +
                ", useYn='" + useYn + '\'' +
                ", updateDate=" + updateDate +
                ", updateUserId='" + updateUserId + '\'' +
                '}';
    }
}
