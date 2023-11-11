package com.tsh.slt.agent.domain.product.vo.dto;

import com.tsh.slt.agent.domain.product.model.SltrLcProdDtl;
import com.tsh.slt.agent.util.code.PriceCurrency;
import com.tsh.slt.agent.util.code.ProdStatus;
import com.tsh.slt.agent.util.common.dto.CommonDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Getter
public class SltrLcProdDtlSaveRequestDto implements CommonDto<SltrLcProdDtl> {

    private String userObjId;
    private String keywordObjId;
    private String optTyp;
    private String optName;
    private Integer optPrice;
    private String priceCurrency;
    private String srcItemId;
    private String srcItemUrl;
    private String prodStatus;
    private String prodFileName;
    private String cpDeployKey;
    private Timestamp cpDeployDate;
    private String ssDeployKey;
    private Timestamp ssDeployDate;
    private String stDeployKey;
    private Timestamp stDeployDate;
    private String gmDeployKey;
    private Timestamp gmDeployDate;
    private String acDeployKey;
    private Timestamp acDeployDate;
    private String intpkDeployKey;
    private Timestamp intpkDeployDate;
    private String othersDeployKey;

    private Timestamp createDate;
    private String createUserId;
    private Timestamp updateDate;
    private String updateUserId;

    @Builder
    public SltrLcProdDtlSaveRequestDto(String userObjId, String keywordObjId, String optTyp, String optName, Integer optPrice, String priceCurrency, String srcItemId, String srcItemUrl, String prodStatus, String prodFileName, String cpDeployKey, Timestamp cpDeployDate, String ssDeployKey, Timestamp ssDeployDate, String stDeployKey, Timestamp stDeployDate, String gmDeployKey, Timestamp gmDeployDate, String acDeployKey, Timestamp acDeployDate, String intpkDeployKey, Timestamp intpkDeployDate, String othersDeployKey, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
        this.userObjId = userObjId;
        this.keywordObjId = keywordObjId;
        this.optTyp = optTyp;
        this.optName = optName;
        this.optPrice = optPrice;
        this.priceCurrency = priceCurrency;
        this.srcItemId = srcItemId;
        this.srcItemUrl = srcItemUrl;
        this.prodStatus = prodStatus;
        this.prodFileName = prodFileName;
        this.cpDeployKey = cpDeployKey;
        this.cpDeployDate = cpDeployDate;
        this.ssDeployKey = ssDeployKey;
        this.ssDeployDate = ssDeployDate;
        this.stDeployKey = stDeployKey;
        this.stDeployDate = stDeployDate;
        this.gmDeployKey = gmDeployKey;
        this.gmDeployDate = gmDeployDate;
        this.acDeployKey = acDeployKey;
        this.acDeployDate = acDeployDate;
        this.intpkDeployKey = intpkDeployKey;
        this.intpkDeployDate = intpkDeployDate;
        this.othersDeployKey = othersDeployKey;
        this.createDate = createDate;
        this.createUserId = createUserId;
        this.updateDate = updateDate;
        this.updateUserId = updateUserId;
    }

    @Override
    public SltrLcProdDtl toEntity() {
        return SltrLcProdDtl.builder()
                .userObjId(userObjId)
                .keywordObjId(keywordObjId)
                .optTyp(optTyp)
                .optName(optName)
                .optPrice(optPrice)
                .priceCurrency(PriceCurrency.valueOf(priceCurrency))
                .srcItemId(srcItemId)
                .srcItemUrl(srcItemUrl)
                .prodStatus(ProdStatus.valueOf(prodStatus))
                .prodFileName(prodFileName)
                .cpDeployKey(cpDeployKey)
                .cpDeployDate(cpDeployDate)
                .ssDeployKey(ssDeployKey)
                .ssDeployDate(ssDeployDate)
                .stDeployKey(stDeployKey)
                .stDeployDate(stDeployDate)
                .gmDeployKey(gmDeployKey)
                .gmDeployDate(gmDeployDate)
                .acDeployKey(acDeployKey)
                .acDeployDate(acDeployDate)
                .intpkDeployKey(intpkDeployKey)
                .intpkDeployDate(intpkDeployDate)
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
