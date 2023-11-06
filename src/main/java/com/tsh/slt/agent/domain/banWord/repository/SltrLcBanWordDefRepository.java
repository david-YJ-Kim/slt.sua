package com.tsh.slt.agent.domain.banWord.repository;

import com.tsh.slt.agent.domain.banWord.model.SltrLcBanWordDef;
import com.tsh.slt.agent.util.code.UseYn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SltrLcBanWordDefRepository extends JpaRepository<SltrLcBanWordDef, String> {


    @Modifying(clearAutomatically = true)
    @Query("UPDATE SLTR_LC_BAN_WORD_DEF word SET word.useYn = :useYn WHERE word.objId = :objId")
    void updateUseYnByObjId(@Param(value = "useYn") UseYn useYn, @Param(value = "objId") String objId);
}
