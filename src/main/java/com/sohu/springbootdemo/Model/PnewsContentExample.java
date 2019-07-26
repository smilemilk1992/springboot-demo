package com.sohu.springbootdemo.Model;

import java.util.ArrayList;
import java.util.List;

public class PnewsContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PnewsContentExample() {
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

        public Criteria andCitynameIsNull() {
            addCriterion("cityName is null");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNotNull() {
            addCriterion("cityName is not null");
            return (Criteria) this;
        }

        public Criteria andCitynameEqualTo(String value) {
            addCriterion("cityName =", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotEqualTo(String value) {
            addCriterion("cityName <>", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThan(String value) {
            addCriterion("cityName >", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThanOrEqualTo(String value) {
            addCriterion("cityName >=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThan(String value) {
            addCriterion("cityName <", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThanOrEqualTo(String value) {
            addCriterion("cityName <=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLike(String value) {
            addCriterion("cityName like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotLike(String value) {
            addCriterion("cityName not like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameIn(List<String> values) {
            addCriterion("cityName in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotIn(List<String> values) {
            addCriterion("cityName not in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameBetween(String value1, String value2) {
            addCriterion("cityName between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotBetween(String value1, String value2) {
            addCriterion("cityName not between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andArenameIsNull() {
            addCriterion("areName is null");
            return (Criteria) this;
        }

        public Criteria andArenameIsNotNull() {
            addCriterion("areName is not null");
            return (Criteria) this;
        }

        public Criteria andArenameEqualTo(String value) {
            addCriterion("areName =", value, "arename");
            return (Criteria) this;
        }

        public Criteria andArenameNotEqualTo(String value) {
            addCriterion("areName <>", value, "arename");
            return (Criteria) this;
        }

        public Criteria andArenameGreaterThan(String value) {
            addCriterion("areName >", value, "arename");
            return (Criteria) this;
        }

        public Criteria andArenameGreaterThanOrEqualTo(String value) {
            addCriterion("areName >=", value, "arename");
            return (Criteria) this;
        }

        public Criteria andArenameLessThan(String value) {
            addCriterion("areName <", value, "arename");
            return (Criteria) this;
        }

        public Criteria andArenameLessThanOrEqualTo(String value) {
            addCriterion("areName <=", value, "arename");
            return (Criteria) this;
        }

        public Criteria andArenameLike(String value) {
            addCriterion("areName like", value, "arename");
            return (Criteria) this;
        }

        public Criteria andArenameNotLike(String value) {
            addCriterion("areName not like", value, "arename");
            return (Criteria) this;
        }

        public Criteria andArenameIn(List<String> values) {
            addCriterion("areName in", values, "arename");
            return (Criteria) this;
        }

        public Criteria andArenameNotIn(List<String> values) {
            addCriterion("areName not in", values, "arename");
            return (Criteria) this;
        }

        public Criteria andArenameBetween(String value1, String value2) {
            addCriterion("areName between", value1, value2, "arename");
            return (Criteria) this;
        }

        public Criteria andArenameNotBetween(String value1, String value2) {
            addCriterion("areName not between", value1, value2, "arename");
            return (Criteria) this;
        }

        public Criteria andForumnameIsNull() {
            addCriterion("forumName is null");
            return (Criteria) this;
        }

        public Criteria andForumnameIsNotNull() {
            addCriterion("forumName is not null");
            return (Criteria) this;
        }

        public Criteria andForumnameEqualTo(String value) {
            addCriterion("forumName =", value, "forumname");
            return (Criteria) this;
        }

        public Criteria andForumnameNotEqualTo(String value) {
            addCriterion("forumName <>", value, "forumname");
            return (Criteria) this;
        }

        public Criteria andForumnameGreaterThan(String value) {
            addCriterion("forumName >", value, "forumname");
            return (Criteria) this;
        }

        public Criteria andForumnameGreaterThanOrEqualTo(String value) {
            addCriterion("forumName >=", value, "forumname");
            return (Criteria) this;
        }

        public Criteria andForumnameLessThan(String value) {
            addCriterion("forumName <", value, "forumname");
            return (Criteria) this;
        }

        public Criteria andForumnameLessThanOrEqualTo(String value) {
            addCriterion("forumName <=", value, "forumname");
            return (Criteria) this;
        }

        public Criteria andForumnameLike(String value) {
            addCriterion("forumName like", value, "forumname");
            return (Criteria) this;
        }

        public Criteria andForumnameNotLike(String value) {
            addCriterion("forumName not like", value, "forumname");
            return (Criteria) this;
        }

        public Criteria andForumnameIn(List<String> values) {
            addCriterion("forumName in", values, "forumname");
            return (Criteria) this;
        }

        public Criteria andForumnameNotIn(List<String> values) {
            addCriterion("forumName not in", values, "forumname");
            return (Criteria) this;
        }

        public Criteria andForumnameBetween(String value1, String value2) {
            addCriterion("forumName between", value1, value2, "forumname");
            return (Criteria) this;
        }

        public Criteria andForumnameNotBetween(String value1, String value2) {
            addCriterion("forumName not between", value1, value2, "forumname");
            return (Criteria) this;
        }

        public Criteria andDomainnameIsNull() {
            addCriterion("domainName is null");
            return (Criteria) this;
        }

        public Criteria andDomainnameIsNotNull() {
            addCriterion("domainName is not null");
            return (Criteria) this;
        }

        public Criteria andDomainnameEqualTo(String value) {
            addCriterion("domainName =", value, "domainname");
            return (Criteria) this;
        }

        public Criteria andDomainnameNotEqualTo(String value) {
            addCriterion("domainName <>", value, "domainname");
            return (Criteria) this;
        }

        public Criteria andDomainnameGreaterThan(String value) {
            addCriterion("domainName >", value, "domainname");
            return (Criteria) this;
        }

        public Criteria andDomainnameGreaterThanOrEqualTo(String value) {
            addCriterion("domainName >=", value, "domainname");
            return (Criteria) this;
        }

        public Criteria andDomainnameLessThan(String value) {
            addCriterion("domainName <", value, "domainname");
            return (Criteria) this;
        }

        public Criteria andDomainnameLessThanOrEqualTo(String value) {
            addCriterion("domainName <=", value, "domainname");
            return (Criteria) this;
        }

        public Criteria andDomainnameLike(String value) {
            addCriterion("domainName like", value, "domainname");
            return (Criteria) this;
        }

        public Criteria andDomainnameNotLike(String value) {
            addCriterion("domainName not like", value, "domainname");
            return (Criteria) this;
        }

        public Criteria andDomainnameIn(List<String> values) {
            addCriterion("domainName in", values, "domainname");
            return (Criteria) this;
        }

        public Criteria andDomainnameNotIn(List<String> values) {
            addCriterion("domainName not in", values, "domainname");
            return (Criteria) this;
        }

        public Criteria andDomainnameBetween(String value1, String value2) {
            addCriterion("domainName between", value1, value2, "domainname");
            return (Criteria) this;
        }

        public Criteria andDomainnameNotBetween(String value1, String value2) {
            addCriterion("domainName not between", value1, value2, "domainname");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNull() {
            addCriterion("typeName is null");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNotNull() {
            addCriterion("typeName is not null");
            return (Criteria) this;
        }

        public Criteria andTypenameEqualTo(String value) {
            addCriterion("typeName =", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotEqualTo(String value) {
            addCriterion("typeName <>", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThan(String value) {
            addCriterion("typeName >", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("typeName >=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThan(String value) {
            addCriterion("typeName <", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThanOrEqualTo(String value) {
            addCriterion("typeName <=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLike(String value) {
            addCriterion("typeName like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotLike(String value) {
            addCriterion("typeName not like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameIn(List<String> values) {
            addCriterion("typeName in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotIn(List<String> values) {
            addCriterion("typeName not in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameBetween(String value1, String value2) {
            addCriterion("typeName between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotBetween(String value1, String value2) {
            addCriterion("typeName not between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andDatelineIsNull() {
            addCriterion("dateline is null");
            return (Criteria) this;
        }

        public Criteria andDatelineIsNotNull() {
            addCriterion("dateline is not null");
            return (Criteria) this;
        }

        public Criteria andDatelineEqualTo(String value) {
            addCriterion("dateline =", value, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineNotEqualTo(String value) {
            addCriterion("dateline <>", value, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineGreaterThan(String value) {
            addCriterion("dateline >", value, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineGreaterThanOrEqualTo(String value) {
            addCriterion("dateline >=", value, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineLessThan(String value) {
            addCriterion("dateline <", value, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineLessThanOrEqualTo(String value) {
            addCriterion("dateline <=", value, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineLike(String value) {
            addCriterion("dateline like", value, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineNotLike(String value) {
            addCriterion("dateline not like", value, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineIn(List<String> values) {
            addCriterion("dateline in", values, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineNotIn(List<String> values) {
            addCriterion("dateline not in", values, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineBetween(String value1, String value2) {
            addCriterion("dateline between", value1, value2, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineNotBetween(String value1, String value2) {
            addCriterion("dateline not between", value1, value2, "dateline");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andSubjectcontentIsNull() {
            addCriterion("subjectContent is null");
            return (Criteria) this;
        }

        public Criteria andSubjectcontentIsNotNull() {
            addCriterion("subjectContent is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectcontentEqualTo(String value) {
            addCriterion("subjectContent =", value, "subjectcontent");
            return (Criteria) this;
        }

        public Criteria andSubjectcontentNotEqualTo(String value) {
            addCriterion("subjectContent <>", value, "subjectcontent");
            return (Criteria) this;
        }

        public Criteria andSubjectcontentGreaterThan(String value) {
            addCriterion("subjectContent >", value, "subjectcontent");
            return (Criteria) this;
        }

        public Criteria andSubjectcontentGreaterThanOrEqualTo(String value) {
            addCriterion("subjectContent >=", value, "subjectcontent");
            return (Criteria) this;
        }

        public Criteria andSubjectcontentLessThan(String value) {
            addCriterion("subjectContent <", value, "subjectcontent");
            return (Criteria) this;
        }

        public Criteria andSubjectcontentLessThanOrEqualTo(String value) {
            addCriterion("subjectContent <=", value, "subjectcontent");
            return (Criteria) this;
        }

        public Criteria andSubjectcontentLike(String value) {
            addCriterion("subjectContent like", value, "subjectcontent");
            return (Criteria) this;
        }

        public Criteria andSubjectcontentNotLike(String value) {
            addCriterion("subjectContent not like", value, "subjectcontent");
            return (Criteria) this;
        }

        public Criteria andSubjectcontentIn(List<String> values) {
            addCriterion("subjectContent in", values, "subjectcontent");
            return (Criteria) this;
        }

        public Criteria andSubjectcontentNotIn(List<String> values) {
            addCriterion("subjectContent not in", values, "subjectcontent");
            return (Criteria) this;
        }

        public Criteria andSubjectcontentBetween(String value1, String value2) {
            addCriterion("subjectContent between", value1, value2, "subjectcontent");
            return (Criteria) this;
        }

        public Criteria andSubjectcontentNotBetween(String value1, String value2) {
            addCriterion("subjectContent not between", value1, value2, "subjectcontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentIsNull() {
            addCriterion("answerContent is null");
            return (Criteria) this;
        }

        public Criteria andAnswercontentIsNotNull() {
            addCriterion("answerContent is not null");
            return (Criteria) this;
        }

        public Criteria andAnswercontentEqualTo(String value) {
            addCriterion("answerContent =", value, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentNotEqualTo(String value) {
            addCriterion("answerContent <>", value, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentGreaterThan(String value) {
            addCriterion("answerContent >", value, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentGreaterThanOrEqualTo(String value) {
            addCriterion("answerContent >=", value, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentLessThan(String value) {
            addCriterion("answerContent <", value, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentLessThanOrEqualTo(String value) {
            addCriterion("answerContent <=", value, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentLike(String value) {
            addCriterion("answerContent like", value, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentNotLike(String value) {
            addCriterion("answerContent not like", value, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentIn(List<String> values) {
            addCriterion("answerContent in", values, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentNotIn(List<String> values) {
            addCriterion("answerContent not in", values, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentBetween(String value1, String value2) {
            addCriterion("answerContent between", value1, value2, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentNotBetween(String value1, String value2) {
            addCriterion("answerContent not between", value1, value2, "answercontent");
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