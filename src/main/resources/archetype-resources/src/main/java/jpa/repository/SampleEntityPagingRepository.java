package ${groupId}.jpa.repository;

import ${groupId}.jpa.model.SampleEntity;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.PagingAndSortingRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Repository
public interface SampleEntityPagingRepository extends PagingAndSortingRepository<SampleEntity, Long> {

    Page<SampleEntity> findAll(Pageable p);

}