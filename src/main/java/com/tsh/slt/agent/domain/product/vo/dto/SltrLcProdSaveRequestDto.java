package com.tsh.slt.agent.domain.product.vo.dto;

import com.tsh.slt.agent.domain.product.model.SltrLcProd;
import com.tsh.slt.agent.util.code.DeliveryOpt;
import com.tsh.slt.agent.util.code.PriceCurrency;
import com.tsh.slt.agent.util.code.ProdStatus;
import com.tsh.slt.agent.util.code.UseYn;
import com.tsh.slt.agent.util.common.dto.CommonDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Getter
public class SltrLcProdSaveRequestDto implements CommonDto<SltrLcProd> {

    private String prodId;
    private String keywordObjId;
    private String prodTitle;
    private String prodContent;
    private String priceCurrency;
    private Integer prodPrice;
    private String deliveryOpt;
    private String deliveryYn;
    private String srcMktUrl;
    private String prodStatus;
    private String coreProdYn;
    private Timestamp createDate;
    private String createUserId;
    private Timestamp updateDate;
    private String updateUserId;


    @Builder
    public SltrLcProdSaveRequestDto(String prodId, String keywordObjId, String prodTitle, String prodContent, String priceCurrency, Integer prodPrice, String deliveryOpt, String deliveryYn, String srcMktUrl, String prodStatus, String coreProdYn, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
        this.prodId = prodId;
        this.keywordObjId = keywordObjId;
        this.prodTitle = prodTitle;
        this.prodContent = prodContent;
        this.priceCurrency = priceCurrency;
        this.prodPrice = prodPrice;
        this.deliveryOpt = deliveryOpt;
        this.deliveryYn = deliveryYn;
        this.srcMktUrl = srcMktUrl;
        this.prodStatus = prodStatus;
        this.coreProdYn = coreProdYn;
        this.createDate = createDate;
        this.createUserId = createUserId;
        this.updateDate = updateDate;
        this.updateUserId = updateUserId;
    }

    @Override
    public SltrLcProd toEntity() {
        return SltrLcProd.builder()
                .prodId(prodId)
                .keywordObjId(keywordObjId)
                .prodTitle(prodTitle)
                .prodContent(prodContent)
                .priceCurrency(PriceCurrency.valueOf(priceCurrency))
                .prodPrice(prodPrice)
                .deliveryOpt(DeliveryOpt.valueOf(deliveryOpt))
                .deliveryYn(UseYn.valueOf(deliveryYn))
                .srcMktUrl(srcMktUrl)
                .prodStatus(ProdStatus.valueOf(prodStatus))
                .coreProdYn(UseYn.valueOf(coreProdYn))
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
