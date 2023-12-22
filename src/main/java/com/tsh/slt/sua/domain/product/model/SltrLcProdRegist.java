package com.tsh.slt.sua.domain.product.model;

import com.tsh.slt.sua.util.code.MktCode;
import com.tsh.slt.sua.util.code.PriceCurrency;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Entity(name = "SLTR_LC_PROD_REGIST")
public class SltrLcProdRegist {

    @javax.persistence.Id
    @GenericGenerator(name = "SLTR_LC_PROD_REGIST_SEQ_GENERATOR", strategy = "com.tsh.slt.agent.util.ObjIdGenerator")
    @GeneratedValue(generator = "SLTR_LC_PROD_REGIST_SEQ_GENERATOR")
    private String objId;

    @Column(name = "USER_OBJ_ID")
    private String userObjId;

    @Column(name = "REGIST_PROD_ID")
    private String registProdId;

    @Column(name = "COLLECT_PROD_OBJ_ID")
    private String collectProdObjId;

    @Enumerated(EnumType.STRING)
    @Column(name = "TGT_MKT_CODE")
    private MktCode tgtMktCode;

    @Column(name = "REGIST_VERSION")
    private Integer registVersion;

    @Column(name = "REGIST_PRICE")
    private Integer registPrice;

    @Enumerated(EnumType.STRING)
    @Column(name = "PRICE_CURRENCY")
    private PriceCurrency priceCurrency;

    @Column(name = "TGT_PROD_URL")
    private String tgtProdUrl;


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
    public SltrLcProdRegist(String objId, String userObjId, String registProdId, String collectProdObjId, MktCode tgtMktCode, Integer registVersion, Integer registPrice, PriceCurrency priceCurrency, String tgtProdUrl, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
        this.objId = objId;
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

    @Override
    public String toString() {
        return "SltrLcProdRegist{" +
                "objId='" + objId + '\'' +
                ", userObjId='" + userObjId + '\'' +
                ", registProdId='" + registProdId + '\'' +
                ", collectProdObjId='" + collectProdObjId + '\'' +
                ", tgtMktCode=" + tgtMktCode +
                ", registVersion=" + registVersion +
                ", registPrice=" + registPrice +
                ", priceCurrency=" + priceCurrency +
                ", tgtProdUrl='" + tgtProdUrl + '\'' +
                ", createDate=" + createDate +
                ", createUserId='" + createUserId + '\'' +
                ", updateDate=" + updateDate +
                ", updateUserId='" + updateUserId + '\'' +
                '}';
    }
}
