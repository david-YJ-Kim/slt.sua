package com.tsh.slt.agent.domain.user.vo.dto;

import com.tsh.slt.agent.domain.user.model.SltrLcImgDtl;
import com.tsh.slt.agent.util.code.ImgType;
import com.tsh.slt.agent.util.common.dto.CommonDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Getter
public class SltrLcImgDtlSaveRequestDto implements CommonDto<SltrLcImgDtl> {

    private String userId;
    private String imgType;
    private String imgFilePath;
    private Integer imgSeq;
    private String imgFileName;
    private Integer imgFileSize;
    private Timestamp createDate;
    private String createUserId;
    private Timestamp updateDate;
    private String updateUserId;

    @Builder
    public SltrLcImgDtlSaveRequestDto(String userId, String imgType, String imgFilePath, Integer imgSeq, String imgFileName, Integer imgFileSize, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
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
    public SltrLcImgDtl toEntity() {
        return SltrLcImgDtl.builder()
                .userId(userId)
                .imgType(ImgType.valueOf(imgType))
                .imgFilePath(imgFilePath)
                .imgSeq(imgSeq)
                .imgFileName(imgFileName)
                .imgFileSize(imgFileSize)
                .createDate(createDate).createUserId(createUserId)
                .updateDate(updateDate).updateUserId(updateUserId)
                .build();
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
