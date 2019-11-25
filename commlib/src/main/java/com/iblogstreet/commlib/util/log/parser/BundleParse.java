package com.iblogstreet.commlib.util.log.parser;

import android.os.Bundle;

import com.iblogstreet.commlib.util.log.config.LogConvert;


/**
 * @author junwang
 * @date 2019/1/30 下午2:14
 * <p>
 * Bundle解析器
 */
public class BundleParse implements Parser<Bundle> {
    @Override
    public Class<Bundle> parseClassType() {
        return Bundle.class;
    }

    @Override
    public String parseString(Bundle bundle) {
        if (bundle != null) {
            StringBuilder builder = new StringBuilder(bundle.getClass().getName() + " [" +
                    LINE_SEPARATOR);
            for (String key : bundle.keySet()) {
                builder.append(String.format("'%s' => %s " + LINE_SEPARATOR,
                        key, LogConvert.objectToString(bundle.get(key))));
            }
            builder.append("]");
            return builder.toString();
        }
        return null;
    }
}
