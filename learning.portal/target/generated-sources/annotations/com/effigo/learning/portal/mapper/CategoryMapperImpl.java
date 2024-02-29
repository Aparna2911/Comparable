package com.effigo.learning.portal.mapper;

import com.effigo.learning.portal.dto.Categorydto;
import com.effigo.learning.portal.entity.CategoryEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-25T21:58:05+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.36.0.v20231114-0937, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Categorydto toDto(Optional<CategoryEntity> user) {
        if ( user == null ) {
            return null;
        }

        Categorydto categorydto = new Categorydto();

        return categorydto;
    }

    @Override
    public Categorydto toDto(CategoryEntity user) {
        if ( user == null ) {
            return null;
        }

        Categorydto categorydto = new Categorydto();

        categorydto.setAuthorId( user.getAuthorId() );
        categorydto.setCategoryId( user.getCategoryId() );
        categorydto.setCreatedOn( user.getCreatedOn() );
        categorydto.setName( user.getName() );
        categorydto.setUpdatedOn( user.getUpdatedOn() );

        return categorydto;
    }

    @Override
    public CategoryEntity toEntity(Categorydto d) {
        if ( d == null ) {
            return null;
        }

        CategoryEntity categoryEntity = new CategoryEntity();

        categoryEntity.setAuthorId( d.getAuthorId() );
        categoryEntity.setCategoryId( d.getCategoryId() );
        categoryEntity.setCreatedOn( d.getCreatedOn() );
        categoryEntity.setName( d.getName() );
        categoryEntity.setUpdatedOn( d.getUpdatedOn() );

        return categoryEntity;
    }

    @Override
    public List<Categorydto> toDto(List<CategoryEntity> elist) {
        if ( elist == null ) {
            return null;
        }

        List<Categorydto> list = new ArrayList<Categorydto>( elist.size() );
        for ( CategoryEntity categoryEntity : elist ) {
            list.add( toDto( categoryEntity ) );
        }

        return list;
    }

    @Override
    public List<CategoryEntity> toEntity(List<Categorydto> dlist) {
        if ( dlist == null ) {
            return null;
        }

        List<CategoryEntity> list = new ArrayList<CategoryEntity>( dlist.size() );
        for ( Categorydto categorydto : dlist ) {
            list.add( toEntity( categorydto ) );
        }

        return list;
    }
}
