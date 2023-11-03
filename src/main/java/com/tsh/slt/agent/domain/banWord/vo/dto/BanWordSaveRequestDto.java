package com.tsh.slt.agent.domain.banWord.vo.dto;

import com.tsh.slt.agent.domain.banWord.model.SltrLcBanWordDef;
import com.tsh.slt.agent.util.CommonDto;
import com.tsh.slt.agent.util.code.LangCode;
import com.tsh.slt.agent.util.code.UseYn;
import com.tsh.slt.agent.util.code.WordCateCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Getter
public class BanWordSaveRequestDto implements CommonDto {

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

    public BanWordSaveRequestDto(String userObjId, String bandWord, String langCode, String wordCateCode, String alterWord, String useYn, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
        this.userObjId = userObjId;
        this.bandWord = bandWord;
        this.langCode = langCode;
        this.wordCateCode = wordCateCode;
        this.alterWord = alterWord;
        this.useYn = useYn;
        this.createDate = createDate;
        this.createUserId = createUserId;
        this.updateDate = updateDate;
        this.updateUserId = updateUserId;
    }

    @Override
    public SltrLcBanWordDef toEntity() {

        return SltrLcBanWordDef.builder()
                .userObjId(userObjId)
                .bandWord(bandWord)
                .langCode(LangCode.valueOf(langCode))
                .wordCateCode(WordCateCode.valueOf(wordCateCode))
                .alterWord(alterWord)
                .useYn(UseYn.valueOf(useYn))
                .createDate(createDate)
                .createUserId(createUserId)
                .updateDate(updateDate)
                .updateUserId(updateUserId)
                .build();
    }


    @Override
    public String toString() {
        return "BanWordSaveRequestDto{" +
                "userObjId='" + userObjId + '\'' +
                ", bandWord='" + bandWord + '\'' +
                ", langCode='" + langCode + '\'' +
                ", wordCateCode='" + wordCateCode + '\'' +
                ", alterWord='" + alterWord + '\'' +
                ", useYn='" + useYn + '\'' +
                ", createDate=" + createDate +
                ", createUserId='" + createUserId + '\'' +
                ", updateDate=" + updateDate +
                ", updateUserId='" + updateUserId + '\'' +
                '}';
    }
}
