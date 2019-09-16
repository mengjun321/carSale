package com.hzit.service.Impl;
import java.util.List;
import com.hzit.dao.FinancingMapper;
import com.hzit.entity.Financing;
import com.hzit.common.Assist;
import com.hzit.service.IFinancingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FinancingServiceImpl implements IFinancingService{
    @Autowired
    private FinancingMapper financingMapper;
    @Override
    public long getFinancingRowCount(Assist assist){
        return financingMapper.getFinancingRowCount(assist);
    }
    @Override
    public List<Financing> selectFinancing(Assist assist){
        return financingMapper.selectFinancing(assist);
    }
    @Override
    public Financing selectFinancingByObj(Financing obj){
        return financingMapper.selectFinancingByObj(obj);
    }
    @Override
    public Financing selectFinancingById(Integer id){
        return financingMapper.selectFinancingById(id);
    }
    @Override
    public int insertFinancing(Financing value){
        return financingMapper.insertFinancing(value);
    }
    @Override
    public int insertNonEmptyFinancing(Financing value){
        return financingMapper.insertNonEmptyFinancing(value);
    }
    @Override
    public int insertFinancingByBatch(List<Financing> value){
        return financingMapper.insertFinancingByBatch(value);
    }
    @Override
    public int deleteFinancingById(Integer id){
        return financingMapper.deleteFinancingById(id);
    }
    @Override
    public int deleteFinancing(Assist assist){
        return financingMapper.deleteFinancing(assist);
    }
    @Override
    public int updateFinancingById(Financing enti){
        return financingMapper.updateFinancingById(enti);
    }
    @Override
    public int updateFinancing(Financing value, Assist assist){
        return financingMapper.updateFinancing(value,assist);
    }
    @Override
    public int updateNonEmptyFinancingById(Financing enti){
        return financingMapper.updateNonEmptyFinancingById(enti);
    }
    @Override
    public int updateNonEmptyFinancing(Financing value, Assist assist){
        return financingMapper.updateNonEmptyFinancing(value,assist);
    }

    public FinancingMapper getFinancingMapper() {
        return this.financingMapper;
    }

    public void setFinancingMapper(FinancingMapper financingMapper) {
        this.financingMapper = financingMapper;
    }

}