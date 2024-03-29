package com.tsh.slt.sua.domain.banWord.mapper;

import com.tsh.slt.sua.domain.banWord.vo.BanWordDefVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SltrLcBanWordDefMapper {

    // 등록
    void save(BanWordDefVO vo);

    void update(BanWordDefVO vo);

    BanWordDefVO selectById(String objectId);

    List<BanWordDefVO> selectAll();

    List<BanWordDefVO> selectByWord(String word);

    void deleteById(String objectId);

    void deleteByWord(String word);

}
