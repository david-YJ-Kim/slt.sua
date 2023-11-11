package com.tsh.slt.agent.domain.user.model;

import com.tsh.slt.agent.util.code.ImgType;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Entity(name = "SLTR_LC_IMG_DTL")
public class SltrLcImgDtl {

    @javax.persistence.Id
    @GenericGenerator(name = "SLTR_LC_IMG_DTL_SEQ_GENERATOR", strategy = "com.tsh.slt.agent.util.ObjIdGenerator")
    @GeneratedValue(generator = "SLTR_LC_IMG_DTL_SEQ_GENERATOR")
    private String objId;

    @Column(name = "USER_ID")
    private String userId;

    @Enumerated(EnumType.STRING)
    @Column(name = "IMG_TYPE")
    private ImgType imgType;

    @Column(name = "IMG_FILE_PATH")
    private String imgFilePath;

    @Column(name = "IMG_SEQ")
    private Integer imgSeq;

    @Column(name = "IMG_FILE_NAME")
    private String imgFileName;

    @Column(name = "IMG_FILE_SIZE")
    private Integer imgFileSize;

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
    public SltrLcImgDtl(String objId, String userId, ImgType imgType, String imgFilePath, Integer imgSeq, String imgFileName, Integer imgFileSize, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
        this.objId = objId;
        this.userId = userId;
        this.imgType = imgType;
        this.imgFilePath = imgFilePath;
        this.imgSeq = imgSeq;
        this.imgFileName = imgFileName;
        this.imgFileSize = imgFileSize;
        this.createDate = createDate;
        this.createUserId = createUserId;
        this.updateDate = updateDate;
        this.updateUserId = updateUserId;
    }

    @Override
    public String toString() {
        return "SltrLcImgDtl{" +
                "objId='" + objId + '\'' +
                ", userId='" + userId + '\'' +
                ", imgType=" + imgType +
                ", imgFilePath='" + imgFilePath + '\'' +
                ", imgSeq='" + imgSeq + '\'' +
                ", imgFileName='" + imgFileName + '\'' +
                ", imgFileSize=" + imgFileSize +
                ", createDate=" + createDate +
                ", createUserId='" + createUserId + '\'' +
                ", updateDate=" + updateDate +
                ", updateUserId='" + updateUserId + '\'' +
                '}';
    }
}
