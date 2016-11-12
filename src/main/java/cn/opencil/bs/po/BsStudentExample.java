package cn.opencil.bs.po;

import java.util.ArrayList;
import java.util.List;

public class BsStudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BsStudentExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andAcademyidIsNull() {
            addCriterion("academyid is null");
            return (Criteria) this;
        }

        public Criteria andAcademyidIsNotNull() {
            addCriterion("academyid is not null");
            return (Criteria) this;
        }

        public Criteria andAcademyidEqualTo(String value) {
            addCriterion("academyid =", value, "academyid");
            return (Criteria) this;
        }

        public Criteria andAcademyidNotEqualTo(String value) {
            addCriterion("academyid <>", value, "academyid");
            return (Criteria) this;
        }

        public Criteria andAcademyidGreaterThan(String value) {
            addCriterion("academyid >", value, "academyid");
            return (Criteria) this;
        }

        public Criteria andAcademyidGreaterThanOrEqualTo(String value) {
            addCriterion("academyid >=", value, "academyid");
            return (Criteria) this;
        }

        public Criteria andAcademyidLessThan(String value) {
            addCriterion("academyid <", value, "academyid");
            return (Criteria) this;
        }

        public Criteria andAcademyidLessThanOrEqualTo(String value) {
            addCriterion("academyid <=", value, "academyid");
            return (Criteria) this;
        }

        public Criteria andAcademyidLike(String value) {
            addCriterion("academyid like", value, "academyid");
            return (Criteria) this;
        }

        public Criteria andAcademyidNotLike(String value) {
            addCriterion("academyid not like", value, "academyid");
            return (Criteria) this;
        }

        public Criteria andAcademyidIn(List<String> values) {
            addCriterion("academyid in", values, "academyid");
            return (Criteria) this;
        }

        public Criteria andAcademyidNotIn(List<String> values) {
            addCriterion("academyid not in", values, "academyid");
            return (Criteria) this;
        }

        public Criteria andAcademyidBetween(String value1, String value2) {
            addCriterion("academyid between", value1, value2, "academyid");
            return (Criteria) this;
        }

        public Criteria andAcademyidNotBetween(String value1, String value2) {
            addCriterion("academyid not between", value1, value2, "academyid");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNull() {
            addCriterion("deptid is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("deptid is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(String value) {
            addCriterion("deptid =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(String value) {
            addCriterion("deptid <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(String value) {
            addCriterion("deptid >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(String value) {
            addCriterion("deptid >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(String value) {
            addCriterion("deptid <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(String value) {
            addCriterion("deptid <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLike(String value) {
            addCriterion("deptid like", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotLike(String value) {
            addCriterion("deptid not like", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<String> values) {
            addCriterion("deptid in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<String> values) {
            addCriterion("deptid not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(String value1, String value2) {
            addCriterion("deptid between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(String value1, String value2) {
            addCriterion("deptid not between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andEmployeenumIsNull() {
            addCriterion("employeenum is null");
            return (Criteria) this;
        }

        public Criteria andEmployeenumIsNotNull() {
            addCriterion("employeenum is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeenumEqualTo(String value) {
            addCriterion("employeenum =", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumNotEqualTo(String value) {
            addCriterion("employeenum <>", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumGreaterThan(String value) {
            addCriterion("employeenum >", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumGreaterThanOrEqualTo(String value) {
            addCriterion("employeenum >=", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumLessThan(String value) {
            addCriterion("employeenum <", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumLessThanOrEqualTo(String value) {
            addCriterion("employeenum <=", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumLike(String value) {
            addCriterion("employeenum like", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumNotLike(String value) {
            addCriterion("employeenum not like", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumIn(List<String> values) {
            addCriterion("employeenum in", values, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumNotIn(List<String> values) {
            addCriterion("employeenum not in", values, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumBetween(String value1, String value2) {
            addCriterion("employeenum between", value1, value2, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumNotBetween(String value1, String value2) {
            addCriterion("employeenum not between", value1, value2, "employeenum");
            return (Criteria) this;
        }

        public Criteria andStdnameIsNull() {
            addCriterion("stdname is null");
            return (Criteria) this;
        }

        public Criteria andStdnameIsNotNull() {
            addCriterion("stdname is not null");
            return (Criteria) this;
        }

        public Criteria andStdnameEqualTo(String value) {
            addCriterion("stdname =", value, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameNotEqualTo(String value) {
            addCriterion("stdname <>", value, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameGreaterThan(String value) {
            addCriterion("stdname >", value, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameGreaterThanOrEqualTo(String value) {
            addCriterion("stdname >=", value, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameLessThan(String value) {
            addCriterion("stdname <", value, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameLessThanOrEqualTo(String value) {
            addCriterion("stdname <=", value, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameLike(String value) {
            addCriterion("stdname like", value, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameNotLike(String value) {
            addCriterion("stdname not like", value, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameIn(List<String> values) {
            addCriterion("stdname in", values, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameNotIn(List<String> values) {
            addCriterion("stdname not in", values, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameBetween(String value1, String value2) {
            addCriterion("stdname between", value1, value2, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameNotBetween(String value1, String value2) {
            addCriterion("stdname not between", value1, value2, "stdname");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andRankidIsNull() {
            addCriterion("rankid is null");
            return (Criteria) this;
        }

        public Criteria andRankidIsNotNull() {
            addCriterion("rankid is not null");
            return (Criteria) this;
        }

        public Criteria andRankidEqualTo(String value) {
            addCriterion("rankid =", value, "rankid");
            return (Criteria) this;
        }

        public Criteria andRankidNotEqualTo(String value) {
            addCriterion("rankid <>", value, "rankid");
            return (Criteria) this;
        }

        public Criteria andRankidGreaterThan(String value) {
            addCriterion("rankid >", value, "rankid");
            return (Criteria) this;
        }

        public Criteria andRankidGreaterThanOrEqualTo(String value) {
            addCriterion("rankid >=", value, "rankid");
            return (Criteria) this;
        }

        public Criteria andRankidLessThan(String value) {
            addCriterion("rankid <", value, "rankid");
            return (Criteria) this;
        }

        public Criteria andRankidLessThanOrEqualTo(String value) {
            addCriterion("rankid <=", value, "rankid");
            return (Criteria) this;
        }

        public Criteria andRankidLike(String value) {
            addCriterion("rankid like", value, "rankid");
            return (Criteria) this;
        }

        public Criteria andRankidNotLike(String value) {
            addCriterion("rankid not like", value, "rankid");
            return (Criteria) this;
        }

        public Criteria andRankidIn(List<String> values) {
            addCriterion("rankid in", values, "rankid");
            return (Criteria) this;
        }

        public Criteria andRankidNotIn(List<String> values) {
            addCriterion("rankid not in", values, "rankid");
            return (Criteria) this;
        }

        public Criteria andRankidBetween(String value1, String value2) {
            addCriterion("rankid between", value1, value2, "rankid");
            return (Criteria) this;
        }

        public Criteria andRankidNotBetween(String value1, String value2) {
            addCriterion("rankid not between", value1, value2, "rankid");
            return (Criteria) this;
        }

        public Criteria andKindIsNull() {
            addCriterion("kind is null");
            return (Criteria) this;
        }

        public Criteria andKindIsNotNull() {
            addCriterion("kind is not null");
            return (Criteria) this;
        }

        public Criteria andKindEqualTo(String value) {
            addCriterion("kind =", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotEqualTo(String value) {
            addCriterion("kind <>", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThan(String value) {
            addCriterion("kind >", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThanOrEqualTo(String value) {
            addCriterion("kind >=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThan(String value) {
            addCriterion("kind <", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThanOrEqualTo(String value) {
            addCriterion("kind <=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLike(String value) {
            addCriterion("kind like", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotLike(String value) {
            addCriterion("kind not like", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindIn(List<String> values) {
            addCriterion("kind in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotIn(List<String> values) {
            addCriterion("kind not in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindBetween(String value1, String value2) {
            addCriterion("kind between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotBetween(String value1, String value2) {
            addCriterion("kind not between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andResearchIsNull() {
            addCriterion("research is null");
            return (Criteria) this;
        }

        public Criteria andResearchIsNotNull() {
            addCriterion("research is not null");
            return (Criteria) this;
        }

        public Criteria andResearchEqualTo(String value) {
            addCriterion("research =", value, "research");
            return (Criteria) this;
        }

        public Criteria andResearchNotEqualTo(String value) {
            addCriterion("research <>", value, "research");
            return (Criteria) this;
        }

        public Criteria andResearchGreaterThan(String value) {
            addCriterion("research >", value, "research");
            return (Criteria) this;
        }

        public Criteria andResearchGreaterThanOrEqualTo(String value) {
            addCriterion("research >=", value, "research");
            return (Criteria) this;
        }

        public Criteria andResearchLessThan(String value) {
            addCriterion("research <", value, "research");
            return (Criteria) this;
        }

        public Criteria andResearchLessThanOrEqualTo(String value) {
            addCriterion("research <=", value, "research");
            return (Criteria) this;
        }

        public Criteria andResearchLike(String value) {
            addCriterion("research like", value, "research");
            return (Criteria) this;
        }

        public Criteria andResearchNotLike(String value) {
            addCriterion("research not like", value, "research");
            return (Criteria) this;
        }

        public Criteria andResearchIn(List<String> values) {
            addCriterion("research in", values, "research");
            return (Criteria) this;
        }

        public Criteria andResearchNotIn(List<String> values) {
            addCriterion("research not in", values, "research");
            return (Criteria) this;
        }

        public Criteria andResearchBetween(String value1, String value2) {
            addCriterion("research between", value1, value2, "research");
            return (Criteria) this;
        }

        public Criteria andResearchNotBetween(String value1, String value2) {
            addCriterion("research not between", value1, value2, "research");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("comments is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("comments is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("comments =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("comments <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("comments >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("comments >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("comments <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("comments <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("comments like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("comments not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("comments in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("comments not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("comments between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("comments not between", value1, value2, "comments");
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