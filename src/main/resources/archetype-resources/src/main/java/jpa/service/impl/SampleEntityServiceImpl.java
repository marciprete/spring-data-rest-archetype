package ${groupId}.jpa.service.impl;

import ${groupId}.jpa.dto.SampleEntityDto;
import ${groupId}.jpa.model.SampleEntity;
import ${groupId}.jpa.service.SampleEntityService;
import ${groupId}.jpa.util.ConverterUtils;
import ${groupId}.jpa.repository.SampleEntityPagingRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

@Service
@Transactional
public class SampleEntityServiceImpl implements SampleEntityService{

    private final SampleEntityPagingRepository repository;

    @Autowired
    public SampleEntityServiceImpl(SampleEntityPagingRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public Page<SampleEntityDto> findAll(Pageable pageRequest) {
        Page<SampleEntity> entityPage = repository.findAll(pageRequest);
        return ConverterUtils.mapEntityPageIntoDTOPage(pageRequest, entityPage);
    }

}