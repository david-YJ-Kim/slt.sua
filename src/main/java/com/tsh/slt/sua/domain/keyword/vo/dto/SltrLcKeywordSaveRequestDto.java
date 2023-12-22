package com.tsh.slt.sua.domain.keyword.vo.dto;

import com.tsh.slt.sua.domain.keyword.model.SltrLcKeyword;
import com.tsh.slt.sua.util.code.UseYn;
import com.tsh.slt.sua.util.common.dto.CommonDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Getter
public class SltrLcKeywordSaveRequestDto implements CommonDto<SltrLcKeyword> {

    private String userObjId;
    private String prodKeyword;
    private String srcMktId;
    private String keywordUrl;
    private String searchKeyword;
    private String subjectKeyword;
    private String hashTag;
    private String autoSearchYn;
    private Integer collectStartPage;
    private Integer collectEndPage;
    private Integer baseMgnRate;
    private Integer baseMgnValue;
    private Timestamp registerDate;
    private String collectProdYn;
    private Timestamp lastCollectDate;
    private Integer prodQty;
    private Integer collectQty;
    private String cpCategory;
    private String ssCategory;
    private String stCategory;
    private String cmCategory;
    private String intpkCategory;
    private String coreKeywordYn;
    private Timestamp createDate;
    private String createUserId;
    private Timestamp updateDate;
    private String updateUserId;

    @Builder
    public SltrLcKeywordSaveRequestDto(String userObjId, String prodKeyword, String srcMktId, String keywordUrl, String searchKeyword, String subjectKeyword, String hashTag, String autoSearchYn, Integer collectStartPage, Integer collectEndPage, Integer baseMgnRate, Integer baseMgnValue, Timestamp registerDate, String collectProdYn, Timestamp lastCollectDate, Integer prodQty, Integer collectQty, String cpCategory, String ssCategory, String stCategory, String cmCategory, String intpkCategory, String coreKeywordYn, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
        this.userObjId = userObjId;
        this.prodKeyword = prodKeyword;
        this.srcMktId = srcMktId;
        this.keywordUrl = keywordUrl;
        this.searchKeyword = searchKeyword;
        this.subjectKeyword = subjectKeyword;
        this.hashTag = hashTag;
        this.autoSearchYn = autoSearchYn;
        this.collectStartPage = collectStartPage;
        this.collectEndPage = collectEndPage;
        this.baseMgnRate = baseMgnRate;
        this.baseMgnValue = baseMgnValue;
        this.registerDate = registerDate;
        this.collectProdYn = collectProdYn;
        this.lastCollectDate = lastCollectDate;
        this.prodQty = prodQty;
        this.collectQty = collectQty;
        this.cpCategory = cpCategory;
        this.ssCategory = ssCategory;
        this.stCategory = stCategory;
        this.cmCategory = cmCategory;
        this.intpkCategory = intpkCategory;
        this.coreKeywordYn = coreKeywordYn;
        this.createDate = createDate;
        this.createUserId = createUserId;
        this.updateDate = updateDate;
        this.updateUserId = updateUserId;
    }

    @Override
    public SltrLcKeyword toEntity() {

        return SltrLcKeyword.builder()
                .userObjId(userObjId)
                .prodKeyword(prodKeyword)
                .srcMktId(srcMktId)
                .keywordUrl(keywordUrl)
                .searchKeyword(searchKeyword)
                .subjectKeyword(subjectKeyword)
                .hashTag(hashTag)
                .autoSearchYn(UseYn.valueOf(autoSearchYn))
                .collectStartPage(collectStartPage)
                .collectEndPage(collectEndPage)
                .baseMgnRate(baseMgnRate)
                .baseMgnValue(baseMgnValue)
                .registerDate(registerDate)
                .collectProdYn(UseYn.valueOf(collectProdYn))
                .lastCollectDate(lastCollectDate)
                .prodQty(prodQty)
                .collectQty(collectQty)
                .cpCategory(cpCategory)
                .ssCategory(ssCategory)
                .stCategory(stCategory)
                .cmCategory(cmCategory)
                .intpkCategory(intpkCategory)
                .coreKeywordYn(UseYn.valueOf(coreKeywordYn))
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
