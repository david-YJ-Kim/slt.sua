package com.tsh.slt.sua.domain.user.vo.dto;

import com.tsh.slt.sua.domain.user.model.SltrLcUser;
import com.tsh.slt.sua.util.code.ShipFeeType;
import com.tsh.slt.sua.util.code.UseYn;
import com.tsh.slt.sua.util.common.dto.CommonDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Getter
public class SltrLcUserSaveRequestDto implements CommonDto<SltrLcUser> {

    private String userId;
    private String userName;
    private String activeLicenseId;
    private Timestamp activeDate;
    private Integer usdExchangeRate;
    private Integer cnyExchangeRate;
    private Integer baseMgnRate;
    private Integer baseMgnValue;
    private Integer customExcdMgnRate;
    private Integer customExcdMgnValue;
    private String shipFeeType;
    private Integer baseShipFee;
    private Integer returnShipFee;
    private Integer exchangeShipFee;
    private String makerName;
    private String brandName;
    private String onlyForAdultYn;
    private String useThumbOptImgYn;
    private String autoHashTagYn;
    private String useTopImgYn;
    private String useBotImgYn;
    private String useBaseBotImgYn;
    private Timestamp createDate;
    private String createUserId;
    private Timestamp updateDate;
    private String updateUserId;

    @Builder
    public SltrLcUserSaveRequestDto(String userId, String userName, String activeLicenseId, Timestamp activeDate, Integer usdExchangeRate, Integer cnyExchangeRate, Integer baseMgnRate, Integer baseMgnValue, Integer customExcdMgnRate, Integer customExcdMgnValue, String shipFeeType, Integer baseShipFee, Integer returnShipFee, Integer exchangeShipFee, String makerName, String brandName, String onlyForAdultYn, String useThumbOptImgYn, String autoHashTagYn, String useTopImgYn, String useBotImgYn, String useBaseBotImgYn, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
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
    public SltrLcUser toEntity() {
        return SltrLcUser.builder()
                .userId(userId)
                .userName(userName)
                .activeLicenseId(activeLicenseId)
                .activeDate(activeDate)
                .usdExchangeRate(usdExchangeRate)
                .cnyExchangeRate(cnyExchangeRate)
                .baseMgnRate(baseMgnRate)
                .baseMgnValue(baseMgnValue)
                .customExcdMgnRate(customExcdMgnRate)
                .customExcdMgnValue(customExcdMgnValue)
                .shipFeeType(ShipFeeType.valueOf(shipFeeType))
                .baseShipFee(baseShipFee)
                .returnShipFee(returnShipFee)
                .exchangeShipFee(exchangeShipFee)
                .makerName(makerName)
                .brandName(brandName)
                .onlyForAdultYn(UseYn.valueOf(onlyForAdultYn))
                .useThumbOptImgYn(UseYn.valueOf(useThumbOptImgYn))
                .autoHashTagYn(UseYn.valueOf(autoHashTagYn))
                .useTopImgYn(UseYn.valueOf(useTopImgYn))
                .useBotImgYn(UseYn.valueOf(useBaseBotImgYn))
                .useBaseBotImgYn(UseYn.valueOf(useBaseBotImgYn))
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
