package com.plexter.sellter.agent.banWord.mapper;

import com.plexter.sellter.agent.banWord.vo.BanWordVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BanWordMapper {

    // 등록
    void save(BanWordVO vo);

    BanWordVO update(BanWordVO vo);

    BanWordVO selectById(String objectId);

    List<BanWordVO> selectAll();

    List<BanWordVO> selectByWord(String word);

    void deleteById(String objectId);

    void deleteByWord(String word);

}
