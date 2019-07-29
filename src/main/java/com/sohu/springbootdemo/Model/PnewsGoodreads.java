package com.sohu.springbootdemo.Model;

import java.io.Serializable;

public class PnewsGoodreads implements Serializable {
    private Integer id;

    private Integer cudosid;

    private Integer goodreadsid;

    private String goodreadsurl;

    private String title;

    private String authorname;

    private String authornameurl;

    private String illustrator;

    private String illustratorurl;

    private String coverpic;

    private String ratingdetails;

    private String score;

    private Integer ratings;

    private Integer reviews;

    private String genres;

    private String bookformat;

    private String publishedtime;

    private String firstpublishedtime;

    private Integer pages;

    private String originaltitle;

    private String literaryawards;

    private String isbn;

    private String isbn13;

    private String editionlanguage;

    private String isbninfo;

    private String description;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCudosid() {
        return cudosid;
    }

    public void setCudosid(Integer cudosid) {
        this.cudosid = cudosid;
    }

    public Integer getGoodreadsid() {
        return goodreadsid;
    }

    public void setGoodreadsid(Integer goodreadsid) {
        this.goodreadsid = goodreadsid;
    }

    public String getGoodreadsurl() {
        return goodreadsurl;
    }

    public void setGoodreadsurl(String goodreadsurl) {
        this.goodreadsurl = goodreadsurl == null ? null : goodreadsurl.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname == null ? null : authorname.trim();
    }

    public String getAuthornameurl() {
        return authornameurl;
    }

    public void setAuthornameurl(String authornameurl) {
        this.authornameurl = authornameurl == null ? null : authornameurl.trim();
    }

    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator == null ? null : illustrator.trim();
    }

    public String getIllustratorurl() {
        return illustratorurl;
    }

    public void setIllustratorurl(String illustratorurl) {
        this.illustratorurl = illustratorurl == null ? null : illustratorurl.trim();
    }

    public String getCoverpic() {
        return coverpic;
    }

    public void setCoverpic(String coverpic) {
        this.coverpic = coverpic == null ? null : coverpic.trim();
    }

    public String getRatingdetails() {
        return ratingdetails;
    }

    public void setRatingdetails(String ratingdetails) {
        this.ratingdetails = ratingdetails == null ? null : ratingdetails.trim();
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }

    public Integer getRatings() {
        return ratings;
    }

    public void setRatings(Integer ratings) {
        this.ratings = ratings;
    }

    public Integer getReviews() {
        return reviews;
    }

    public void setReviews(Integer reviews) {
        this.reviews = reviews;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres == null ? null : genres.trim();
    }

    public String getBookformat() {
        return bookformat;
    }

    public void setBookformat(String bookformat) {
        this.bookformat = bookformat == null ? null : bookformat.trim();
    }

    public String getPublishedtime() {
        return publishedtime;
    }

    public void setPublishedtime(String publishedtime) {
        this.publishedtime = publishedtime == null ? null : publishedtime.trim();
    }

    public String getFirstpublishedtime() {
        return firstpublishedtime;
    }

    public void setFirstpublishedtime(String firstpublishedtime) {
        this.firstpublishedtime = firstpublishedtime == null ? null : firstpublishedtime.trim();
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getOriginaltitle() {
        return originaltitle;
    }

    public void setOriginaltitle(String originaltitle) {
        this.originaltitle = originaltitle == null ? null : originaltitle.trim();
    }

    public String getLiteraryawards() {
        return literaryawards;
    }

    public void setLiteraryawards(String literaryawards) {
        this.literaryawards = literaryawards == null ? null : literaryawards.trim();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13 == null ? null : isbn13.trim();
    }

    public String getEditionlanguage() {
        return editionlanguage;
    }

    public void setEditionlanguage(String editionlanguage) {
        this.editionlanguage = editionlanguage == null ? null : editionlanguage.trim();
    }

    public String getIsbninfo() {
        return isbninfo;
    }

    public void setIsbninfo(String isbninfo) {
        this.isbninfo = isbninfo == null ? null : isbninfo.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}