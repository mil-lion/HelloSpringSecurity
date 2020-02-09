/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2005-2020 LionSoft LLC.
 */
package ru.lionsoft.hello.spring.security.catalog;

import java.util.Collection;
import ru.lionsoft.hello.spring.security.entity.MusicItem;

public interface Catalog {

    public MusicItem findById(Long id);

    public Collection<MusicItem> findByKeyword(String keyword);
}
