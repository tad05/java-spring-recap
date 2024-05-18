package com.example.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {
    @DisplayName("자바소트-리스트를 넣으면 정렬된 결과를 보여준다")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList() {
        //Given
        JavaSort<Integer> javaSort = new JavaSort<>();

        //When
        List<Integer> actual = javaSort.sort(List.of(1,3,5,8,2));

        //Then
        assertEquals(List.of(1,2,3,5,8),actual);

    }
}