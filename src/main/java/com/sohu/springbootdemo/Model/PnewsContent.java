package com.sohu.springbootdemo.Model;

import java.io.Serializable;

public class PnewsContent implements Serializable {
    private Integer id;

    private String cityname;

    private String arename;

    private String forumname;

    private String domainname;

    private String typename;

    private String subject;

    private String dateline;

    private String url;

    private String subjectcontent;

    private String answercontent;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    public String getArename() {
        return arename;
    }

    public void setArename(String arename) {
        this.arename = arename == null ? null : arename.trim();
    }

    public String getForumname() {
        return forumname;
    }

    public void setForumname(String forumname) {
        this.forumname = forumname == null ? null : forumname.trim();
    }

    public String getDomainname() {
        return domainname;
    }

    public void setDomainname(String domainname) {
        this.domainname = domainname == null ? null : domainname.trim();
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getDateline() {
        return dateline;
    }

    public void setDateline(String dateline) {
        this.dateline = dateline == null ? null : dateline.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getSubjectcontent() {
        return subjectcontent;
    }

    public void setSubjectcontent(String subjectcontent) {
        this.subjectcontent = subjectcontent == null ? null : subjectcontent.trim();
    }

    public String getAnswercontent() {
        return answercontent;
    }

    public void setAnswercontent(String answercontent) {
        this.answercontent = answercontent == null ? null : answercontent.trim();
    }
}