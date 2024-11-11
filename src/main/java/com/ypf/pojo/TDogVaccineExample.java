package com.ypf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TDogVaccineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDogVaccineExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDogIdIsNull() {
            addCriterion("dog_id is null");
            return (Criteria) this;
        }

        public Criteria andDogIdIsNotNull() {
            addCriterion("dog_id is not null");
            return (Criteria) this;
        }

        public Criteria andDogIdEqualTo(Integer value) {
            addCriterion("dog_id =", value, "dogId");
            return (Criteria) this;
        }

        public Criteria andDogIdNotEqualTo(Integer value) {
            addCriterion("dog_id <>", value, "dogId");
            return (Criteria) this;
        }

        public Criteria andDogIdGreaterThan(Integer value) {
            addCriterion("dog_id >", value, "dogId");
            return (Criteria) this;
        }

        public Criteria andDogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dog_id >=", value, "dogId");
            return (Criteria) this;
        }

        public Criteria andDogIdLessThan(Integer value) {
            addCriterion("dog_id <", value, "dogId");
            return (Criteria) this;
        }

        public Criteria andDogIdLessThanOrEqualTo(Integer value) {
            addCriterion("dog_id <=", value, "dogId");
            return (Criteria) this;
        }

        public Criteria andDogIdIn(List<Integer> values) {
            addCriterion("dog_id in", values, "dogId");
            return (Criteria) this;
        }

        public Criteria andDogIdNotIn(List<Integer> values) {
            addCriterion("dog_id not in", values, "dogId");
            return (Criteria) this;
        }

        public Criteria andDogIdBetween(Integer value1, Integer value2) {
            addCriterion("dog_id between", value1, value2, "dogId");
            return (Criteria) this;
        }

        public Criteria andDogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dog_id not between", value1, value2, "dogId");
            return (Criteria) this;
        }

        public Criteria andVaccineIdIsNull() {
            addCriterion("vaccine_id is null");
            return (Criteria) this;
        }

        public Criteria andVaccineIdIsNotNull() {
            addCriterion("vaccine_id is not null");
            return (Criteria) this;
        }

        public Criteria andVaccineIdEqualTo(Integer value) {
            addCriterion("vaccine_id =", value, "vaccineId");
            return (Criteria) this;
        }

        public Criteria andVaccineIdNotEqualTo(Integer value) {
            addCriterion("vaccine_id <>", value, "vaccineId");
            return (Criteria) this;
        }

        public Criteria andVaccineIdGreaterThan(Integer value) {
            addCriterion("vaccine_id >", value, "vaccineId");
            return (Criteria) this;
        }

        public Criteria andVaccineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vaccine_id >=", value, "vaccineId");
            return (Criteria) this;
        }

        public Criteria andVaccineIdLessThan(Integer value) {
            addCriterion("vaccine_id <", value, "vaccineId");
            return (Criteria) this;
        }

        public Criteria andVaccineIdLessThanOrEqualTo(Integer value) {
            addCriterion("vaccine_id <=", value, "vaccineId");
            return (Criteria) this;
        }

        public Criteria andVaccineIdIn(List<Integer> values) {
            addCriterion("vaccine_id in", values, "vaccineId");
            return (Criteria) this;
        }

        public Criteria andVaccineIdNotIn(List<Integer> values) {
            addCriterion("vaccine_id not in", values, "vaccineId");
            return (Criteria) this;
        }

        public Criteria andVaccineIdBetween(Integer value1, Integer value2) {
            addCriterion("vaccine_id between", value1, value2, "vaccineId");
            return (Criteria) this;
        }

        public Criteria andVaccineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vaccine_id not between", value1, value2, "vaccineId");
            return (Criteria) this;
        }

        public Criteria andVaccineTimeIsNull() {
            addCriterion("vaccine_time is null");
            return (Criteria) this;
        }

        public Criteria andVaccineTimeIsNotNull() {
            addCriterion("vaccine_time is not null");
            return (Criteria) this;
        }

        public Criteria andVaccineTimeEqualTo(Date value) {
            addCriterion("vaccine_time =", value, "vaccineTime");
            return (Criteria) this;
        }

        public Criteria andVaccineTimeNotEqualTo(Date value) {
            addCriterion("vaccine_time <>", value, "vaccineTime");
            return (Criteria) this;
        }

        public Criteria andVaccineTimeGreaterThan(Date value) {
            addCriterion("vaccine_time >", value, "vaccineTime");
            return (Criteria) this;
        }

        public Criteria andVaccineTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("vaccine_time >=", value, "vaccineTime");
            return (Criteria) this;
        }

        public Criteria andVaccineTimeLessThan(Date value) {
            addCriterion("vaccine_time <", value, "vaccineTime");
            return (Criteria) this;
        }

        public Criteria andVaccineTimeLessThanOrEqualTo(Date value) {
            addCriterion("vaccine_time <=", value, "vaccineTime");
            return (Criteria) this;
        }

        public Criteria andVaccineTimeIn(List<Date> values) {
            addCriterion("vaccine_time in", values, "vaccineTime");
            return (Criteria) this;
        }

        public Criteria andVaccineTimeNotIn(List<Date> values) {
            addCriterion("vaccine_time not in", values, "vaccineTime");
            return (Criteria) this;
        }

        public Criteria andVaccineTimeBetween(Date value1, Date value2) {
            addCriterion("vaccine_time between", value1, value2, "vaccineTime");
            return (Criteria) this;
        }

        public Criteria andVaccineTimeNotBetween(Date value1, Date value2) {
            addCriterion("vaccine_time not between", value1, value2, "vaccineTime");
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