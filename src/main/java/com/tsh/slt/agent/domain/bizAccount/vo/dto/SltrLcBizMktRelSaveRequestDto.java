package com.tsh.slt.agent.domain.bizAccount.vo.dto;

import com.tsh.slt.agent.domain.bizAccount.model.SltrLcBizMktRel;
import com.tsh.slt.agent.util.code.UseYn;
import com.tsh.slt.agent.util.common.dto.CommonDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.sql.Timestamp;

@NoArgsConstructor
@Getter
public class SltrLcBizMktRelSaveRequestDto implements CommonDto<SltrLcBizMktRel> {

    private String userObjId;
    private String userId;
    private String bizObjId;
    private String mktId;
    private String mktUserId;
    private String mktUserPwd;
    private String apiAccessKey;
    private String apiSecretKey;
    private String mktCompanyCode;
    private String autoConnectYn;
    private String autoProdUploadYn;
    private Integer mgnRate;
    private Integer mgnBasic;
    private Timestamp createDate;
    private String createUserId;
    private Timestamp updateDate;
    private String updateUserId;

    @Builder
    public SltrLcBizMktRelSaveRequestDto(String userObjId, String userId, String bizObjId, String mktId, String mktUserId, String mktUserPwd, String apiAccessKey, String apiSecretKey, String mktCompanyCode, String autoConnectYn, String autoProdUploadYn, Integer mgnRate, Integer mgnBasic, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
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
    public SltrLcBizMktRel toEntity() {
        return SltrLcBizMktRel.builder()
                .userId(userId)
                .userId(userId)
                .bizObjId(bizObjId)
                .mktId(mktId)
                .mktUserId(mktUserId)
                .mktUserPwd(mktUserPwd)
                .apiAccessKey(apiAccessKey)
                .apiSecretKey(apiSecretKey)
                .mktCompanyCode(mktCompanyCode)
                .autoConnectYn(UseYn.valueOf(autoConnectYn))
                .autoProdUploadYn(UseYn.valueOf(autoProdUploadYn))
                .mgnRate(mgnRate)
                .mgnBasic(mgnBasic)
                .createDate(createDate)
                .createUserId(createUserId)
                .updateDate(updateDate)
                .updateUserId(updateUserId)
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
