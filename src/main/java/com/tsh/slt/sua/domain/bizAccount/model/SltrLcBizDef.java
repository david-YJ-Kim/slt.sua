package com.tsh.slt.sua.domain.bizAccount.model;

import com.tsh.slt.sua.util.code.UseYn;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Entity(name = "SLTR_LC_BIZ_DEF")
public class SltrLcBizDef {

    @javax.persistence.Id
    @GenericGenerator(name = "SLTR_LC_BIZ_DEF_SEQ_GENERATOR", strategy = "com.tsh.slt.agent.util.ObjIdGenerator")
    @GeneratedValue(generator = "SLTR_LC_BIZ_DEF_SEQ_GENERATOR")
    private String objId;

    @Column(name = "USER_OBJ_ID")
    private String userObjId;

    @Column(name = "BIZ_REQ_NUM")
    private String bizRegNum;

    @Column(name = "BIZ_NAME")
    private String bizName;

    @Column(name = "REP_USE_NAME")
    private String repUseName;

    @Column(name = "BIZ_ADDR")
    private String bizAddr;

    @Column(name = "BIZ_START_DATE")
    private Timestamp bizStartDate;

    @Column(name = "DISP_SEQ")
    private Integer dispSeq;

    @Enumerated(EnumType.STRING)
    @Column(name = "USE_YN")
    private UseYn useYn;

    @Column(name = "LAST_VALID_DATE")
    private Timestamp lastValidDate;

    @Column(name = "BASE_MGN_RATE")
    private Integer baseMgnRate;

    @Column(name = "BASE_MGN_VALUE")
    private Integer baseMgnValue;

    @Column(name = "CREATE_DATE")
    private Timestamp createDate;

    @Column(name = "CREATE_USER_ID")
    private String createUserId;

    @Column(name = "UPDATE_DATE")
    private Timestamp updateDate;

    @Column(name = "UPDATE_USER_ID")
    private String updateUserId;


    @Builder
    public SltrLcBizDef(String objId, String userObjId, String bizRegNum, String bizName, String repUseName, String bizAddr, Timestamp bizStartDate, Integer dispSeq, UseYn useYn, Timestamp lastValidDate, Integer baseMgnRate, Integer baseMgnValue, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
        this.objId = objId;
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
    public String toString() {
        return "BizAccountEntity{" +
                "objId='" + objId + '\'' +
                ", userObjId='" + userObjId + '\'' +
                ", bizRegNum='" + bizRegNum + '\'' +
                ", bizName='" + bizName + '\'' +
                ", repUseName='" + repUseName + '\'' +
                ", bizAddr='" + bizAddr + '\'' +
                ", bizStartDate=" + bizStartDate +
                ", dispSeq=" + dispSeq +
                ", useYn=" + useYn +
                ", lastValidDate=" + lastValidDate +
                ", baseMgnRate=" + baseMgnRate +
                ", baseMgnValue=" + baseMgnValue +
                ", createDate=" + createDate +
                ", createUserId='" + createUserId + '\'' +
                ", updateDate=" + updateDate +
                ", updateUserId='" + updateUserId + '\'' +
                '}';
    }
}
