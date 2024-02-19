package com.kwang2003.id;

import java.util.UUID;

/**
 * 使用UUID算法生成id
 * @author kevin
 */
public class UUIDGenerator implements IdGenerator{
    @Override
    public String generate() {
        return UUID.randomUUID().toString();
    }
}
