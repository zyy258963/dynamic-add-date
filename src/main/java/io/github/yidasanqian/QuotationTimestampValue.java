package io.github.yidasanqian;

import net.sf.jsqlparser.expression.TimestampValue;

/**
 * 解决与alibaba druid整合时出现的异常：
 * <p>com.alibaba.druid.sql.parser.ParserException: ERROR. token : LBRACE
 *
 * @author Linyu Chen
 */
public class QuotationTimestampValue extends TimestampValue {

    private String value;

    public QuotationTimestampValue(String value) {
        super("'" + value + "'");
        this.value = value;
    }

    @Override
    public String toString() {
        return "'" + value.trim() + "'";
    }
}
