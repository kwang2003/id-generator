package com.kwang2003.id;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class NanoIdGeneratorTest {
    @Test
    void generate() {
        NanoIdGenerator generator = new NanoIdGenerator();
        for(int i =0;i < 20;i++){
            log.info(generator.generate());
        }
    }
}