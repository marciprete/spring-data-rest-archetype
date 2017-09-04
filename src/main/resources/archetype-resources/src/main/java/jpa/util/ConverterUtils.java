package ${groupId}.jpa.util;

import ${groupId}.jpa.dto.SampleEntityDto;
import ${groupId}.jpa.model.SampleEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.ArrayList;

public final class ConverterUtils {

    private ConverterUtils() {}

    public static SampleEntityDto convertEntityToDTO(SampleEntity entity) {
        SampleEntityDto dto = new SampleEntityDto();
        dto.setId(entity.getId());
        dto.setColumn(entity.getColumn());
        return dto;
    }

    public static List<SampleEntityDto> mapEntitiesIntoDTOs(Iterable<SampleEntity> entities) {
        List<SampleEntityDto> dtos = new ArrayList<>();
        entities.forEach(e -> dtos.add(convertEntityToDTO(e)));
        return dtos;
    }

    public static Page<SampleEntityDto> mapEntityPageIntoDTOPage(Pageable pageRequest, Page<SampleEntity> source) {
        List<SampleEntityDto> dtos = mapEntitiesIntoDTOs(source.getContent());
        return new PageImpl<>(dtos, pageRequest, source.getTotalElements());
    }
}