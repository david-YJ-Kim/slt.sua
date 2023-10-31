package com.tsh.slt.agent.domain.banWord.mapper;

import com.tsh.slt.agent.domain.banWord.vo.SltrLcBanWordDefVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BanWordMapper {

    // 등록
    void save(SltrLcBanWordDefVO vo);

    void update(SltrLcBanWordDefVO vo);

    SltrLcBanWordDefVO selectById(String objectId);

    List<SltrLcBanWordDefVO> selectAll();

    List<SltrLcBanWordDefVO> selectByWord(String word);

    void deleteById(String objectId);

    void deleteByWord(String word);

}
