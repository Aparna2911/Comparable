package com.effigo.learning.portal.mapper;

import com.effigo.learning.portal.dto.Userdto;
import com.effigo.learning.portal.entity.UserEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-26T10:25:49+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.36.0.v20231114-0937, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public Userdto toDto(UserEntity user) {
        if ( user == null ) {
            return null;
        }

        Userdto userdto = new Userdto();

        userdto.setCreatedOn( user.getCreatedOn() );
        userdto.setEmail( user.getEmail() );
        userdto.setName( user.getName() );
        userdto.setPassword( user.getPassword() );
        userdto.setRole( user.getRole() );
        userdto.setUpdatedOn( user.getUpdatedOn() );
        userdto.setUserId( user.getUserId() );

        return userdto;
    }

    @Override
    public UserEntity toEntity(Userdto d) {
        if ( d == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setCreatedOn( d.getCreatedOn() );
        userEntity.setEmail( d.getEmail() );
        userEntity.setName( d.getName() );
        userEntity.setPassword( d.getPassword() );
        userEntity.setRole( d.getRole() );
        userEntity.setUpdatedOn( d.getUpdatedOn() );
        userEntity.setUserId( d.getUserId() );

        return userEntity;
    }

    @Override
    public List<Userdto> toDto(List<UserEntity> elist) {
        if ( elist == null ) {
            return null;
        }

        List<Userdto> list = new ArrayList<Userdto>( elist.size() );
        for ( UserEntity userEntity : elist ) {
            list.add( toDto( userEntity ) );
        }

        return list;
    }

    @Override
    public List<UserEntity> toEntity(List<Userdto> dlist) {
        if ( dlist == null ) {
            return null;
        }

        List<UserEntity> list = new ArrayList<UserEntity>( dlist.size() );
        for ( Userdto userdto : dlist ) {
            list.add( toEntity( userdto ) );
        }

        return list;
    }
}
