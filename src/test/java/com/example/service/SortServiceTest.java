package com.example.service;

import com.example.logic.BubbleSort;
import com.example.logic.JavaSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {
    private SortService sut = new SortService(new JavaSort<String>());

    @DisplayName("sort service test")
    @Test
    void test(){
        //Given

        //When
        List<String> actual = sut.doSort(List.of("3","1","2"));
        //Then
        assertEquals(List.of("1","2","3"),actual);
    }
}