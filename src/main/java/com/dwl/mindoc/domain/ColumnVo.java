package com.dwl.mindoc.domain;

/**
 * @program: mindoc
 * @description: 列信息
 * @author: daiwenlong
 * @create: 2018-10-09 21:58
 **/
public class ColumnVo {


    public ColumnVo() {

    }


    public ColumnVo(String columnName, String columnType, String columnKey, String isNullable, String columnComment,
                    String defaultValue) {
        super();
        this.columnName = columnName;
        this.columnType = columnType;
        this.columnKey = columnKey;
        this.isNullable = isNullable;
        this.columnComment = columnComment;
        this.defaultValue = defaultValue;
    }


    /*列名*/
    private String columnName;
    /*数据类型*/
    private String columnType;
    /*键类型*/
    private String columnKey;
    /*可否为空*/
    private String isNullable;
    /*注释*/
    private String columnComment;
    /*默认值*/
    private String defaultValue;

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public String getColumnKey() {
        return columnKey;
    }

    public void setColumnKey(String columnKey) {
        this.columnKey = columnKey;
    }

    public String getIsNullable() {
        return isNullable;
    }

    public void setIsNullable(String isNullable) {
        this.isNullable = isNullable;
    }

    public String getColumnComment() {
        if (columnComment == null || columnComment == "") {
            return "-";
        } else {
            return columnComment.replace("&", "&amp;").replace(">", "&gt;").replace("<", "&lt;");
        }
    }

    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
}


