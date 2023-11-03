package com.tsh.slt.agent.domain.keyword.model;

import com.tsh.slt.agent.util.code.UseYn;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Entity(name = "SLTR_LC_KEYWORD")
public class SltrLcKeyword {

    @javax.persistence.Id
    @GenericGenerator(name = "SLTR_LC_CODE_DEF_SEQ_GENERATOR", strategy = "com.tsh.slt.agent.util.ObjIdGenerator")
    @GeneratedValue(generator = "SLTR_LC_CODE_DEF_SEQ_GENERATOR")
    private String objId;


    @Column(name = "USER_OBJ_ID")
    private String userObjId;

    @Column(name = "PROD_KEYWORD")
    private String prodKeyword;

    @Column(name = "SRC_MKT_ID")
    private String srcMktId;

    @Column(name = "KEYWORD_URL")
    private String keywordUrl;

    @Column(name = "SEARCH_KEYWORD")
    private String searchKeyword;

    @Column(name = "SUBJECT_KEYWORD")
    private String subjectKeyword;

    @Column(name = "HASTAG")
    private String hashTag;

    @Column(name = "AUTO_SEARCH_YN")
    private UseYn autoSearchYn;

    @Column(name = "COLLECT_START_PAGE")
    private String collectStartPage;

    @Column(name = "COLLECT_END_PAGE")
    private String collectEndPage;

    @Column(name = "BASE_MGN_RATE")
    private Integer baseMgnRate;

    @Column(name = "BASE_MGN_VALUE")
    private Integer baseMgnValue;

    @Column(name = "REGISTER_DATE")
    private Timestamp registerDate;

    @Column(name = "COLLECT_PROD_YN")
    private UseYn collectProdYn;

    @Column(name = "LAST_COLLECT_DATE")
    private Timestamp lastCollectDate;

    @Column(name = "PROD_QTY")
    private Integer prodQty;

    @Column(name = "COLLECT_QTY")
    private Integer collectQty;

    @Column(name = "CP_CATEGORY")
    private String cpCategory;

    @Column(name = "SS_CATEGORY")
    private String ssCategory;

    @Column(name = "ST_CATEGORY")
    private String stCategory;

    @Column(name = "CM_CATEGORY")
    private String cmCategory;

    @Column(name = "INTPK_CATEGORY")
    private String intpkCategory;

    @Column(name = "CORE_KEYWORD_YN")
    private UseYn coreKeywordYn;



    // Default
    @Column(name = "CREATE_DATE")
    private Timestamp createDate;

    @Column(name = "CREATE_USER_ID")
    private String createUserId;

    @Column(name = "UPDATE_DATE")
    private Timestamp updateDate;

    @Column(name = "UPDATE_USER_ID")
    private String updateUserId;

    public SltrLcKeyword(String objId, String userObjId, String prodKeyword, String srcMktId, String keywordUrl, String searchKeyword, String subjectKeyword, String hashTag, UseYn autoSearchYn, String collectStartPage, String collectEndPage, Integer baseMgnRate, Integer baseMgnValue, Timestamp registerDate, UseYn collectProdYn, Timestamp lastCollectDate, Integer prodQty, Integer collectQty, String cpCategory, String ssCategory, String stCategory, String cmCategory, String intpkCategory, UseYn coreKeywordYn, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
        this.objId = objId;
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
    public String toString() {
        return "SltrLcKeyword{" +
                "objId='" + objId + '\'' +
                ", userObjId='" + userObjId + '\'' +
                ", prodKeyword='" + prodKeyword + '\'' +
                ", srcMktId='" + srcMktId + '\'' +
                ", keywordUrl='" + keywordUrl + '\'' +
                ", searchKeyword='" + searchKeyword + '\'' +
                ", subjectKeyword='" + subjectKeyword + '\'' +
                ", hashTag='" + hashTag + '\'' +
                ", autoSearchYn=" + autoSearchYn +
                ", collectStartPage='" + collectStartPage + '\'' +
                ", collectEndPage='" + collectEndPage + '\'' +
                ", baseMgnRate=" + baseMgnRate +
                ", baseMgnValue=" + baseMgnValue +
                ", registerDate=" + registerDate +
                ", collectProdYn=" + collectProdYn +
                ", lastCollectDate=" + lastCollectDate +
                ", prodQty=" + prodQty +
                ", collectQty=" + collectQty +
                ", cpCategory='" + cpCategory + '\'' +
                ", ssCategory='" + ssCategory + '\'' +
                ", stCategory='" + stCategory + '\'' +
                ", cmCategory='" + cmCategory + '\'' +
                ", intpkCategory='" + intpkCategory + '\'' +
                ", coreKeywordYn=" + coreKeywordYn +
                ", createDate=" + createDate +
                ", createUserId='" + createUserId + '\'' +
                ", updateDate=" + updateDate +
                ", updateUserId='" + updateUserId + '\'' +
                '}';
    }
}
