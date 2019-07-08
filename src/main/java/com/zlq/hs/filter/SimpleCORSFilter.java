package com.zlq.hs.filter;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class SimpleCORSFilter implements Filter {
    public boolean isLoggable(LogRecord record) {
        return false;
    }
}
