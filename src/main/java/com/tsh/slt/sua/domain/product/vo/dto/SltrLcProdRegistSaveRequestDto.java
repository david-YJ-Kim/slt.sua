package com.tsh.slt.sua.domain.product.vo.dto;


import com.tsh.slt.sua.domain.product.model.SltrLcProdRegist;
import com.tsh.slt.sua.util.code.MktCode;
import com.tsh.slt.sua.util.code.PriceCurrency;
import com.tsh.slt.sua.util.common.dto.CommonDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Getter
public class SltrLcProdRegistSaveRequestDto implements CommonDto<SltrLcProdRegist> {

    private String userObjId;
    private String registProdId;
    private String collectProdObjId;
    private String tgtMktCode;
    private Integer registVersion;
    private Integer registPrice;
    private String priceCurrency;
    private String tgtProdUrl;
    private Timestamp createDate;
    private String createUserId;
    private Timestamp updateDate;
    private String updateUserId;

    @Builder
    public SltrLcProdRegistSaveRequestDto(String userObjId, String registProdId, String collectProdObjId, String tgtMktCode, Integer registVersion, Integer registPrice, String priceCurrency, String tgtProdUrl, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
        this.userObjId = userObjId;
        this.registProdId = registProdId;
        this.collectProdObjId = collectProdObjId;
        this.tgtMktCode = tgtMktCode;
        this.registVersion = registVersion;
        this.registPrice = registPrice;
        this.priceCurrency = priceCurrency;
        this.tgtProdUrl = tgtProdUrl;
        this.createDate = createDate;
        this.createUserId = createUserId;
        this.updateDate = updateDate;
        this.updateUserId = updateUserId;
    }

    public SltrLcProdRegist toEntity() {
        return SltrLcProdRegist.builder()
                .userObjId(userObjId)
                .registProdId(registProdId)
                .collectProdObjId(collectProdObjId)
                .tgtMktCode(MktCode.valueOf(tgtMktCode))
                .registVersion(registVersion)
                .registPrice(registPrice)
                .priceCurrency(PriceCurrency.valueOf(priceCurrency))
                .tgtProdUrl(tgtProdUrl)
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
