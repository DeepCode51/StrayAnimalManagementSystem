package com.ypf.pojo;

import java.util.ArrayList;
import java.util.List;

public class TDogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDogExample() {
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

        public Criteria andDogKindIsNull() {
            addCriterion("dog_kind is null");
            return (Criteria) this;
        }

        public Criteria andDogKindIsNotNull() {
            addCriterion("dog_kind is not null");
            return (Criteria) this;
        }

        public Criteria andDogKindEqualTo(String value) {
            addCriterion("dog_kind =", value, "dogKind");
            return (Criteria) this;
        }

        public Criteria andDogKindNotEqualTo(String value) {
            addCriterion("dog_kind <>", value, "dogKind");
            return (Criteria) this;
        }

        public Criteria andDogKindGreaterThan(String value) {
            addCriterion("dog_kind >", value, "dogKind");
            return (Criteria) this;
        }

        public Criteria andDogKindGreaterThanOrEqualTo(String value) {
            addCriterion("dog_kind >=", value, "dogKind");
            return (Criteria) this;
        }

        public Criteria andDogKindLessThan(String value) {
            addCriterion("dog_kind <", value, "dogKind");
            return (Criteria) this;
        }

        public Criteria andDogKindLessThanOrEqualTo(String value) {
            addCriterion("dog_kind <=", value, "dogKind");
            return (Criteria) this;
        }

        public Criteria andDogKindLike(String value) {
            addCriterion("dog_kind like", value, "dogKind");
            return (Criteria) this;
        }

        public Criteria andDogKindNotLike(String value) {
            addCriterion("dog_kind not like", value, "dogKind");
            return (Criteria) this;
        }

        public Criteria andDogKindIn(List<String> values) {
            addCriterion("dog_kind in", values, "dogKind");
            return (Criteria) this;
        }

        public Criteria andDogKindNotIn(List<String> values) {
            addCriterion("dog_kind not in", values, "dogKind");
            return (Criteria) this;
        }

        public Criteria andDogKindBetween(String value1, String value2) {
            addCriterion("dog_kind between", value1, value2, "dogKind");
            return (Criteria) this;
        }

        public Criteria andDogKindNotBetween(String value1, String value2) {
            addCriterion("dog_kind not between", value1, value2, "dogKind");
            return (Criteria) this;
        }

        public Criteria andDogNameIsNull() {
            addCriterion("dog_name is null");
            return (Criteria) this;
        }

        public Criteria andDogNameIsNotNull() {
            addCriterion("dog_name is not null");
            return (Criteria) this;
        }

        public Criteria andDogNameEqualTo(String value) {
            addCriterion("dog_name =", value, "dogName");
            return (Criteria) this;
        }

        public Criteria andDogNameNotEqualTo(String value) {
            addCriterion("dog_name <>", value, "dogName");
            return (Criteria) this;
        }

        public Criteria andDogNameGreaterThan(String value) {
            addCriterion("dog_name >", value, "dogName");
            return (Criteria) this;
        }

        public Criteria andDogNameGreaterThanOrEqualTo(String value) {
            addCriterion("dog_name >=", value, "dogName");
            return (Criteria) this;
        }

        public Criteria andDogNameLessThan(String value) {
            addCriterion("dog_name <", value, "dogName");
            return (Criteria) this;
        }

        public Criteria andDogNameLessThanOrEqualTo(String value) {
            addCriterion("dog_name <=", value, "dogName");
            return (Criteria) this;
        }

        public Criteria andDogNameLike(String value) {
            addCriterion("dog_name like", value, "dogName");
            return (Criteria) this;
        }

        public Criteria andDogNameNotLike(String value) {
            addCriterion("dog_name not like", value, "dogName");
            return (Criteria) this;
        }

        public Criteria andDogNameIn(List<String> values) {
            addCriterion("dog_name in", values, "dogName");
            return (Criteria) this;
        }

        public Criteria andDogNameNotIn(List<String> values) {
            addCriterion("dog_name not in", values, "dogName");
            return (Criteria) this;
        }

        public Criteria andDogNameBetween(String value1, String value2) {
            addCriterion("dog_name between", value1, value2, "dogName");
            return (Criteria) this;
        }

        public Criteria andDogNameNotBetween(String value1, String value2) {
            addCriterion("dog_name not between", value1, value2, "dogName");
            return (Criteria) this;
        }

        public Criteria andAdoptStateIsNull() {
            addCriterion("adopt_state is null");
            return (Criteria) this;
        }

        public Criteria andAdoptStateIsNotNull() {
            addCriterion("adopt_state is not null");
            return (Criteria) this;
        }

        public Criteria andAdoptStateEqualTo(Integer value) {
            addCriterion("adopt_state =", value, "adoptState");
            return (Criteria) this;
        }

        public Criteria andAdoptStateNotEqualTo(Integer value) {
            addCriterion("adopt_state <>", value, "adoptState");
            return (Criteria) this;
        }

        public Criteria andAdoptStateGreaterThan(Integer value) {
            addCriterion("adopt_state >", value, "adoptState");
            return (Criteria) this;
        }

        public Criteria andAdoptStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("adopt_state >=", value, "adoptState");
            return (Criteria) this;
        }

        public Criteria andAdoptStateLessThan(Integer value) {
            addCriterion("adopt_state <", value, "adoptState");
            return (Criteria) this;
        }

        public Criteria andAdoptStateLessThanOrEqualTo(Integer value) {
            addCriterion("adopt_state <=", value, "adoptState");
            return (Criteria) this;
        }

        public Criteria andAdoptStateIn(List<Integer> values) {
            addCriterion("adopt_state in", values, "adoptState");
            return (Criteria) this;
        }

        public Criteria andAdoptStateNotIn(List<Integer> values) {
            addCriterion("adopt_state not in", values, "adoptState");
            return (Criteria) this;
        }

        public Criteria andAdoptStateBetween(Integer value1, Integer value2) {
            addCriterion("adopt_state between", value1, value2, "adoptState");
            return (Criteria) this;
        }

        public Criteria andAdoptStateNotBetween(Integer value1, Integer value2) {
            addCriterion("adopt_state not between", value1, value2, "adoptState");
            return (Criteria) this;
        }

        public Criteria andVaccinationStatusIsNull() {
            addCriterion("vaccination_status is null");
            return (Criteria) this;
        }

        public Criteria andVaccinationStatusIsNotNull() {
            addCriterion("vaccination_status is not null");
            return (Criteria) this;
        }

        public Criteria andVaccinationStatusEqualTo(Integer value) {
            addCriterion("vaccination_status =", value, "vaccinationStatus");
            return (Criteria) this;
        }

        public Criteria andVaccinationStatusNotEqualTo(Integer value) {
            addCriterion("vaccination_status <>", value, "vaccinationStatus");
            return (Criteria) this;
        }

        public Criteria andVaccinationStatusGreaterThan(Integer value) {
            addCriterion("vaccination_status >", value, "vaccinationStatus");
            return (Criteria) this;
        }

        public Criteria andVaccinationStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("vaccination_status >=", value, "vaccinationStatus");
            return (Criteria) this;
        }

        public Criteria andVaccinationStatusLessThan(Integer value) {
            addCriterion("vaccination_status <", value, "vaccinationStatus");
            return (Criteria) this;
        }

        public Criteria andVaccinationStatusLessThanOrEqualTo(Integer value) {
            addCriterion("vaccination_status <=", value, "vaccinationStatus");
            return (Criteria) this;
        }

        public Criteria andVaccinationStatusIn(List<Integer> values) {
            addCriterion("vaccination_status in", values, "vaccinationStatus");
            return (Criteria) this;
        }

        public Criteria andVaccinationStatusNotIn(List<Integer> values) {
            addCriterion("vaccination_status not in", values, "vaccinationStatus");
            return (Criteria) this;
        }

        public Criteria andVaccinationStatusBetween(Integer value1, Integer value2) {
            addCriterion("vaccination_status between", value1, value2, "vaccinationStatus");
            return (Criteria) this;
        }

        public Criteria andVaccinationStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("vaccination_status not between", value1, value2, "vaccinationStatus");
            return (Criteria) this;
        }

        public Criteria andDescrptionIsNull() {
            addCriterion("descrption is null");
            return (Criteria) this;
        }

        public Criteria andDescrptionIsNotNull() {
            addCriterion("descrption is not null");
            return (Criteria) this;
        }

        public Criteria andDescrptionEqualTo(String value) {
            addCriterion("descrption =", value, "descrption");
            return (Criteria) this;
        }

        public Criteria andDescrptionNotEqualTo(String value) {
            addCriterion("descrption <>", value, "descrption");
            return (Criteria) this;
        }

        public Criteria andDescrptionGreaterThan(String value) {
            addCriterion("descrption >", value, "descrption");
            return (Criteria) this;
        }

        public Criteria andDescrptionGreaterThanOrEqualTo(String value) {
            addCriterion("descrption >=", value, "descrption");
            return (Criteria) this;
        }

        public Criteria andDescrptionLessThan(String value) {
            addCriterion("descrption <", value, "descrption");
            return (Criteria) this;
        }

        public Criteria andDescrptionLessThanOrEqualTo(String value) {
            addCriterion("descrption <=", value, "descrption");
            return (Criteria) this;
        }

        public Criteria andDescrptionLike(String value) {
            addCriterion("descrption like", value, "descrption");
            return (Criteria) this;
        }

        public Criteria andDescrptionNotLike(String value) {
            addCriterion("descrption not like", value, "descrption");
            return (Criteria) this;
        }

        public Criteria andDescrptionIn(List<String> values) {
            addCriterion("descrption in", values, "descrption");
            return (Criteria) this;
        }

        public Criteria andDescrptionNotIn(List<String> values) {
            addCriterion("descrption not in", values, "descrption");
            return (Criteria) this;
        }

        public Criteria andDescrptionBetween(String value1, String value2) {
            addCriterion("descrption between", value1, value2, "descrption");
            return (Criteria) this;
        }

        public Criteria andDescrptionNotBetween(String value1, String value2) {
            addCriterion("descrption not between", value1, value2, "descrption");
            return (Criteria) this;
        }

        public Criteria andFaceImageIsNull() {
            addCriterion("face_image is null");
            return (Criteria) this;
        }

        public Criteria andFaceImageIsNotNull() {
            addCriterion("face_image is not null");
            return (Criteria) this;
        }

        public Criteria andFaceImageEqualTo(String value) {
            addCriterion("face_image =", value, "faceImage");
            return (Criteria) this;
        }

        public Criteria andFaceImageNotEqualTo(String value) {
            addCriterion("face_image <>", value, "faceImage");
            return (Criteria) this;
        }

        public Criteria andFaceImageGreaterThan(String value) {
            addCriterion("face_image >", value, "faceImage");
            return (Criteria) this;
        }

        public Criteria andFaceImageGreaterThanOrEqualTo(String value) {
            addCriterion("face_image >=", value, "faceImage");
            return (Criteria) this;
        }

        public Criteria andFaceImageLessThan(String value) {
            addCriterion("face_image <", value, "faceImage");
            return (Criteria) this;
        }

        public Criteria andFaceImageLessThanOrEqualTo(String value) {
            addCriterion("face_image <=", value, "faceImage");
            return (Criteria) this;
        }

        public Criteria andFaceImageLike(String value) {
            addCriterion("face_image like", value, "faceImage");
            return (Criteria) this;
        }

        public Criteria andFaceImageNotLike(String value) {
            addCriterion("face_image not like", value, "faceImage");
            return (Criteria) this;
        }

        public Criteria andFaceImageIn(List<String> values) {
            addCriterion("face_image in", values, "faceImage");
            return (Criteria) this;
        }

        public Criteria andFaceImageNotIn(List<String> values) {
            addCriterion("face_image not in", values, "faceImage");
            return (Criteria) this;
        }

        public Criteria andFaceImageBetween(String value1, String value2) {
            addCriterion("face_image between", value1, value2, "faceImage");
            return (Criteria) this;
        }

        public Criteria andFaceImageNotBetween(String value1, String value2) {
            addCriterion("face_image not between", value1, value2, "faceImage");
            return (Criteria) this;
        }

        public Criteria andDogAgeIsNull() {
            addCriterion("dog_age is null");
            return (Criteria) this;
        }

        public Criteria andDogAgeIsNotNull() {
            addCriterion("dog_age is not null");
            return (Criteria) this;
        }

        public Criteria andDogAgeEqualTo(Integer value) {
            addCriterion("dog_age =", value, "dogAge");
            return (Criteria) this;
        }

        public Criteria andDogAgeNotEqualTo(Integer value) {
            addCriterion("dog_age <>", value, "dogAge");
            return (Criteria) this;
        }

        public Criteria andDogAgeGreaterThan(Integer value) {
            addCriterion("dog_age >", value, "dogAge");
            return (Criteria) this;
        }

        public Criteria andDogAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dog_age >=", value, "dogAge");
            return (Criteria) this;
        }

        public Criteria andDogAgeLessThan(Integer value) {
            addCriterion("dog_age <", value, "dogAge");
            return (Criteria) this;
        }

        public Criteria andDogAgeLessThanOrEqualTo(Integer value) {
            addCriterion("dog_age <=", value, "dogAge");
            return (Criteria) this;
        }

        public Criteria andDogAgeIn(List<Integer> values) {
            addCriterion("dog_age in", values, "dogAge");
            return (Criteria) this;
        }

        public Criteria andDogAgeNotIn(List<Integer> values) {
            addCriterion("dog_age not in", values, "dogAge");
            return (Criteria) this;
        }

        public Criteria andDogAgeBetween(Integer value1, Integer value2) {
            addCriterion("dog_age between", value1, value2, "dogAge");
            return (Criteria) this;
        }

        public Criteria andDogAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("dog_age not between", value1, value2, "dogAge");
            return (Criteria) this;
        }

        public Criteria andDogSexIsNull() {
            addCriterion("dog_sex is null");
            return (Criteria) this;
        }

        public Criteria andDogSexIsNotNull() {
            addCriterion("dog_sex is not null");
            return (Criteria) this;
        }

        public Criteria andDogSexEqualTo(String value) {
            addCriterion("dog_sex =", value, "dogSex");
            return (Criteria) this;
        }

        public Criteria andDogSexNotEqualTo(String value) {
            addCriterion("dog_sex <>", value, "dogSex");
            return (Criteria) this;
        }

        public Criteria andDogSexGreaterThan(String value) {
            addCriterion("dog_sex >", value, "dogSex");
            return (Criteria) this;
        }

        public Criteria andDogSexGreaterThanOrEqualTo(String value) {
            addCriterion("dog_sex >=", value, "dogSex");
            return (Criteria) this;
        }

        public Criteria andDogSexLessThan(String value) {
            addCriterion("dog_sex <", value, "dogSex");
            return (Criteria) this;
        }

        public Criteria andDogSexLessThanOrEqualTo(String value) {
            addCriterion("dog_sex <=", value, "dogSex");
            return (Criteria) this;
        }

        public Criteria andDogSexLike(String value) {
            addCriterion("dog_sex like", value, "dogSex");
            return (Criteria) this;
        }

        public Criteria andDogSexNotLike(String value) {
            addCriterion("dog_sex not like", value, "dogSex");
            return (Criteria) this;
        }

        public Criteria andDogSexIn(List<String> values) {
            addCriterion("dog_sex in", values, "dogSex");
            return (Criteria) this;
        }

        public Criteria andDogSexNotIn(List<String> values) {
            addCriterion("dog_sex not in", values, "dogSex");
            return (Criteria) this;
        }

        public Criteria andDogSexBetween(String value1, String value2) {
            addCriterion("dog_sex between", value1, value2, "dogSex");
            return (Criteria) this;
        }

        public Criteria andDogSexNotBetween(String value1, String value2) {
            addCriterion("dog_sex not between", value1, value2, "dogSex");
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