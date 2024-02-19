package com.kwang2003.id;

import java.util.UUID;

/**
 * simple uuid 去掉中间的-
 * @author kevin
 */
public class SimpleUUIDGenerator implements IdGenerator{
    @Override
    public String generate() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
