package ${groupId}.jpa.service;

import ${groupId}.jpa.dto.SampleEntityDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SampleEntityService {

    public Page<SampleEntityDto> findAll(Pageable pageRequest);

}