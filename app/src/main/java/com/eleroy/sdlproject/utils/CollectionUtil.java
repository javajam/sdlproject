package com.eleroy.sdlproject.utils;

import java.util.List;

public final class CollectionUtil {

    public static boolean isNotEmpty(final List<?> list) {
        return list != null && list.size() > 0;
    }
}
