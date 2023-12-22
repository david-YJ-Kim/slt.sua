package com.tsh.slt.sua.rest.query;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsh.slt.sua.query.model.*;
import com.tsh.slt.sua.query.service.MesQueryWfsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class WfsQueryController {

    @Autowired
    private MesQueryWfsService mesQueryWfsService;

    /**
     * Common`
     */
    @RequestMapping(value = "/mesQuery/selectMoveStatDistinct", method = RequestMethod.GET)
    public List<MoveStatDistinctVO> selectMoveStatDistinct(MoveStatDistinctVO vo) throws Exception {
        try{
            return mesQueryWfsService.selectMoveStatDistinct(vo);
        }catch (Exception ex){
            throw ex;
        }

    }


    @RequestMapping(value = "/mesQuery/selectZoneDistinct", method = RequestMethod.GET)
    public List<ZoneDistinctVO> selectZoneDistinct(ZoneDistinctVO vo) throws Exception {
        try{
            return mesQueryWfsService.selectZoneDistinct(vo);
        }catch (Exception ex){
            throw ex;
        }
    }


    /**
     * WORK STAT
     */

    @RequestMapping(value = "/mesQuery/selectWorkStatList", method = RequestMethod.POST)
    public PageInfo<WorkStatListVO> selectWorkStatList(@RequestBody WorkStatListVO vo, Integer size, Integer page) throws Exception {

        try{
            PageHelper.startPage(page, size);
            PageInfo<WorkStatListVO> pageInfo = PageInfo.of(mesQueryWfsService.selectWorkStatList(vo));
            return pageInfo;
        }catch (Exception ex){
            throw ex;
        }

    }

    @RequestMapping(value = "/mesQuery/selectWorkStatCondList", method = RequestMethod.POST)
    public PageInfo<WorkStatCondListVO> selectWorkStatCondList(@RequestBody WorkStatCondListVO vo, Integer size, Integer page) throws Exception {

        try{
            PageHelper.startPage(page, size);
            PageInfo<WorkStatCondListVO> pageInfo = PageInfo.of(mesQueryWfsService.selectWorkStatCondList(vo));
            return pageInfo;
        }catch (Exception ex){
            throw ex;
        }
    }

    @RequestMapping(value = "/mesQuery/selectWorkStatSlotList", method = RequestMethod.POST)
    public PageInfo<WorkStatSlotListVO> selectWorkStatSlotList(@RequestBody WorkStatSlotListVO vo, Integer size, Integer page) throws Exception {

        try{
            PageHelper.startPage(page, size);
            PageInfo<WorkStatSlotListVO> pageInfo = PageInfo.of(mesQueryWfsService.selectWorkStatSlotList(vo));
            return pageInfo;
        }catch (Exception ex){
            throw ex;
        }
    }




    /**
     * TRANSFER JOB
     */
    @RequestMapping(value = "/mesQuery/selectTransferJobList", method = RequestMethod.GET)
    public PageInfo<TransferJobListVO> selectTransferJobList(@RequestBody TransferJobListVO vo, Integer size, Integer page) throws Exception{
        try{
            PageHelper.startPage(page, size);
            PageInfo<TransferJobListVO> pageInfo = PageInfo.of(mesQueryWfsService.selectTransferJobList(vo));
            return pageInfo;
        }catch (Exception ex){
            throw ex;
        }

    }

    @RequestMapping(value = "/mesQuery/selectTransferJobCondList", method = RequestMethod.GET)
    public PageInfo<TransferJobCondListVO> selectTransferJobCondList(@RequestBody TransferJobCondListVO vo, Integer size, Integer page) throws Exception{

        try{
            PageHelper.startPage(page, size);
            PageInfo<TransferJobCondListVO> pageInfo = PageInfo.of(mesQueryWfsService.selectTransferJobCondList(vo));
            return pageInfo;
        }catch (Exception ex){
            throw ex;
        }
    }


    /**
     * Manual
     */
    @RequestMapping(value = "/mesQuery/selectManualCarrList", method = RequestMethod.GET)
    public PageInfo<ManualCarrListVO> selectManualCarrList(@RequestBody ManualCarrListVO vo, Integer size, Integer page) throws Exception{
        try{
            PageHelper.startPage(page, size);
            PageInfo<ManualCarrListVO> pageInfo = PageInfo.of(mesQueryWfsService.selectManualCarrList(vo));
            return pageInfo;
        }catch (Exception ex){
            throw ex;
        }
    }

    @RequestMapping(value = "/mesQuery/selectManualCarrCondList", method = RequestMethod.GET)
    public PageInfo<ManualCarrCondListVO> selectManualCarrCondList(@RequestBody ManualCarrCondListVO vo, Integer size, Integer page) throws Exception{
        try{
            PageHelper.startPage(page, size);
            PageInfo<ManualCarrCondListVO> pageInfo = PageInfo.of(mesQueryWfsService.selectManualCarrCondList(vo));
            return pageInfo;
        }catch (Exception ex){
            throw ex;
        }
    }


    /**
     * WIP
     */
    @RequestMapping(value = "/mesQuery/selectWipQueryList", method = RequestMethod.GET)
    public PageInfo<WipQueryListVO> selectWipQueryList(@RequestBody WipQueryListVO vo, Integer size, Integer page) throws Exception{
        try{
            PageHelper.startPage(page, size);
            PageInfo<WipQueryListVO> pageInfo = PageInfo.of(mesQueryWfsService.selectWipQueryList(vo));
            return pageInfo;
        }catch (Exception ex){
            throw ex;
        }
    }

    @RequestMapping(value = "/mesQuery/selectWipQueryCondList", method = RequestMethod.GET)
    public PageInfo<WipQueryCondListVO> selectWipQueryCondList(@RequestBody WipQueryCondListVO vo, Integer size, Integer page) throws Exception{
        try{
            PageHelper.startPage(page, size);
            PageInfo<WipQueryCondListVO> pageInfo = PageInfo.of(mesQueryWfsService.selectWipQueryCondList(vo));
            return pageInfo;
        }catch (Exception ex){
            throw ex;
        }
    }



}
