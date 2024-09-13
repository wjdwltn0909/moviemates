package com.nc13.moviemates.model.querydsl.impl;

import com.nc13.moviemates.model.entity.MovieEntity;
import com.nc13.moviemates.model.entity.QMovieEntity;
import com.nc13.moviemates.model.querydsl.MovieQueryDSL;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class MovieQueryDSLImpl implements MovieQueryDSL {

    private final JPAQueryFactory jpaQueryFactory;
    private QMovieEntity qMovie = QMovieEntity.movieEntity;

    @Override
    public List<MovieEntity> getAll() {
        return jpaQueryFactory.selectFrom(qMovie).fetch();
    }

    @Override
    public MovieEntity getById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public Boolean exists(Long id) {
        return jpaQueryFactory.selectFrom(qMovie).where(qMovie.id.eq(id)).fetchCount() > 0;
    }

    @Override
    public Long getRowCount() {
        return jpaQueryFactory.select(qMovie.id.count()).from(qMovie).fetchOne();
    }

}
