package edu.drexel.SpringDataSakilaApp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity(name="FilmActor")
@Table(name="film_actor")
@NamedQuery(name="FilmActor.findAll", query="SELECT f FROM FilmActor f")
public class FilmActor implements Serializable{

}
