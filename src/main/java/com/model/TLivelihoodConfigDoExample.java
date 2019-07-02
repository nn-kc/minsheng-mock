package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TLivelihoodConfigDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TLivelihoodConfigDoExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCfgKeyIsNull() {
            addCriterion("cfg_key is null");
            return (Criteria) this;
        }

        public Criteria andCfgKeyIsNotNull() {
            addCriterion("cfg_key is not null");
            return (Criteria) this;
        }

        public Criteria andCfgKeyEqualTo(String value) {
            addCriterion("cfg_key =", value, "cfgKey");
            return (Criteria) this;
        }

        public Criteria andCfgKeyNotEqualTo(String value) {
            addCriterion("cfg_key <>", value, "cfgKey");
            return (Criteria) this;
        }

        public Criteria andCfgKeyGreaterThan(String value) {
            addCriterion("cfg_key >", value, "cfgKey");
            return (Criteria) this;
        }

        public Criteria andCfgKeyGreaterThanOrEqualTo(String value) {
            addCriterion("cfg_key >=", value, "cfgKey");
            return (Criteria) this;
        }

        public Criteria andCfgKeyLessThan(String value) {
            addCriterion("cfg_key <", value, "cfgKey");
            return (Criteria) this;
        }

        public Criteria andCfgKeyLessThanOrEqualTo(String value) {
            addCriterion("cfg_key <=", value, "cfgKey");
            return (Criteria) this;
        }

        public Criteria andCfgKeyLike(String value) {
            addCriterion("cfg_key like", value, "cfgKey");
            return (Criteria) this;
        }

        public Criteria andCfgKeyNotLike(String value) {
            addCriterion("cfg_key not like", value, "cfgKey");
            return (Criteria) this;
        }

        public Criteria andCfgKeyIn(List<String> values) {
            addCriterion("cfg_key in", values, "cfgKey");
            return (Criteria) this;
        }

        public Criteria andCfgKeyNotIn(List<String> values) {
            addCriterion("cfg_key not in", values, "cfgKey");
            return (Criteria) this;
        }

        public Criteria andCfgKeyBetween(String value1, String value2) {
            addCriterion("cfg_key between", value1, value2, "cfgKey");
            return (Criteria) this;
        }

        public Criteria andCfgKeyNotBetween(String value1, String value2) {
            addCriterion("cfg_key not between", value1, value2, "cfgKey");
            return (Criteria) this;
        }

        public Criteria andCfgValueIsNull() {
            addCriterion("cfg_value is null");
            return (Criteria) this;
        }

        public Criteria andCfgValueIsNotNull() {
            addCriterion("cfg_value is not null");
            return (Criteria) this;
        }

        public Criteria andCfgValueEqualTo(String value) {
            addCriterion("cfg_value =", value, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueNotEqualTo(String value) {
            addCriterion("cfg_value <>", value, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueGreaterThan(String value) {
            addCriterion("cfg_value >", value, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueGreaterThanOrEqualTo(String value) {
            addCriterion("cfg_value >=", value, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueLessThan(String value) {
            addCriterion("cfg_value <", value, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueLessThanOrEqualTo(String value) {
            addCriterion("cfg_value <=", value, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueLike(String value) {
            addCriterion("cfg_value like", value, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueNotLike(String value) {
            addCriterion("cfg_value not like", value, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueIn(List<String> values) {
            addCriterion("cfg_value in", values, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueNotIn(List<String> values) {
            addCriterion("cfg_value not in", values, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueBetween(String value1, String value2) {
            addCriterion("cfg_value between", value1, value2, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueNotBetween(String value1, String value2) {
            addCriterion("cfg_value not between", value1, value2, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionIsNull() {
            addCriterion("CFG_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionIsNotNull() {
            addCriterion("CFG_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionEqualTo(String value) {
            addCriterion("CFG_DESCRIPTION =", value, "cfgDescription");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionNotEqualTo(String value) {
            addCriterion("CFG_DESCRIPTION <>", value, "cfgDescription");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionGreaterThan(String value) {
            addCriterion("CFG_DESCRIPTION >", value, "cfgDescription");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("CFG_DESCRIPTION >=", value, "cfgDescription");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionLessThan(String value) {
            addCriterion("CFG_DESCRIPTION <", value, "cfgDescription");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionLessThanOrEqualTo(String value) {
            addCriterion("CFG_DESCRIPTION <=", value, "cfgDescription");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionLike(String value) {
            addCriterion("CFG_DESCRIPTION like", value, "cfgDescription");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionNotLike(String value) {
            addCriterion("CFG_DESCRIPTION not like", value, "cfgDescription");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionIn(List<String> values) {
            addCriterion("CFG_DESCRIPTION in", values, "cfgDescription");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionNotIn(List<String> values) {
            addCriterion("CFG_DESCRIPTION not in", values, "cfgDescription");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionBetween(String value1, String value2) {
            addCriterion("CFG_DESCRIPTION between", value1, value2, "cfgDescription");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionNotBetween(String value1, String value2) {
            addCriterion("CFG_DESCRIPTION not between", value1, value2, "cfgDescription");
            return (Criteria) this;
        }

        public Criteria andEffectFlagIsNull() {
            addCriterion("EFFECT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andEffectFlagIsNotNull() {
            addCriterion("EFFECT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andEffectFlagEqualTo(String value) {
            addCriterion("EFFECT_FLAG =", value, "effectFlag");
            return (Criteria) this;
        }

        public Criteria andEffectFlagNotEqualTo(String value) {
            addCriterion("EFFECT_FLAG <>", value, "effectFlag");
            return (Criteria) this;
        }

        public Criteria andEffectFlagGreaterThan(String value) {
            addCriterion("EFFECT_FLAG >", value, "effectFlag");
            return (Criteria) this;
        }

        public Criteria andEffectFlagGreaterThanOrEqualTo(String value) {
            addCriterion("EFFECT_FLAG >=", value, "effectFlag");
            return (Criteria) this;
        }

        public Criteria andEffectFlagLessThan(String value) {
            addCriterion("EFFECT_FLAG <", value, "effectFlag");
            return (Criteria) this;
        }

        public Criteria andEffectFlagLessThanOrEqualTo(String value) {
            addCriterion("EFFECT_FLAG <=", value, "effectFlag");
            return (Criteria) this;
        }

        public Criteria andEffectFlagLike(String value) {
            addCriterion("EFFECT_FLAG like", value, "effectFlag");
            return (Criteria) this;
        }

        public Criteria andEffectFlagNotLike(String value) {
            addCriterion("EFFECT_FLAG not like", value, "effectFlag");
            return (Criteria) this;
        }

        public Criteria andEffectFlagIn(List<String> values) {
            addCriterion("EFFECT_FLAG in", values, "effectFlag");
            return (Criteria) this;
        }

        public Criteria andEffectFlagNotIn(List<String> values) {
            addCriterion("EFFECT_FLAG not in", values, "effectFlag");
            return (Criteria) this;
        }

        public Criteria andEffectFlagBetween(String value1, String value2) {
            addCriterion("EFFECT_FLAG between", value1, value2, "effectFlag");
            return (Criteria) this;
        }

        public Criteria andEffectFlagNotBetween(String value1, String value2) {
            addCriterion("EFFECT_FLAG not between", value1, value2, "effectFlag");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("updated_by like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("updated_by not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
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