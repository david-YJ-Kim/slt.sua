package com.tsh.slt.agent.domain.bizAccount.model;

import com.tsh.slt.agent.util.code.UseYn;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Entity(name = "SLTR_LC_BIZ_MKT_REL")
public class SltrLcBizMktRel {

    @javax.persistence.Id
    @GenericGenerator(name = "SLTR_LC_BIZ_MKT_REL_SEQ_GENERATOR", strategy = "com.tsh.slt.agent.util.ObjIdGenerator")
    @GeneratedValue(generator = "SLTR_LC_BIZ_MKT_REL_SEQ_GENERATOR")
    private String objId;

    @Column(name = "USER_OBJ_ID")
    private String userObjId;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "BIZ_OBJ_ID")
    private String bizObjId;

    @Column(name = "MKT_ID")
    private String mktId;

    @Column(name = "MKT_USER_ID")
    private String mktUserId;

    @Column(name = "MKT_USER_PWD")
    private String mktUserPwd;

    @Column(name = "API_ACCESS_KEY")
    private String apiAccessKey;

    @Column(name = "API_SECRET_KEY")
    private String apiSecretKey;

    @Column(name = "MKT_COMPANY_CODE")
    private String mktCompanyCode;

    @Enumerated(EnumType.STRING)
    @Column(name = "USE_YN")
    private UseYn autoConnectYn;

    @Enumerated(EnumType.STRING)
    @Column(name = "USE_YN")
    private UseYn autoProdUploadYn;
    @Column(name = "MGN_RATE")
    private Integer mgnRate;

    @Column(name = "MGN_BASIC")
    private Integer mgnBasic;

    @Column(name = "CREATE_DATE")
    private Timestamp createDate;

    @Column(name = "CREATE_USER_ID")
    private String createUserId;

    @Column(name = "UPDATE_DATE")
    private Timestamp updateDate;

    @Column(name = "UPDATE_USER_ID")
    private String updateUserId;

    @Builder
    public SltrLcBizMktRel(String objId, String userObjId, String userId, String bizObjId, String mktId, String mktUserId, String mktUserPwd, String apiAccessKey, String apiSecretKey, String mktCompanyCode, UseYn autoConnectYn, UseYn autoProdUploadYn, Integer mgnRate, Integer mgnBasic, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
        this.objId = objId;
        this.userObjId = userObjId;
        this.userId = userId;
        this.bizObjId = bizObjId;
        this.mktId = mktId;
        this.mktUserId = mktUserId;
        this.mktUserPwd = mktUserPwd;
        this.apiAccessKey = apiAccessKey;
        this.apiSecretKey = apiSecretKey;
        this.mktCompanyCode = mktCompanyCode;
        this.autoConnectYn = autoConnectYn;
        this.autoProdUploadYn = autoProdUploadYn;
        this.mgnRate = mgnRate;
        this.mgnBasic = mgnBasic;
        this.createDate = createDate;
        this.createUserId = createUserId;
        this.updateDate = updateDate;
        this.updateUserId = updateUserId;
    }

    @Override
    public String toString() {
        return "SltrLcBizMktRel{" +
                "objId='" + objId + '\'' +
                ", userObjId='" + userObjId + '\'' +
                ", userId='" + userId + '\'' +
                ", bizObjId='" + bizObjId + '\'' +
                ", mktId='" + mktId + '\'' +
                ", mktUserId='" + mktUserId + '\'' +
                ", mktUserPwd='" + mktUserPwd + '\'' +
                ", apiAccessKey='" + apiAccessKey + '\'' +
                ", apiSecretKey='" + apiSecretKey + '\'' +
                ", mktCompanyCode='" + mktCompanyCode + '\'' +
                ", autoConnectYn=" + autoConnectYn +
                ", autoProdUploadYn=" + autoProdUploadYn +
                ", mgnRate=" + mgnRate +
                ", mgnBasic=" + mgnBasic +
                ", createDate=" + createDate +
                ", createUserId='" + createUserId + '\'' +
                ", updateDate=" + updateDate +
                ", updateUserId='" + updateUserId + '\'' +
                '}';
    }
}
