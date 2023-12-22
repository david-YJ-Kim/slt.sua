package com.tsh.slt.sua.domain.module.vo;


import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class UserInfoVo {

    @Getter @Setter
    @Schema(name = "loginUserId", description = "User Id", hidden = true, example = "Tsdavid")
    String loginUserId;

    @Getter @Setter
    @Schema(name = "loginUserNm", description = "User Name", hidden = true, example = "김연준")
    String loginUserNm;

    @Getter @Setter
    @Schema(name = "loginAuthLevel", description = "User Authority Level", hidden = true, example = "PU")
    String loginAuthLevel;

    @JsonIgnore
    public boolean isAppAdmin(){
        return false;
    }
}
