package com.inje.vmware.vra.comm;

import java.util.List;
import java.util.Map;

public class QueryInfo {
    private List<OrderBy> orderBy;
    private Map<String, Object> customOptions;
    private List<Object> expand;
    private List<Object> select;
    private String rawOrderBy;
    private List<String> properties;
    private Sort sort;

    public List<OrderBy> getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(List<OrderBy> orderBy) {
        this.orderBy = orderBy;
    }

    public Map<String, Object> getCustomOptions() {
        return customOptions;
    }

    public void setCustomOptions(Map<String, Object> customOptions) {
        this.customOptions = customOptions;
    }

    public List<Object> getExpand() {
        return expand;
    }

    public void setExpand(List<Object> expand) {
        this.expand = expand;
    }

    public List<Object> getSelect() {
        return select;
    }

    public void setSelect(List<Object> select) {
        this.select = select;
    }

    public String getRawOrderBy() {
        return rawOrderBy;
    }

    public void setRawOrderBy(String rawOrderBy) {
        this.rawOrderBy = rawOrderBy;
    }

    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public static class OrderBy {
        private Expression expression;
        private String direction;

        public String getDirection() {
            return direction;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }

        public Expression getExpression() {
            return expression;
        }

        public void setExpression(Expression expression) {
            this.expression = expression;
        }

        public static class Expression {
            private String propertyName;

            public String getPropertyName() {
                return propertyName;
            }

            public void setPropertyName(String propertyName) {
                this.propertyName = propertyName;
            }
        }
    }

}