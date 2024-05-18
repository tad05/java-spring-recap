package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {

        //Given
        String[] args = {"1", "5", "2"};

        //When & Then
        Main.main(args);

    }
}