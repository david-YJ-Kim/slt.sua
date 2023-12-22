package com.tsh.slt.sua.domain.product.vo.dto;

import com.tsh.slt.sua.domain.product.model.SltrLcProdDtlImg;
import com.tsh.slt.sua.util.code.ProdImgType;
import com.tsh.slt.sua.util.code.ProdImgValueType;
import com.tsh.slt.sua.util.code.UseYn;
import com.tsh.slt.sua.util.common.dto.CommonDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Getter
public class SltrLcProdDtlImgSaveRequestDto implements CommonDto<SltrLcProdDtlImg> {

    private String userObjId;
    private String prodObjId;
    private String prodDtlObjId;
    private String prodImgType;
    private Integer prodImgSeq;
    private String prodImgValueType;
    private String defaultYn;
    private String prodImgFilePath;
    private Integer prodImgFileSize;
    private Integer prodImgVersion;
    private Timestamp createDate;
    private String createUserId;
    private Timestamp updateDate;
    private String updateUserId;

    @Builder
    public SltrLcProdDtlImgSaveRequestDto(String userObjId, String prodObjId, String prodDtlObjId, String prodImgType, Integer prodImgSeq, String prodImgValueType, String defaultYn, String prodImgFilePath, Integer prodImgFileSize, Integer prodImgVersion, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
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
    public SltrLcProdDtlImg toEntity() {
        return SltrLcProdDtlImg.builder()
                .userObjId(userObjId)
                .prodObjId(prodObjId)
                .prodDtlObjId(prodDtlObjId)
                .prodImgType(ProdImgType.valueOf(prodImgType))
                .prodImgSeq(prodImgSeq)
                .prodImgValueType(ProdImgValueType.valueOf(prodImgValueType))
                .defaultYn(UseYn.valueOf(defaultYn))
                .prodImgFilePath(prodImgFilePath)
                .prodImgFileSize(prodImgFileSize)
                .prodImgVersion(prodImgVersion)
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
