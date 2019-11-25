package com.iblogstreet.commlib.util.log.parser;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @author junwang
 * @date 2019/1/30 下午2:21
 * <p>
 * Throwable解析器
 */
public class ThrowableParse implements Parser<Throwable> {
    @Override
    public Class<Throwable> parseClassType() {
        return Throwable.class;
    }

    @Override
    public String parseString(Throwable throwable) {
        return getStackTraceString(throwable);
    }

    private String getStackTraceString(Throwable t) {
        StringWriter sw = new StringWriter(256);
        PrintWriter pw = new PrintWriter(sw, false);
        t.printStackTrace(pw);
        pw.flush();
        return sw.toString();
    }
}
