package com.tsh.slt.agent.domain.code.model;


import com.tsh.slt.agent.util.code.UseYn;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Entity(name = "SLTR_LC_CODE_DEF")
public class SltrLcCodeDef {

    @javax.persistence.Id
    @GenericGenerator(name = "SLTR_LC_CODE_DEF_SEQ_GENERATOR", strategy = "com.tsh.slt.agent.util.ObjIdGenerator")
    @GeneratedValue(generator = "SLTR_LC_CODE_DEF_SEQ_GENERATOR")
    private String objId;

    @Column(name = "CODE_CLASS_ID")
    private String codeClassId;

    @Column(name = "CODE_ID")
    private String codeId;

    @Column(name = "KOR_CODE_NAME")
    private String korCodeName;

    @Column(name = "ENG_CODE_NAME")
    private String engCodeName;

    @Enumerated(EnumType.STRING)
    @Column(name = "USE_YN")
    private UseYn useYn;

    @Column(name = "DESCRIPTION")
    private String description;


    @Column(name = "CREATE_DATE")
    private Timestamp createDate;

    @Column(name = "CREATE_USER_ID")
    private String createUserId;

    @Column(name = "UPDATE_DATE")
    private Timestamp updateDate;

    @Column(name = "UPDATE_USER_ID")
    private String updateUserId;

    @Builder
    public SltrLcCodeDef(String objId, String codeClassId, String codeId, String korCodeName, String engCodeName, UseYn useYn, String description, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
        this.objId = objId;
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
    public String toString() {
        return "CodeEntity{" +
                "objId='" + objId + '\'' +
                ", codeClassId='" + codeClassId + '\'' +
                ", codeId='" + codeId + '\'' +
                ", korCodeName='" + korCodeName + '\'' +
                ", engCodeName='" + engCodeName + '\'' +
                ", useYn=" + useYn +
                ", description='" + description + '\'' +
                ", createDate=" + createDate +
                ", createUserId='" + createUserId + '\'' +
                ", updateDate=" + updateDate +
                ", updateUserId='" + updateUserId + '\'' +
                '}';
    }
}
