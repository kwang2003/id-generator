package com.kwang2003.id;

import de.huxhorn.sulky.ulid.ULID;

/**
 * @author kevin
 */
public class ULIDGenerator implements IdGenerator{
    private ULID ulid = new ULID();
    @Override
    public String generate() {
        return ulid.nextULID();
    }
}
