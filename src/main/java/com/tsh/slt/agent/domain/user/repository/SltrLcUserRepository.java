package com.tsh.slt.agent.domain.user.repository;

import com.tsh.slt.agent.domain.user.model.SltrLcUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SltrLcUserRepository extends JpaRepository<SltrLcUser, String> {
}
