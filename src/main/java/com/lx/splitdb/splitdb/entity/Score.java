package com.lx.splitdb.splitdb.entity;

import javax.persistence.*;

public class Score {
    @Id
    @Column(name = "score_id")
    @GeneratedValue(generator = "JDBC")
    private Integer scoreId;

    @Column(name = "user_id")
    private Integer userId;

    private String item;

    private Integer score;

    /**
     * @return score_id
     */
    public Integer getScoreId() {
        return scoreId;
    }

    /**
     * @param scoreId
     */
    public void setScoreId(Integer scoreId) {
        this.scoreId = scoreId;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return item
     */
    public String getItem() {
        return item;
    }

    /**
     * @param item
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * @return score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * @param score
     */
    public void setScore(Integer score) {
        this.score = score;
    }
}