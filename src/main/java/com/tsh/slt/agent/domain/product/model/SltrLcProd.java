package com.tsh.slt.agent.domain.product.model;

import com.tsh.slt.agent.util.code.DeliveryOpt;
import com.tsh.slt.agent.util.code.PriceCurrency;
import com.tsh.slt.agent.util.code.ProdStatus;
import com.tsh.slt.agent.util.code.UseYn;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Entity(name = "SLTR_LC_PROD")
public class SltrLcProd {
    @javax.persistence.Id
    @GenericGenerator(name = "SLTR_LC_PROD_SEQ_GENERATOR", strategy = "com.tsh.slt.agent.util.ObjIdGenerator")
    @GeneratedValue(generator = "SLTR_LC_PROD_SEQ_GENERATOR")
    private String objId;

    @Column(name = "PROD_ID")
    private String prodId;

    @Column(name = "KEYWORD_OBJ_ID")
    private String keywordObjId;

    @Column(name = "PROD_TITLE")
    private String prodTitle;

    @Column(name = "PROD_CONTENT")
    private String prodContent;

    @Enumerated(EnumType.STRING)
    @Column(name = "PRICE_CURRENCY")
    private PriceCurrency priceCurrency;

    @Column(name = "PROD_PRICE")
    private Integer prodPrice;

    @Enumerated(EnumType.STRING)
    @Column(name = "DELIVERY_OPT")
    private DeliveryOpt deliveryOpt;

    @Enumerated(EnumType.STRING)
    @Column(name = "DELIVERY_YN")
    private UseYn deliveryYn;

    @Column(name = "SRC_MKT_URL")
    private String srcMktUrl;

    @Enumerated(EnumType.STRING)
    @Column(name = "PROD_STATUS")
    private ProdStatus prodStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "CORE_PROD_YN")
    private UseYn coreProdYn;

    // Default
    @Column(name = "CREATE_DATE")
    private Timestamp createDate;

    @Column(name = "CREATE_USER_ID")
    private String createUserId;

    @Column(name = "UPDATE_DATE")
    private Timestamp updateDate;

    @Column(name = "UPDATE_USER_ID")
    private String updateUserId;

    public SltrLcProd(String objId, String prodId, String keywordObjId, String prodTitle, String prodContent, PriceCurrency priceCurrency, Integer prodPrice, DeliveryOpt deliveryOpt, UseYn deliveryYn, String srcMktUrl, ProdStatus prodStatus, UseYn coreProdYn, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
        this.objId = objId;
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
    public String toString() {
        return "SltrLcProd{" +
                "objId='" + objId + '\'' +
                ", prodId='" + prodId + '\'' +
                ", keywordObjId='" + keywordObjId + '\'' +
                ", prodTitle='" + prodTitle + '\'' +
                ", prodContent='" + prodContent + '\'' +
                ", priceCurrency=" + priceCurrency +
                ", prodPrice=" + prodPrice +
                ", deliveryOpt=" + deliveryOpt +
                ", deliveryYn=" + deliveryYn +
                ", srcMktUrl='" + srcMktUrl + '\'' +
                ", prodStatus=" + prodStatus +
                ", coreProdYn=" + coreProdYn +
                ", createDate=" + createDate +
                ", createUserId='" + createUserId + '\'' +
                ", updateDate=" + updateDate +
                ", updateUserId='" + updateUserId + '\'' +
                '}';
    }
}
