package de.kohnlehome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class SubSortTest {
    private ISubSort subSort;
    @BeforeEach
    public void init(){
        //Arrange
        subSort = new SubSort();
    }
    @Test
    public void SubSortTest1(){
        //Arrange
        int[] array = {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};
        //Act
        int[] result = subSort.SubSort(array);
        //Assert
        assertThat(result[0]).isEqualTo(3);
        assertThat(result[1]).isEqualTo(9);
    }
}
