package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import org.springframework.beans.BeanUtils;

public class GameDTO {

	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;


    public GameDTO() {

    }

    public GameDTO(Game entity) {
        //Copia os mesmos atributos do objeto Game para o DTO
		BeanUtils.copyProperties(entity, this);
    }

    private Long getId() {
        return id;
    }

    private String getTitle() {
        return title;
    }
    private Integer getYear() {
        return year;
    }
    private String getGenre() {
        return genre;
    }

    private String getPlatforms() {
        return platforms;
    }
    private Double getScore() {
        return score;
    }
    private String getImgUrl() {
        return imgUrl;
    }
    private String getShortDescription() {
        return shortDescription;
    }
    private String getLongDescription() {
        return longDescription;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

}
