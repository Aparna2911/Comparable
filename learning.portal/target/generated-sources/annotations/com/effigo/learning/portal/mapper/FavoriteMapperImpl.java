package com.effigo.learning.portal.mapper;

import com.effigo.learning.portal.dto.Favoritedto;
import com.effigo.learning.portal.entity.FavoriteEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-23T11:40:23+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.36.0.v20231114-0937, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class FavoriteMapperImpl implements FavoriteMapper {

    @Override
    public Favoritedto toDto(Optional<FavoriteEntity> user) {
        if ( user == null ) {
            return null;
        }

        Favoritedto favoritedto = new Favoritedto();

        return favoritedto;
    }

    @Override
    public Favoritedto toDto(FavoriteEntity user) {
        if ( user == null ) {
            return null;
        }

        Favoritedto favoritedto = new Favoritedto();

        favoritedto.setCourseId( user.getCourseId() );
        favoritedto.setCreatedOn( user.getCreatedOn() );
        favoritedto.setDeleted( user.isDeleted() );
        favoritedto.setFavoriteId( user.getFavoriteId() );
        favoritedto.setUpdatedOn( user.getUpdatedOn() );
        favoritedto.setUserId( user.getUserId() );

        return favoritedto;
    }

    @Override
    public FavoriteEntity toEntity(Favoritedto d) {
        if ( d == null ) {
            return null;
        }

        FavoriteEntity favoriteEntity = new FavoriteEntity();

        favoriteEntity.setCourseId( d.getCourseId() );
        favoriteEntity.setCreatedOn( d.getCreatedOn() );
        favoriteEntity.setDeleted( d.isDeleted() );
        favoriteEntity.setFavoriteId( d.getFavoriteId() );
        favoriteEntity.setUpdatedOn( d.getUpdatedOn() );
        favoriteEntity.setUserId( d.getUserId() );

        return favoriteEntity;
    }

    @Override
    public List<Favoritedto> toDto(List<FavoriteEntity> elist) {
        if ( elist == null ) {
            return null;
        }

        List<Favoritedto> list = new ArrayList<Favoritedto>( elist.size() );
        for ( FavoriteEntity favoriteEntity : elist ) {
            list.add( toDto( favoriteEntity ) );
        }

        return list;
    }

    @Override
    public List<FavoriteEntity> toEntity(List<Favoritedto> dlist) {
        if ( dlist == null ) {
            return null;
        }

        List<FavoriteEntity> list = new ArrayList<FavoriteEntity>( dlist.size() );
        for ( Favoritedto favoritedto : dlist ) {
            list.add( toEntity( favoritedto ) );
        }

        return list;
    }
}
