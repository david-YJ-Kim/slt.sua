package com.tsh.slt.agent.domain.keyword.repository;

import com.tsh.slt.agent.domain.keyword.model.SltrLcKeyword;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SltrLcKeywordRepository extends JpaRepository<SltrLcKeyword, String> {
}
