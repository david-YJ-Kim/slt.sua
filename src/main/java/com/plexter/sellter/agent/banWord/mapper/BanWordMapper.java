package com.plexter.sellter.agent.banWord.mapper;

import com.plexter.sellter.agent.banWord.vo.SltrLcBanWordDefVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BanWordMapper {

    // 등록
    void save(SltrLcBanWordDefVO vo);

    SltrLcBanWordDefVO update(SltrLcBanWordDefVO vo);

    SltrLcBanWordDefVO selectById(String objectId);

    List<SltrLcBanWordDefVO> selectAll();

    List<SltrLcBanWordDefVO> selectByWord(String word);

    void deleteById(String objectId);

    void deleteByWord(String word);

}
