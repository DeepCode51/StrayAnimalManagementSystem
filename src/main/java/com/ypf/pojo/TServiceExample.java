package com.ypf.pojo;

import java.util.ArrayList;
import java.util.List;

public class TServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TServiceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andServicenameIsNull() {
            addCriterion("servicename is null");
            return (Criteria) this;
        }

        public Criteria andServicenameIsNotNull() {
            addCriterion("servicename is not null");
            return (Criteria) this;
        }

        public Criteria andServicenameEqualTo(String value) {
            addCriterion("servicename =", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameNotEqualTo(String value) {
            addCriterion("servicename <>", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameGreaterThan(String value) {
            addCriterion("servicename >", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameGreaterThanOrEqualTo(String value) {
            addCriterion("servicename >=", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameLessThan(String value) {
            addCriterion("servicename <", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameLessThanOrEqualTo(String value) {
            addCriterion("servicename <=", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameLike(String value) {
            addCriterion("servicename like", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameNotLike(String value) {
            addCriterion("servicename not like", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameIn(List<String> values) {
            addCriterion("servicename in", values, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameNotIn(List<String> values) {
            addCriterion("servicename not in", values, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameBetween(String value1, String value2) {
            addCriterion("servicename between", value1, value2, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameNotBetween(String value1, String value2) {
            addCriterion("servicename not between", value1, value2, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicepasswordIsNull() {
            addCriterion("servicepassword is null");
            return (Criteria) this;
        }

        public Criteria andServicepasswordIsNotNull() {
            addCriterion("servicepassword is not null");
            return (Criteria) this;
        }

        public Criteria andServicepasswordEqualTo(String value) {
            addCriterion("servicepassword =", value, "servicepassword");
            return (Criteria) this;
        }

        public Criteria andServicepasswordNotEqualTo(String value) {
            addCriterion("servicepassword <>", value, "servicepassword");
            return (Criteria) this;
        }

        public Criteria andServicepasswordGreaterThan(String value) {
            addCriterion("servicepassword >", value, "servicepassword");
            return (Criteria) this;
        }

        public Criteria andServicepasswordGreaterThanOrEqualTo(String value) {
            addCriterion("servicepassword >=", value, "servicepassword");
            return (Criteria) this;
        }

        public Criteria andServicepasswordLessThan(String value) {
            addCriterion("servicepassword <", value, "servicepassword");
            return (Criteria) this;
        }

        public Criteria andServicepasswordLessThanOrEqualTo(String value) {
            addCriterion("servicepassword <=", value, "servicepassword");
            return (Criteria) this;
        }

        public Criteria andServicepasswordLike(String value) {
            addCriterion("servicepassword like", value, "servicepassword");
            return (Criteria) this;
        }

        public Criteria andServicepasswordNotLike(String value) {
            addCriterion("servicepassword not like", value, "servicepassword");
            return (Criteria) this;
        }

        public Criteria andServicepasswordIn(List<String> values) {
            addCriterion("servicepassword in", values, "servicepassword");
            return (Criteria) this;
        }

        public Criteria andServicepasswordNotIn(List<String> values) {
            addCriterion("servicepassword not in", values, "servicepassword");
            return (Criteria) this;
        }

        public Criteria andServicepasswordBetween(String value1, String value2) {
            addCriterion("servicepassword between", value1, value2, "servicepassword");
            return (Criteria) this;
        }

        public Criteria andServicepasswordNotBetween(String value1, String value2) {
            addCriterion("servicepassword not between", value1, value2, "servicepassword");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}