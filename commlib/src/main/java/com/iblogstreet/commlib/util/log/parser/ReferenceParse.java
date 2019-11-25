package com.iblogstreet.commlib.util.log.parser;

import com.iblogstreet.commlib.util.log.config.LogConvert;

import java.lang.ref.Reference;


/**
 * @author junwang
 * @date 2019/1/30 下午2:20
 * <p>
 * Reference解析器
 */
public class ReferenceParse implements Parser<Reference> {
    @Override
    public Class<Reference> parseClassType() {
        return Reference.class;
    }

    @Override
    public String parseString(Reference reference) {
        Object actual = reference.get();
        StringBuilder builder = new StringBuilder(reference.getClass().getSimpleName() + "<"
                + actual.getClass().getSimpleName() + "> {");
        builder.append("→").append(LogConvert.objectToString(actual));
        return builder.toString() + "}";
    }
}
