package com.tsh.slt.sua.query.service;

import com.tsh.slt.sua.query.mapper.MesQueryWfsMapper;
import com.tsh.slt.sua.query.model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service("MesQueryWfsService")
@Transactional(rollbackFor = {Exception.class})
public class MesQueryWfsServiceImpl implements MesQueryWfsService{

    @Autowired
    MesQueryWfsMapper mesQueryWfsMapper;


    /**
     * CMN (Common)
     */
    @Override
    public List<MoveStatDistinctVO> selectMoveStatDistinct(MoveStatDistinctVO vo) throws Exception {
        log.info("MesQuery Req.Data : " + vo.toString());

        List<MoveStatDistinctVO> moveStatDisticntVOS = mesQueryWfsMapper.selectMoveStatDistinct(vo);

        log.info("MesQuery Response Count : " + moveStatDisticntVOS.size());
        log.info("MesQuery Response Data : " + moveStatDisticntVOS.toString());

        return moveStatDisticntVOS;
    }

    @Override
    public List<ZoneDistinctVO> selectZoneDistinct(ZoneDistinctVO vo) throws Exception {
        log.info("MesQuery Req.Data : " + vo.toString());

        List<ZoneDistinctVO> zoneDistinctVOS = mesQueryWfsMapper.selectZoneDistinct(vo);

        log.info("MesQuery Response Count : " + zoneDistinctVOS.size());
        log.info("MesQuery Response Data : " + zoneDistinctVOS.toString());

        return zoneDistinctVOS;
    }

    /**
     * WR (WORK STAT)
     */
    @Override
    public List<WorkStatCondListVO> selectWorkStatCondList(WorkStatCondListVO vo){
        log.info("MesQuery Req.Data : " + vo.toString());

        List<WorkStatCondListVO> workStatCondListVOs = mesQueryWfsMapper.selectWorkStatCondList(vo);

        log.info("MesQuery Response Count : " + workStatCondListVOs.size());
        log.info("MesQuery Response Data : " + workStatCondListVOs.toString());

        return workStatCondListVOs;
    }

    @Override
    public List<WorkStatListVO> selectWorkStatList(WorkStatListVO vo) throws Exception {
        log.info("MesQuery Req.Data : " + vo.toString());

        List<WorkStatListVO> workStatListVOS = mesQueryWfsMapper.selectWorkStatList(vo);

        log.info("MesQuery Response Count : " + workStatListVOS.size());
        log.info("MesQuery Response Data : " + workStatListVOS.toString());

        return workStatListVOS;
    }

    @Override
    public List<WorkStatSlotListVO> selectWorkStatSlotList(WorkStatSlotListVO vo) throws Exception {
        log.info("MesQuery Req.Data : " + vo.toString());

        List<WorkStatSlotListVO> workStatSlotListVOS = mesQueryWfsMapper.selectWorkStatSlotList(vo);

        log.info("MesQuery Response Count : " + workStatSlotListVOS.size());
        log.info("MesQuery Response Data : " + workStatSlotListVOS.toString());

        return workStatSlotListVOS;
    }


    /**
     * TR (TRANSFER JOB)
     */
    @Override
    public List<TransferJobCondListVO> selectTransferJobCondList(TransferJobCondListVO vo) throws Exception {
        log.info("MesQuery Req.Data : " + vo.toString());

        List<TransferJobCondListVO> transferJobCondListVOS = mesQueryWfsMapper.selectTransferJobCondList(vo);

        log.info("MesQuery Response Count : " + transferJobCondListVOS.size());
        log.info("MesQuery Response Data : " + transferJobCondListVOS.toString());

        return transferJobCondListVOS;
    }

    @Override
    public List<TransferJobListVO> selectTransferJobList(TransferJobListVO vo) throws Exception {
        log.info("MesQuery Req.Data : " + vo.toString());

        List<TransferJobListVO> transferJobListVOS = mesQueryWfsMapper.selectTransferJobList(vo);

        log.info("MesQuery Response Count : " + transferJobListVOS.size());
        log.info("MesQuery Response Data : " + transferJobListVOS.toString());

        return transferJobListVOS;
    }


    /**
     * MU (Manual)
     */
    @Override
    public List<ManualCarrListVO> selectManualCarrList(ManualCarrListVO vo) throws Exception {
        log.info("MesQuery Req.Data : " + vo.toString());

        List<ManualCarrListVO> manualCarrListVOS = mesQueryWfsMapper.selectManualCarrList(vo);

        log.info("MesQuery Response Count : " + manualCarrListVOS.size());
        log.info("MesQuery Response Data : " + manualCarrListVOS.toString());

        return manualCarrListVOS;
    }

    @Override
    public List<ManualCarrCondListVO> selectManualCarrCondList(ManualCarrCondListVO vo) throws Exception {
        log.info("MesQuery Req.Data : " + vo.toString());

        List<ManualCarrCondListVO> manualCarrCondLis = mesQueryWfsMapper.selectManualCarrCondList(vo);

        log.info("MesQuery Response Count : " + manualCarrCondLis.size());
        log.info("MesQuery Response Data : " + manualCarrCondLis.toString());

        return manualCarrCondLis;
    }


    /**
     * WP (WIP)
     */
    @Override
    public List<WipQueryListVO> selectWipQueryList(WipQueryListVO vo) throws Exception {
        log.info("MesQuery Req.Data : " + vo.toString());

        List<WipQueryListVO> wipQueryListVOS = mesQueryWfsMapper.selectWipQueryList(vo);

        log.info("MesQuery Response Count : " + wipQueryListVOS.size());
        log.info("MesQuery Response Data : " + wipQueryListVOS.toString());

        return wipQueryListVOS;
    }

    @Override
    public List<WipQueryCondListVO> selectWipQueryCondList(WipQueryCondListVO vo) throws Exception {
        log.info("MesQuery Req.Data : " + vo.toString());

        List<WipQueryCondListVO> wipQueryCondListVOS = mesQueryWfsMapper.selectWipQueryCondList(vo);

        log.info("MesQuery Response Count : " + wipQueryCondListVOS.size());
        log.info("MesQuery Response Data : " + wipQueryCondListVOS.toString());

        return wipQueryCondListVOS;
    }






}
