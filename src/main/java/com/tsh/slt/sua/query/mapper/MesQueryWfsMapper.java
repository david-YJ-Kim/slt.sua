package com.tsh.slt.sua.query.mapper;

import com.tsh.slt.sua.query.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MesQueryWfsMapper {


    /**
     * CMN (Common)
     */
    List<MoveStatDistinctVO> selectMoveStatDistinct(MoveStatDistinctVO vo);
    List<ZoneDistinctVO> selectZoneDistinct(ZoneDistinctVO vo);


    /**
     * WR (WORK STAT)
     */
    List<WorkStatCondListVO> selectWorkStatCondList(WorkStatCondListVO vo);

    List<WorkStatListVO> selectWorkStatList(WorkStatListVO vo);

    List<WorkStatSlotListVO> selectWorkStatSlotList(WorkStatSlotListVO vo);


    /**
     * TR (TRANSFER JOB)
     */
    List<TransferJobCondListVO> selectTransferJobCondList(TransferJobCondListVO vo);

    List<TransferJobListVO> selectTransferJobList(TransferJobListVO vo);



    /**
     * MU (Manual)
     */
    List<ManualCarrListVO> selectManualCarrList(ManualCarrListVO vo);

    List<ManualCarrCondListVO> selectManualCarrCondList(ManualCarrCondListVO vo);


    /**
     * WP (WIP)
     */
    List<WipQueryCondListVO> selectWipQueryCondList(WipQueryCondListVO vo);

    List<WipQueryListVO> selectWipQueryList(WipQueryListVO vo);


}
