package ${groupId}.jpa.repository;

import ${groupId}.config.PersistenceContext;
import ${groupId}.jpa.model.SampleEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersistenceContext.class})
public class ITSampleEntityPagingRepositoryTest {

    @Autowired
    SampleEntityPagingRepository repository;

    @Test
    public void thatFindAll_retrievesResults() {
        assertNotNull(repository);
        Pageable pageRequest = new PageRequest(0,10);
        Page<SampleEntity> entities = repository.findAll(pageRequest);
        assertFalse(entities.getSize() == 0);
    }

}