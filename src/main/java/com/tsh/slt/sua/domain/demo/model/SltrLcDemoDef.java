package com.tsh.slt.sua.domain.demo.model;

import com.tsh.slt.sua.util.code.UseYn;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Entity(name = "SLTR_LC_DEMO")
public class SltrLcDemoDef {

    @javax.persistence.Id
    @GenericGenerator(name = "SLTR_LC_DEMO_SEQ_GENERATOR", strategy = "com.tsh.slt.agent.util.ObjIdGenerator")
    @GeneratedValue(generator = "SLTR_LC_DEMO_SEQ_GENERATOR")
    private String objId;


    // Default
    @Column(name = "CREATE_DATE")
    private Timestamp createDate;

    @Column(name = "CREATE_USER_ID")
    private String createUserId;

    @Column(name = "UPDATE_DATE")
    private Timestamp updateDate;

    @Column(name = "UPDATE_USER_ID")
    private String updateUserId;

    // Enum Sample
    @Enumerated(EnumType.STRING)
    @Column(name = "USE_YN")
    private UseYn useYn;

    public SltrLcDemoDef(String objId, Timestamp createDate, String createUserId, Timestamp updateDate, String updateUserId) {
        this.objId = objId;
        this.createDate = createDate;
        this.createUserId = createUserId;
        this.updateDate = updateDate;
        this.updateUserId = updateUserId;
    }

    @Override
    public String toString() {
        return "SltrLcDemoDef{" +
                "objId='" + objId + '\'' +
                ", createDate=" + createDate +
                ", createUserId='" + createUserId + '\'' +
                ", updateDate=" + updateDate +
                ", updateUserId='" + updateUserId + '\'' +
                '}';
    }
}
