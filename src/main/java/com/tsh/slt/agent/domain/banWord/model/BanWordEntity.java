package com.tsh.slt.agent.domain.banWord.model;

import com.tsh.slt.agent.util.code.LangCode;
import com.tsh.slt.agent.util.code.UseYn;
import com.tsh.slt.agent.util.code.WordCateCode;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Entity(name = "SLTR_LC_BAN_WORD_DEF")
public class BanWordEntity {

    @javax.persistence.Id
    @GenericGenerator(name = "SLTR_LC_BAN_WORD_DEF_SEQ_GENERATOR", strategy = "com.tsh.slt.agent.util.ObjIdGenerator")
    @GeneratedValue(generator = "SLTR_LC_BAN_WORD_DEF_SEQ_GENERATOR")
    private String objId;

    @Column(name = "USER_OBJ_ID")
    private String userObjId;

    @Column(name = "BAN_WORD")
    private String bandWord;

    @Enumerated(EnumType.STRING)
    @Column(name = "LANG_CD")
    private LangCode langCode;

    @Enumerated(EnumType.STRING)
    @Column(name = "WORD_CATE_CD")
    private WordCateCode wordCateCode;

    @Column(name = "ALTER_WORD")
    private String alterWord;

    @Enumerated(EnumType.STRING)
    @Column(name = "USE_YN")
    private UseYn useYn;

    @Column(name = "CREATE_DATE")
    private Timestamp createDate;

    @Column(name = "CREATE_USER_ID")
    private String createUserId;

    @Column(name = "UPDATE_DATE")
    private Timestamp updateDate;

    @Column(name = "UPDATE_USER_ID")
    private String updateUserId;

    @Builder
    public BanWordEntity(String objId, String userObjId, String bandWord, LangCode langCode, WordCateCode wordCateCode, String alterWord, UseYn useYn, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
        this.objId = objId;
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
    public String toString() {
        return "BanWordEntity{" +
                "objId='" + objId + '\'' +
                ", userObjId='" + userObjId + '\'' +
                ", bandWord='" + bandWord + '\'' +
                ", langCode=" + langCode +
                ", wordCateCode=" + wordCateCode +
                ", alterWord='" + alterWord + '\'' +
                ", useYn=" + useYn +
                ", createDate=" + createDate +
                ", createUserId='" + createUserId + '\'' +
                ", updateDate=" + updateDate +
                ", updateUserId='" + updateUserId + '\'' +
                '}';
    }
}
