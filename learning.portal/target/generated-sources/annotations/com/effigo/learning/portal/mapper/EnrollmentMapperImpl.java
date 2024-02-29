package com.effigo.learning.portal.mapper;

import com.effigo.learning.portal.dto.Enrollmentdto;
import com.effigo.learning.portal.entity.EnrollmentEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-23T11:29:09+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.36.0.v20231114-0937, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class EnrollmentMapperImpl implements EnrollmentMapper {

    @Override
    public Enrollmentdto toDto(Optional<EnrollmentEntity> user) {
        if ( user == null ) {
            return null;
        }

        Enrollmentdto enrollmentdto = new Enrollmentdto();

        return enrollmentdto;
    }

    @Override
    public Enrollmentdto toDto(EnrollmentEntity user) {
        if ( user == null ) {
            return null;
        }

        Enrollmentdto enrollmentdto = new Enrollmentdto();

        enrollmentdto.setCourseId( user.getCourseId() );
        enrollmentdto.setCreatedOn( user.getCreatedOn() );
        if ( user.getEnrollmentId() != null ) {
            enrollmentdto.setEnrollmentId( user.getEnrollmentId() );
        }
        enrollmentdto.setUpdatedOn( user.getUpdatedOn() );
        enrollmentdto.setUserId( user.getUserId() );

        return enrollmentdto;
    }

    @Override
    public EnrollmentEntity toEntity(Enrollmentdto d) {
        if ( d == null ) {
            return null;
        }

        EnrollmentEntity enrollmentEntity = new EnrollmentEntity();

        enrollmentEntity.setCourseId( d.getCourseId() );
        enrollmentEntity.setCreatedOn( d.getCreatedOn() );
        enrollmentEntity.setEnrollmentId( d.getEnrollmentId() );
        enrollmentEntity.setUpdatedOn( d.getUpdatedOn() );
        enrollmentEntity.setUserId( d.getUserId() );

        return enrollmentEntity;
    }

    @Override
    public List<Enrollmentdto> toDto(List<EnrollmentEntity> elist) {
        if ( elist == null ) {
            return null;
        }

        List<Enrollmentdto> list = new ArrayList<Enrollmentdto>( elist.size() );
        for ( EnrollmentEntity enrollmentEntity : elist ) {
            list.add( toDto( enrollmentEntity ) );
        }

        return list;
    }

    @Override
    public List<EnrollmentEntity> toEntity(List<Enrollmentdto> dlist) {
        if ( dlist == null ) {
            return null;
        }

        List<EnrollmentEntity> list = new ArrayList<EnrollmentEntity>( dlist.size() );
        for ( Enrollmentdto enrollmentdto : dlist ) {
            list.add( toEntity( enrollmentdto ) );
        }

        return list;
    }
}
