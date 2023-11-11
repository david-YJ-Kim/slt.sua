package com.tsh.slt.agent.domain.user.model;

import com.tsh.slt.agent.util.code.ShipFeeType;
import com.tsh.slt.agent.util.code.UseYn;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Entity(name = "SLTR_LC_USER")
public class SltrLcUser {

    @javax.persistence.Id
    @GenericGenerator(name = "SLTR_LC_USER_SEQ_GENERATOR", strategy = "com.tsh.slt.agent.util.ObjIdGenerator")
    @GeneratedValue(generator = "SLTR_LC_USER_SEQ_GENERATOR")
    private String objId;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "ACTIVE_LICENSE_ID")
    private String activeLicenseId;

    @Column(name = "ACTIVE_DATE")
    private Timestamp activeDate;

    @Column(name = "USD_EXCHANGE_RATE")
    private Integer usdExchangeRate;

    @Column(name = "CNY_EXCHANGE_RATE")
    private Integer cnyExchangeRate;

    @Column(name = "BASE_MGN_RATE")
    private Integer baseMgnRate;

    @Column(name = "BASE_MGN_VALUE")
    private Integer baseMgnValue;

    @Column(name = "CUSTOM_EXCD_MGN_RATE")
    private Integer customExcdMgnRate;

    @Column(name = "CUSTOM_EXCD_MGN_VALUE")
    private Integer customExcdMgnValue;

    @Enumerated(EnumType.STRING)
    @Column(name = "SHIP_FEE_TYPE")
    private ShipFeeType shipFeeType;

    @Column(name = "BASE_SHIP_FEE")
    private Integer baseShipFee;

    @Column(name = "RETURN_SHIP_FEE")
    private Integer returnShipFee;

    @Column(name = "EXCHANGE_SHIP_FEE")
    private Integer exchangeShipFee;

    @Column(name = "MAKER_NAME")
    private String makerName;

    @Column(name = "BRAND_NAME")
    private String brandName;

    @Enumerated(EnumType.STRING)
    @Column(name = "ONLY_FOR_ADULT_YN")
    private UseYn onlyForAdultYn;

    @Enumerated(EnumType.STRING)
    @Column(name = "USE_THUMB_OPT_IMG_YN")
    private UseYn useThumbOptImgYn;

    @Enumerated(EnumType.STRING)
    @Column(name = "AUTO_HASH_TAG_YN")
    private UseYn autoHashTagYn;

    @Enumerated(EnumType.STRING)
    @Column(name = "USE_TOP_IMG_YN")
    private UseYn useTopImgYn;

    @Enumerated(EnumType.STRING)
    @Column(name = "USE_BOT_IMG_YN")
    private UseYn useBotImgYn;

    @Enumerated(EnumType.STRING)
    @Column(name = "USE_BASE_BOT_IMG_YN")
    private UseYn useBaseBotImgYn;



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
    public SltrLcUser(String objId, String userId, String userName, String activeLicenseId, Timestamp activeDate, Integer usdExchangeRate, Integer cnyExchangeRate, Integer baseMgnRate, Integer baseMgnValue, Integer customExcdMgnRate, Integer customExcdMgnValue, ShipFeeType shipFeeType, Integer baseShipFee, Integer returnShipFee, Integer exchangeShipFee, String makerName, String brandName, UseYn onlyForAdultYn, UseYn useThumbOptImgYn, UseYn autoHashTagYn, UseYn useTopImgYn, UseYn useBotImgYn, UseYn useBaseBotImgYn, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
        this.objId = objId;
        this.userId = userId;
        this.userName = userName;
        this.activeLicenseId = activeLicenseId;
        this.activeDate = activeDate;
        this.usdExchangeRate = usdExchangeRate;
        this.cnyExchangeRate = cnyExchangeRate;
        this.baseMgnRate = baseMgnRate;
        this.baseMgnValue = baseMgnValue;
        this.customExcdMgnRate = customExcdMgnRate;
        this.customExcdMgnValue = customExcdMgnValue;
        this.shipFeeType = shipFeeType;
        this.baseShipFee = baseShipFee;
        this.returnShipFee = returnShipFee;
        this.exchangeShipFee = exchangeShipFee;
        this.makerName = makerName;
        this.brandName = brandName;
        this.onlyForAdultYn = onlyForAdultYn;
        this.useThumbOptImgYn = useThumbOptImgYn;
        this.autoHashTagYn = autoHashTagYn;
        this.useTopImgYn = useTopImgYn;
        this.useBotImgYn = useBotImgYn;
        this.useBaseBotImgYn = useBaseBotImgYn;
        this.createDate = createDate;
        this.createUserId = createUserId;
        this.updateDate = updateDate;
        this.updateUserId = updateUserId;
    }

    @Override
    public String toString() {
        return "SltrLcUser{" +
                "objId='" + objId + '\'' +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", activeLicenseId='" + activeLicenseId + '\'' +
                ", activeDate=" + activeDate +
                ", usdExchangeRate=" + usdExchangeRate +
                ", cnyExchangeRate=" + cnyExchangeRate +
                ", baseMgnRate=" + baseMgnRate +
                ", baseMgnValue=" + baseMgnValue +
                ", customExcdMgnRate=" + customExcdMgnRate +
                ", customExcdMgnValue=" + customExcdMgnValue +
                ", shipFeeType=" + shipFeeType +
                ", baseShipFee=" + baseShipFee +
                ", returnShipFee=" + returnShipFee +
                ", exchangeShipFee=" + exchangeShipFee +
                ", makerName='" + makerName + '\'' +
                ", brandName='" + brandName + '\'' +
                ", onlyForAdultYn=" + onlyForAdultYn +
                ", useThumbOptImgYn=" + useThumbOptImgYn +
                ", autoHashTagYn=" + autoHashTagYn +
                ", useTopImgYn=" + useTopImgYn +
                ", useBotImgYn=" + useBotImgYn +
                ", useBaseBotImgYn=" + useBaseBotImgYn +
                ", createDate=" + createDate +
                ", createUserId='" + createUserId + '\'' +
                ", updateDate=" + updateDate +
                ", updateUserId='" + updateUserId + '\'' +
                '}';
    }
}
