package com.tsh.slt.sua.domain.product.model;

import com.tsh.slt.sua.util.code.PriceCurrency;
import com.tsh.slt.sua.util.code.ProdStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Entity(name = "SLTR_LC_PROD_DTL")
public class SltrLcProdDtl {

    @javax.persistence.Id
    @GenericGenerator(name = "SLTR_LC_PROD_DTL_SEQ_GENERATOR", strategy = "com.tsh.slt.agent.util.ObjIdGenerator")
    @GeneratedValue(generator = "SLTR_LC_PROD_DTL_SEQ_GENERATOR")
    private String objId;

    @Column(name = "USER_OBJ_ID")
    private String userObjId;

    @Column(name = "KEYWORD_OBJ_ID")
    private String keywordObjId;

    @Column(name = "OPT_TYP")
    private String optTyp;

    @Column(name = "OPT_NAME")
    private String optName;

    @Column(name = "OPT_PRICE")
    private Integer optPrice;

    @Enumerated(EnumType.STRING)
    @Column(name = "PRICE_CURRENCY")
    private PriceCurrency priceCurrency;

    @Column(name = "SRC_ITEM_ID")
    private String srcItemId;

    @Column(name = "SRC_ITEM_URL")
    private String srcItemUrl;

    @Enumerated(EnumType.STRING)
    @Column(name = "PROD_STATUS")
    private ProdStatus prodStatus;

    @Column(name = "PROD_FILE_NAME")
    private String prodFileName;

    @Column(name = "CP_DEPLOY_KEY")
    private String cpDeployKey;

    @Column(name = "CP_DEPLOY_DATE")
    private Timestamp cpDeployDate;

    @Column(name = "SS_DEPLOY_KEY")
    private String ssDeployKey;

    @Column(name = "SS_DEPLOY_DATE")
    private Timestamp ssDeployDate;

    @Column(name = "ST_DEPLOY_KEY")
    private String stDeployKey;

    @Column(name = "ST_DEPLOY_DATE")
    private Timestamp stDeployDate;

    @Column(name = "GM_DEPLOY_KEY")
    private String gmDeployKey;

    @Column(name = "GM_DEPLOY_DATE")
    private Timestamp gmDeployDate;

    @Column(name = "AC_DEPLOY_KEY")
    private String acDeployKey;

    @Column(name = "AC_DEPLOY_DATE")
    private Timestamp acDeployDate;

    @Column(name = "INTPK_DEPLOY_KEY")
    private String intpkDeployKey;

    @Column(name = "INTPK_DEPLOY_DATE")
    private Timestamp intpkDeployDate;

    @Column(name = "OTHERS_DEPLOY_KEY")
    private String othersDeployKey;

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
    public SltrLcProdDtl(String objId, String userObjId, String keywordObjId, String optTyp, String optName, Integer optPrice, PriceCurrency priceCurrency, String srcItemId, String srcItemUrl, ProdStatus prodStatus, String prodFileName, String cpDeployKey, Timestamp cpDeployDate, String ssDeployKey, Timestamp ssDeployDate, String stDeployKey, Timestamp stDeployDate, String gmDeployKey, Timestamp gmDeployDate, String acDeployKey, Timestamp acDeployDate, String intpkDeployKey, Timestamp intpkDeployDate, String othersDeployKey, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
        this.objId = objId;
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
    public String toString() {
        return "SltrLcProdDtl{" +
                "objId='" + objId + '\'' +
                ", userObjId='" + userObjId + '\'' +
                ", keywordObjId='" + keywordObjId + '\'' +
                ", optTyp='" + optTyp + '\'' +
                ", optName='" + optName + '\'' +
                ", optPrice=" + optPrice +
                ", priceCurrency=" + priceCurrency +
                ", srcItemId='" + srcItemId + '\'' +
                ", srcItemUrl='" + srcItemUrl + '\'' +
                ", prodStatus=" + prodStatus +
                ", prodFileName='" + prodFileName + '\'' +
                ", cpDeployKey='" + cpDeployKey + '\'' +
                ", cpDeployDate=" + cpDeployDate +
                ", ssDeployKey='" + ssDeployKey + '\'' +
                ", ssDeployDate=" + ssDeployDate +
                ", stDeployKey='" + stDeployKey + '\'' +
                ", stDeployDate=" + stDeployDate +
                ", gmDeployKey='" + gmDeployKey + '\'' +
                ", gmDeployDate=" + gmDeployDate +
                ", acDeployKey='" + acDeployKey + '\'' +
                ", acDeployDate=" + acDeployDate +
                ", intpkDeployKey='" + intpkDeployKey + '\'' +
                ", intpkDeployDate=" + intpkDeployDate +
                ", othersDeployKey='" + othersDeployKey + '\'' +
                ", createDate=" + createDate +
                ", createUserId='" + createUserId + '\'' +
                ", updateDate=" + updateDate +
                ", updateUserId='" + updateUserId + '\'' +
                '}';
    }
}
