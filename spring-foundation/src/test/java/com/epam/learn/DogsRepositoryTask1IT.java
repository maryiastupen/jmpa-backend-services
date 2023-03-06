package com.epam.learn;

import java.util.List;

import com.epam.learn.model.Dog;
import com.epam.learn.repo.DogsRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@ActiveProfiles("qa")
@SpringBootTest
public class DogsRepositoryTask1IT {

    @Autowired
    private DogsRepository dogsRepository;

    @Test
    public void shouldSaveDogUsingHsqlDataSource() {
        // given
        dogsRepository.save(new Dog("Norty", 2));

        // when
        List<Dog> dogs = (List<Dog>) dogsRepository.findAll();

        // then
        assertThat(dogs.size()).isEqualTo(1);
    }

}
