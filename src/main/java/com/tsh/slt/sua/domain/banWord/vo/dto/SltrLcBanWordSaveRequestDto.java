package com.tsh.slt.sua.domain.banWord.vo.dto;

import com.tsh.slt.sua.domain.banWord.model.SltrLcBanWordDef;
import com.tsh.slt.sua.util.common.dto.CommonDto;
import com.tsh.slt.sua.util.code.LangCode;
import com.tsh.slt.sua.util.code.UseYn;
import com.tsh.slt.sua.util.code.WordCateCode;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Getter
public class SltrLcBanWordSaveRequestDto implements CommonDto<SltrLcBanWordDef> {

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

    @Builder
    public SltrLcBanWordSaveRequestDto(String userObjId, String bandWord, String langCode, String wordCateCode, String alterWord, String useYn, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
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

    public String getSamplePayload(){
        return "{\n" +
                "  \"userObjId\": \"DavidKim\",\n" +
                "  \"bandWord\": \"Ban-Word\",\n" +
                "  \"langCode\": \"KR\",\n" +
                "  \"wordCateCode\": \"BAN\",\n" +
                "  \"alterWord\": \"\",\n" +
                "  \"useYn\": \"Y\",\n" +
                "  \"createDate\": \"2023-11-02\",\n" +
                "  \"createUserId\": \"DavidKim\",\n" +
                "  \"updateDate\": \"2023-11-02\",\n" +
                "  \"updateUserId\": \"DavidKim\"\n" +
                "}";
    }

    @Override
    public String getSamplePayload(String objId) {
        return null;
    }


}
