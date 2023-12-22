package com.tsh.slt.sua.query.service;


import com.tsh.slt.sua.query.model.*;

import java.util.List;

public interface MesQueryWfsService {

    /**
     * CMN (Common)
     */
    public List<MoveStatDistinctVO> selectMoveStatDistinct(MoveStatDistinctVO vo) throws Exception;
    public List<ZoneDistinctVO> selectZoneDistinct(ZoneDistinctVO vo) throws Exception;

    /**
     * WR (WORK STAT)
     */
    public List<WorkStatListVO> selectWorkStatList(WorkStatListVO vo) throws Exception;

    public List<WorkStatCondListVO> selectWorkStatCondList(WorkStatCondListVO vo) throws Exception;

    public List<WorkStatSlotListVO> selectWorkStatSlotList(WorkStatSlotListVO vo) throws Exception;


    /**
     * TR (TRANSFER JOB)
     */
    public List<TransferJobListVO> selectTransferJobList(TransferJobListVO vo) throws Exception;

    public List<TransferJobCondListVO> selectTransferJobCondList(TransferJobCondListVO vo) throws Exception;



    /**
     * MU (Manual)
     */
    public List<ManualCarrListVO> selectManualCarrList(ManualCarrListVO vo) throws Exception;

    public List<ManualCarrCondListVO> selectManualCarrCondList(ManualCarrCondListVO vo) throws Exception;


    /**
     * WP (WIP)
     */
    public List<WipQueryListVO> selectWipQueryList(WipQueryListVO vo) throws Exception;

    public List<WipQueryCondListVO> selectWipQueryCondList(WipQueryCondListVO vo) throws Exception;



}
