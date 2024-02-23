package com.effigo.learning.portal.mapper;

import com.effigo.learning.portal.dto.Coursedto;
import com.effigo.learning.portal.entity.CourseEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-23T16:21:48+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.36.0.v20231114-0937, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class CourseMapperImpl implements CourseMapper {

    @Override
    public Coursedto toDto(Optional<CourseEntity> user) {
        if ( user == null ) {
            return null;
        }

        Coursedto coursedto = new Coursedto();

        return coursedto;
    }

    @Override
    public Coursedto toDto(CourseEntity user) {
        if ( user == null ) {
            return null;
        }

        Coursedto coursedto = new Coursedto();

        coursedto.setCategoryId( user.getCategoryId() );
        coursedto.setCourseId( user.getCourseId() );
        coursedto.setCreatedOn( user.getCreatedOn() );
        coursedto.setDescription( user.getDescription() );
        coursedto.setName( user.getName() );
        coursedto.setUpdatedOn( user.getUpdatedOn() );

        return coursedto;
    }

    @Override
    public CourseEntity toEntity(Coursedto d) {
        if ( d == null ) {
            return null;
        }

        CourseEntity courseEntity = new CourseEntity();

        courseEntity.setCategoryId( d.getCategoryId() );
        courseEntity.setCourseId( d.getCourseId() );
        courseEntity.setCreatedOn( d.getCreatedOn() );
        courseEntity.setDescription( d.getDescription() );
        courseEntity.setName( d.getName() );
        courseEntity.setUpdatedOn( d.getUpdatedOn() );

        return courseEntity;
    }

    @Override
    public List<Coursedto> toDto(List<CourseEntity> elist) {
        if ( elist == null ) {
            return null;
        }

        List<Coursedto> list = new ArrayList<Coursedto>( elist.size() );
        for ( CourseEntity courseEntity : elist ) {
            list.add( toDto( courseEntity ) );
        }

        return list;
    }

    @Override
    public List<CourseEntity> toEntity(List<Coursedto> dlist) {
        if ( dlist == null ) {
            return null;
        }

        List<CourseEntity> list = new ArrayList<CourseEntity>( dlist.size() );
        for ( Coursedto coursedto : dlist ) {
            list.add( toEntity( coursedto ) );
        }

        return list;
    }
}
