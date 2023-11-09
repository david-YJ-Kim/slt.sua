package com.tsh.slt.agent.domain.banWord.vo.dto;

import com.tsh.slt.agent.domain.banWord.model.SltrLcBanWordDef;
import com.tsh.slt.agent.util.common.dto.CommonDto;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
public class SltrLcBanWordResponseDto implements CommonDto<SltrLcBanWordDef> {

    private String objId;
    private String userObjId;
    private String bandWord;
    private String langCode;
    private String wordCateCode;
    private String alterWord;
    private String useYn;
    private Timestamp createDate;
    private String createUserId;
    private Timestamp updateDate;
    private String updateUserId;



    public SltrLcBanWordResponseDto(SltrLcBanWordDef entity) {
        this.objId = entity.getObjId();
        this.userObjId = entity.getUserObjId();
        this.bandWord = entity.getBandWord();
        this.langCode = entity.getLangCode().name();
        this.wordCateCode = entity.getWordCateCode().name();
        this.alterWord = entity.getAlterWord();
        this.useYn = entity.getUseYn().name();
        this.createDate = entity.getCreateDate();
        this.createUserId = entity.getCreateUserId();
        this.updateDate = entity.getUpdateDate();
        this.updateUserId = entity.getUpdateUserId();
    }
    @Override
    public SltrLcBanWordDef toEntity() {
        return null;
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
