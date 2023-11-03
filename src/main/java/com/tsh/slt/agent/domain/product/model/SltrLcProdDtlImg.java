package com.tsh.slt.agent.domain.product.model;

import com.tsh.slt.agent.util.code.ProdImgType;
import com.tsh.slt.agent.util.code.ProdImgValueType;
import com.tsh.slt.agent.util.code.UseYn;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Entity(name = "SLTR_LC_PROD_DTL_IMG")
public class SltrLcProdDtlImg {

    @javax.persistence.Id
    @GenericGenerator(name = "SLTR_LC_PROD_DTL_IMG_SEQ_GENERATOR", strategy = "com.tsh.slt.agent.util.ObjIdGenerator")
    @GeneratedValue(generator = "SLTR_LC_PROD_DTL_IMG_SEQ_GENERATOR")
    private String objId;

    @Column(name = "USER_OBJ_ID")
    private String userObjId;

    @Column(name = "PROD_OBJ_ID")
    private String prodObjId;

    @Column(name = "PROD_DTL_OBJ_ID")
    private String prodDtlObjId;

    @Enumerated(EnumType.STRING)
    @Column(name = "PROD_IMG_TYPE")
    private ProdImgType prodImgType;

    @Column(name = "PROD_IMG_SEQ")
    private String prodImgSeq;

    @Enumerated(EnumType.STRING)
    @Column(name = "PROD_IMG_VALUE_TYPE")
    private ProdImgValueType prodImgValueType;

    @Enumerated(EnumType.STRING)
    @Column(name = "DEFAULT_YN")
    private UseYn defaultYn;

    @Column(name = "PROD_IMG_FILE_PATH")
    private String prodImgFilePath;

    @Column(name = "PROD_IMG_FILE_SIZE")
    private Integer prodImgFileSize;

    @Column(name = "PROD_IMG_VERSION")
    private Integer prodImgVersion;

    // Default
    @Column(name = "CREATE_DATE")
    private Timestamp createDate;

    @Column(name = "CREATE_USER_ID")
    private String createUserId;

    @Column(name = "UPDATE_DATE")
    private Timestamp updateDate;

    @Column(name = "UPDATE_USER_ID")
    private String updateUserId;

    public SltrLcProdDtlImg(String objId, String userObjId, String prodObjId, String prodDtlObjId, ProdImgType prodImgType, String prodImgSeq, ProdImgValueType prodImgValueType, UseYn defaultYn, String prodImgFilePath, Integer prodImgFileSize, Integer prodImgVersion, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
        this.objId = objId;
        this.userObjId = userObjId;
        this.prodObjId = prodObjId;
        this.prodDtlObjId = prodDtlObjId;
        this.prodImgType = prodImgType;
        this.prodImgSeq = prodImgSeq;
        this.prodImgValueType = prodImgValueType;
        this.defaultYn = defaultYn;
        this.prodImgFilePath = prodImgFilePath;
        this.prodImgFileSize = prodImgFileSize;
        this.prodImgVersion = prodImgVersion;
        this.createDate = createDate;
        this.createUserId = createUserId;
        this.updateDate = updateDate;
        this.updateUserId = updateUserId;
    }

    @Override
    public String toString() {
        return "SltrLcProdDtlImg{" +
                "objId='" + objId + '\'' +
                ", userObjId='" + userObjId + '\'' +
                ", prodObjId='" + prodObjId + '\'' +
                ", prodDtlObjId='" + prodDtlObjId + '\'' +
                ", prodImgType=" + prodImgType +
                ", prodImgSeq='" + prodImgSeq + '\'' +
                ", prodImgValueType=" + prodImgValueType +
                ", defaultYn=" + defaultYn +
                ", prodImgFilePath='" + prodImgFilePath + '\'' +
                ", prodImgFileSize=" + prodImgFileSize +
                ", prodImgVersion=" + prodImgVersion +
                ", createDate=" + createDate +
                ", createUserId='" + createUserId + '\'' +
                ", updateDate=" + updateDate +
                ", updateUserId='" + updateUserId + '\'' +
                '}';
    }
}
