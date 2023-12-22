package com.tsh.slt.sua.query.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ZoneDistinctVO {

    String zoneId;

    // 조회 파라미터
    String siteId;

}
