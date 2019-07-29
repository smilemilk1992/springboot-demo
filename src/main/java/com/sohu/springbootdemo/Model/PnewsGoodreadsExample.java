package com.sohu.springbootdemo.Model;

import java.util.ArrayList;
import java.util.List;

public class PnewsGoodreadsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PnewsGoodreadsExample() {
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

        public Criteria andCudosidIsNull() {
            addCriterion("cudosid is null");
            return (Criteria) this;
        }

        public Criteria andCudosidIsNotNull() {
            addCriterion("cudosid is not null");
            return (Criteria) this;
        }

        public Criteria andCudosidEqualTo(Integer value) {
            addCriterion("cudosid =", value, "cudosid");
            return (Criteria) this;
        }

        public Criteria andCudosidNotEqualTo(Integer value) {
            addCriterion("cudosid <>", value, "cudosid");
            return (Criteria) this;
        }

        public Criteria andCudosidGreaterThan(Integer value) {
            addCriterion("cudosid >", value, "cudosid");
            return (Criteria) this;
        }

        public Criteria andCudosidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cudosid >=", value, "cudosid");
            return (Criteria) this;
        }

        public Criteria andCudosidLessThan(Integer value) {
            addCriterion("cudosid <", value, "cudosid");
            return (Criteria) this;
        }

        public Criteria andCudosidLessThanOrEqualTo(Integer value) {
            addCriterion("cudosid <=", value, "cudosid");
            return (Criteria) this;
        }

        public Criteria andCudosidIn(List<Integer> values) {
            addCriterion("cudosid in", values, "cudosid");
            return (Criteria) this;
        }

        public Criteria andCudosidNotIn(List<Integer> values) {
            addCriterion("cudosid not in", values, "cudosid");
            return (Criteria) this;
        }

        public Criteria andCudosidBetween(Integer value1, Integer value2) {
            addCriterion("cudosid between", value1, value2, "cudosid");
            return (Criteria) this;
        }

        public Criteria andCudosidNotBetween(Integer value1, Integer value2) {
            addCriterion("cudosid not between", value1, value2, "cudosid");
            return (Criteria) this;
        }

        public Criteria andGoodreadsidIsNull() {
            addCriterion("goodreadsId is null");
            return (Criteria) this;
        }

        public Criteria andGoodreadsidIsNotNull() {
            addCriterion("goodreadsId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodreadsidEqualTo(Integer value) {
            addCriterion("goodreadsId =", value, "goodreadsid");
            return (Criteria) this;
        }

        public Criteria andGoodreadsidNotEqualTo(Integer value) {
            addCriterion("goodreadsId <>", value, "goodreadsid");
            return (Criteria) this;
        }

        public Criteria andGoodreadsidGreaterThan(Integer value) {
            addCriterion("goodreadsId >", value, "goodreadsid");
            return (Criteria) this;
        }

        public Criteria andGoodreadsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodreadsId >=", value, "goodreadsid");
            return (Criteria) this;
        }

        public Criteria andGoodreadsidLessThan(Integer value) {
            addCriterion("goodreadsId <", value, "goodreadsid");
            return (Criteria) this;
        }

        public Criteria andGoodreadsidLessThanOrEqualTo(Integer value) {
            addCriterion("goodreadsId <=", value, "goodreadsid");
            return (Criteria) this;
        }

        public Criteria andGoodreadsidIn(List<Integer> values) {
            addCriterion("goodreadsId in", values, "goodreadsid");
            return (Criteria) this;
        }

        public Criteria andGoodreadsidNotIn(List<Integer> values) {
            addCriterion("goodreadsId not in", values, "goodreadsid");
            return (Criteria) this;
        }

        public Criteria andGoodreadsidBetween(Integer value1, Integer value2) {
            addCriterion("goodreadsId between", value1, value2, "goodreadsid");
            return (Criteria) this;
        }

        public Criteria andGoodreadsidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodreadsId not between", value1, value2, "goodreadsid");
            return (Criteria) this;
        }

        public Criteria andGoodreadsurlIsNull() {
            addCriterion("goodreadsUrl is null");
            return (Criteria) this;
        }

        public Criteria andGoodreadsurlIsNotNull() {
            addCriterion("goodreadsUrl is not null");
            return (Criteria) this;
        }

        public Criteria andGoodreadsurlEqualTo(String value) {
            addCriterion("goodreadsUrl =", value, "goodreadsurl");
            return (Criteria) this;
        }

        public Criteria andGoodreadsurlNotEqualTo(String value) {
            addCriterion("goodreadsUrl <>", value, "goodreadsurl");
            return (Criteria) this;
        }

        public Criteria andGoodreadsurlGreaterThan(String value) {
            addCriterion("goodreadsUrl >", value, "goodreadsurl");
            return (Criteria) this;
        }

        public Criteria andGoodreadsurlGreaterThanOrEqualTo(String value) {
            addCriterion("goodreadsUrl >=", value, "goodreadsurl");
            return (Criteria) this;
        }

        public Criteria andGoodreadsurlLessThan(String value) {
            addCriterion("goodreadsUrl <", value, "goodreadsurl");
            return (Criteria) this;
        }

        public Criteria andGoodreadsurlLessThanOrEqualTo(String value) {
            addCriterion("goodreadsUrl <=", value, "goodreadsurl");
            return (Criteria) this;
        }

        public Criteria andGoodreadsurlLike(String value) {
            addCriterion("goodreadsUrl like", value, "goodreadsurl");
            return (Criteria) this;
        }

        public Criteria andGoodreadsurlNotLike(String value) {
            addCriterion("goodreadsUrl not like", value, "goodreadsurl");
            return (Criteria) this;
        }

        public Criteria andGoodreadsurlIn(List<String> values) {
            addCriterion("goodreadsUrl in", values, "goodreadsurl");
            return (Criteria) this;
        }

        public Criteria andGoodreadsurlNotIn(List<String> values) {
            addCriterion("goodreadsUrl not in", values, "goodreadsurl");
            return (Criteria) this;
        }

        public Criteria andGoodreadsurlBetween(String value1, String value2) {
            addCriterion("goodreadsUrl between", value1, value2, "goodreadsurl");
            return (Criteria) this;
        }

        public Criteria andGoodreadsurlNotBetween(String value1, String value2) {
            addCriterion("goodreadsUrl not between", value1, value2, "goodreadsurl");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andAuthornameIsNull() {
            addCriterion("authorName is null");
            return (Criteria) this;
        }

        public Criteria andAuthornameIsNotNull() {
            addCriterion("authorName is not null");
            return (Criteria) this;
        }

        public Criteria andAuthornameEqualTo(String value) {
            addCriterion("authorName =", value, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameNotEqualTo(String value) {
            addCriterion("authorName <>", value, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameGreaterThan(String value) {
            addCriterion("authorName >", value, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameGreaterThanOrEqualTo(String value) {
            addCriterion("authorName >=", value, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameLessThan(String value) {
            addCriterion("authorName <", value, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameLessThanOrEqualTo(String value) {
            addCriterion("authorName <=", value, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameLike(String value) {
            addCriterion("authorName like", value, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameNotLike(String value) {
            addCriterion("authorName not like", value, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameIn(List<String> values) {
            addCriterion("authorName in", values, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameNotIn(List<String> values) {
            addCriterion("authorName not in", values, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameBetween(String value1, String value2) {
            addCriterion("authorName between", value1, value2, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameNotBetween(String value1, String value2) {
            addCriterion("authorName not between", value1, value2, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameurlIsNull() {
            addCriterion("authorNameUrl is null");
            return (Criteria) this;
        }

        public Criteria andAuthornameurlIsNotNull() {
            addCriterion("authorNameUrl is not null");
            return (Criteria) this;
        }

        public Criteria andAuthornameurlEqualTo(String value) {
            addCriterion("authorNameUrl =", value, "authornameurl");
            return (Criteria) this;
        }

        public Criteria andAuthornameurlNotEqualTo(String value) {
            addCriterion("authorNameUrl <>", value, "authornameurl");
            return (Criteria) this;
        }

        public Criteria andAuthornameurlGreaterThan(String value) {
            addCriterion("authorNameUrl >", value, "authornameurl");
            return (Criteria) this;
        }

        public Criteria andAuthornameurlGreaterThanOrEqualTo(String value) {
            addCriterion("authorNameUrl >=", value, "authornameurl");
            return (Criteria) this;
        }

        public Criteria andAuthornameurlLessThan(String value) {
            addCriterion("authorNameUrl <", value, "authornameurl");
            return (Criteria) this;
        }

        public Criteria andAuthornameurlLessThanOrEqualTo(String value) {
            addCriterion("authorNameUrl <=", value, "authornameurl");
            return (Criteria) this;
        }

        public Criteria andAuthornameurlLike(String value) {
            addCriterion("authorNameUrl like", value, "authornameurl");
            return (Criteria) this;
        }

        public Criteria andAuthornameurlNotLike(String value) {
            addCriterion("authorNameUrl not like", value, "authornameurl");
            return (Criteria) this;
        }

        public Criteria andAuthornameurlIn(List<String> values) {
            addCriterion("authorNameUrl in", values, "authornameurl");
            return (Criteria) this;
        }

        public Criteria andAuthornameurlNotIn(List<String> values) {
            addCriterion("authorNameUrl not in", values, "authornameurl");
            return (Criteria) this;
        }

        public Criteria andAuthornameurlBetween(String value1, String value2) {
            addCriterion("authorNameUrl between", value1, value2, "authornameurl");
            return (Criteria) this;
        }

        public Criteria andAuthornameurlNotBetween(String value1, String value2) {
            addCriterion("authorNameUrl not between", value1, value2, "authornameurl");
            return (Criteria) this;
        }

        public Criteria andIllustratorIsNull() {
            addCriterion("Illustrator is null");
            return (Criteria) this;
        }

        public Criteria andIllustratorIsNotNull() {
            addCriterion("Illustrator is not null");
            return (Criteria) this;
        }

        public Criteria andIllustratorEqualTo(String value) {
            addCriterion("Illustrator =", value, "illustrator");
            return (Criteria) this;
        }

        public Criteria andIllustratorNotEqualTo(String value) {
            addCriterion("Illustrator <>", value, "illustrator");
            return (Criteria) this;
        }

        public Criteria andIllustratorGreaterThan(String value) {
            addCriterion("Illustrator >", value, "illustrator");
            return (Criteria) this;
        }

        public Criteria andIllustratorGreaterThanOrEqualTo(String value) {
            addCriterion("Illustrator >=", value, "illustrator");
            return (Criteria) this;
        }

        public Criteria andIllustratorLessThan(String value) {
            addCriterion("Illustrator <", value, "illustrator");
            return (Criteria) this;
        }

        public Criteria andIllustratorLessThanOrEqualTo(String value) {
            addCriterion("Illustrator <=", value, "illustrator");
            return (Criteria) this;
        }

        public Criteria andIllustratorLike(String value) {
            addCriterion("Illustrator like", value, "illustrator");
            return (Criteria) this;
        }

        public Criteria andIllustratorNotLike(String value) {
            addCriterion("Illustrator not like", value, "illustrator");
            return (Criteria) this;
        }

        public Criteria andIllustratorIn(List<String> values) {
            addCriterion("Illustrator in", values, "illustrator");
            return (Criteria) this;
        }

        public Criteria andIllustratorNotIn(List<String> values) {
            addCriterion("Illustrator not in", values, "illustrator");
            return (Criteria) this;
        }

        public Criteria andIllustratorBetween(String value1, String value2) {
            addCriterion("Illustrator between", value1, value2, "illustrator");
            return (Criteria) this;
        }

        public Criteria andIllustratorNotBetween(String value1, String value2) {
            addCriterion("Illustrator not between", value1, value2, "illustrator");
            return (Criteria) this;
        }

        public Criteria andIllustratorurlIsNull() {
            addCriterion("IllustratorUrl is null");
            return (Criteria) this;
        }

        public Criteria andIllustratorurlIsNotNull() {
            addCriterion("IllustratorUrl is not null");
            return (Criteria) this;
        }

        public Criteria andIllustratorurlEqualTo(String value) {
            addCriterion("IllustratorUrl =", value, "illustratorurl");
            return (Criteria) this;
        }

        public Criteria andIllustratorurlNotEqualTo(String value) {
            addCriterion("IllustratorUrl <>", value, "illustratorurl");
            return (Criteria) this;
        }

        public Criteria andIllustratorurlGreaterThan(String value) {
            addCriterion("IllustratorUrl >", value, "illustratorurl");
            return (Criteria) this;
        }

        public Criteria andIllustratorurlGreaterThanOrEqualTo(String value) {
            addCriterion("IllustratorUrl >=", value, "illustratorurl");
            return (Criteria) this;
        }

        public Criteria andIllustratorurlLessThan(String value) {
            addCriterion("IllustratorUrl <", value, "illustratorurl");
            return (Criteria) this;
        }

        public Criteria andIllustratorurlLessThanOrEqualTo(String value) {
            addCriterion("IllustratorUrl <=", value, "illustratorurl");
            return (Criteria) this;
        }

        public Criteria andIllustratorurlLike(String value) {
            addCriterion("IllustratorUrl like", value, "illustratorurl");
            return (Criteria) this;
        }

        public Criteria andIllustratorurlNotLike(String value) {
            addCriterion("IllustratorUrl not like", value, "illustratorurl");
            return (Criteria) this;
        }

        public Criteria andIllustratorurlIn(List<String> values) {
            addCriterion("IllustratorUrl in", values, "illustratorurl");
            return (Criteria) this;
        }

        public Criteria andIllustratorurlNotIn(List<String> values) {
            addCriterion("IllustratorUrl not in", values, "illustratorurl");
            return (Criteria) this;
        }

        public Criteria andIllustratorurlBetween(String value1, String value2) {
            addCriterion("IllustratorUrl between", value1, value2, "illustratorurl");
            return (Criteria) this;
        }

        public Criteria andIllustratorurlNotBetween(String value1, String value2) {
            addCriterion("IllustratorUrl not between", value1, value2, "illustratorurl");
            return (Criteria) this;
        }

        public Criteria andCoverpicIsNull() {
            addCriterion("coverPic is null");
            return (Criteria) this;
        }

        public Criteria andCoverpicIsNotNull() {
            addCriterion("coverPic is not null");
            return (Criteria) this;
        }

        public Criteria andCoverpicEqualTo(String value) {
            addCriterion("coverPic =", value, "coverpic");
            return (Criteria) this;
        }

        public Criteria andCoverpicNotEqualTo(String value) {
            addCriterion("coverPic <>", value, "coverpic");
            return (Criteria) this;
        }

        public Criteria andCoverpicGreaterThan(String value) {
            addCriterion("coverPic >", value, "coverpic");
            return (Criteria) this;
        }

        public Criteria andCoverpicGreaterThanOrEqualTo(String value) {
            addCriterion("coverPic >=", value, "coverpic");
            return (Criteria) this;
        }

        public Criteria andCoverpicLessThan(String value) {
            addCriterion("coverPic <", value, "coverpic");
            return (Criteria) this;
        }

        public Criteria andCoverpicLessThanOrEqualTo(String value) {
            addCriterion("coverPic <=", value, "coverpic");
            return (Criteria) this;
        }

        public Criteria andCoverpicLike(String value) {
            addCriterion("coverPic like", value, "coverpic");
            return (Criteria) this;
        }

        public Criteria andCoverpicNotLike(String value) {
            addCriterion("coverPic not like", value, "coverpic");
            return (Criteria) this;
        }

        public Criteria andCoverpicIn(List<String> values) {
            addCriterion("coverPic in", values, "coverpic");
            return (Criteria) this;
        }

        public Criteria andCoverpicNotIn(List<String> values) {
            addCriterion("coverPic not in", values, "coverpic");
            return (Criteria) this;
        }

        public Criteria andCoverpicBetween(String value1, String value2) {
            addCriterion("coverPic between", value1, value2, "coverpic");
            return (Criteria) this;
        }

        public Criteria andCoverpicNotBetween(String value1, String value2) {
            addCriterion("coverPic not between", value1, value2, "coverpic");
            return (Criteria) this;
        }

        public Criteria andRatingdetailsIsNull() {
            addCriterion("ratingDetails is null");
            return (Criteria) this;
        }

        public Criteria andRatingdetailsIsNotNull() {
            addCriterion("ratingDetails is not null");
            return (Criteria) this;
        }

        public Criteria andRatingdetailsEqualTo(String value) {
            addCriterion("ratingDetails =", value, "ratingdetails");
            return (Criteria) this;
        }

        public Criteria andRatingdetailsNotEqualTo(String value) {
            addCriterion("ratingDetails <>", value, "ratingdetails");
            return (Criteria) this;
        }

        public Criteria andRatingdetailsGreaterThan(String value) {
            addCriterion("ratingDetails >", value, "ratingdetails");
            return (Criteria) this;
        }

        public Criteria andRatingdetailsGreaterThanOrEqualTo(String value) {
            addCriterion("ratingDetails >=", value, "ratingdetails");
            return (Criteria) this;
        }

        public Criteria andRatingdetailsLessThan(String value) {
            addCriterion("ratingDetails <", value, "ratingdetails");
            return (Criteria) this;
        }

        public Criteria andRatingdetailsLessThanOrEqualTo(String value) {
            addCriterion("ratingDetails <=", value, "ratingdetails");
            return (Criteria) this;
        }

        public Criteria andRatingdetailsLike(String value) {
            addCriterion("ratingDetails like", value, "ratingdetails");
            return (Criteria) this;
        }

        public Criteria andRatingdetailsNotLike(String value) {
            addCriterion("ratingDetails not like", value, "ratingdetails");
            return (Criteria) this;
        }

        public Criteria andRatingdetailsIn(List<String> values) {
            addCriterion("ratingDetails in", values, "ratingdetails");
            return (Criteria) this;
        }

        public Criteria andRatingdetailsNotIn(List<String> values) {
            addCriterion("ratingDetails not in", values, "ratingdetails");
            return (Criteria) this;
        }

        public Criteria andRatingdetailsBetween(String value1, String value2) {
            addCriterion("ratingDetails between", value1, value2, "ratingdetails");
            return (Criteria) this;
        }

        public Criteria andRatingdetailsNotBetween(String value1, String value2) {
            addCriterion("ratingDetails not between", value1, value2, "ratingdetails");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(String value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(String value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(String value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(String value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(String value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(String value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLike(String value) {
            addCriterion("score like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotLike(String value) {
            addCriterion("score not like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<String> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<String> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(String value1, String value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(String value1, String value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andRatingsIsNull() {
            addCriterion("ratings is null");
            return (Criteria) this;
        }

        public Criteria andRatingsIsNotNull() {
            addCriterion("ratings is not null");
            return (Criteria) this;
        }

        public Criteria andRatingsEqualTo(Integer value) {
            addCriterion("ratings =", value, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsNotEqualTo(Integer value) {
            addCriterion("ratings <>", value, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsGreaterThan(Integer value) {
            addCriterion("ratings >", value, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ratings >=", value, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsLessThan(Integer value) {
            addCriterion("ratings <", value, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsLessThanOrEqualTo(Integer value) {
            addCriterion("ratings <=", value, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsIn(List<Integer> values) {
            addCriterion("ratings in", values, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsNotIn(List<Integer> values) {
            addCriterion("ratings not in", values, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsBetween(Integer value1, Integer value2) {
            addCriterion("ratings between", value1, value2, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsNotBetween(Integer value1, Integer value2) {
            addCriterion("ratings not between", value1, value2, "ratings");
            return (Criteria) this;
        }

        public Criteria andReviewsIsNull() {
            addCriterion("reviews is null");
            return (Criteria) this;
        }

        public Criteria andReviewsIsNotNull() {
            addCriterion("reviews is not null");
            return (Criteria) this;
        }

        public Criteria andReviewsEqualTo(Integer value) {
            addCriterion("reviews =", value, "reviews");
            return (Criteria) this;
        }

        public Criteria andReviewsNotEqualTo(Integer value) {
            addCriterion("reviews <>", value, "reviews");
            return (Criteria) this;
        }

        public Criteria andReviewsGreaterThan(Integer value) {
            addCriterion("reviews >", value, "reviews");
            return (Criteria) this;
        }

        public Criteria andReviewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("reviews >=", value, "reviews");
            return (Criteria) this;
        }

        public Criteria andReviewsLessThan(Integer value) {
            addCriterion("reviews <", value, "reviews");
            return (Criteria) this;
        }

        public Criteria andReviewsLessThanOrEqualTo(Integer value) {
            addCriterion("reviews <=", value, "reviews");
            return (Criteria) this;
        }

        public Criteria andReviewsIn(List<Integer> values) {
            addCriterion("reviews in", values, "reviews");
            return (Criteria) this;
        }

        public Criteria andReviewsNotIn(List<Integer> values) {
            addCriterion("reviews not in", values, "reviews");
            return (Criteria) this;
        }

        public Criteria andReviewsBetween(Integer value1, Integer value2) {
            addCriterion("reviews between", value1, value2, "reviews");
            return (Criteria) this;
        }

        public Criteria andReviewsNotBetween(Integer value1, Integer value2) {
            addCriterion("reviews not between", value1, value2, "reviews");
            return (Criteria) this;
        }

        public Criteria andGenresIsNull() {
            addCriterion("genres is null");
            return (Criteria) this;
        }

        public Criteria andGenresIsNotNull() {
            addCriterion("genres is not null");
            return (Criteria) this;
        }

        public Criteria andGenresEqualTo(String value) {
            addCriterion("genres =", value, "genres");
            return (Criteria) this;
        }

        public Criteria andGenresNotEqualTo(String value) {
            addCriterion("genres <>", value, "genres");
            return (Criteria) this;
        }

        public Criteria andGenresGreaterThan(String value) {
            addCriterion("genres >", value, "genres");
            return (Criteria) this;
        }

        public Criteria andGenresGreaterThanOrEqualTo(String value) {
            addCriterion("genres >=", value, "genres");
            return (Criteria) this;
        }

        public Criteria andGenresLessThan(String value) {
            addCriterion("genres <", value, "genres");
            return (Criteria) this;
        }

        public Criteria andGenresLessThanOrEqualTo(String value) {
            addCriterion("genres <=", value, "genres");
            return (Criteria) this;
        }

        public Criteria andGenresLike(String value) {
            addCriterion("genres like", value, "genres");
            return (Criteria) this;
        }

        public Criteria andGenresNotLike(String value) {
            addCriterion("genres not like", value, "genres");
            return (Criteria) this;
        }

        public Criteria andGenresIn(List<String> values) {
            addCriterion("genres in", values, "genres");
            return (Criteria) this;
        }

        public Criteria andGenresNotIn(List<String> values) {
            addCriterion("genres not in", values, "genres");
            return (Criteria) this;
        }

        public Criteria andGenresBetween(String value1, String value2) {
            addCriterion("genres between", value1, value2, "genres");
            return (Criteria) this;
        }

        public Criteria andGenresNotBetween(String value1, String value2) {
            addCriterion("genres not between", value1, value2, "genres");
            return (Criteria) this;
        }

        public Criteria andBookformatIsNull() {
            addCriterion("bookFormat is null");
            return (Criteria) this;
        }

        public Criteria andBookformatIsNotNull() {
            addCriterion("bookFormat is not null");
            return (Criteria) this;
        }

        public Criteria andBookformatEqualTo(String value) {
            addCriterion("bookFormat =", value, "bookformat");
            return (Criteria) this;
        }

        public Criteria andBookformatNotEqualTo(String value) {
            addCriterion("bookFormat <>", value, "bookformat");
            return (Criteria) this;
        }

        public Criteria andBookformatGreaterThan(String value) {
            addCriterion("bookFormat >", value, "bookformat");
            return (Criteria) this;
        }

        public Criteria andBookformatGreaterThanOrEqualTo(String value) {
            addCriterion("bookFormat >=", value, "bookformat");
            return (Criteria) this;
        }

        public Criteria andBookformatLessThan(String value) {
            addCriterion("bookFormat <", value, "bookformat");
            return (Criteria) this;
        }

        public Criteria andBookformatLessThanOrEqualTo(String value) {
            addCriterion("bookFormat <=", value, "bookformat");
            return (Criteria) this;
        }

        public Criteria andBookformatLike(String value) {
            addCriterion("bookFormat like", value, "bookformat");
            return (Criteria) this;
        }

        public Criteria andBookformatNotLike(String value) {
            addCriterion("bookFormat not like", value, "bookformat");
            return (Criteria) this;
        }

        public Criteria andBookformatIn(List<String> values) {
            addCriterion("bookFormat in", values, "bookformat");
            return (Criteria) this;
        }

        public Criteria andBookformatNotIn(List<String> values) {
            addCriterion("bookFormat not in", values, "bookformat");
            return (Criteria) this;
        }

        public Criteria andBookformatBetween(String value1, String value2) {
            addCriterion("bookFormat between", value1, value2, "bookformat");
            return (Criteria) this;
        }

        public Criteria andBookformatNotBetween(String value1, String value2) {
            addCriterion("bookFormat not between", value1, value2, "bookformat");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeIsNull() {
            addCriterion("publishedTime is null");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeIsNotNull() {
            addCriterion("publishedTime is not null");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeEqualTo(String value) {
            addCriterion("publishedTime =", value, "publishedtime");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeNotEqualTo(String value) {
            addCriterion("publishedTime <>", value, "publishedtime");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeGreaterThan(String value) {
            addCriterion("publishedTime >", value, "publishedtime");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeGreaterThanOrEqualTo(String value) {
            addCriterion("publishedTime >=", value, "publishedtime");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeLessThan(String value) {
            addCriterion("publishedTime <", value, "publishedtime");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeLessThanOrEqualTo(String value) {
            addCriterion("publishedTime <=", value, "publishedtime");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeLike(String value) {
            addCriterion("publishedTime like", value, "publishedtime");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeNotLike(String value) {
            addCriterion("publishedTime not like", value, "publishedtime");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeIn(List<String> values) {
            addCriterion("publishedTime in", values, "publishedtime");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeNotIn(List<String> values) {
            addCriterion("publishedTime not in", values, "publishedtime");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeBetween(String value1, String value2) {
            addCriterion("publishedTime between", value1, value2, "publishedtime");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeNotBetween(String value1, String value2) {
            addCriterion("publishedTime not between", value1, value2, "publishedtime");
            return (Criteria) this;
        }

        public Criteria andFirstpublishedtimeIsNull() {
            addCriterion("firstPublishedTime is null");
            return (Criteria) this;
        }

        public Criteria andFirstpublishedtimeIsNotNull() {
            addCriterion("firstPublishedTime is not null");
            return (Criteria) this;
        }

        public Criteria andFirstpublishedtimeEqualTo(String value) {
            addCriterion("firstPublishedTime =", value, "firstpublishedtime");
            return (Criteria) this;
        }

        public Criteria andFirstpublishedtimeNotEqualTo(String value) {
            addCriterion("firstPublishedTime <>", value, "firstpublishedtime");
            return (Criteria) this;
        }

        public Criteria andFirstpublishedtimeGreaterThan(String value) {
            addCriterion("firstPublishedTime >", value, "firstpublishedtime");
            return (Criteria) this;
        }

        public Criteria andFirstpublishedtimeGreaterThanOrEqualTo(String value) {
            addCriterion("firstPublishedTime >=", value, "firstpublishedtime");
            return (Criteria) this;
        }

        public Criteria andFirstpublishedtimeLessThan(String value) {
            addCriterion("firstPublishedTime <", value, "firstpublishedtime");
            return (Criteria) this;
        }

        public Criteria andFirstpublishedtimeLessThanOrEqualTo(String value) {
            addCriterion("firstPublishedTime <=", value, "firstpublishedtime");
            return (Criteria) this;
        }

        public Criteria andFirstpublishedtimeLike(String value) {
            addCriterion("firstPublishedTime like", value, "firstpublishedtime");
            return (Criteria) this;
        }

        public Criteria andFirstpublishedtimeNotLike(String value) {
            addCriterion("firstPublishedTime not like", value, "firstpublishedtime");
            return (Criteria) this;
        }

        public Criteria andFirstpublishedtimeIn(List<String> values) {
            addCriterion("firstPublishedTime in", values, "firstpublishedtime");
            return (Criteria) this;
        }

        public Criteria andFirstpublishedtimeNotIn(List<String> values) {
            addCriterion("firstPublishedTime not in", values, "firstpublishedtime");
            return (Criteria) this;
        }

        public Criteria andFirstpublishedtimeBetween(String value1, String value2) {
            addCriterion("firstPublishedTime between", value1, value2, "firstpublishedtime");
            return (Criteria) this;
        }

        public Criteria andFirstpublishedtimeNotBetween(String value1, String value2) {
            addCriterion("firstPublishedTime not between", value1, value2, "firstpublishedtime");
            return (Criteria) this;
        }

        public Criteria andPagesIsNull() {
            addCriterion("pages is null");
            return (Criteria) this;
        }

        public Criteria andPagesIsNotNull() {
            addCriterion("pages is not null");
            return (Criteria) this;
        }

        public Criteria andPagesEqualTo(Integer value) {
            addCriterion("pages =", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotEqualTo(Integer value) {
            addCriterion("pages <>", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesGreaterThan(Integer value) {
            addCriterion("pages >", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesGreaterThanOrEqualTo(Integer value) {
            addCriterion("pages >=", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLessThan(Integer value) {
            addCriterion("pages <", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLessThanOrEqualTo(Integer value) {
            addCriterion("pages <=", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesIn(List<Integer> values) {
            addCriterion("pages in", values, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotIn(List<Integer> values) {
            addCriterion("pages not in", values, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesBetween(Integer value1, Integer value2) {
            addCriterion("pages between", value1, value2, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotBetween(Integer value1, Integer value2) {
            addCriterion("pages not between", value1, value2, "pages");
            return (Criteria) this;
        }

        public Criteria andOriginaltitleIsNull() {
            addCriterion("originalTitle is null");
            return (Criteria) this;
        }

        public Criteria andOriginaltitleIsNotNull() {
            addCriterion("originalTitle is not null");
            return (Criteria) this;
        }

        public Criteria andOriginaltitleEqualTo(String value) {
            addCriterion("originalTitle =", value, "originaltitle");
            return (Criteria) this;
        }

        public Criteria andOriginaltitleNotEqualTo(String value) {
            addCriterion("originalTitle <>", value, "originaltitle");
            return (Criteria) this;
        }

        public Criteria andOriginaltitleGreaterThan(String value) {
            addCriterion("originalTitle >", value, "originaltitle");
            return (Criteria) this;
        }

        public Criteria andOriginaltitleGreaterThanOrEqualTo(String value) {
            addCriterion("originalTitle >=", value, "originaltitle");
            return (Criteria) this;
        }

        public Criteria andOriginaltitleLessThan(String value) {
            addCriterion("originalTitle <", value, "originaltitle");
            return (Criteria) this;
        }

        public Criteria andOriginaltitleLessThanOrEqualTo(String value) {
            addCriterion("originalTitle <=", value, "originaltitle");
            return (Criteria) this;
        }

        public Criteria andOriginaltitleLike(String value) {
            addCriterion("originalTitle like", value, "originaltitle");
            return (Criteria) this;
        }

        public Criteria andOriginaltitleNotLike(String value) {
            addCriterion("originalTitle not like", value, "originaltitle");
            return (Criteria) this;
        }

        public Criteria andOriginaltitleIn(List<String> values) {
            addCriterion("originalTitle in", values, "originaltitle");
            return (Criteria) this;
        }

        public Criteria andOriginaltitleNotIn(List<String> values) {
            addCriterion("originalTitle not in", values, "originaltitle");
            return (Criteria) this;
        }

        public Criteria andOriginaltitleBetween(String value1, String value2) {
            addCriterion("originalTitle between", value1, value2, "originaltitle");
            return (Criteria) this;
        }

        public Criteria andOriginaltitleNotBetween(String value1, String value2) {
            addCriterion("originalTitle not between", value1, value2, "originaltitle");
            return (Criteria) this;
        }

        public Criteria andLiteraryawardsIsNull() {
            addCriterion("literaryAwards is null");
            return (Criteria) this;
        }

        public Criteria andLiteraryawardsIsNotNull() {
            addCriterion("literaryAwards is not null");
            return (Criteria) this;
        }

        public Criteria andLiteraryawardsEqualTo(String value) {
            addCriterion("literaryAwards =", value, "literaryawards");
            return (Criteria) this;
        }

        public Criteria andLiteraryawardsNotEqualTo(String value) {
            addCriterion("literaryAwards <>", value, "literaryawards");
            return (Criteria) this;
        }

        public Criteria andLiteraryawardsGreaterThan(String value) {
            addCriterion("literaryAwards >", value, "literaryawards");
            return (Criteria) this;
        }

        public Criteria andLiteraryawardsGreaterThanOrEqualTo(String value) {
            addCriterion("literaryAwards >=", value, "literaryawards");
            return (Criteria) this;
        }

        public Criteria andLiteraryawardsLessThan(String value) {
            addCriterion("literaryAwards <", value, "literaryawards");
            return (Criteria) this;
        }

        public Criteria andLiteraryawardsLessThanOrEqualTo(String value) {
            addCriterion("literaryAwards <=", value, "literaryawards");
            return (Criteria) this;
        }

        public Criteria andLiteraryawardsLike(String value) {
            addCriterion("literaryAwards like", value, "literaryawards");
            return (Criteria) this;
        }

        public Criteria andLiteraryawardsNotLike(String value) {
            addCriterion("literaryAwards not like", value, "literaryawards");
            return (Criteria) this;
        }

        public Criteria andLiteraryawardsIn(List<String> values) {
            addCriterion("literaryAwards in", values, "literaryawards");
            return (Criteria) this;
        }

        public Criteria andLiteraryawardsNotIn(List<String> values) {
            addCriterion("literaryAwards not in", values, "literaryawards");
            return (Criteria) this;
        }

        public Criteria andLiteraryawardsBetween(String value1, String value2) {
            addCriterion("literaryAwards between", value1, value2, "literaryawards");
            return (Criteria) this;
        }

        public Criteria andLiteraryawardsNotBetween(String value1, String value2) {
            addCriterion("literaryAwards not between", value1, value2, "literaryawards");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNull() {
            addCriterion("ISBN is null");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNotNull() {
            addCriterion("ISBN is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnEqualTo(String value) {
            addCriterion("ISBN =", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotEqualTo(String value) {
            addCriterion("ISBN <>", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThan(String value) {
            addCriterion("ISBN >", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("ISBN >=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThan(String value) {
            addCriterion("ISBN <", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThanOrEqualTo(String value) {
            addCriterion("ISBN <=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLike(String value) {
            addCriterion("ISBN like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotLike(String value) {
            addCriterion("ISBN not like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnIn(List<String> values) {
            addCriterion("ISBN in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotIn(List<String> values) {
            addCriterion("ISBN not in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnBetween(String value1, String value2) {
            addCriterion("ISBN between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotBetween(String value1, String value2) {
            addCriterion("ISBN not between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbn13IsNull() {
            addCriterion("ISBN13 is null");
            return (Criteria) this;
        }

        public Criteria andIsbn13IsNotNull() {
            addCriterion("ISBN13 is not null");
            return (Criteria) this;
        }

        public Criteria andIsbn13EqualTo(String value) {
            addCriterion("ISBN13 =", value, "isbn13");
            return (Criteria) this;
        }

        public Criteria andIsbn13NotEqualTo(String value) {
            addCriterion("ISBN13 <>", value, "isbn13");
            return (Criteria) this;
        }

        public Criteria andIsbn13GreaterThan(String value) {
            addCriterion("ISBN13 >", value, "isbn13");
            return (Criteria) this;
        }

        public Criteria andIsbn13GreaterThanOrEqualTo(String value) {
            addCriterion("ISBN13 >=", value, "isbn13");
            return (Criteria) this;
        }

        public Criteria andIsbn13LessThan(String value) {
            addCriterion("ISBN13 <", value, "isbn13");
            return (Criteria) this;
        }

        public Criteria andIsbn13LessThanOrEqualTo(String value) {
            addCriterion("ISBN13 <=", value, "isbn13");
            return (Criteria) this;
        }

        public Criteria andIsbn13Like(String value) {
            addCriterion("ISBN13 like", value, "isbn13");
            return (Criteria) this;
        }

        public Criteria andIsbn13NotLike(String value) {
            addCriterion("ISBN13 not like", value, "isbn13");
            return (Criteria) this;
        }

        public Criteria andIsbn13In(List<String> values) {
            addCriterion("ISBN13 in", values, "isbn13");
            return (Criteria) this;
        }

        public Criteria andIsbn13NotIn(List<String> values) {
            addCriterion("ISBN13 not in", values, "isbn13");
            return (Criteria) this;
        }

        public Criteria andIsbn13Between(String value1, String value2) {
            addCriterion("ISBN13 between", value1, value2, "isbn13");
            return (Criteria) this;
        }

        public Criteria andIsbn13NotBetween(String value1, String value2) {
            addCriterion("ISBN13 not between", value1, value2, "isbn13");
            return (Criteria) this;
        }

        public Criteria andEditionlanguageIsNull() {
            addCriterion("editionLanguage is null");
            return (Criteria) this;
        }

        public Criteria andEditionlanguageIsNotNull() {
            addCriterion("editionLanguage is not null");
            return (Criteria) this;
        }

        public Criteria andEditionlanguageEqualTo(String value) {
            addCriterion("editionLanguage =", value, "editionlanguage");
            return (Criteria) this;
        }

        public Criteria andEditionlanguageNotEqualTo(String value) {
            addCriterion("editionLanguage <>", value, "editionlanguage");
            return (Criteria) this;
        }

        public Criteria andEditionlanguageGreaterThan(String value) {
            addCriterion("editionLanguage >", value, "editionlanguage");
            return (Criteria) this;
        }

        public Criteria andEditionlanguageGreaterThanOrEqualTo(String value) {
            addCriterion("editionLanguage >=", value, "editionlanguage");
            return (Criteria) this;
        }

        public Criteria andEditionlanguageLessThan(String value) {
            addCriterion("editionLanguage <", value, "editionlanguage");
            return (Criteria) this;
        }

        public Criteria andEditionlanguageLessThanOrEqualTo(String value) {
            addCriterion("editionLanguage <=", value, "editionlanguage");
            return (Criteria) this;
        }

        public Criteria andEditionlanguageLike(String value) {
            addCriterion("editionLanguage like", value, "editionlanguage");
            return (Criteria) this;
        }

        public Criteria andEditionlanguageNotLike(String value) {
            addCriterion("editionLanguage not like", value, "editionlanguage");
            return (Criteria) this;
        }

        public Criteria andEditionlanguageIn(List<String> values) {
            addCriterion("editionLanguage in", values, "editionlanguage");
            return (Criteria) this;
        }

        public Criteria andEditionlanguageNotIn(List<String> values) {
            addCriterion("editionLanguage not in", values, "editionlanguage");
            return (Criteria) this;
        }

        public Criteria andEditionlanguageBetween(String value1, String value2) {
            addCriterion("editionLanguage between", value1, value2, "editionlanguage");
            return (Criteria) this;
        }

        public Criteria andEditionlanguageNotBetween(String value1, String value2) {
            addCriterion("editionLanguage not between", value1, value2, "editionlanguage");
            return (Criteria) this;
        }

        public Criteria andIsbninfoIsNull() {
            addCriterion("isbnInfo is null");
            return (Criteria) this;
        }

        public Criteria andIsbninfoIsNotNull() {
            addCriterion("isbnInfo is not null");
            return (Criteria) this;
        }

        public Criteria andIsbninfoEqualTo(String value) {
            addCriterion("isbnInfo =", value, "isbninfo");
            return (Criteria) this;
        }

        public Criteria andIsbninfoNotEqualTo(String value) {
            addCriterion("isbnInfo <>", value, "isbninfo");
            return (Criteria) this;
        }

        public Criteria andIsbninfoGreaterThan(String value) {
            addCriterion("isbnInfo >", value, "isbninfo");
            return (Criteria) this;
        }

        public Criteria andIsbninfoGreaterThanOrEqualTo(String value) {
            addCriterion("isbnInfo >=", value, "isbninfo");
            return (Criteria) this;
        }

        public Criteria andIsbninfoLessThan(String value) {
            addCriterion("isbnInfo <", value, "isbninfo");
            return (Criteria) this;
        }

        public Criteria andIsbninfoLessThanOrEqualTo(String value) {
            addCriterion("isbnInfo <=", value, "isbninfo");
            return (Criteria) this;
        }

        public Criteria andIsbninfoLike(String value) {
            addCriterion("isbnInfo like", value, "isbninfo");
            return (Criteria) this;
        }

        public Criteria andIsbninfoNotLike(String value) {
            addCriterion("isbnInfo not like", value, "isbninfo");
            return (Criteria) this;
        }

        public Criteria andIsbninfoIn(List<String> values) {
            addCriterion("isbnInfo in", values, "isbninfo");
            return (Criteria) this;
        }

        public Criteria andIsbninfoNotIn(List<String> values) {
            addCriterion("isbnInfo not in", values, "isbninfo");
            return (Criteria) this;
        }

        public Criteria andIsbninfoBetween(String value1, String value2) {
            addCriterion("isbnInfo between", value1, value2, "isbninfo");
            return (Criteria) this;
        }

        public Criteria andIsbninfoNotBetween(String value1, String value2) {
            addCriterion("isbnInfo not between", value1, value2, "isbninfo");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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