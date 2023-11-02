package com.tsh.slt.agent.domain.banWord.repository;

import com.tsh.slt.agent.domain.banWord.model.BanWordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BanWordEntityRepository extends JpaRepository<BanWordEntity, String> {
}
