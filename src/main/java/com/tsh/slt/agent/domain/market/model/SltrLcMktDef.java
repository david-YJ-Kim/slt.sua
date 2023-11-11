package com.tsh.slt.agent.domain.market.model;

import com.tsh.slt.agent.util.code.MktCode;
import com.tsh.slt.agent.util.code.MktTyp;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
@NoArgsConstructor
@Getter
@Entity(name = "SLTR_LC_MKT_DEF")
public class SltrLcMktDef {


    @javax.persistence.Id
    @GenericGenerator(name = "SLTR_LC_MKT_DEF_SEQ_GENERATOR", strategy = "com.tsh.slt.agent.util.ObjIdGenerator")
    @GeneratedValue(generator = "SLTR_LC_MKT_DEF_SEQ_GENERATOR")
    private String objId;

    @Enumerated(EnumType.STRING)
    @Column(name = "MKT_CODE")
    private MktCode mktCode;

    @Column(name = "MKT_NAME")
    private String mktName;

    @Enumerated(EnumType.STRING)
    @Column(name = "MKT_TYP")
    private MktTyp mktTyp;


    // Default
    @Column(name = "CREATE_DATE")
    private Timestamp createDate;

    @Column(name = "CREATE_USER_ID")
    private String createUserId;

    @Column(name = "UPDATE_DATE")
    private Timestamp updateDate;

    @Column(name = "UPDATE_USER_ID")
    private String updateUserId;

    @Builder
    public SltrLcMktDef(String objId, MktCode mktCode, String mktName, MktTyp mktTyp, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
        this.objId = objId;
        this.mktCode = mktCode;
        this.mktName = mktName;
        this.mktTyp = mktTyp;
        this.createDate = createDate;
        this.createUserId = createUserId;
        this.updateDate = updateDate;
        this.updateUserId = updateUserId;
    }

    @Override
    public String toString() {
        return "SltrLcMktDef{" +
                "objId='" + objId + '\'' +
                ", mktCode=" + mktCode +
                ", mktName='" + mktName + '\'' +
                ", mktTyp='" + mktTyp + '\'' +
                ", createDate=" + createDate +
                ", createUserId='" + createUserId + '\'' +
                ", updateDate=" + updateDate +
                ", updateUserId='" + updateUserId + '\'' +
                '}';
    }
}
